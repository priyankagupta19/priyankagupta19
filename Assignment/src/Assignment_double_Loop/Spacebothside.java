package Assignment_double_Loop;

public class Spacebothside {
	
	public static void main(String[] args) {
		int space=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			space--;
				for(int k=1;k<=2*i-1;k++)
				{
					System.out.print("*");
				}
				
				
			System.out.println(" ");
		}
		
	}
}
