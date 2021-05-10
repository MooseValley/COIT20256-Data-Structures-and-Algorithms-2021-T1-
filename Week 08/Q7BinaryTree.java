/*
 Author:  Mike O'Malley
   Date:  04-May-2021
Descrtn:  Week 8 Tutorial questions - stacks, queues, trees, BinaryTrees, etc.

Q7BinaryTree
7. (Processing a Binary Search Tree of Strings) Write a program based on the Tree and TreeNode class discussed in the textbook. The program is to read a line of text from the user, tokenizes it into separate words, insert the words in a binary search tree and print the resulting tree using the  methods for inorder, preorder and postorder traversals of the tree. The code for the Tree and TreeNode classes is provided on the unit website in the week 12 tutorial area.
The skeleton for the main method of your program is given below. Add the code to achieve the functionality described by the comments.

public static void main(String[] args) {
   // create a Scanner to get input string
   <<todo>>

   // Prompt the user for the line of test (string of words)
   <<todo>>

   //use the Scanner object to read the input
   <<todo>>

   //Create a new tree (Tree<String> tree = ...)to store the words
   <<todo>>

   // insert input string of words into the into the tree
   // use split("\\s+") to split the input String of words into
   // individual words and insert the words into the tree
   for ( String word : input.split( "\\s+" ) )
         //insert the word into the tree
         <<todo>>

   //print out the contents of the tree using preorder traversal
   <<todo>>

   //print out the contents of the tree using inorder traversal
   <<todo>>

   //print out the contents of the tree using postorder traversal
   <<todo>>

}
Test your program thoroughly. Predict what will be output by each of the traversal methods for the tree that will be built from the data you input.


Mike O's extras / homework for students to do:
*

*/

import java.util.Scanner;

public class Q7BinaryTree
{
   public static void main (String[] args)
   {
	   String inStr = "";

/*
	   // create a Scanner to get input string
	   Scanner kb = new Scanner (System.in);

	   // Prompt the user for the line of test (string of words)
	   System.out.println ("Enter text:");

	   //use the Scanner object to read the input
	   inStr = kb.nextLine();
*/

		inStr = "Frankie  Mike       Bella Bear Dog    Biter Saminal  Teenie-Weenie  Ben";

		String treeMapStr =
			"                 Frankie                        " + "\n" +
			"                /       \\                      " + "\n" +
			"              /           \\                    " + "\n" +
			"           Bella           Mike                 " + "\n" +
			"          /    \\           /   \\              " + "\n" +
			"      Bear     Biter     Dog   Saminal          " + "\n" +
			"               /                  \\            " + "\n" +
			"             Ben                Teenie-Weenie   " + "\n" +
			"";

	   System.out.println ("Mike's Tree:" + "\n" + treeMapStr + "\n");


		//Create a new tree (Tree<String> tree = ...)to store the words
		Tree<String> tree = new Tree<String> ();

		// insert input string of words into the into the tree
		// use split("\\s+") to split the input String of words into
		// individual words and insert the words into the tree
		for ( String word : inStr.split( "\\s+" ) )
		{
			//insert the word into the tree
			tree.insertNode (word);
		}

		//print out the contents of the tree using preorder traversal
		System.out.println ("\n" + "preorderTraversal:");
		tree.preorderTraversal();
		System.out.println ();

		//print out the contents of the tree using inorder traversal
		System.out.println ("\n" + "inorderTraversal:");
		tree.inorderTraversal();
		System.out.println ();

		//print out the contents of the tree using postorder traversal
		System.out.println ("\n" + "postorderTraversal:");
		tree.postorderTraversal();
		System.out.println ();

		System.out.println ();
	}
}


/*
		inStr = "Frankie  Mike       Bella Bear Dog    Biter Saminal  Teenie-Weenie  Ben";

                             Frankie
                             /      \
                        Bella        Mike
                        /   \           \
                     Bear    Dog        Saminal
                       \                  \
                       Biter             Teenie-Weenie
                       /
                     Ben

*/