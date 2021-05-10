/*
 Author:  Mike O'Malley
   Date:  04-May-2021
Descrtn:  Week 8 Tutorial questions - stacks, queues, trees, BinaryTrees, etc.


1. (Printing a Sentence in Reverse Using a Stack) Write a program that inputs a line of text and uses a stack to display the words of the line in reverse order.  Use java.util.Stack.

Mike O's extras / homework for students to do:
*

*/
import java.util.Scanner;
import java.util.Stack;

public class Q1StackReverseSentence
{
   public static void main (String[] args)
   {
	   Scanner kb = new Scanner (System.in);
	   Stack<String> wordStack = new Stack<String> ();

	   // Prompt the user for the line of test (string of words)
	   System.out.println ("Enter text:");
	   String inStr = kb.nextLine();

/*
	   String[] wordsArray = inStr.split ("\\s+");
		for (int k = 0; k < wordsArray.length; k++)
		{
			//insert the word into the tree
			wordStack.push (wordsArray [k]);
		}
*/

		// Equivalent to the above commented out code but 1 less line of code:
		for ( String word : inStr.split( "\\s+" ) )
		{
			//insert the word into the tree
			wordStack.push (word);
		}


		// Display the words in reverse order:
		while ( wordStack.isEmpty () == false )
		{
			System.out.println (wordStack.pop () );
		}
   }
}

