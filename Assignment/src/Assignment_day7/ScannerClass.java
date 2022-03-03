package Assignment_day7;

import java.util.Scanner;

public class ScannerClass {
	public float addition(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Result of addition is: "+c);
		return c;
	}
	public int subtraction (float d,int e)
	{
		int f;
		f=(int) (d-e);
		System.out.println("Result of subtraction is: "+f);
		return f;
	}
	public int multiplication (int u,int v)
	{
		int w;
		w=u*v;
		System.out.println("Result of multiplication is: "+w);
		return w;
		
	}
	public void division(int x,int y)
	{
		int z;
		z=x/y;
		System.out.println("Final Result is: "+z);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Value of X1");
		int X1=s.nextInt();
		System.out.println("Value of X1 is: "+X1);
		System.out.println("Enter Value of X2");
		int X2=s.nextInt();
		System.out.println("Value of X2 is: "+X2);
		ScannerClass obj=new ScannerClass();
		float sum =obj.addition(X1, X2);
		System.out.println("Enter Value of X3");
		int X3=s.nextInt();
		System.out.println("Value of X3 is: "+X3);
		int sub=obj.subtraction(sum, X3);
		System.out.println("Enter Value of X4");
		int X4=s.nextInt();
		System.out.println("Value of X4 is: "+X4);
		float sum1 =obj.addition(sub, X4);
		System.out.println("Enter Value of X5");
		int X5=s.nextInt();
		System.out.println("Value of X5 is: "+X5);
		int mul =obj.multiplication((int) sum1, X5);
		System.out.println("Enter Value of X6");
		int X6=s.nextInt();
		System.out.println("Value of X6 is: "+X6);
		obj.division(mul,X6);
		
	}
	
	
	
	
	
	
	

}
