package ads2;

/* This data structure should use outward-facing zero-based indexing.  To maintain 
 * the concept that there is a dummy header column at 0 (as per the lecture slides) 
 * you can simply add one to any row and column values passed into this class and 
 * keep this "slight of hand" beind the scenes and invisible to the outside world
 * This class uses SparseMatrixNode to hold the nodes and stores integer values
 */

// You may  find it useful to search out further reading related to "Sparse Matrix using Linked Lists"

public class SparseMatrix
{
  //Initiates height and width, as well as the root node and another node which will
  //be used to assign a new node to
  int height, width;
  SparseMatrixNode root, newNode;
  // Default Constructor
  public SparseMatrix()
  {
      //Defaultly makes them equal 0
      height = 0;
      width = 0;
  }
  
  /* Initalises this data structure to have the specificed number of rows and columns
   * Any previous matrix held in this object is lost after this call */
  public void Create(int noofrows, int noofcols)
  {
      //Checks if the sizes for the matrix are valid
      if (noofrows > 0 && noofcols > 0)
      {
        //Sets the height and width and sets up the root node
        height = noofrows;
        width = noofcols;
        root = new SparseMatrixNode(height, width);
      }
      //else
          //System.out.println("Bad matrix size");
  }

  /* Gets the number of rows within this matrix */
  public int GetNoOfRows()
  {
    return height;
  }
  
  /* Gets the number of columns within this matrix */
  public int GetNoOfCols()
  {
    return width;
  }
  
  /* Gets the value at [row, col] 
   * E.G. Search down the dummy header column 0 looking for the specified row
   * If the row list doesn't exist then all entries along that row are zero
   * If the row list exist, search along it for the specified column
   */
  public int GetValue(int row, int col)
  {
    //Checks to see if the values entered are valid, else returns a 0
    if (row < height && col < width && root != null)
    {
        return root.GetValue(row, col);
    }
    else
        return 0;
  }

  /* Sets the values at [row, col] 
   * Is the new value zero or non-zero?
   * Does a node already exist at [row, col]?
   * Does the row or column contain other non-zero entries?
   */
  public void SetValue(int row, int col, int value)
  {
      //Checks to see if the values entered are valid, else returns an error
      if (row < height && col < width && value != 0)
      {
          //Makes newNode equal to a node which contains all the values given to it
          newNode = new SparseMatrixNode(value, row, col);
          //Calls to insert the node into the matrix, using row then column search
          root.SetValue(row, col, newNode);
          //Checks to see if a dummy column node needs to be created
          if (root.NodeExists(-1, col) == null)
          {
             root.MakeDummyColumnNode(col, root.NodeExists(row, col));
          } 
          //Sets up any links that may be needed withing the columns
          root.SetColumn(row, col, root.NodeExists(row, col));
      }
      //else
          //System.out.println("Error - cannot add this value");
  }
  
  /* if you want extra internal information about the state of your sparse matrix when
   * tested by the unit tests, update the following toString method to dump
   * any information you are interested in - this method is not marked */
  public String toString()
  {
      return "";
}
}
