


// class Tree definition
public class Tree< T extends Comparable< T > >
{
   private TreeNode< T > root;

   // constructor initializes an empty Tree of integers
   public Tree()
   {
      root = null;
   } // end Tree no-argument constructor

   // insert a new node in the binary search tree
   public void insertNode( T insertValue )
   {
      if ( root == null )
         root = new TreeNode< T >( insertValue ); // create root node
      else
         root.insert( insertValue ); // call the insert method
   } // end method insertNode

   // begin preorder traversal
   public void preorderTraversal()
   {
      preorderHelper( root );
   } // end method preorderTraversal

   // recursive method to perform preorder traversal
   private void preorderHelper( TreeNode< T > node )
   {
      if ( node == null )
         return;

      System.out.printf( "%s ", node.data ); // output node data
      preorderHelper( node.leftNode ); // traverse left subtree
      preorderHelper( node.rightNode ); // traverse right subtree
   } // end method preorderHelper

   // begin inorder traversal
   public void inorderTraversal()
   {
      inorderHelper( root );
   } // end method inorderTraversal

   // recursive method to perform inorder traversal
   private void inorderHelper( TreeNode< T > node )
   {
      if ( node == null )
         return;

      inorderHelper( node.leftNode ); // traverse left subtree
      System.out.printf( "%s ", node.data ); // output node data
      inorderHelper( node.rightNode ); // traverse right subtree
   } // end method inorderHelper

   // begin postorder traversal
   public void postorderTraversal()
   {
      postorderHelper( root );
   } // end method postorderTraversal

   // recursive method to perform postorder traversal
   private void postorderHelper( TreeNode< T > node )
   {
      if ( node == null )
         return;

      postorderHelper( node.leftNode ); // traverse left subtree
      postorderHelper( node.rightNode ); // traverse right subtree
      System.out.printf( "%s ", node.data ); // output node data
   } // end method postorderHelper


/* *** WIP ***

   public TreeNode< T > contains (T searchValue)
   {
      return root.contains(searchValue);
   }
*/

   // search / locate an element in the tree
   public T contains( T value )
   {
      TreeNode< T > current = root;

      while ( current != null )
      {
         int compareResult = value.compareTo( current.data );

         if ( compareResult < 0 )
            current = current.leftNode; // search left subtree
         else if ( compareResult > 0 )
            current = current.rightNode; // search right subtree
         else
            return current.data; // element found
      } // end while

      return null; // element not found
   } // end method contains


} // end class Tree
/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
