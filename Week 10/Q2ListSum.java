/*
2. Complete and test Activity Two from the lecture. The question is repeated below:

Assuming the following declaration for list,

   List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

What is wrong with the following code?

   int sum = list.stream()
             .filter(value -> value % 2 != 0)
             .sum()

Correct the code. Test your answer.

*/
import java.util.Arrays;
import java.util.List;

public class Q2ListSum
{
   public static void main (String[] args)
   {
      List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

      /*
      Issue is that sum() requires int data not Integer data - the primitive type not the Wrapper class.
      We need to convert the list of values to int.
      One way to do this is use mapToInt.
      */

      int sum = list.stream()
                .filter(value -> value % 2 != 0)  // Odd integers only
                .mapToInt (Integer :: intValue)
                .sum();

      System.out.println ("Sum = " + sum);


      // Like above, but using a Lambda and type casting ...
      // I like this better than the above "Integer :: intValue" solution.
      int sum2 = list.stream()
                .filter(value -> value % 2 != 0)  // Odd integers only
                .mapToInt (x -> (int) x)
                .sum();

      System.out.println ("Sum = " + sum);

   }
}