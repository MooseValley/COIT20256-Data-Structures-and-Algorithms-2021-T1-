/*
 Author:  Mike O'Malley
   Date:  27-Apr-2021
Descrtn:  Recursion VS Iteration.

2. Find the error(s) in the following recursive method, and explain how to
correct it (them). This method should find the sum of the values from 0 to n.

     public int sum( int n ) {
        if( n == 0 )
           return 0;
        else
           return n + sum( n );
      } // end method sum

*/
public class Q2SumRecursion
{
   public static int sumRecursion( int n )
   {
     if( n <= 0 )  // ERROR #1: == should be <= to handle negative values.
        return 0;
     else
        return n + sumRecursion( n - 1 ); // ERROR #2: (n) should be (n-1) or it wont converge to an answer.  You will get StackOverflow errors.
   } // end method sum

   public static int sumIteration( int n )
   {
     int total = 0;

     for (int k = 0; k <= n; k++)
     {
        total += k;
     }

     return total;
   } // end method sumIteration


   public static void main (String[] args)
   {
      System.out.println (sumRecursion (10) );
      System.out.println (sumIteration (10) );

      System.out.println (sumRecursion (-10) );
      System.out.println (sumIteration (-10) );
   }

}