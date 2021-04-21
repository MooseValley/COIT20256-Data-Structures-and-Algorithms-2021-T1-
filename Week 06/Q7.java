/*
 Author:  Mike O'Malley
 Source:  Q7.java
Descrtn:  Generic classes.  Week 6, Tutorial Qurestion 7.

7.	Provide a declaration and implementation of the generic method findMinimum( )
that takes an array of generic type T as the argument and returns the minimum
value of the array. Test this generic method with the Integer and String type data.

Integer[] intArr = {5, 3, 7, 1, 4, 9, 8, 2};
String[]  strArr = {"pear", "apple", "orange", "grape"};  // Missing ending brace in question.



*** Sample output:

1
apple



Ammendment History
Ver   Date        Author    Details
----- ----------- --------  ---------------------------------------------------
0.001 20-Apr-2021 Mike O    Created.

*/

public class Q7
{
	public static <T extends Comparable> T findMinimum (T[] array)
	{
		// Assume array contains at least 1 element.
		T minimum = array[0];

		for (int k = 0; k < array.length; k++)
		{
			if (minimum.compareTo (array[k]) > 0)
			{
				minimum = array[k]; // We have found a new minimum.
			}
		}

		return minimum;
	}

    public static void main(String[] args)
    {
		Integer[] intArr = {5, 3, 7, 1, 4, 9, 8, 2};
		String[]  strArr = {"pear", "apple", "orange", "grape"};  // Missing ending brace in question.

		System.out.println (findMinimum (intArr) );
		System.out.println (findMinimum (strArr) );

   } // end main
}
