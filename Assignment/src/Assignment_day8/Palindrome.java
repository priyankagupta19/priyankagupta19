package Assignment_day8;
import java.util.Scanner;
public class Palindrome {
	public void reverse(int a)
	{
		int b;
		b=a;
		int remainder;
		int reversenumber = 0;
		while (a>0)
		{
			remainder=a%10;
			reversenumber=(reversenumber*10)+remainder;
			a=a/10;
		}
		if (b==reversenumber)
		{
			System.out.println("This is Palindrome number");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
	}		
public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter a Number");
	int a=S.nextInt();
	Palindrome pal=new Palindrome();
	pal.reverse(a);
}
}
