package Assignment_day2;

public class globalvar {

	int c;
	public int sum(int a,int b)
	{
		c=a+b;
		System.out.println("sum is "+c);
		return c;
	}
	public int sub(int x,int y)
	{

		c=x-y;
		System.out.println("subtraction is "+c);
		return c;
	}
	public int mul(int u,int v)
	{
		c=u*v;
		System.out.println("multiplication is "+c);
		return c;
	}
	public void div(int m, int n)
	{
	
		c=m/n;
		System.out.println("Result is "+c);
	}
	public static void main(String[] args) {
		first f =new first();
		int sum1=f.sum(10,2);
		System.out.println("Result of sum1 is: "+sum1);
		int sum2=f.sum(sum1,2);
		int sub1=f.sub(sum2,2);
		int mul1=f.mul(sub1,2);
		f.div(mul1,2);
		
	}
}
