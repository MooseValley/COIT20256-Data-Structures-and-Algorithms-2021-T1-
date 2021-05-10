

// class TreeNode definition
public class TreeNode< T extends Comparable< T > >
{
   // package access members
   TreeNode< T > leftNode; // left node
   T data; // node value
   TreeNode< T > rightNode; // right node

   // constructor initializes data and makes this a leaf node
   public TreeNode( T nodeData )
   {
      data = nodeData;
      leftNode = rightNode = null; // node has no children
   } // end TreeNode constructor

   // locate insertion point and insert new node; ignore duplicate values
   public void insert( T insertValue )
   {
      // insert in left subtree
      if ( insertValue.compareTo( data ) < 0 )
      {
         // insert new TreeNode
         if ( leftNode == null )
            leftNode = new TreeNode< T >( insertValue );
         else // continue traversing left subtree recursively
            leftNode.insert( insertValue );
      } // end if
      // insert in right subtree
      else if ( insertValue.compareTo( data ) > 0 )
      {
         // insert new TreeNode
         if ( rightNode == null )
            rightNode = new TreeNode< T >( insertValue );
         else // continue traversing right subtree recursively
            rightNode.insert( insertValue );
      } // end else if
   } // end method insert


/* *** WIP ***

   // Traverse tree to try and find a search value.
   public TreeNode< T > contains( T searchValue )
   {
      System.out.println (data + " (" + super.toString() + ")");

      // search left subtree
      if ( searchValue.compareTo( data ) < 0 )
      {
         if ( leftNode == null )
         {
            System.out.println ("-> Not found.");
            return null;
         }
         else // continue traversing left subtree recursively
            leftNode.contains( searchValue );
      } // end if

      // search right subtree
      else if ( searchValue.compareTo( data ) > 0 )
      {
         if ( rightNode == null )
         {
            System.out.println ("-> Not found.");
            return null;
         }
         else // continue traversing right subtree recursively
            rightNode.contains( searchValue );
      } // end else if

      System.out.println ("-> found!");
      return this; // compareTo must have returned 0, so we have found the node with the value.

   } // end method contains
*/

   @Override
   public String toString()
   {
      return "" + data;
   }

} // end class TreeNode
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
