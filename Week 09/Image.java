import java.nio.file.*;
import java.util.Scanner;

public class Image
{
  // This application “analyses” an image file. Its path name is entered
  // by the user. Currently analysis consists of loading a file and
  // displaying its contents to the standard output.
  //
  // An image file contains m+2 lines, where
  //   line 1 contains the number of rows in the image (m)
  //   line 2 contains the number of columns in the image (n) and
  //   line 3 to line m+2 contain the rows of the image. An image row
  //          consists of n integers in the range 0-255

  public static void main(String[] args) {
     Analyser a = new Analyser();
     Scanner s = new Scanner(System.in);

     System.out.println( "Available commands are" );
     System.out.println( "  Load image   >1 pathname" );
     System.out.println( "  Dump image   >2" );
     System.out.println( "  Quit         >9" );

     System.out.print( "> " );
     int command = s.nextInt();

     while (command != 9) {
        switch( command) {
              case 1:
                String ipath = s.next(); // get name of file

                // <TO DO for case 1 >:
                // use the analyser’s load method to read
                // the image data into the analyser’s data structure
                // “2D” array of int
                // wrap this call to the analyser’s load method in a try
                // in a try .. catch ..blocks to catch the
                // No SuchFileException and InvalidImageExceptions
                // that can be thrown by the
                // load method.

                 try {
                     //To do – add code to load the image

                 }
                 catch( InvalidImageException iie ) {
                     // Todo:
                     // - print out the details about the exception
                     // - print out the message (using the exceptions
                     // message method.
                     // - print the stack trace

                     //you could then exit or allow the user to
                     //go around the loop and load a different image
                 }
                 catch( NoSuchFileException fnfe ) {
                     // Todo:
                     // print message to tell user that the file can’t
                     // be loaded and ask user to try again
                 }

                case 2:
                    // Todo:
                    // display contents of analyser’s image array
            }
            System.out.print( "> " );
            command = s.nextInt();
        }
    }
} // public class Image
