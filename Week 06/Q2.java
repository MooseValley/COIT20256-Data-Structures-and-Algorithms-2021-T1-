/*
 Author:  Mike O'Malley
 Source:  Q2.java
Descrtn:  Generic classes.  Week 6, Tutorial Qurestion 2.
Based on: Q1.java

2.	(Overloaded Generic Method printArray) Overload generic
method printArray from the lecture so that it  takes  two  additional
integer  arguments,  lowSubscript and highSubscript. A call to this
method prints only the designated portion of the array and returns the
number of elements printed. Validate lowSubscript and highSubscript.
If either is  out  of  range,  adjust  their  values  (as  discussed
in  class). Then modify main to exercise both versions of printArray
on arrays integerArray, doubleArray and characterArray.
Test all capabilities of both versions of printArray.


*** Sample output:

Displaying array from indexes: 0 to 9 inclusive:
9  3  6  4  8  10  1  7  5  2

Displaying array from indexes: 3 to 6 inclusive:
4  8  10  1

Displaying array from indexes: 3 to 9 inclusive:
4  8  10  1  7  5  2

Displaying array from indexes: 0 to 9 inclusive:
9  3  6  4  8  10  1  7  5  2

Displaying array from indexes: 0 to 3 inclusive:
9  3  6  4


Ammendment History
Ver   Date        Author    Details
----- ----------- --------  ---------------------------------------------------
0.001 20-Apr-2021 Mike O    Created.

*/

public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
		              // 0  1  2  3  4   5  6  7  8  9
      Integer[] data = { 9, 3, 6, 4, 8, 10, 1, 7, 5, 2 };

      printArray( data, 0, 9 );

      printArray( data, 3, 6 );

      printArray( data, 3, 99 );

      printArray( data, -1, 99 );

      printArray( data, 3, 0);
   } // end main


   // generic method that displays array element
   public static <T> void printArray( T[] array, int lowIndex, int highIndex)
   {
	   lowIndex  = Math.max (0,                lowIndex);
	   lowIndex  = Math.min (array.length - 1, lowIndex);

	   highIndex = Math.min (array.length - 1, highIndex);

	   if (lowIndex > highIndex)
	   {
		   // Swap the values:
		   int temp  = lowIndex;
		   lowIndex  = highIndex;
		   highIndex = temp;
	   }

      // Display each element
	  System.out.println ("\n" + "Displaying array from indexes: " +
	                      lowIndex + " to " + highIndex + " inclusive:");

      for (int k = lowIndex; k <= highIndex; k++)
      {
		System.out.print( array[k] + "  ");
	  }

      System.out.println();
   } // end method displayArray

}
