package pplJava;

public class demoInterface implements anInterface {

	@Override
	public void methodI2() {
	 System.out.println("In method I2:"+PI);

	}
    
	public void methodI1(){
        System.out.println("Again from I1 " + lambda); 
    }
	
	@Override
	public void disp() {
		System.out.println("In interface disp");

	}

	public static void main(String[] args) {
		demoInterface obj=new demoInterface();
		obj.methodI1();
		obj.methodI2();
		obj.disp();

	}

}
