package pplJava;

class person
{
	String name,address;
	person(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	
	void showP()
	{
		System.out.println("Name is "+name);
		
	}
}


class Emp extends person
{
	String empid; double sal;
	
	Emp(String name,String address,String empid,double sal)
	{
		super(name,address);
		this.empid=empid;
		this.sal=sal;
	}
	
	void dispE()
	{
		showP();
		System.out.println("\n Emp ID:"+empid);
		System.out.println("\n Sal:"+sal);
	}
}

class principal extends Emp
{
	int noSub;
	principal(String name,String address,String empid,double sal,int noSub)
	{
		super(name,address,empid,sal);
		this.noSub=noSub;
	}
	
	void dispPr()
	{
		dispE();
		System.out.println("\n Subordinate :"+noSub);
	}
}
public class multilevel {

	public static void main(String[] args) {
		principal obj=new principal("abc","xtttt","10",40000.25,8);
		obj.dispPr();

	}

}











