package ads2;

/* Use this class to hold node information within the Sparse Matrix data structure 
 * and provide any associated methods required */

public class SparseMatrixNode
{
  private int column, row, val;
  private SparseMatrixNode nextRow, nextCol;
  
  //Constructor for setting up the root node, creates two extra nodes which are located on the far right
  //and bottom left of the matrix
  public SparseMatrixNode(int height, int width)
  {
      //Sets all location values to be -1 so they are out of the way
      this.column = -1;
      this.row = -1;
      this.val = 0;
      this.nextRow = new SparseMatrixNode(0, height - 1, -1);
      this.nextCol = new SparseMatrixNode(0, -1, width - 1);
  }
  
  //Constructor for when a new node is being created with just the locations and value
  public SparseMatrixNode(int val, int row, int column)
  {
      this.val = val;
      this.row = row;
      this.column = column;
  }
  
    //Constructor for when it has the nextRow value as well
    public SparseMatrixNode(int val, int row, int column, SparseMatrixNode nextRow)
  {
      this.val = val;
      this.row = row;
      this.column = column;
      this.nextRow = nextRow;
  }
    
    //Constructor for when it has the nextRow and nextCol values
    public SparseMatrixNode(int val, int row, int column, SparseMatrixNode nextCol, SparseMatrixNode currentNode)
    {
      this.val = val;
      this.row = row;
      this.column = column;
      this.nextCol = nextCol;
      this.nextRow = currentNode;
    }
  
  
    //Function searches through the rows
  public int GetValue(int rows, int col)
  {
      //Checks if there is another node before it reaches the place it needs to find the node
      if (row != rows && row < rows && nextRow != null)
      {
          return nextRow.GetValue(rows, col);
      }
      //Checks to see if it has found the node place
      else if (row == rows)
      {
          return this.SearchRow(col);
      }
      //Calls when it hasn't found the right dummy node in that column
      else
      {
          return 0;
      }
  }
  
  //Function searches through the columns
  public int SearchRow(int col)
  {
      //Checks if there is another node before it reaches the place it needs to find the node
      if (column != col && column < col && nextCol != null)
      {
          return nextCol.SearchRow(col);
      }
      //Checks to see of it has found the node
      else if (column == col)
      {
          return val;
      }
      //Calls when it hasn't found the right dummy node in that column
      else
      {
          return 0;
      }  
  }
  
  //Function searches through to see if it needs to create dummy nodes
  public void SetValue(int rows, int col, SparseMatrixNode newNode)
  {
      //Checks if it has found the desired row
      if (row == rows)
      {
          this.SetRow(rows, col, newNode);
      }
      //Checks if the next dummy node is bigger than the one it is looking for, thus creating a new dummy node
      else if (nextRow.row > rows)
      {
          SparseMatrixNode tmp = nextRow;
          nextRow = new SparseMatrixNode(0, rows, -1, tmp);         
          nextRow.SetRow(rows, col, newNode);
      }
      //Checks to see if there is another node ahead in which case calls again from this node
      else if (nextRow.row <= rows)
      {
          nextRow.SetValue(rows, col, newNode);
      }
      //In any other case
      else
      {
          nextRow.SetRow(rows, col, newNode);
      }
  }
  
  //Searches through the columns to find where it needs to put the value
  public void SetRow(int rows, int col, SparseMatrixNode newNode)
  {
      //Checks to see if it needs to overwrite a node
      if (col == column)
      {
          //System.out.println("Overwriting node...");
          this.val = newNode.val;
      }
      //Checks first to prevent errors
      else if (nextCol != null)
      {
          //Checks to see if it has found the right area as the column value is larger in the next node in the row
          if (nextCol.column >= col)
          {
            //Creates new node here, changing the pointers
            SparseMatrixNode tmp = nextCol;
            nextCol = newNode;
            nextCol.nextCol = tmp;
          }
          //Calls it again using the next node
          else if (nextCol.column < col)
          {
            nextCol.SetRow(rows, col, newNode);
          }  
      }
      //In all other cases
      else
      {
          nextCol = newNode;
      }
  }
  
  //Function used to set up the column pointer properly
  public void SetColumn(int rows, int col, SparseMatrixNode node)
  {
      //See if it has found the right column, in which case starts searching rows
      if (column == col)
      {
          if (nextRow != null)
          {
            //Breaks if it finds the pointers are correct
            if (nextRow.row == rows)
            {

            }
            //Else it recreates the pointers in the correct places
            else if (nextRow.row > rows)
            {
                SparseMatrixNode tmp = nextRow;
                nextRow = node;
                node.nextRow = tmp;
            }
            //Calls again if not found the correct area
            else
            {
                nextRow.SetColumn(rows, col, node);
            }
          }
          //If it has reached the edge of the matrix and there isn't another node
          else
          {
              nextRow = node;
          }
      }
      //If it doesn't find the correct column then calls itself again using the next column
      else if (nextCol != null)
      {
          nextCol.SetColumn(rows, col, node);
      }
  }
  
  //Funtion used to return a node in a given place and null if it doesn't exist
  public SparseMatrixNode NodeExists(int rows, int col)
  {
      //Recursively searches through rows
      if (row != rows && row < rows)
      {
          return nextRow.NodeExists(rows, col);
      }
      else if (row == rows)
      {
          return this.NodeExists2(col);
      }
      else
      {
          return null;
      } 
  }
  
  
   public SparseMatrixNode NodeExists2(int col)
  {
      //Recursively searches through columns
      if (column != col && column < col)
      {
          return nextCol.NodeExists2(col);
      }
      else if (column == col)
      {
          return this;
      }
      else
      {
          return null;
      }     
  }
   
   //Function used to create a dummy node in the top row when need be and there 
   //has been a node added which doesn't have a node pointing to it
   public void MakeDummyColumnNode(int col, SparseMatrixNode currentNode)
   {
      //Recursively checks to find where the psoition of the node which needs to be added
      //and creates it there
      if (nextCol.column > col)
      {
          SparseMatrixNode tmp = nextCol;
          nextCol = new SparseMatrixNode(0, -1, col, tmp, currentNode);
      }
      else if (nextCol.column < col)
      {
          nextCol.MakeDummyColumnNode(col, currentNode);
      }   
      else
      {
          SparseMatrixNode tmp = nextCol;
          nextCol = new SparseMatrixNode(0, -1, col, tmp, currentNode);           
      }
   }
   
}
