/*
 Author:  Mike O'Malley
   Date:  27-Apr-2021
Descrtn:  Recursion VS Iteration.

6.  The following code is the definition of a recursive method.
Show how you work out the output of call g(16).

public static int g(int n) {
   int output=0;
   if (n <= 4)
      output= 1;
   else
      output=g(n/2)+g(n/4);

   return output;
}


Working it out by hand:
         output
g(16)    g(8) + g(4)    = (1 + 1) + 1  = 3
g(8)     g(4) + g(2)    = 1 + 1
g(4)     1
g(2)     1

Answer:  3.
Ran the code and it agrees with my answer.  :)

*/
public class Q6MysteryRecursion
{
   public static int g(int n) {
      int output=0;
      if (n <= 4)
         output= 1;
      else
         output=g(n/2)+g(n/4);

      return output;
   }

   public static void main (String[] args)
   {
      System.out.println (g (16) );
   }
}