package pplJava;

import java.util.*;

public class array1 {

	public static void main(String[] args) {
		/*int a[]=new int [4];
		a[0]=1; a[1]=10; a[2]=4;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		char b[]=new char[3];
		b[0]='x'; b[1]='y'; b[2]='z';
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[1]);
		
		double c[]=new double[3];
		c[0]=15.3; c[1]=16.3;  c[2]=17.3;
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		*/
		
		//Two- dimensional array
		
		/*int [][]a= {{1,-9,3},{3,8,7},{5,-5,5}};
		for(int i=0;i<a[i].length;++i)
		{
			for(int j=0;j<a[i].length;++j)
			{
				System.out.println(a[i][j]);
			}
		}*/
		
		//Print odd and even 
		/* int n;
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter number of elements");
		 n=s.nextInt(); //accepts int value
		 
		 int a[]=new int[n];
		 
		 System.out.println("Enter all elements");
		 for(int i=0;i<n;i++)
		 {
			 a[i]=s.nextInt();
		 }
		 
		 System.out.println("Odd numbers");
		 for(int i=0;i<n;i++)
		 {
			 if(a[i]%2!=0)
			 {
				 System.out.println(a[i]+" ");
			 }
		 }
		
		 System.out.println("Even numbers");
		 for(int i=0;i<n;i++)
		 {
			 if(a[i]%2==0)
			 {
				 System.out.println(a[i]+" ");
			 }
		 }*/
		
		
		//Addition of matrix
		
		int rows=2, col=3;
		int [][] firstMat= {{2,3,3},{2,2,2}};
		int [][] secMat= {{2,2,3},{2,5,2}};
		
		int[][]sum=new int[rows][col];
		
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
		      sum[i][j]=firstMat[i][j]+secMat[i][j];
	        }
			
		}
		
		//display
		for(int []row:sum)
		{
			for(int cols:row)
			{
				System.out.print(cols+" ");
			}
			System.out.println();
		}
		
	}  // Assignment->WP to set diagonal element to 0 in java using  2D Array
	
}
