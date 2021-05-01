/*
 Author:  Mike O'Malley
   Date:  27-Apr-2021
Descrtn:  Recursion VS Iteration.

3. Write a recursive sum() method that sums the elements
in an array of integers. The method signature is as follows:

   public static int sum(int[] a, int index)

Test your sum method in the main method of your program
with the following array:

   int [] array = { 1, 2, 3, 4, 5 };

Print out the result returned by sum to check that the
method works correctly. Are there any other test cases you
should use to exercise this method?

NOTE:
* Question does not say what index is for.
* Assume that we are summing the array elements from index forward to the end of the array.


*/
public class Q3SumRecursionOfArray
{
   public static int sumRecursion(int[] a, int index)
   {
     if ((index < 0 ) || (index >= a.length) )
        return 0;
     else
        return a[index] + sumRecursion(a, index + 1 );
   } // end method sum

   public static int sumIteration(int[] a, int index)
   {
     int total = 0;

     if ((index < 0 ) || (index >= a.length) )
     {
        // Do nothing.  Kept the if test this way to match the above.
     }
     else
     {
        for (int k = index; k < a.length; k++)
        {
           total += a [k];
        }
     }

     return total;
   } // end method sumIteration


   public static void main (String[] args)
   {
      int [] array = { 1, 2, 3, 4, 5 };

      System.out.println (sumRecursion (array, 0) ); // 15
      System.out.println (sumIteration (array, 0) );

      System.out.println (sumRecursion (array, 2) ); // 12
      System.out.println (sumIteration (array, 2) );

      System.out.println (sumRecursion (array, 4) ); // 5
      System.out.println (sumIteration (array, 4) );

      System.out.println (sumRecursion (array, 5) );  // 0.  ERROR: Index exceeds array size.
      System.out.println (sumIteration (array, 5) );

      System.out.println (sumRecursion (array, -2) ); // 0.  ERROR: Index < 0.
      System.out.println (sumIteration (array, -2) );
   }

}