/*
 Author:  Mike O'Malley
 Source:  Q1.java
Descrtn:  Generic classes.  Week 6, Tutorial Qurestion 1.
Based on: Week10Q1_v2.java

1.	(Generic Method selectionSort)
Write a generic method selectionSort based on the sort program from chapter 19.
Write a test  program  that  inputs,  sorts  and outputs an Integer array and a
Float array. (The code for selection sort from chapter 19 is available in
this week’s materials on the unit website.)


Generic class to Selection Sort arrays of:
* Integers
* Floats
* Strings
* and any other class - Employee, Customer, Product, etc - that implements Comparable !

Very powerful !


*** Sample output:

Integer data items in original order
  9   3   6   4   8  10   1   7   5   2

Integer data items in ascending order
  1   2   3   4   5   6   7   8   9  10


Float data items in original order
 9.0  3.4  6.1  3.8  3.3 10.9  1.1  7.6  5.9  2.1

Float data items in ascending order
 1.1  2.1  3.3  3.4  3.8  5.9  6.1  7.6  9.0 10.9


String data items in original order
Mike  Frankie  Bella

String data items in ascending order
Bella  Frankie  Mike



Ammendment History
Ver   Date        Author    Details
----- ----------- --------  ---------------------------------------------------
0.001 20-Apr-2021 Mike O    Created.

*/

/*
Notes / discussion:
T
T extends Comparable

String n1 = "Mike";
String n2 = "Frankie";

if (n1.compareTo (n2) < 0)
:::

*/
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // initialize Integer array
      Integer[] data = { 9, 3, 6, 4, 8, 10, 1, 7, 5, 2 };

      // display intArray in original order
      System.out.println( "Integer data items in original order" );
      displayArray( data ); // display array elements

      selectionSort( data ); // sort the array

      // display intArray in sorted order
      System.out.println( "\nInteger data items in ascending order" );
      displayArray( data ); // display array elements
      System.out.println( "\n" );



      Float[] floatData = { 9.0F, 3.4F, 6.1F, 3.8F, 3.3F, 10.9F, 1.1F, 7.6F, 5.9F, 2.1F };

      System.out.println( "Float data items in original order" );
      displayArray( floatData ); // display array elements

      selectionSort( floatData ); // sort the array

      // display intArray in sorted order
      System.out.println( "\nFloat data items in ascending order" );
      displayArray( floatData ); // display array elements
      System.out.println( "\n" );



      String[] stringData = { "Mike", "Frankie", "Bella"};

      System.out.println( "String data items in original order" );
      displayArray( stringData ); // display array elements

      selectionSort( stringData ); // sort the array

      // display stringData in sorted order
      System.out.println( "\nString data items in ascending order" );
      displayArray( stringData ); // display array elements
      System.out.println( "\n" );


   } // end main

   // generic method that sorts elements in array
   public static <T extends Comparable> void selectionSort(T[] array )
   {
      int smallest; // index of smallest element

      // loop over all elements
      for ( int spot = 0; spot < array.length - 1; spot++ )
      {
         smallest = spot;

         // loop to find the smallest
         for ( int element = spot + 1; element < array.length; element++ )
         {
            if ( array[ element ].compareTo (array[smallest] ) < 0 )
               smallest = element;
         } // end for

         // swap smallest element into position
         swap( array, smallest, spot );
      } // end for
   } // end method selectionSort

   // generic method that swaps elements in an array
   public static <T> void swap( T[] array, int first, int second )
   {
      T temp = array[ first ]; // copy first to temp
      array[ first ] = array[ second ]; // copy second to first
      array[ second ] = temp; // copy temp to second
   } // end method swap


   // generic method that displays array element
   public static <T> void displayArray( T[] array )
   {
      // display each element
      for ( T element : array )
      {
		  if (element instanceof Integer)
         	System.out.printf( "%3d ", element );
          else if (element instanceof Float)
         	System.out.printf( "%4.1f ", element );
          else
         	System.out.print( element + "  ");
	  }

      System.out.println();
   } // end method displayArray

}
