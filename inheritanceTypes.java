package pplJava;
//hybrid 


class Animal
{
	public void run()
	{
		String name, color;
		System.out.println("animal is running");
	}
}

class dog extends Animal
{
	
	public void B()
	{
		System.out.println("Dog is running");
	}
}

class cat extends Animal
{
	public void C()
	{
		System.out.println("Cat is running");
	}
}



public class inheritanceTypes {

	public static void main(String[] args)
	{
		dog d1= new dog();
		d1.run();
		d1.B();
		cat c1= new cat();
		c1.C();
		c1.run();
	}
}
