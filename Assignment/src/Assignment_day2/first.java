package Assignment_day2;

public class first {

	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Result of sum is "+c);
		return c;
	}
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("Result of subtraction is "+z);
		return z;
	}
	public int mul(int u,int v)
	{
		int w;
		w=u*v;
		System.out.println("Result of multiplication is "+w);
		return w;
	}
	public void div(int m, int n)
	{
		int o;
		o=m/n;
		System.out.println("Final Result is "+o);
	}
	public static void main(String[] args) {
		first f =new first();
		int sum1=f.sum(10,2);
		int sum2=f.sum(sum1,2);
		int sub1=f.sub(sum2,2);
		int mul1=f.mul(sub1,2);
		f.div(mul1,2);
		
	}
	}
	

