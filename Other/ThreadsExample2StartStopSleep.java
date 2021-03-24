/*
Java Threads - Creating, starting and stopping threads in Java
https://lbry.tv/@jakob.jenkov:4/java-threads-creating-starting-and:4
https://www.youtube.com/watch?v=eQk5AWcTS8w

Jakob Jenkov
https://odysee.com/@jakob.jenkov:4

Java Threads tutorial - textual version:
http://tutorials.jenkov.com/java-concurrency/creating-and-starting-threads.html

Java Concurrency and Multithreading - video playlist:
https://www.youtube.com/playlist?list=PLL8woMHwr36EDxjUoCzboZjedsnhLP1j4

Java Lambda Expressions tutorial - text / video playlist
http://tutorials.jenkov.com/java/lambda-expressions.html
https://www.youtube.com/playlist?list=PLL8woMHwr36HQhhPPdV_T8rigbuywMpD7

JVM stays running as long as there is at least 1 thread running ...
Unless the thread(s) are marked as a Daemon thread:
thread1.setDaemon (true);

*/
public class ThreadsExample2StartStopSleep
{

   public static class StoppableRunnable implements Runnable
   {
      private boolean stopRequested = false;
      private String threadNameStr;

      public void setThreadName (String threadNameStr)
      {
         //threadNameStr = Thread.currentThread().getName();
         this.threadNameStr = threadNameStr;
      }

      public synchronized void requestStop()
      {
         System.out.println ("STOP Requested: " + threadNameStr);

         this.stopRequested = true;
      }

      public synchronized boolean isStopRequested()
      {
         return stopRequested;
      }

      public void sleep(long millisec)
      {
         try
         {
            Thread.sleep (millisec); // Milliseconds
         }
         catch (InterruptedException err)
         {
            err.printStackTrace();
         }
      }

      @Override
      public void run ()
      {
         System.out.println ("START: " + threadNameStr);

         boolean stopLoop = false;

         //while (isStopRequested() == false)
         while (stopLoop == false)
         {
            sleep (1000);

            if (isStopRequested() == false)
               System.out.println ("RUN: " + threadNameStr);
            else
               stopLoop = true;
         }

         System.out.println ("END: " + threadNameStr);
      }

   } // public static class StoppableRunnable


   public static void main (String[] args)
   {
      StoppableRunnable stoppableRunnable = new StoppableRunnable ();
      Thread thread1 = new Thread (stoppableRunnable); //, "Stoppable Runnable Thread" );

      thread1.start();
      stoppableRunnable.setThreadName ("Stoppable Runnable Thread");

      //stoppableRunnable.sleep (5000);
         try
         {
            Thread.sleep (5000); // Milliseconds
         }
         catch (InterruptedException err)
         {
            err.printStackTrace();
         }

      stoppableRunnable.requestStop ();
   }

} // public class ThreadsExample2StartStopSleep