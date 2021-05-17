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

      int sum = list.stream()
                .filter(value -> value % 2 != 0)
                .sum()
   }
}