package Assignment_day8;

import java.util.Scanner;

public class Swaptwonumber {
	public void swap(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap Value of a is "+a);
		System.out.println("After swap Value of b is "+b);
	}

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter Value of A");
		int A=S.nextInt();
		System.out.println("Value of A is "+A);
		System.out.println("Enter Value of B");
		int B=S.nextInt();
		System.out.println("Value of B is "+B);
		Swaptwonumber obj=new Swaptwonumber();
		obj.swap(A, B);
	}
}
