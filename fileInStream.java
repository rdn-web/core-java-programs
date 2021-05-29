package pplJava;
import java.io.*;

public class fileInStream {

	public static void main(String[] args) {
		//Example 1-Read file input stream
		System.out.println("Example for fileinput stream");
		try
		{
			FileInputStream f=new FileInputStream("textFiles\\file1.txt");
			int i=0;
			System.out.println("Available data "+f.available());
			while((i=f.read())!= -1)
			{
				System.out.print((char)i);
			}
			//System.out.println("Available data "+f.available());
		}catch(Exception e)
		{
			System.out.println("\nSpecified file not found");
		}
		  
     //Example 2 file output stream		
		try
		{
			FileOutputStream fout=new FileOutputStream("textFiles\\example.txt");
			String s="This the example string "+"check by opening a file";
			byte[] b=s.getBytes(); 
			fout.write(b);
			fout.close();
			System.out.println("\n Data written successfully");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
