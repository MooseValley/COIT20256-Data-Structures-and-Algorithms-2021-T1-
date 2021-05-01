/*
 Author:  Mike O'Malley
   Date:  27-Apr-2021
Descrtn:  Recursion VS Iteration.

4. Write a recursive method recursiveMinimun() that determines
the smallest element in array of integers. The method should
return when it receives an array of one element.

The method signature is as follows:
    public static int recursiveMinimum(int[] array, int index)

Test your recursiveMinimum method in the main method of your
program with the following array:

   int array[] = { 22, 88, 8, 94, 78, 84, 96, 73, 34 }

Print out the result returned by recursiveMinimum to check that the method works correctly. Are there any other test cases you should use to exercise this method?

NOTE:
* Question does not say what index is for.
* Assume that we are summing the array elements from index forward to the end of the array.


*/
public class Q4RecursiveMinimumOfArray
{
   public static int recursiveMinimum(int[] a, int index)
   {
      // Assume array is valid and has elements.

     if (index < 0)
        return recursiveMinimum (a, 0);
     else if (index >= a.length)
        return a[a.length - 1];
     else
        return Math.min (a[index], recursiveMinimum(a, index + 1) );
   } // end method recursiveMinimum

   public static int iterativeMinimum(int[] a, int index)
   {
      // Assume array is valid and has elements.

     int min = 0; // Place holder.  Not safe, not used below.

     if ((index >= 0 ) && (index < a.length) )
     {
        for (int k = index; k < a.length; k++)
        {
           if (k == index)
              min = a [k];  // Must be set to a value in the part of the array being processed.
           else
              min = Math.min (min, a [k]);
        }
     }

     return min;
   } // end method iterativeMinimum


   public static void main (String[] args)
   {
      //               0   1  2   3   4   5   6   7   8
      int array[] = { 22, 88, 8, 94, 78, 84, 96, 73, 34 };

      System.out.println (recursiveMinimum (array, 0) ); // 8
      System.out.println (iterativeMinimum (array, 0) );

      System.out.println (recursiveMinimum (array, 2) ); // 8
      System.out.println (iterativeMinimum (array, 2) );

      System.out.println (recursiveMinimum (array, 3) ); // 34
      System.out.println (iterativeMinimum (array, 3) );

      System.out.println (recursiveMinimum (array, 8) ); // 34
      System.out.println (iterativeMinimum (array, 8) );

      System.out.println (recursiveMinimum (array, 9) );  // 0.  ERROR: Index exceeds array size.
      System.out.println (iterativeMinimum (array, 9) );

      System.out.println (recursiveMinimum (array, -2) ); // 0.  ERROR: Index < 0.
      System.out.println (iterativeMinimum (array, -2) );
   }

}