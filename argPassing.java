package pplJava;
//Argument passing - 1. call by val 2. call by ref

/*class callByVal
{
	public static void example(int p,int q)
	{
		p++; q++;
		System.out.println("In static method");
		System.out.println("i= "+p+"j="+q);
	}
}*/

class callByRef
{  
	int i,j;
	callByRef(int p,int q)
	{
		i=p; j=q;
	}
	
	void changeVal(callByRef R)
	{
		R.i+=20;
		R.j+=10;
	}
}



public class argPassing {

	//1. call by value
	/*public static void main(String[] args) {
		callByVal obj=new callByVal();
		int i=20,j=40;
        System.out.println("i= "+i+"j="+j);
        obj.example(i, j);
        System.out.println("i= "+i+"j="+j);
	}*/
	
	//2.call by reference
	public static void main(String[] args)
	{
		callByRef obj1= new callByRef(10,20);
		System.out.println(" \ni="+obj1.i+"j="+obj1.j);
        obj1.changeVal(obj1);
        System.out.println(" \ni="+obj1.i+"j="+obj1.j);
	}
	

}
