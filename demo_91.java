package pplJava;

public class demo_91 implements myInterface {

	@Override
	public void display() {
		System.out.println("Fine!"); 
 
	}

	public static void main(String[] args) {
		demo_91 t = new demo_91(); 
        t.display(); 
        System.out.println("The final value a in myInterface "+ a); 
    } 

	}


