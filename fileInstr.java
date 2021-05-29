package pplJava;

import java.io.*;

public class fileInstr {

	public static void main(String[] args) {
		/*System.out.println("Example for file input stream");
		//1. create object for class file input stream
		try
		{
			FileInputStream f=new FileInputStream("textfiles\\file1.txt"); //input stream object
			int i=0;
			System.out.println("Available data: "+f.available()); //returns total bytes
			
			while((i=f.read())!= -1) 
			{
				System.out.print((char)i);
			}
		}catch(Exception e)
		{
			System.out.println("Specified file not found");
		}
*/
        
		
		//2. File output stream example
		
		try
		{
			FileOutputStream fout=new FileOutputStream("textfiles\\output.txt"); //create new file
			String s="This is the string "+"open file";
			
			//Converting string into bytes
			byte[] b=s.getBytes();
			
			//write b into text file
			fout.write(b);
			fout.close();
			System.out.println("Data added successfully");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
