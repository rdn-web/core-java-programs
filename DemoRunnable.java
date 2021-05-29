package pplJava;
import java.lang.*;

/*When we will create a new thread, actually a new object will be instantiated from this Runnable interface as the target 
of our thread, meaning that the thread will look for the code for the run( ) method within our object's class instead
of inside the Thread's class. This is illustrated with an example where two processes Brother and Sister will 
be executed simultaneously.*/


public class DemoRunnable {
	
	public static void main(String args[])
	{
		ThreadX x=new ThreadX();
		Thread t1=new Thread(x);
		
		ThreadY y=new ThreadY();
		Thread t2=new Thread(y);
		
		ThreadZ z=new ThreadZ();
		Thread t3=new Thread(z);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
	
	class ThreadX implements Runnable{
		public void run()
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Thread X with i="+-1*i);
			}
			System.out.println("Exiting Thread X..");
		}
		
	}
	
	class ThreadY implements Runnable{
		public void run()
		{
			for(int j=1;j<=5;j++)
			{
				System.out.println("Thread Y with j="+2*j);
			}
			System.out.println("Exiting Thread Y..");
		}
	}
    
	
	class ThreadZ implements Runnable{
		public void run()
		{
			for(int k=1;k<=5;k++)
			{
				System.out.println("Thread Y with j="+2*(k-1));
			}
			System.out.println("Exiting Thread Y..");
		}
	}

