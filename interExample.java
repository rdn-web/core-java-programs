package pplJava;

//1. create interface
/* interface anInterface
 {
	 int a=10; //public static final
	 void disp(); //public abstract
 }*/

//2.implement interface in class
public class interExample implements anInterface {
    public void  disp()
    {
    	System.out.println("Implemented display");
    }
	public void disp1()
	{
		int a=20;
	}
	
	public static void main(String[] args) {
		interExample obj=new interExample();
		obj.disp();
		System.out.println("The final value of a "+obj.a);
        System.out.println("The final value of a "+a);
	}
	@Override
	public void methodI2() {
		// TODO Auto-generated method stub
		
	}

}
