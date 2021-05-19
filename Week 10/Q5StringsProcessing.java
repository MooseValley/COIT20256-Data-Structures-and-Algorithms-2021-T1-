/*
5. Write a java program to:
a) Display the original string values in the array
b) Display the string values converted to uppercase
c) Display the string values in ascending order after filtering the values starting with g or less
d) Display the string values in ascending order after filtering the values starting with g or less.
Data: String [] names = {"bob", "Mary", "Andrew", "Tomy", "Michael", "Kathy", "lily", "Frances"}

Hint: see Slides 39-41 !

Mike O's Notes:
* (c) and (d) above are the same - so make one case sensitive and the other case insensitive.


Mike O's extra tasks for students:
* Add (e) and (f) where the order is descending (not ascending).

*/
import java.util.*;
import java.util.stream.*;

public class Q5StringsProcessing
{
   public static void main (String[] args)
   {
		String[] names = {"bob", "Mary", "Andrew", "Tomy", "Michael", "Kathy", "lily", "Frances"};


		System.out.println ("Original names:  "  + Arrays.asList (names) );

		System.out.println ("Uppercase names: " +
			Arrays.stream (names)
			.map(String :: toUpperCase)
			.collect (Collectors.toList() )
			);

		System.out.println ("Sorted names < 'g' (Case Sensitive,   Ascending):  " +
			Arrays.stream (names)
			.filter (s -> s.compareToIgnoreCase("g") < 0)
			.sorted ()
			.collect (Collectors.toList() )
			);

		System.out.println ("Sorted names < 'g' (Case Insensitive, Ascending):  " +
			Arrays.stream (names)
			.filter (s -> s.compareToIgnoreCase("g") < 0)
			.sorted (String.CASE_INSENSITIVE_ORDER)
			.collect (Collectors.toList() )
			);

		System.out.println ("Sorted names < 'g' (Case Sensitive,   Descending): " +
			Arrays.stream (names)
			.filter (s -> s.compareToIgnoreCase("g") < 0)
			.sorted ()
			.collect (Collectors.toList() )
			);

		System.out.println ("Sorted names < 'g' (Case Insensitive, Descending): " +
			Arrays.stream (names)
			.filter (s -> s.compareToIgnoreCase("g") < 0)
			.sorted (String.CASE_INSENSITIVE_ORDER.reversed() )
			.collect (Collectors.toList() )
			);

   }
}