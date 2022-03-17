package Assignment_double_Loop;

public class Backwatd_Pattern {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
}
