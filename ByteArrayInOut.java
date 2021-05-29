package pplJava;
import java.io.*;

public class ByteArrayInOut {
	

	public static void main(String[] args) {
		//1.Byte array input stream
		System.out.println("Example for byteInput");
		String str="This is string for byte";
		byte[]b=str.getBytes();
		
		ByteArrayInputStream ba=new ByteArrayInputStream(b);
		System.out.println("Reading data from array");
		int a=ba.read();
		while(a!=-1)
		{
			System.out.print((char)a);
			a=ba.read();
		}
		
		//1.Byte array output stream
		
		System.out.println("Example for byteOutput");
		ByteArrayOutputStream out=new ByteArrayOutputStream();
		
		String str1="This is a string for writing in bytes array";
		byte []b1=str.getBytes();
		
		//extract bytes from string
		try
		{
			out.write(b1);
		}
		catch(IOException e)
		{
			System.out.println("Error in writing the data" );
		}
		System.out.println("Reading data from output stream");
		byte[]c=out.toByteArray();
		for(int i=0;i<b1.length;i++)
		{
			System.out.print((char)c[i]);
		}

	}

}
