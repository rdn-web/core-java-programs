package pplJava;


class test
{

	int x;  //default
	public int y;  //public
	private int z; //private
	
	void setz(int i)  //set value of z
	{
		z=i;
	}
	
	int getz()  //get value of z
	{
		return z;
	}
}
public class accControl {

	public static void main(String[] args) {
		
     test T=new test();
     T.x=10;
     T.y=20;
     
     T.setz(40);
     
     System.out.println("\n Value of x y and z"+T.x+"  "+T.y+"  "+T.getz());
	}

}
