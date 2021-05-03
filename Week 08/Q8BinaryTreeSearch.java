/*
 Author:  Mike O'Malley
   Date:  04-May-2021
Descrtn:  Week 8 Tutorial questions - stacks, queues, trees, BinaryTrees, etc.

Q8BinaryTreeSearch
8. (Binary Search Tree) Modify class Tree to include method contains(), which attempts to locate a specified value in a binary-search- tree object. The method should take as an argument a search key to locate. If the node containing the search key is found, the method should return a reference to that node’s data; otherwise, it should return null. The code for the Tree and TreeNode classes is provided on the unit website in the week 12 tutorial area.

The signature for the contains() method you have to add to the Tree class is:
	public T contains( T value )

The skeleton code for your main method is given below:

public static void main( String[] args ){
      Tree< Integer > tree = new Tree< Integer >();
      Random randomNumber = new Random();

      System.out.println( "Inserting the following values: " );

      // create Objects to store in tree
      for ( int i = 0; i < 10; i++ )
      {
         int number = randomNumber.nextInt( 100 );
         System.out.printf( "%d ", number );
         tree.insertNode( number );
      } // end for

      //Create a Scanner object and ask the user
      //for the number to be searched for in the tree
      <to be completed>

      // search for the number entered by the user
      // this tests the contains() method you added to the Tree
// class
      Integer result = tree.contains( searchNumber );

      // depending on whether or not the result returned is null
      // print out a message to indicate whether the number was
      // found in the tree or not
      <to be completed>

} // end main

Test your program (and contains() method) thoroughly.


Mike O's extras / homework for students to do:
*

*/
public class Q8BinaryTreeSearch
{
   public static void main (String[] args)
   {

   }
}
