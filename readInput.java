package pplJava;
import java.util.Scanner;
import java.io.*;
public class readInput {

	//Reading console input
	public static void main(String[] args) throws Exception{
	
		/*System.out.println("Example for Scanner");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter yorur roll number");
		int rollno=sc.nextInt();
		
		System.out.println("Enter yorur Name");
		String name=sc.next();
		
		System.out.println("Roll no "+rollno+"  Name "+name);
		sc.close();*/
		
		
	//Writing console output
		
		System.out.println("Print stream Example");
		
		FileOutputStream fout=new FileOutputStream("textFiles\\example3.txt");
		
		PrintStream pout=new PrintStream(fout);
		
		pout.println(8956);
		pout.println("This line is from printstream");
		
		pout.close();
		fout.close();
		
	}

}
