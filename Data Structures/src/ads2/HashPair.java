package ads2;

/* This class provides a basic pair object to use with the HashMap
 * The attributes are public so you can access them directly or via the get
 * methods
*/
public class HashPair 
{
  public String key, value;
  
  public HashPair(String key, String value)
  {
    this.key=key;
    this.value=value;
  }
  
  public String GetKey()
  {
    return key;
  }
  
  public String GetValue()
  {
    return value;
  }
}
