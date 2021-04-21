/*
Was: Week10Q1_v2.java

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * 
 */
public class Week10Q1_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // initialize Integer array
      int[] data = { 9, 3, 6, 4, 8, 10, 1, 7, 5, 2 };

      // display intArray in original order
      System.out.println( "Integer data items in original order" );
      displayArray( data ); // display array elements

      selectionSort( data ); // sort the array

      // display intArray in sorted order
      System.out.println( "\nInteger data items in ascending order" );
      displayArray( data ); // display array elements
      System.out.println( "\n" );

      
   } // end main

   // generic method that sorts elements in array
   public static  void selectionSort(int[] array )
   {
      int smallest; // index of smallest element

      // loop over all elements
      for ( int spot = 0; spot < array.length - 1; spot++ )
      {
         smallest = spot;

         // loop to find the smallest
         for ( int element = spot + 1; element < array.length; element++ )
         {
            if ( array[ element ]< array[ smallest ] )  
               smallest = element;
         } // end for

         // swap smallest element into position
         swap( array, smallest, spot );
      } // end for
   } // end method selectionSort

   // generic method that swaps elements in an array
   public static  void swap( int[] array, int first, int second )
   {
      int temp = array[ first ]; // copy first to temp
      array[ first ] = array[ second ]; // copy second to first
      array[ second ] = temp; // copy temp to second
   } // end method swap

   // generic method that displays array element
   public static  void displayArray( int[] array )
   {
      // display each element
      for ( int element : array )
         System.out.printf( "%d ", element );

      System.out.println();
   } // end method displayArray
    
}
