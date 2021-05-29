package pplJava;

public class DemoThread2 extends Thread{
   public static void main(String args[])
   
   {

	   //1. Thread 1 example
	   /*  Thread t=Thread.currentThread();
	   System.out.println("Main thread "+t);
	   
	   t.setName("Current Thread");
	   System.out.println("Current thread "+t);
	   
	   
	   try {
		   for(int i=1;i<5;i++)
		   {
			   System.out.println(i);
			   Thread.sleep(10);
		   }
	   }catch(InterruptedException e)
	   {
		   System.out.println("Main thread interrupted");
	   }
   }*/
	   
	   /*  Thread 2 example Creating three threads using the class Thread 
	    * and then running them concurrently. */
	   

	  
	      
	            ThreadA a = new ThreadA();
	            ThreadB b = new ThreadB();
	            ThreadC c = new ThreadC();
	            a.start();
	            b.start();
	            c.start();
	            System.out.println("... Multithreading is over ");
	       }
	   }
   


   class ThreadA extends Thread{
       public void run( ) {
          for(int i = 1; i <= 5; i++) {
             System.out.println("From Thread A with i = "+ -1*i);
          }
          System.out.println("Exiting from Thread A ...");
       }
  }

  class ThreadB extends Thread {
      public void run( ) {
         for(int j = 1; j <= 5; j++) {
           System.out.println("From Thread B with j= "+2* j);
         }
         System.out.println("Exiting from Thread B ...");  
  	}
  }
  class ThreadC extends Thread{
       public void run( ) {
           for(int k = 1; k <= 5; k++) {
               System.out.println("From Thread C with k = "+ (2*k-1));
           }
           System.out.println("Exiting from Thread C ...");
       }
  }
