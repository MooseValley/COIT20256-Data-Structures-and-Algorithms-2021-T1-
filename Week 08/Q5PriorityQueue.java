/*
 Author:  Mike O'Malley
   Date:  04-May-2021
Descrtn:  Week 8 Tutorial questions - stacks, queues, trees, BinaryTrees, etc.

Q5PriorityQueue
5. Implement a Java program to demonstrate the application of the java built-in data structure – priority queue. The application considers a list of printing jobs is maintained by a priority queue in the operating system of a server computer. When allocating CPU cycles to handle the printing jobs, the operating system uses the file size as the criteria to select next printing job (assume smaller file would be printed out first). It is obvious that the print job should be comparable based on the file size. Your program should include two classes:
-  PrintJob
-  PriorityQueueApplication

The PrintJob class defines the user name and the file size (to be printed) and implements the Comparable interface. The PriorityQueueApplication class declares a priority queue object to hold all PrintJob objects and then uses a loop to output the order of the printing jobs. For the test purpose, it assumes that the user names of these printing jobs are John, David, Peter, Adam and Bob. Their file sizes are respectively 1000, 5000, 3500, 2000, and 4400 (the unit is Kbyte).


Mike O's extras / homework for students to do:
* Return queue items alphabetically by username.
* Return queue items in descending order of file size.  Higher file sizes print first.
* Return queue items alphabetically by username, and where a user has the same name, return them in ascending file size order (smaller files first).


*/
import java.util.PriorityQueue;
import java.util.Iterator;


class PrintJob implements Comparable
{
	private String userName;
	private int fileSizeBytes;

	public PrintJob ()
	{
		this ("Empty job", 0);
	}

	public PrintJob (String userName, int fileSizeBytes)
	{
		this.fileSizeBytes = fileSizeBytes;
		this.userName = userName;
	}

	public int getFileSizeBytes ()
	{
		return fileSizeBytes;
	}

	public String getUserName ()
	{
		return userName;
	}

	// Smaller files are printed out first !
	public int compareTo (Object object)
	{
		int result = 0;

		if (object instanceof PrintJob)
		{
			PrintJob otherJob = (PrintJob) object;

			if (fileSizeBytes < otherJob.getFileSizeBytes () )
				result = -1;
			else if (fileSizeBytes > otherJob.getFileSizeBytes () )
				result = 1;
		}

		return result;

		//result userName.compareTo (((PrintJob) object).getUserName ()
	}

	@Override
	public String toString()
	{
		return userName + " job size: " + fileSizeBytes + " (bytes)";
	}
}

public class Q5PriorityQueue
{
   public static void main (String[] args)
   {
		PriorityQueue<PrintJob> priorityQueue = new PriorityQueue<PrintJob> ();

		priorityQueue.add (new PrintJob ("Frankie", 4800 ) );
		priorityQueue.add (new PrintJob ("Ben",       99 ) );
		priorityQueue.add (new PrintJob ("Mike",    1200 ) );
		priorityQueue.add (new PrintJob ("Bella",    300 ) );
		priorityQueue.add (new PrintJob ("Teenie",  9999 ) );


		//System.out.println (priorityQueue.poll() );
		//System.out.println (priorityQueue.poll() );

		Iterator iter = priorityQueue.iterator();


		while (iter.hasNext() == true)
		{
			System.out.println (priorityQueue.poll() );
		}


		/*
		// For fun, let's use peek: need 2 more Iterator commands !!
		while (iter.hasNext() == true)
		{
			System.out.println (priorityQueue.peek() );
			iter.next();
			iter.remove();
		}
		*/

   }
}
