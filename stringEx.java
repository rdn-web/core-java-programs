package pplJava;

public class stringEx {

	public static void main(String[] args) {
		/*String str="Hello world";
		System.out.println(str);
		
		String str1="Hello SEb";
		System.out.println(str1);
		
		System.out.println("Concatenated string");
		System.out.println(str+" "+str1); */
		
		//Create a string from character array
	/*	String s1="Python";
		char ch[]= {'j','a','v','a'};
		
		String s2=new String(ch); //char array->string
		String s3=new String("fortran"); //created java string new keyword
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		*/
		
		
	/*	String str="String using string literal";
		System.out.println(str);
		
		
		byte b[]= {71,72,73,74,75,76};
		String s3=new String(b);
		
		System.out.println("String from ACSII character"+s3);
		
		
		String str="First String";
		String str1="Second String";
		
		System.out.println("Length of string"+str.length()+"\t"+str1.length());
		System.out.println("Fifth place in character"+str+"is:"+str.charAt(4));
		
		char buf[]=new char[5];
		str.getChars(2, 7, buf, 0);
		System.out.println("Range of character");
		System.out.println(buf);
		*/
		
		/*String str="Java complete reference";
		System.out.println("Position of character m "+str.indexOf('m'));
		System.out.println("e appears lastly at "+str.lastIndexOf('e'));
		
		System.out.println("Position of character m "+str.indexOf("ref"));
		System.out.println("Substring  "+str.substring(3));
		
		String str1="First";
		String str2=str1.replace('t', 'a');
		System.out.println("Modified string is "+str2);
		
		*/
		
		for(int j=0;j<args.length;j++)
		{
			System.out.println("args["+j+"]:"+args[j]);
			
		}
	}

}
