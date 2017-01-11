package ads2;

import java.io.*;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // All your code to implement the behaviour of the requested algorithms and
    // data structures need to go into the classes provided as this main method 
    // will be replaced when it is being evaluated using pre-defined tests
    
    System.out.println("Test you code here");
    System.out.println("Remember to break the tasks down into smaller chunks and test as you go - what functions need to be written first and tested before others can be written and tested?");
    
    SortedVector vec = new SortedVector();
    
    
    int noOfItems;
    
    
//    //TESTING FOR VECTOR
//    System.out.println("TESTING FOR VECTOR");
//    
//    //Check to see if it puts single letters in order
//    System.out.println("Check to see if it puts single letters in order");
//    vec.AddItem("b");
//    vec.AddItem("e");
//    vec.AddItem("c");
//    vec.AddItem("a");
//    vec.AddItem("d");
//    
//    for (int i = 0; i < vec.GetNoOfItems(); i++)
//        System.out.println(vec.GetItemByIndex(i) + " " + i);
//    
//    //Deleteion testing
//    System.out.println("Deleteion testing");
//    noOfItems = vec.GetNoOfItems();
//    
//    for (int i = 0; i < noOfItems; i++)
//        vec.DeleteItem(0);
//    
//    //Check to see if it can handle words of more than two letters
//    System.out.println("Check to see if it can handle words of more than two letters");
//    vec.AddItem("aa");
//    vec.AddItem("ab");
//    vec.AddItem("c");
//    vec.AddItem("da");
//    vec.AddItem("db");
//    
//    for (int i = 0; i < vec.GetNoOfItems(); i++)
//        System.out.println(vec.GetItemByIndex(i) + " " + i);
//    
//    for (int i = 0; i < noOfItems; i++)
//        vec.DeleteItem(0);
//    
//    //Check to see if it sorts characters by the amount of a single character there is
//    System.out.println("Check to see if it sorts characters by the amount of a single character there is");
//    vec.AddItem("abbbbb");
//    vec.AddItem("ab");
//    vec.AddItem("addddd");
//    vec.AddItem("abbb");
//    vec.AddItem("add");
//    
//    for (int i = 0; i < vec.GetNoOfItems(); i++)
//        System.out.println(vec.GetItemByIndex(i) + " " + i);
//    
//    for (int i = 0; i < noOfItems; i++)
//        vec.DeleteItem(0);
//    
//    //Check to see if it can sort really long values with short values
//    System.out.println("Check to see if it can sort really long values with short values");
//    vec.AddItem("a");
//    vec.AddItem("abbbafafsafsaf");
//    vec.AddItem("ab");
//    vec.AddItem("agsbxvcxzv");
//    vec.AddItem("aafafsafafafafafsafda");    
//    
//    for (int i = 0; i < vec.GetNoOfItems(); i++)
//        System.out.println(vec.GetItemByIndex(i) + " " + i);
//    
//    for (int i = 0; i < noOfItems; i++)
//        vec.DeleteItem(0);
//    
//    //Check to see if it is case sensitive
//    System.out.println("Check to see if it is case sensitive");
//    vec.AddItem("AAA");
//    vec.AddItem("BBBB");
//    vec.AddItem("ABB");
//    vec.AddItem("ffff");
//    vec.AddItem("AAAA"); 
//    
//    for (int i = 0; i < vec.GetNoOfItems(); i++)
//        System.out.println(vec.GetItemByIndex(i) + " " + i);    
//    
//    //Check to see if I can search for a lower case item and get a upper case item returned
//    System.out.println("Check to see if I can search for a lower case item and get a upper case item returned (aaaa)");
//    System.out.println(vec.FindItem("aaaa"));
//    //Check to see if I can use different cases within the search and still get the coreect item
//    System.out.println("Check to see if I can use different cases within the search and still get the coreect item (BbBb)");
//    System.out.println(vec.FindItem("BbBb"));
//    //Check to see if searching all in capitals works
//    System.out.println("Check to see if searching all in capitals works (AAA)");
//    System.out.println(vec.FindItem("AAA"));
//    //Check to see if searching in upper case can return a lower case item
//    System.out.println("Check to see if searching in upper case can return a lower case item (FFFF)");
//    System.out.println(vec.FindItem("FFFF"));
//    
//    //Check to see if searching for a non-existant item returns -1
//    System.out.println("Check to see if searching for a non-existant item returns -1 (hi)");
//    System.out.println(vec.FindItem("hi"));
//    //Check to see what happens if you search for nothing
//    System.out.println("Check to see what happens if you search for nothing");
//    System.out.println(vec.FindItem(""));
//    //Check to see if you add an item with no value nothing will be added
//    System.out.println("Check to see if you add an item with no value nothing will be added");
//    vec.AddItem(""); 
//    
//    for (int i = 0; i < vec.GetNoOfItems(); i++)
//        System.out.println(vec.GetItemByIndex(i) + " " + i); 
//    
//    for (int i = 0; i < noOfItems; i++)
//        vec.DeleteItem(0);
//    
//    //Check to see if it extends the array when more than five items are added
//    System.out.println("Check to see if it extends the array when more than five items are added");
//    //Also check to see if it orders correctly when items are added in a random order
//    System.out.println("Also check to see if it orders correctly when items are added in a random order");
//    vec.AddItem("hiu");
//    vec.AddItem("yaasa");
//    vec.AddItem("sgs");
//    vec.AddItem("vxvcx");
//    vec.AddItem("ggjg");
//    vec.AddItem("qewq");
//    vec.AddItem("jjff");
//    vec.AddItem("fddfg");
//    vec.AddItem("lkjl");
//    vec.AddItem("upiup"); 
//    
//    for (int i = 0; i < vec.GetNoOfItems(); i++)
//        System.out.println(vec.GetItemByIndex(i) + " " + i); 
//    
//    noOfItems = vec.GetNoOfItems();
//    
//    for (int i = 0; i < noOfItems; i++)
//        vec.DeleteItem(0);
//    
//    
//    //Check to see if it works for many repeated characters
//    System.out.println("Check to see if it works for many repeated characters");
//    vec.AddItem("aaaaaaaaaaaaaa");
//    vec.AddItem("bbbbbb");
//    vec.AddItem("ccccccccccccc");
//    vec.AddItem("ddddddddddddddd");
//    vec.AddItem("eeeeeeeeeeeeeee");
//    vec.AddItem("ffffffffffffff");
//    vec.AddItem("ggggggggggggg");
//    vec.AddItem("hhhhhhhhhhhhhhhhh");
//    vec.AddItem("iiiiiiiiiiii");
//    vec.AddItem("jjjjjjjjjjj"); 
//    
//    for (int i = 0; i < vec.GetNoOfItems(); i++)
//        System.out.println(vec.GetItemByIndex(i) + " " + i); 
//    
//    //Check to see if the toString function works
        //    System.out.println("Check to see if the toString function works");
//    System.out.println(vec.toString());
//    
//    //Check to see if deleting a empty space doesn't error
//    System.out.println("Check to see if deleting a empty space doesn't error");
//    vec.DeleteItem(10);
//    
//    //TESTING FOR DOUBLY LINKED LIST
//    System.out.println("TESTING FOR DOUBLY LINKED LIST");
//    
//    DoublyLinkedList list = new DoublyLinkedList();
//    
//    //Attempt to add an item to the list to creat the root node
//    System.out.println("Attempt to add an item to the list to creat the root node");
//    
//    list.AddItem("Root");
//    
//    //First attempt at getting an item by index
//    System.out.println("First attempt at getting an item by index");
//    
//    System.out.println("The data item at index 0 is " + list.GetItemByIndex(0));
//    
//    //Attempt at getting the node when the index is 0
//    System.out.println("Attempt at getting the node when the index is 0");
//    
//    System.out.println("The node at place 0 is " + list.GetNodeByIndex(0));
//    
//    //Attempt at getting number of items when it is 1
//    System.out.println("Attempt at getting number of items when it is 1");
//    
//    System.out.println("The number of items in the list is " + list.GetNoOfItems());
//    
//    //Attempt to delete the root node
//    System.out.println("Attempt to delete the root node");
//    
//    list.DeleteItem(0);
//    System.out.println("Root node is equal to " + list.GetNodeByIndex(0));
//    
//    //Attempt to add three items to the linked list
//    System.out.println("Attempt to add four items to the linked list");
//    
//    list.AddItem("Root");
//    list.AddItem("Middle");
//    list.AddItem("Middle2");
//    list.AddItem("End");
//    
//    for (int i = 0; i < list.GetNoOfItems(); i++)
//    {
//        System.out.println("Node " + i + " " + list.GetItemByIndex(i));
//    }
//    
//    //See if getting the number of items works
//    System.out.println("See if getting the number of items works");
//    
//    System.out.println("The number of items is " + list.GetNoOfItems());
//    
//    //Try to use the get node function for an item at the beggining, middle and end
//    System.out.println("Try to use the get node function for an item at the beggining, middle and end");
//    
//    System.out.println("The node at the beggining is " + list.GetNodeByIndex(0));
//    System.out.println("The node in position 2 is " + list.GetNodeByIndex(2));
//    System.out.println("The node at the end of the list is " + list.GetNodeByIndex(3));
//    
//    //Try to delete the item at the end of the list
//    System.out.println("Try to delete the item at the end of the list");
//    
//    list.DeleteItem(3);
//    System.out.println("Attempting to get the item where the end once was gives " + list.GetNodeByIndex(3));
//    
//    //Try to delete the item at the end of the list
//    System.out.println("Try to delete the item at the middle of the list");
//    
//    list.DeleteItem(2);
//    System.out.println("Attempting to get the item where the middle once was gives " + list.GetNodeByIndex(2));
//    
//    //Try to delete the item at the start of the list
//    System.out.println("Try to delete the item at the start of the list");
//    
//    list.DeleteItem(0);
//    System.out.println("Attempting to get the item where the root once was gives " 
//    + list.GetNodeByIndex(0) + " which is the last remaining item which has filled the spot: " + list.GetItemByIndex(0));
//    
//    list.DeleteItem(0);
//    
//    //Try to insert an item when there are no items in the list
//    System.out.println("Try to insert an item when there are no items in the list (hi)");
//    
//    list.InsertItem(0, "hi");
//    System.out.println("The item at place 1 is " + list.GetItemByIndex(0));
//    
//    //Try inserting a item with an index that is out of range
//    System.out.println("Try inserting a item with an index that is out of range");
//    
//    list.InsertItem(5, "OutOfRangeVal");
//    System.out.println("This item should be at place 1: " + list.GetItemByIndex(1));
//    
//    list.DeleteItem(0);
//    list.DeleteItem(0);
//    
//    list.AddItem("Root");
//    list.AddItem("Middle");
//    list.AddItem("Middle2");
//    list.AddItem("End");
//    
//    for (int i = 0; i < list.GetNoOfItems(); i++)
//    {
//        System.out.println("Node " + i + " " + list.GetItemByIndex(i));
//    }
//    
//    //Try inserting an item at 2 in a list of 4 items
//    System.out.println("Try inserting an item at 2 in a list of 4 items");
//    
//    list.InsertItem(2, "ValueInsertedAtPlace2");
//    System.out.println("The value at palce 2 is: " + list.GetItemByIndex(2));
//    System.out.println("The value after the inserted value is " + list.GetItemByIndex(3));
//    
//    
//    for (int i = 0; i < list.GetNoOfItems(); i++)
//    {
//        System.out.println("Node " + i + " " + list.GetItemByIndex(i));
//    }
//    
//    //Try inserting a value at the end of a list
//    System.out.println("Try inserting a value at the ned of a list");
//    
//    list.InsertItem(5, "EndOfTheListInsertion");
//    System.out.println("The value at palce 5 is: " + list.GetItemByIndex(5));
//    
//    for (int i = 0; i < list.GetNoOfItems(); i++)
//    {
//        System.out.println("Node " + i + " " + list.GetItemByIndex(i));
//    }
//    
//    //TRy inserting an item at the beginning of an already populated list
//    System.out.println("TRy inserting an item at the beginning of an already populated list");
//    
//    list.InsertItem(0, "ItemInsertedAtFront");
//    System.out.println("The value at palce 0 is: " + list.GetItemByIndex(0));
//    
//    for (int i = 0; i < list.GetNoOfItems(); i++)
//    {
//        System.out.println("Node " + i + " " + list.GetItemByIndex(i));
//    }
//    
//    //Check if previous, next and data are all in the right place for each node
//    System.out.println("Check if previous, next and data are all in the right place for each node");
//    
//    for (int i = 0; i < list.GetNoOfItems(); i++)
//        System.out.println(list.toString(i));
//    
//    //TESTING FOR QUEUE
//    System.out.println("TESTING FOR QUEUE");
//    
//    MyQueue queue = new MyQueue();
//    
//    //Test if adding a single item to the queue adds to the queue
//    System.out.println("Test if adding a single item to the queue adds to the queue");
//      
//    //Also test to see if getting the number of items works
//    System.out.println("Number of items in queue before push: " + queue.GetNoOfItems());
//    queue.Push("Item");
//    System.out.println("Number of items in queue now: " + queue.GetNoOfItems());
//    
//    //Test to see if I can pop this item and it will return the value
//    System.out.println("Test to see if I can pop this item and it will return the value");
//    
//    System.out.println(queue.Pop());
//    System.out.println("Number of items in queue now: " + queue.GetNoOfItems());
//    
//    //Test to see what will happen if I pop from the emptry queue
//    System.out.println("Test to see what will happen if I pop from the emptry queue");
//    
//    System.out.println(queue.Pop());
//    
//    //See if pushing 20 items into the queue will work
//    System.out.println("See if pushing 20 items into the queue will work");
//    
//    for (int i = 0; i<20; i++)
//    {
//        queue.Push("Item" + i);
//    }
//    
//    System.out.println("Number of items in queue now: " + queue.GetNoOfItems());
//    
//    //See if the previous and next pointers are all correct
//    System.out.println("See if the previous and next pointers are all correct");
//    
//    for (int i = 0; i < queue.GetNoOfItems(); i++)
//        System.out.println(queue.toString(i));
//    
//    //See if popping all 20 items will work
//    System.out.println("See if popping all 20 items will work");
//    
//    for (int i = 0; i<20; i++)
//    {
//        System.out.println(queue.Pop());
//    }
//    
//    //TESTING FOR HASHMAP
//    System.out.println("TESTING FOR HASHMAP");
//
//    
//    //Test for a homemade hash map, adding my own items to it
//    System.out.println("Test for a homemade hash map, adding my own items to it");
//    HashMap hash = new HashMap(5);
//    
//    hash.AddItem("John", "A name called John");
//    hash.AddItem("Jim", "A name called Jim");
//    hash.AddItem("Jack", "A name called Jack");
//    hash.AddItem("Jill", "A name called Jill");
//    hash.AddItem("Jayne", "A name called Jayne");
//    
//    //See if it returns the values for the keys I request, try with caps and non caps
//    System.out.println("See if it returns the values for the keys I request");
//    System.out.println("Try with caps and non-caps");
//    
//    System.out.println("Definition for 'Jill'");
//    System.out.println(hash.GetValue("Jill"));
//    System.out.println("Definition for 'John'");
//    System.out.println(hash.GetValue("John"));
//    System.out.println("Definition for 'jack'");
//    System.out.println(hash.GetValue("jack"));
//    System.out.println("Definition for 'JAYNE'");
//    System.out.println(hash.GetValue("JAYNE"));
//    System.out.println("Definition for 'JIM'");
//    System.out.println(hash.GetValue("JIM"));
//    
//    //This line first adds the dictionary items into the hashmap, automatically resizing as it does so
//    //so that all the items in the dictionary can fit inside of the hashmap    
//    System.out.println("Adds dictionary items to the hashmap, resizing automatically to fit the dictionary in");
//    HashMap dict=CreateDictionary();
//    
//    
//  
//    //Scanner in=new Scanner(System.in);
//    //while (true)
//    //{
//      //System.out.println("Enter word to look up (enter '0' to exit): ");
//      //String search=in.next();
//      //if (search.equals("0"))
//        //break;
//        
//    //}
    
    //TESTING FOR MERGE SORT
    System.out.println("TESTING FOR MERGE SORT");
    
    MergeSort merge = new MergeSort();
    
    //Test if the merge sort sorts singular characters
    System.out.println("Test if the merge sort sorts singular characters");
    String[] data = new String[] {"z", "v", "a", "d", "j", "l"};
    merge.Sort(data);
    for (int i = 0; i < data.length; i++)
    {
        System.out.println(data[i]);
    }  
    
    //Test if the merge sort will sort these characters if some are captials and some aren't
    System.out.println("Test if the merge sort will sort these characters if some are captials and some aren't");
    data = new String[] {"Z", "v", "A", "d", "J", "l"};
    merge.Sort(data);
    
    //Test if it sorts words with more than one character
    System.out.println("Test if it sorts words with more than one character");
    data = new String[] {"hello", "john", "digger", "zebra", "lime", "abra"};
    merge.Sort(data);
    
    //Test if it sorts words with the same first character
    System.out.println("Test if it sorts words with the same first character");
    data = new String[] {"hello", "hallo", "hale", "hill", "holding", "hlod"};
    merge.Sort(data);   
    
    //Test to see what happens if it searches a empty list
    System.out.println("Test to see what happens if it searches a empty list");
    data = new String[] {};
    merge.Sort(data);   
    
    //See if it correctly sorts multiples of the same character
    System.out.println("See if it correctly sorts multiples of the same character");
    data = new String[] {"aaa", "a", "aa", "aaaaaa", "aa", "aaaaa"};
    merge.Sort(data);
    
    
    //TESTING FOR SPARSE MATRIX
    System.out.println("TESTING FOR SPARSE MATRIX");
    
    SparseMatrix mat = new SparseMatrix();
    
    //row - col
    //Create a 4 by 4 matrix
    System.out.println("Create a 4 by 4 matrix");
    mat.Create(4, 4);
    
    //Add a bunch of random values in random locations
    System.out.println("Add a bunch of random values in random locations");
    mat.SetValue(2, 2, 29);
    mat.SetValue(3, 2, 20);
    mat.SetValue(1, 1, 8);
    mat.SetValue(0, 0, 11);
    mat.SetValue(3, 3, 11);
    
    
    //Test to see if getting the values works and that the values are in the correct locations
    System.out.println("Test to see if getting the values works and that the values are in the correct locations");
    
    for (int i = 0; i < mat.height; i++)
    {
        for (int j = 0; j < mat.width; j++)
            System.out.print(mat.GetValue(i, j) + " ");
        System.out.println("");
    }
    
    
    //See if overwriting a value works
    System.out.println("See if overwriting a value works");
    mat.SetValue(2, 2, 21);
    
    for (int i = 0; i < mat.height; i++)
    {
        for (int j = 0; j < mat.width; j++)
            System.out.print(mat.GetValue(i, j) + " ");
        System.out.println("");
    }
    
    //Test to see what happens if you try and add an item which is out of range
    System.out.println("Test to see what happens if you try and add an item which is out of range");
    mat.SetValue(-1, 10, 21);
    
    //Test to see what happens when you try to add a value which is 0
    System.out.println("Test to see what happens when you try to add a value which is 0");
    mat.SetValue(2, 2, 0);
    
    //Test to see if creating a new matrix deletes the old one, also try a larger matrix
    System.out.println("Test to see if creating a new matrix deletes the old one, also try a larger matrix");
    mat.Create(15,15);
    
    for (int i = 0; i < mat.height; i++)
    {
        for (int j = 0; j < mat.width; j++)
            System.out.print(mat.GetValue(i, j) + " ");
        System.out.println("");
    }
    
    //See what happens if you make a matrix with 0 width and 0 height
    System.out.println("See what happens if you make a matrix with 0 width and 0 height");
    mat.Create(0,0);
    
    
    //Test with a bunch more values
    System.out.println("Test with a bunch more values");
    
    for (int i = 0; i < 15; i++)
    {
        mat.SetValue(i, i, 2);
    }
    
    for (int i = 0; i < mat.height; i++)
    {
        for (int j = 0; j < mat.width; j++)
            System.out.print(mat.GetValue(i, j) + " ");
        System.out.println("");
    }
    
    //And again
    System.out.println("And again");
    for (int i = 14, j = 0; i >= 0; i--, j++)
    {
        mat.SetValue(i, j, 6);
    }
    
    for (int i = 0; i < mat.height; i++)
    {
        for (int j = 0; j < mat.width; j++)
            System.out.print(mat.GetValue(i, j) + " ");
        System.out.println("");
    }
    
  }
  
}

