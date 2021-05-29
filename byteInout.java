package pplJava;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;


public class byteInout {

	public static void main(String[] args) {
		//1. Example for Byte input stream
	/*	String str="This is string variable";
		byte b[]=str.getBytes();
		//extract bytes from string
		
		ByteArrayInputStream ba=new ByteArrayInputStream(b);
		System.out.println("read data successfully");
		
		int a=ba.read();
		
		while(a!=-1)
		{
			System.out.print((char)a);
			a=ba.read();
		}
     */
		
		//2.Example byteArray Output stream->used to write data in byte array
		
		ByteArrayOutputStream ba1=new ByteArrayOutputStream();
		String str1= "this is the string for wrting in byte array";
		byte b1[]=str1.getBytes();
		
		//extract byte from string
		try
		{
			ba1.write(b1);
		}
		catch(Exception e)
		{
			System.out.println("Unable to write bytes");
		}
		
		System.out.println("Reading data from output stream");
		byte c[]=ba1.toByteArray();
		
		for(int i=0;i<b1.length;i++)
		{
			System.out.print((char)c[i]);
		}

		
		
	}

}
