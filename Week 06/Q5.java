/*
 Author:  Mike O'Malley
 Source:  Q5.java
Descrtn:  Generic classes.  Week 6, Tutorial Qurestion 5.

5.	(Generic Class Pair)
Write a generic class Pair which has two type parameters – F and S –
each representing the type of the first and second element of the pair,
respectively. Add get and set methods for the first and second elements
of the pair.

Mike's Notes: question could be extended to really explore this Pair class.
Add the following methods:
* Default Constructor
* Parameterised Constructor
* toString
* compareTo (implements Comparable)
* etc


*** Sample output:

10-Hearts
5-Spades


Ammendment History
Ver   Date        Author    Details
----- ----------- --------  ---------------------------------------------------
0.001 20-Apr-2021 Mike O    Created.

*/

class Pair <F,S>
{
	private F first;
	private S second;

	public Pair ()
	{
		this(null, null);
	}

	public Pair (F first, S second)
	{
		this.first  = first;
		this.second = second;
	}

	public F getFirst ()
	{
		return first;
	}

	public S getSecond ()
	{
		return second;
	}

	public void setFirst (F first)
	{
		this.first  = first;
	}

	public void setSecond (S second)
	{
		this.second  = second;
	}

	@Override
	public String toString ()
	{
		return first + "-" + second;
	}
} // class Pair <F,S>


public class Q5
{

    public static void main(String[] args)
    {
		Pair <Integer, String> pair1 = new Pair <>(10, "Hearts");
		Pair <Integer, String> pair2 = new Pair <>(5,  "Spades");

		System.out.println (pair1);
		System.out.println (pair2);

   } // end main
}
