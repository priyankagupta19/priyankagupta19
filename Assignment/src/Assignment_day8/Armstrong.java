package Assignment_day8;

import java.util.Scanner;

public class Armstrong {
	public void arm(int a)
	{
		int b;
		b=a;
		int remainder;
		int armstrongnumber = 0;
		while (a>0)
		{
			remainder=a%10;
			armstrongnumber=(remainder*remainder*remainder)+armstrongnumber;
			a=a/10;
				}
	
		if (b==armstrongnumber)
		{
			System.out.println("This is armstrong number");
		}
		else
		{
			System.out.println("Number is not Armstrong");
		}
	
}
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter a Number");
		int a=S.nextInt();
		Armstrong ar=new Armstrong();
		ar.arm(a);

}
}
