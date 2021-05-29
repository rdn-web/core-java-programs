package pplJava;
import java.lang.*;

public class threadD1 extends Thread {

	public static void main(String[] args) {
		
		Thread t=Thread.currentThread();
		System.out.println("Main Thread "+t);
		
		t.setName("Current Thread");
		System.out.println("Current Thread "+t);
		
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(10);
			}
		}catch(Exception e)
		{
			System.out.println("Main thread is interrupted");
			
		}
		System.out.println("Exit from Main thread");
	}

}
