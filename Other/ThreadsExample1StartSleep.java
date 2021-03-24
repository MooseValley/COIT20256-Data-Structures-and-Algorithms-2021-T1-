/*
Java Threads - Creating, starting and stopping threads in Java
https://lbry.tv/@jakob.jenkov:4/java-threads-creating-starting-and:4
https://www.youtube.com/watch?v=eQk5AWcTS8w

Java Threads tutorial - textual version:
http://tutorials.jenkov.com/java-concurrency/creating-and-starting-threads.html

Java Concurrency and Multithreading - video playlist:
https://www.youtube.com/playlist?list=PLL8woMHwr36EDxjUoCzboZjedsnhLP1j4

Java Lambda Expressions tutorial - text / video playlist
http://tutorials.jenkov.com/java/lambda-expressions.html
https://www.youtube.com/playlist?list=PLL8woMHwr36HQhhPPdV_T8rigbuywMpD7

*/
public class ThreadsExample1StartSleep
{

   public static class MyRunnable implements Runnable
   {
      @Override
      public void run ()
      {
         String threadNameStr = Thread.currentThread().getName();

         System.out.println ("START: " + threadNameStr);

         try
         {
            Thread.sleep (1000); // Milliseconds
         }
         catch (InterruptedException err)
         {
            err.printStackTrace();
         }

         System.out.println ("END: " + threadNameStr);
      }
   }


   public static void main (String[] args)
   {
      Thread thread1 = new Thread (new MyRunnable() );

      Thread thread2 = new Thread (new MyRunnable(), "Hello Moose Thread" );

      thread1.start();
      thread2.start();
   }
}