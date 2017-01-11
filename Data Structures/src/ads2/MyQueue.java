package ads2;

/* This data structure represents a queue collection.
 * You should hold the underlying data using an efficient resizable collection
 * data structure
 */


public class MyQueue
{
  // Default Constructor
    
  private DLLNode root;
  private DLLNode end;  
  //Creates a temporary node which will be used when adding new items
  private DLLNode tempNode;
  //Creates a dummy node which will always be at the end of the list and which will
  //point back to the previous node
  private DLLNode dummyEndNode;
  
  public MyQueue()
  {   
      
  }
  
  /* Return the number of items contained within this data structure */
  public int GetNoOfItems()
  {
    return (root==null?0:root.GetNoOfItems());
  }
  
  // Returns true if the queue is empty else false if there are items available
  public boolean IsEmpty()
  {
    if (root.GetNoOfItems() == 0)
        return true;
    else
        return false;
  }
  
  // Gets the next item from the queue (remember First-in, First-out) 
  // or null if there are no more items
  public String Pop()
  {
      if (root != null)
      {
        String val = root.GetDataItem();
        if (root.GetNextNode().GetDataItem() != null)
        {
            root = root.GetNextNode();
            root.SetPrevious(null);
        }
        else
        {
            root = null;
        }
        return val;
      }
      else
          return null;
  }
  
  // Adds value to the queue  (remember First-in, First-out)
  public void Push(String value)
  { 
    if (root==null)
    {
        root=new DLLNode(value);
        //Sets the dummy node after the root node
        dummyEndNode = root.SetDummyNode();
    }
    //Checks to see if root has been made but end hasn't
    else if (end==null)
    {
        //Sets up the end node, giving it a previous value and adding the dummy node after
        end = root.AddItem(value);
        end.SetPrevious(root);
        dummyEndNode = end.SetDummyNode();
    }
    //Calls this if root and end have already been set
    else
    {
        //Makes the temp equal to end to save it temporarily
        tempNode = end;
        //Sets the new end node as the item being added
        end = end.AddItem(value);  
        //Sets the previous for this node
        end.SetPrevious(tempNode);
        //Puts the dummy node after this node
        dummyEndNode = end.SetDummyNode();
        //Resets the tempNode
        tempNode = null;
    }
  }      
  

  /* if you want extra internal information about the state of your stack when
   * tested, update the following toString method to dump any information you are 
   * interested in - this method is not marked */
  public String toString(int index)
  {
    if (index == 0)
        return "Previous: " + null + " Next: " + (root.GetNextNode().GetDataItem()).toString() + " Data: " + (root.GetDataItem()).toString();
    else if (index == GetNoOfItems() - 1)
        return "Previous: " + (end.GetPreviousNode().GetDataItem()).toString() + " Next: " + null + " Data: " + (end.GetDataItem()).toString();
    else
        return root.GetNodeInfo(index);
  }
  
}
