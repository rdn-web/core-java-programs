package pplJava;
//dymanic method dispatch->run time polymorphism
abstract class base {
	public void callMe (  ) {
		System.out. println ( "I am from A ") ; 
		} 
	}
class B1  extends base {
	public void callMe (  ) {
	System.out.println ( "I am from B ");
	}
}  

	
public class dynamicMethod {

	public static void main(String[] args) {
		
		
		base obj=new B1();  //pointing to derived
		//base obj1=new base(); //pointing to base
		
		obj.callMe();
		//obj1.callMe();
	}

}
