package pplJava;

//syntax of nested class
/*class Outer_class
{
	....
	class inner_class
	{
		
	}
}*/
//types of nested - 1.non-static  2.static
class outer_Class { //outer class
	
	//simple inner class
	class inner_class
	{
		public void disp()
		{
			System.out.println("\n In Inner_class");
		}
	}
 
}

public class nestedClass
{
	public static void main(String[] args)
	{
		outer_Class.inner_class obj=new outer_Class().new inner_class();
		obj.disp();
	}
}

