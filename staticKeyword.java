package pplJava;

// 1. static variables
//2.methods
//3.block  static{  }
//4.nested class


//final keyword
//1.non -access specifier

//syntax: final int PI=3.14

public class staticKeyword {
	
	/*//static varible 
	static int i=10;
	static int k;
	
	//static block
	
	static
	{
		System.out.println("\nStatic block is initialized");
		k=i*5;
	}

	public static void main(String[] args) {
		
		System.out.println("\nInside main method");
		System.out.println("\n Val of i= "+i);
		System.out.println("\n Val of k= "+k);
		
	}*/
	
	
	
	//execute static blocks and method
	
	static int j= statMeth();
	
	static
	{
		System.out.println("\n In static block");
	}
	
	static int statMeth()
	{
		System.out.println("\n In static Method");
		return 20;
	}
	
	//static main method
	public static void main(String[] args)
	{
		System.out.println("\n In main block");
		System.out.println("\n value of j"+j);
	}

}
