/*
 Author:  Mike O'Malley
 Source:  Q4.java
Descrtn:  Generic classes.  Week 6, Tutorial Qurestion 4.

4.	(Generic isEqualTo Method)
Write a simple generic version of method isEqualTo that compares
its two arguments with the equals method and returns  true if they
are equal and false otherwise. Use this generic method in a program
that calls isEqualTo with a variety of built-in types, such as Object
or Integer. What result do you get when you attempt to run this program?


REF:  https://stackoverflow.com/questions/6821810/determine-if-two-java-objects-are-of-the-same-class


*** Sample output:

--------------------  -------      --------------------  -------      -------
Item 1 Type           Value        Item 2 Type           Value        Same ?
--------------------  -------      --------------------  -------      -------
java.lang.Integer        4         java.lang.Integer        4         true
java.lang.Integer        4         java.lang.String         4         false
java.lang.String         4         java.lang.Integer        4         false
java.lang.String         4         java.lang.String         4         true



Ammendment History
Ver   Date        Author    Details
----- ----------- --------  ---------------------------------------------------
0.001 20-Apr-2021 Mike O    Created.

*/

public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
		Object  fourObject1 =  4;  // Treated as Integer !
		Object  fourObject2 = "4"; // Treated as String !
		Integer fourInteger =  4;
		String  fourString  = "4";

		System.out.println ("--------------------  -------      --------------------  -------      -------");
		System.out.println ("Item 1 Type           Value        Item 2 Type           Value        Same ? ");
		System.out.println ("--------------------  -------      --------------------  -------      -------");

        displayAndCompare (fourInteger, fourObject1);
        displayAndCompare (fourInteger, fourObject2);

        displayAndCompare (fourString,  fourObject1);
        displayAndCompare (fourString,  fourObject2);

   } // end main


   // Generic method that displays items and classes and calls isEqualTo
   public static <T,U> void displayAndCompare ( T item1, U item2)
   {
	   System.out.println (String.format ("%-25s", item1.getClass().getName() ) +
	                       String.format ("%-10s", item1)                       +
	                       String.format ("%-25s", item2.getClass().getName() ) +
	                       String.format ("%-10s", item2)                       +
	                       isEqualTo (item1,  item2)
	                      );
   }

   public static <T,U> boolean isEqualTo ( T item1, U item2)
   {
	   boolean result = item1.getClass().equals (item2.getClass() );

	   if (result == true)
	   {
		   // Do deeper checking ...
		   // They are the same data type, now see if they have exactly the same value.

		   result = item1.equals (item2);
	   }

	   return result;
   } // end method displayArray

}
