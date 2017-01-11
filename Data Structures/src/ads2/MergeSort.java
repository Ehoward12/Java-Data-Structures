package ads2;

import java.util.Arrays;

/* Implement the bottom-up merge sort algorithm for String items */

public class MergeSort
{
  /* Takes an array of String items and sorts them into ascending alphabetical order (A to Z)
   * The sort is not case sensitive, i.e. ZOO and zoo are considered the same
   * The input data array is full (i.e. every valid index contains a String)
   * When this function completes, the data array will contain the sorted data 
   * items */
  
  // NOTE: This is a class method since the signature includes the keyword static
  //Function 
  public static void Sort(String[] data)
  {
      data = Merging(data);

  }
  
  public static String[] Merging(String[] data)
  {
    String[] tmp = new String[data.length];
          int gap = 1, r, e;
          while (gap < data.length)
          {
              for (int l = 0; l < data.length; l+=gap*2)
              {
                  if (l + gap < data.length)
                    r = l + gap;
                  else
                  {
                    r = data.length;
                    e = data.length;
                  }
                  if (r + gap < data.length)
                    e = r + gap;
                  else
                    e = data.length;
                  if (l != r && r != e)
                  {
                    if (tmp[tmp.length-1] != null)
                    {
                        System.arraycopy((Merge(tmp, l, r, e)), 0, tmp, l, e-l);
                    }
                    else
                        System.arraycopy((Merge(data, l, r, e)), 0, tmp, l, e-l);
                  }
                }
              gap = gap * 2;
          }
          data = tmp;
          return data;
  }
  
  
   private static String[] Merge(String[] data, int l, int r, int e)
   {
      String[] tempData = new String[e - l];
      int items = 0, jItems = r, iItems = l;
      
      for (int i=iItems; i< (r); i++)
      {
          for (int j=jItems; j< (e); j++)
          {
              if ((data[i]).compareToIgnoreCase(data[j]) > 0)
              {
                tempData[items] = data[j];
                items++;
                jItems ++;
                if (j == e-1)
                {
                    for (int b = iItems; b < r; b++)
                    {
                        tempData[items] = data[b];
                        items ++;
                    } 
                }
              }
              else
              {
                tempData[items] = data[i];
                items++;
                iItems ++;
                j = e;
                if (i == r-1)
                {
                    for (int b = jItems; b < e; b++)
                    {
                        tempData[items] = data[b];
                        items++;
                    }
                }
              }
          }
      }
      return tempData;
  }
}
