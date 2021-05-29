package pplJava;

// member access and Inheritance 
//superclass A
class A
{
	int i; //public
	int j; //private
	
	void set(int x, int y)
	{
		i=x;
		j=y;
	}
}


//subclass B

class B extends A
{
	int tot;
	void sum()
	{
		tot=i+j;
	}
}

public class memberAccessIn {

	public static void main(String[] args) {
		
		B obj=new B();
	    obj.set(10, 20);
	    obj.sum();
	    System.out.println("\n total :"+obj.tot);

	}

}


//subclass-child class 
//parent class-super class
