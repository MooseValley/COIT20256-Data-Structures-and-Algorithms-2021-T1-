/*
Lambdas, Streams, Functional programming
*/

import java.util.stream.*;
import java.util.*;
import java.security.SecureRandom;

public class FunctionalProgrammingLambdasStreams
{
	public static void main (String[] args)
	{
		SecureRandom generator = new SecureRandom ();


		/*
		Generate all values from 1 to 100 incl. and sum them up.

		Intermediate operations are lazy—they aren’t performed until a
		terminal operation is invoked. eg. rangeClosed()

		Terminal operations are eager—they perform the requested
		operation when they are called.  eg. sum().


		*/
		int total = IntStream.rangeClosed (1, 100) //
						.sum();

		System.out.println ("Sum 1 + 2 + 3 + ... + 100 = " + total);


		/*
		Lambda Expression:  (int x) -> {return x * 2; }
		Represents an anonymous method with a parameter list and a body.
		This simple Lambda expression takes an integer and returns double its value.

		Another example is:  (int x, int y) -> {return x + y; }

		map() takes a Lambda expression as an argument.

		*/
		int total2 = IntStream.rangeClosed (1, 10)
						.map( (int x) -> {return x * 2; } )
						.sum();

		System.out.println ("Sum 2 + 4 + 6 + .... + 20 = " + total2);


		/*
			Generate ints 1..10 incl.
			filter out the odd numbers (not divisable by 2) - ie. get the even numbers: 2, 4, 6, 8, 10.
			multiple these even numbers by 3
			and sum the results.
		*/
		int total3 = IntStream.rangeClosed (1, 10)
						.filter ( x -> x % 2 == 0)
						.map( (int x) -> {return x * 3; } )
						.sum();

        //                      2x3  4x3  6x3         10x3
		System.out.println ("Sum 6 + 12 + 18 + .... + 30 = " + total3);


		/*
		Generate 10 random numbers between 1 and 6 inclusive
		and print them one per line.
		*/
		System.out.println ("10 Random numbers (1 per line): ");
		generator.ints (10, 1, 7)
				.forEach (System.out::println);  // object :: method
		System.out.println ();


		// Moose: added this !
		System.out.println ("10 more Random numbers (comma separated, 1 line): ");
		generator.ints (10, 1, 7)
				.forEach ( (int x) -> System.out.print (x + ", ") );
		System.out.println ();


		System.out.println ("10 more Random numbers (comma separated, 1 line): ");
		String numbersStr = generator.ints (10, 1, 7)
								.mapToObj (String::valueOf)
								.collect  (Collectors.joining (", ") );
		System.out.println (numbersStr);



		// Slide 25:
		int[] valuesArray = generator.ints (10, 1, 7).toArray();

		System.out.println ();
	}
}



