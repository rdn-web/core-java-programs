package pplJava;

public interface anInterface {
	public static final double PI = 3.1413434567;   //OK
    static final double lambda = 0.04; //OK: public is implicit

    //int x1;  //Declaration of any instance variable is NOT allowed.
	int x=100;// Initialization of variable is necessary.
	
	//private static final int p = 444;   
                   //ERROR: private/ protected is NOT allowed.
	//abstract public static void methodI1(); // Static method is not allowed

	void methodI2(); //public abstract by default
	
	
	
	int a=20; //public static final
	void disp(); //public abstract
}
