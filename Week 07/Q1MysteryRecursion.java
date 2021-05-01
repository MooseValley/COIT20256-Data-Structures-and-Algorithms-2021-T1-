/*
 Author:  Mike O'Malley
   Date:  27-Apr-2021
Descrtn:  Recursion VS Iteration.

1. What does the following code do?

   public int mystery( int a, int b ) {
      if( b == 1 )
         return a;
      else
         return a + mystery( a, b - 1 );
   } // end method mystery


The code returns a x b.

Example: mystery (5, 9)

5 + mystery (5, 8)      45
5 + mystery (5, 7)      40
:::
5 + mystery (5, 2)      10
5 + mystery (5, 1)      5

*/
public class Q1MysteryRecursion
{

   public static int mystery( int a, int b ) {
      if( b == 1 )
         return a;
      else
         return a + mystery( a, b - 1 );
   } // end method mystery

   public static void main (String[] args)
   {
      System.out.println (mystery (5, 9) );  // 45
      System.out.println (mystery (3, 10) ); // 30
   }

}