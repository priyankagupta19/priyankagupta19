package Assignment_day8;

import java.util.Scanner;

public class FibnocciSeries 
{
	public void fibnocci()
	{
		int a=0;
		int b=1;
		System.out.println("Fibnocci Series is: ");
		System.out.println(a);
		System.out.println(b);
		int c;
		for (int i=0;i<10;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
	}
	
	public static void main(String[] args) {
			FibnocciSeries f=new FibnocciSeries();
		f.fibnocci();
		
}
}
