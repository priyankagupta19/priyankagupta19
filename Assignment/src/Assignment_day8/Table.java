package Assignment_day8;

import java.util.Scanner;

public class Table {
	public void tableofnumber(int a)
	{
		System.out.println("Table of " + a);
		for (int i=1;i<=10;i++)
		{
			int b;
		b=a*i;
		System.out.println(b);
		}
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Number");
	int a=s.nextInt();
	Table t=new Table();
	t.tableofnumber(a);
	
}
}
