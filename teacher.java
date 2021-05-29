package pplJava;

class lecturer
{
	String dept="computer";
	String collname="xyz";
	
	void work()
	{
		System.out.println("Teaching");
	}
}

public class teacher extends lecturer {
	String sub="PPL";

	public static void main(String[] args) {
		
		teacher T=new teacher();
		System.out.println("\ncollege "+T.collname);
		System.out.println("\n Depaertment "+T.dept);
		System.out.println("\n Subject "+T.sub);
		T.work();
	}

}
