package Assignment_day8;

import java.util.Scanner;

public class Factorial {
	int b=1;
	public void fact(int a)
	{
		for (int i=a;i>=1;i--)
		{
			b=b*i;
			
		}
		
		System.out.println("Factorial of number is "+b);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		int a=s.nextInt();
		Factorial f=new Factorial();
		f.fact(a);
		
	
}
}