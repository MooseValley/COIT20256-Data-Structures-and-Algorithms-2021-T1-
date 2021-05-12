

import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Scanner;

// Analyse image files. Multiple image files can be analysed - when an // image file is loaded, the previous image is replaced.

public class Analyser
{
    private int[][] image;
    private int rows;
    private int columns;

    // the following load method throws two exceptions.
    // Load can handle exceptions in a try / catch block.
    // Note that if you catch the exception, it won't
    // get thrown unless you throw it from the catch block.
    // You can of course catch some exceptions and throw others, which
    // is what we should really do.
    // The wrong pathname is recoverable, but i/o errors are probably
    // not, so you may as well just exit.
    // Note that IOException actually has a lot of subclasses.

    // load reads an image file into an m x n matrix – note that it
    // throws 2 exceptions – are these both caught when load is
    // invoked?  Check the main method
    public void load(String ipath) throws NoSuchFileException,
                                          InvalidImageException {
         Scanner s = null;
        // open image file and create a scanner for it
        try {
            // throws NoSuchFileException if unable to create path
            // exercise/test this with non-existent path/file
            Path p = Paths.get(ipath);

           // Throws IOException if unable to create scanner.
           // Exercise/test this with a directory rather than a file.
           // Note that what is actually thrown in this case is a
           // subclass of IOException - AccessDeniedException
            s = new Scanner(p);

           // process image file. No need for a while loop as the file
           // size is specified by the first two records – use nested
           // for loops


           //TO DO:
           // - read the number of rows (and assign to rows
           // - read the number of columns (and assign to columns)
           // - create an empty image array with space for the data
           // - read the image file a row at a time (nested for loops)
           // - if the pixel data read from the file is not an int
           //   in the range 0 to 255 then create and throw and
           //   InvalidImageException

           System.out.println ("Reading file: '" + ipath + "' ...");
           rows = s.nextInt();
           s.nextLine();
           columns = s.nextInt();
           s.nextLine();

           System.out.println ("-> rows = " + rows + ", columns = " + columns);

           image =  new int [rows][columns];

           for (int row = 0; row < rows; row++)
           {
			   for (int col = 0; col < columns; col++)
			   {
				   int val = s.nextInt();

				   if ((val < 0) || (val > 255) )
				   		throw new InvalidImageException (row, col);

				   image[row][col] = val;

			   }

			   s.nextLine();
		   }

        }
        catch (NoSuchFileException nsfe) {
            //To do: throw the nsfe
        }
        catch (IOException ioe) {
            //To do:
            // print details of IOException
            // print message using exception’s message method
            // print stack trace
            // exit the program
                  }
        finally {
            //To do:  close the scanner, which will close the file
        }
    }

    // display the contents of the current image (the image array) to
    // standard output
    public void display()
    {
       //TODO iterate through the array and output the contents

	   System.out.println ("Image Display:");
	   System.out.println ("-> rows = " + rows + ", columns = " + columns);

	   for (int row = 0; row < rows; row++)
	   {
		   for (int col = 0; col < columns; col++)
		   {
			   System.out.print (image[row][col] + "\t");
		   }

		   System.out.println ();
	   }

    }
} // public class Analyser
