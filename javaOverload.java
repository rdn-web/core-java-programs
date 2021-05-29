package pplJava;

//Overloading in java  1.Number of Parameters
	//    2.Data type of parameter
	//Sequence of data type of parameter
	
class arithmetic
{
	void test()
	{
		System.out.println("\n No argument");
	}
	
	void test(int x)
	{
		System.out.println("\n X="+x);
	}
	
	void test(int x,int y)
	{
		System.out.println("\n X and Y "+x+"  "+y);
	}
	
	double test(double x)
	{
		System.out.println("double x "+x);
		return x*x;
	}
}
public class javaOverload {

	public static void main(String[] args) {
		arithmetic A=new arithmetic();
		double res;
		A.test();
		A.test(10);
		A.test(2, 6);
		res=A.test(5.5);
		System.out.println("\nRes= "+res);
	}

}
