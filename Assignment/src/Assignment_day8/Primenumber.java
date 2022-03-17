package Assignment_day8;

import java.util.Scanner;

public class Primenumber
{
		public void prime(int a)
	{
		for (int i=2;i<a/2;i++)
		{
			if (a%i==0)
					{
				System.out.println(" Non Prime number");
								break;
					}
			else
			{
				System.out.println("Prime number");
			break;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter Value of A");
		int A=S.nextInt();
		Primenumber obj=new Primenumber();
		obj.prime(A);
	}

}
