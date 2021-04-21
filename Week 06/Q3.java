/*
 Author:  Mike O'Malley
 Source:  Q3.java
Descrtn:  Generic classes.  Week 6, Tutorial Qurestion 3.
Based on: Q2.java

3.	(Overloading a Generic Method with a Nongeneric Method)
Overload the generic method printArray with a nongeneric version that
specifically prints an array of Strings in neat, tabular format.

The question says "prints an array of Strings" - so the whole array.
It does not say "prints part or subset of an array of Strings".

The question is vague.  Should the number of rows and columns of data be passed to the method ?
e.g.  printArray( stringData, 4, 3); // 4 columns, 3 rows.


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

Displaying Array of Strings:
One       Two       Three     Four
Five      Six       Seven     Eight


Ammendment History
Ver   Date        Author    Details
----- ----------- --------  ---------------------------------------------------
0.001 20-Apr-2021 Mike O    Created.

*/

public class Q3 {

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


 		                     // 0      1      2       3       4       5      6        7
      String[] stringData = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight"};

      printArray( stringData );

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


   // generic method that displays array element
   public static <T> void printArray( String[] array)
   {

      // Display each element
	  System.out.println ("\n" + "Displaying Array of Strings: ");

      for (int k = 0; k < array.length; k++)
      {
		System.out.printf("%-10s", array[k] );

		if (k + 1 == array.length / 2)
           System.out.println();
	  }

      System.out.println();
   } // end method displayArray

}
