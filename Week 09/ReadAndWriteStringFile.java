/*
 Author:  Mike O'Malley
   Date:  11-May-2021
Descrtn:  Week 09 Tutorial questions - File I/O

*/
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Scanner;
import java.util.*;


public class ReadAndWriteStringFile
{
   public static void readFile (String fileNameStr)
   {
      try
      {
         Scanner sc = new Scanner (Paths.get(fileNameStr) );

         //Open it

         while (sc.hasNext() == true)
         {
            System.out.println (sc.nextLine() );
         }

         // Close it
         sc.close();

      }
      catch (Exception err)
      {
         System.out.println ("ERROR: file '" + fileNameStr + "' does not exist.");
      }
   }

   public static void writeFile (String fileNameStr, String[] strArray)
   {
      try
      {
         Formatter outFile = new Formatter (fileNameStr);

         for (int k = 0; k < strArray.length; k++)
         {
            outFile.format ("%s%n", strArray [k]);
         }

         outFile.close();
      }
      catch (Exception err)
      {
         System.out.println ("ERROR: file '" + fileNameStr + "' does not exist.");
      }
   }


   public static void main(String[] args)
   {

      String[] StrArray = {"Mike", "Iftekhar", "Frankie", "Bella"};

      //writeFile ("out.dat", StrArray );

      //readFile ("ReadAndWriteStringFile.java");

      readFile ("out2.dat");
   }
}