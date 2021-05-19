/*
Lambdas, Streams, Functional programming
My code below shows one way to do this - there are others !  Explore !!

1. Implement the program designed as part of Activity One in Lecture. The question is repeated here.
Write a java program to generate twenty five random integers between 0 and 100 (inclusive),
display the values, display the sorted values, sum and average of the values.
Display the list of values greater than 50. Use Lambdas.


Mike O's extra tasks for students:
* Display Min, Max, Count as well.
* Display the list of values greater than 50 - sorted.
* Display sum, product, sum of squares using the reduce() method.  (Ref: Slide 27)


Mike O's NOTES:
* You can shorten the code below, for example, instead of (int x) just write x.
Change this:
		IntStream.of (valuesArray)
				.forEach ( (int x) -> System.out.print (x + ", ") );

to this:
		IntStream.of (valuesArray)
				.forEach ( x -> System.out.print (x + ", ") );

*/
import java.util.stream.*;
import java.util.*;
import java.security.SecureRandom;

public class Q1RandomIntegers
{
   public static void main (String[] args)
   {
		// See Lecture Slide 25-26 !

		SecureRandom generator = new SecureRandom ();


		// Generate 25 random integers between 0 and 100 (inclusive).
		int[] valuesArray = generator.ints (25, 1, 101).toArray();

		// Display the values:
		System.out.println ("\n" + "25 random integers between 0 and 100 (inclusive):");
		System.out.print ("-> ");
		IntStream.of (valuesArray)
				.forEach ( (int x) -> System.out.print (x + ", ") );
		System.out.println ();

		// Display the values sorted:
		System.out.println ("\n" + "Display data sorted:");
		System.out.print ("-> ");
		IntStream.of (valuesArray)
				.sorted()
				.forEach ( (int x) -> System.out.print (x + ", ") );
		System.out.println ();

		System.out.println ();

		// Sum:
		System.out.println ("Sum     = " + IntStream.of (valuesArray).sum() );

		// Average:
		System.out.println ("Average = " + String.format ("%.2f", IntStream.of (valuesArray).average().getAsDouble() ) );

		// Count:
		System.out.println ("Count   = " + IntStream.of (valuesArray).count() );

		// Min:
		System.out.println ("Min     = " + IntStream.of (valuesArray).min().getAsInt() );

		// Max:
		System.out.println ("Max     = " + IntStream.of (valuesArray).max().getAsInt() );


		// Display the list of values greater than 50.
		System.out.println ("\n" + "Values greater than 50:");
		System.out.print ("-> ");
		IntStream.of (valuesArray)
				.filter ( (int x) -> x > 50 )
				.forEach ( (int x) -> System.out.print (x + ", ") );
		System.out.println ();

		// Display the list of values greater than 50 - sorted.
		System.out.println ("\n" + "Values greater than 50 - sorted:");
		System.out.print ("-> ");
		IntStream.of (valuesArray)
				.filter ( (int x) -> x > 50 )
				.sorted()
				.forEach ( (int x) -> System.out.print (x + ", ") );
		System.out.println ();

		System.out.println ();
   }
}
