/*
 Author:  Mike O'Malley
   Date:  04-May-2021
Descrtn:  Week 8 Tutorial questions - stacks, queues, trees, BinaryTrees, etc.

Q2StackPalindrome
2. (Palindrome Tester) Write a program that uses a stack to determine whether a string is a palindrome (i.e., the string is spelled identically backward and forward). The program should ignore space and punctuation. Use java.util.Stack.

Mike O's extras / homework for students to do:
* Optimization: only push the required chars onto the stack - not ALL the chars.


Examples:
rotor
racecar

Hints and Tips:
	myStr.charAt (3); // 4th
	myStr.length()
	Stack of Character - not char because char is a primitive type.  Need the Wrapper class Character !

*/
import java.util.Scanner;
import java.util.Stack;

public class Q2StackPalindrome
{
	public static final String CHARS_TO_REMOVE = " !@#$%^&*()-=+";  // Feel free to add more !  <,>. etc.  ~`:;\"'<,>.?/\\|


	public static boolean isPalindrome (String inStr)
	{

		Stack<Character> characterStack = new Stack<Character> ();
		boolean result = true; // Assume it is a Palindrome and try and prove this false ...

		inStr = inStr.toLowerCase();

		/*
		inStr = inStr.replace ("!", "");
		inStr = inStr.replace ("!", "");
		inStr = inStr.replace (".", "");
		*/

		for (int k = 0; k < CHARS_TO_REMOVE.length(); k++)
		{
			inStr = inStr.replace ("" + CHARS_TO_REMOVE.charAt (k), "");
		}


		// Push each letter onto the stack:
		// Note: this can be improved / optimised - see "Mike O's extras / homework for students to do" above.
		for (int k = 0; k < inStr.length(); k++)
		{
			characterStack.push (inStr.charAt (k) );
		}

		// Compare first-half of String with first-half of the Stack.
		for (int k = 0; k < inStr.length() / 2; k++)
		{
			if (inStr.charAt (k) != characterStack.pop () )
			{
				result = false;     // Not a Palindrome !
				k = inStr.length(); // Exit Loop ... no need to check further.
			}
		}

		return result;
	}

   public static void main (String[] args)
   {
		Scanner kb = new Scanner (System.in);

		// Prompt the user for the line of test (string of words)
		System.out.println ("Enter text:");
		String inStr = kb.nextLine();

		// Display if it is a Palindrome:
		System.out.println ("Is '" + inStr + "' a palindrome: " +  isPalindrome (inStr) );
   }
}
