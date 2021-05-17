/*

3.      Assuming that random is a SecureRandom object, explain in detail the stream pipeline:

random.ints(1000000, 1, 3)
   .boxed()
   .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
   .forEach((side, frequency) ->
            System.out.printf("%-6d%d%n", side, frequency));

*/
import java.security.SecureRandom;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q3IntFrequency
{
   public static void main (String[] args)
   {
      SecureRandom random = new SecureRandom ();

      random.ints(1000000, 1, 3)
         .boxed()
         .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
         .forEach((side, frequency) ->
                  System.out.printf("%-6d%d%n", side, frequency));
   }
}