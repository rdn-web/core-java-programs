package pplJava;
//Super to call Superclass method
/*class base
{
	void disp()
	{
		System.out.println(" \n Super disp()");
	}
}

class sub extends base
{
	void disp()
	{
		super.disp();
		System.out.println("\n Subclass disp");
	}
}
public class superCall {

	public static void main(String[] args)
	{
		sub obj=new sub();
		obj.disp();
	}
}
*/


//2. using super ->superclass constructor
//super(args-list)

/*class base
{
	int d1,d2;
	
	base(int a,int b)
	{
		d1=a;
		d2=b;
		System.out.println("\n Super class constructor");
	}
}

class sub extends base
{
	sub(int x,int y)
	{
	  super(x,y);
      System.out.println("\n In sub class constructor");
	}
}

public class superCall {

public static void main(String[] args)
{
	sub obj=new sub(20,60);
	System.out.println("\n obj.d1="+obj.d1);
	System.out.println("\n obj.d2="+obj.d2);
	
}
}*/

//3. super keyword for members

class X
{
	int j; //super class member
}

class y extends X
{
	int j; 
	
	y(int a,int b)
	{
		super.j=a;
		j=b;
	}
	
	void disp()
	{
     System.out.println("\n j in superclass "+super.j);
     System.out.println("\n j in subclass "+j);

	}
}


public class superCall {

public static void main(String[] args)
{
  y obj=new y(2,50);
  obj.disp();
  
		  
	
}
}

