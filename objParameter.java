package pplJava;

class rect
{
	int len,wid;
	rect(int l,int w)
	{
		len=l; wid=w;
	}
	//1. object as parameter
	/*void area(rect R1)
	
	{
       int a=R1.len*R1.wid;
       System.out.println("\nArea ="+a);
	}*/
	
	//2. Returning object
    rect getRectobj()
	
	{
       rect r=new rect(20,10);
       return(r);
	}
	
}

public class objParameter {

	/*public static void main(String[] args) {
		rect R=new rect(5,4);
		R.area(R);
      
	}*/
	
	public static void main(String[] args)
	{
		rect r1=new rect(10,30);
		rect r2;
		r2=r1.getRectobj();
		
		System.out.println("\nr1.len: "+r1.len);
		System.out.println("\nr1.wid: "+r1.wid);
		
		System.out.println("\nr2.len: "+r2.len);
		System.out.println("\nr2.wid: "+r2.wid);
	}

}
