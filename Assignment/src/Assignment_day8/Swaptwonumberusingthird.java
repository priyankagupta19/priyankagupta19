package Assignment_day8;

import java.util.Scanner;

public class Swaptwonumberusingthird {
	
	public void swap(int a, int b)
	{
	int c;
	c=a;
	a=b;
	b=c;
			System.out.println("After swap Value of a is "+a);
			System.out.println("After swap value of b is "+b);
	}
	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
				int A=sc.nextInt();
		System.out.println("Value of a is "+A);
		int B=sc.nextInt();
		System.out.println("Value of b is "+B);
		Swaptwonumberusingthird obj=new Swaptwonumberusingthird();
		obj.swap(A, B);
				
		
	}
}