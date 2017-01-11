package ads2;

/* This class defines the behaviour of a sorted Vector where the items in the 
 * collection are String objects.  The items in this Vector collection should be 
 * automatically sorted into ascending order by this class when they are added.
 * Items are not case sensitive. */
public class SortedVector {
    // Default Constructor

    private int noOfItems;
    private String[] data;
    private int growBy;
    private String[] tempArray;

    public SortedVector() {
        noOfItems = 0;
        growBy = 10;
        data = new String[5];
    }

    /* Sets how much this vector should grow by when it needs resizing.  A sensible
   * default growby value should be used in your implementation.  Note, you should 
   * not grow the vector here, just remember what it will grow by when required. */
    public void SetGrowBy(int growby) {
        this.growBy = growBy;
    }

    /* Returns the maximum capacity of the vector before it will need to resize again
   * This is not the number of items in the vector or the number of remaining free slots, 
   * but the current max capacity - i.e. the length of the underly data array. */
    public int GetCapacity() {
        return data.length - noOfItems;
    }

    /* Returns the number of items in the vector */
    public int GetNoOfItems() {
        return noOfItems;
    }

    /* Returns the String value held at index (base zero) or null if the index
   * is out of bounds */
    public String GetItemByIndex(int index) {
        String item;
        item = data[index];
        if (index >= 0 && index < noOfItems) {
            return item;
        } else {
            return null;
        }
    }

    /* Returns the index of the first item found in the collection that matches the
   * value passed in, or -1 if no such item exists.  String matches are not case 
   * sensitive.
   *
   * Use recursive binary search to search your sorted vector data collection */
    public int FindItem(String search) {
        // You must use recursive binary search to search your sorted vector data collection 
        if (search != "")
            return BinarySearch(search.toUpperCase(), 0, noOfItems - 1, true);
        else
            return -1;
    }

    private int BinarySearch(String search, int low, int high, boolean flipFlop) {
        
        int middle;
        boolean found = false;
        while(!found)
        {
            middle = ((high + low) / 2);
            if (high < low)
            {
                if (flipFlop == true)
                    return -1;
                else
                    return low;
            }
            else if ((data[middle].toUpperCase()).equals(search))
            {
                return middle;
            }
            else if ((data[middle]).compareToIgnoreCase(search) > 0)
            {
                high = middle - 1;
            }
            else
            {
                low = middle + 1;
            }
        }
        return -1;
}

    /* Adds value to the Vector collection of data items.  The item must be added
   * to the underlying array data structure such that it mains ascending, non-case
   * sensitive sorted order */
    public void AddItem(String value) {
        if (value != "")
        {
            if (noOfItems == data.length) 
                growArray();
            int place = BinarySearch(value.toUpperCase(), 0, noOfItems - 1, false);  
            for (int i = noOfItems - 1; i >= place; i--)
                data[i + 1] = data[i];
            data[place] = value;
            noOfItems ++;
        }
    }

    private void growArray() {
        String tmp[] = new String[data.length + growBy];
        System.arraycopy(data, 0, tmp, 0, data.length);
        data = tmp;
    }

    /* Removes the item at index from the data structure - if index is out of
   * bounds then the data structure remains unchanged */
    public void DeleteItem(int index) {
        if (index >= noOfItems) {
            System.out.println("This is out of range");
        } else {
            for (int i = index; i != noOfItems - 1; i++) {
                data[i] = data[i + 1];
            }
            noOfItems--;
            data[noOfItems] = null;
        }
    }

    /* if you want extra internal information about the state of your vector when
   * tested by the unit tests, update the following toString method to dump
   * any information you are interested in - this method is not marked */
    public String toString() {
        String newString = "";
        for (int i = 0; i < noOfItems; i++) {
            newString += (GetItemByIndex(i) + " ");
        }

        return newString;
    }
}
