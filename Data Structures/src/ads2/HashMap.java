package ads2;

/* This collection represents a hashmap that contain pairs of strings
 * You must implement this hashmap using open addressing and full resize rehashing
 * with linear probing
 */

public class HashMap 
{
  // Your basic data - you must use the HashPair object which has been predefined for you
  private long noofitems;   // total number of items in the hash map
  private HashPair[] data;  // array of data where the items are stored
  private HashPair[] temp;
  // tip: to get the max length of an array, you use the length function on it
  
  /* Creates a hashmap with a specified inital capacity */
  public HashMap(int initlen)
  {
    noofitems=0;
    data=new HashPair[initlen];
    temp=new HashPair[0];
  }
  
  /* Adds the pair <key, value> to the hash map */
  public void AddItem(String key, String value)
  {
    int index = HashFunction(key)%data.length;
    key = key.toUpperCase();
    HashPair item=new HashPair(key, value);
    
    int tries = 0;

    while ((index <= data.length) && (tries != 2) && (data[index] != null)) 
    {
        index += 1;
        if (index == data.length)
        {
            if (tries == 1)
                tries = 2;
            else
            {
                index = 0;
                tries = 1;
            }
        }
    }

    if (tries != 2)
    {
        noofitems += 1;
        data[index] = item;
    }

    if ((float) noofitems / data.length >= 0.7)
    {
        temp=new HashPair[(int) ((float) data.length * (float) 1.5)];
        for (int i = 0; i < data.length; i++)
        {
            if (data[i] != null)
            {
                RehashItem(data[i].key, data[i].value);
            }
        }
        data = temp;
    }
    // Check load factor here and resize if over 0.7.  Use full rehashing

    // Place item into data, but check and resolve collisions first using 
    // linear probing.
    
  }
  
  private void RehashItem(String key, String value)
  {
    int index = HashFunction(key)%temp.length;
    HashPair item=new HashPair(key, value);
    
    int tries = 0;

    while ((index <= temp.length) && (tries != 2) && (temp[index] != null)) 
    {
        index += 1;
        if (index == temp.length)
        {
            if (tries == 1)
                tries = 2;
            else
            {
                index = 0;
                tries = 1;
            }
        }
    }

    if (tries != 2)
    {
        temp[index] = item;
    } 
  }
  
  /* Function used to create a hash from the key String passed in */
  private int HashFunction(String key)
  {
    // Provide a basic hash function that mashes all the ascii values of key
    // into an index and return that
    byte data[] = key.getBytes();
    int hash = 800;

    for (int i = 0; i < key.length(); i++) 
    {
        if (hash % 2 == 0) 
        {
            hash = hash + (data[i] * 7);
        } else if (hash % 3 == 0) 
        {
            hash = hash - data[i];
        } else 
        {
            hash = hash + (data[i] * 23);
        }
    }

    return hash;
  }
  
  /* Returns the value associated with the key stored in the hash map
   * If the key is not in the hash map then null should be returned
  */
  public String GetValue(String key)
  {
    // Returns the item associated with key - remember you will need to 
    // implement the same collision resolution formular here - linear probing
    
    key = key.toUpperCase();
    int tries = 0;
    int searches = data.length;
    for (int index = HashFunction(key)%data.length; index < searches; index++)
    {
        if (data[index] != null) 
        {
            if (data[index].key.equals(key))
            {                 
                return data[index].value;
            }
            if (index == data.length-1 && tries == 0)
            {
                index = 0;
                tries = 1;
                searches = HashFunction(key);
            }
        }
    }
    return null;
  }
  
  /* if you want extra internal information about the state of your stack when
   * tested, update the following toString method to dump any information you are 
   * interested in - this method is not marked */
  public String toString()
  {
    return super.toString();
  }  
}
