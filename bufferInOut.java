package pplJava;
import java.io.*;
public class bufferInOut {

	/*public static void main(String[] args) {
		System.out.println("Example for Buffered input stream");
		//1.Read content from file
		try
		{
			FileInputStream fin=new FileInputStream("textFiles\\example.txt");
			
			//2. Create BufferedInput Stream object
			
			BufferedInputStream bin=new BufferedInputStream(fin);
			int i;
			
			while((i=bin.read())!=-1)
			{
				System.out.print((char)i);
			}
			bin.close();
			fin.close();
		}catch(Exception e)
		{
           System.out.println(e);
		}
		
		
		//Example for BufferedOutput stream
		
		

	}*/
	
	public static void main(String[] args) throws Exception
	{
		FileOutputStream fout=new FileOutputStream("textFiles\\example2.txt");
		
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		
		String s="Example for output stream";
		
		byte b[]=s.getBytes();
		bout.write(b);
		bout.close();
		fout.close();
		
		System.out.println("Data written in file");
	}

}
