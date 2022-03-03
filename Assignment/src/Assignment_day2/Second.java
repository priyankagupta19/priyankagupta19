package Assignment_day2;

public class Second {

	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("sum is "+c);
		return c;
	}
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("subtraction is "+z);
		return z;
	}
	public int mul(int u,int v)
	{
		int w;
		w=u*v;
		System.out.println("multiplication is "+w);
		return w;
	}
	public void div(int m, int n)
	{
		int o;
		o=m/n;
		System.out.println("Result is "+o);
	}
	public static void main(String[] args) {
		Second s=new Second();
		int MUL=s.mul(10, 2);
		int SUB=s.sub(MUL,2);
		int MUL1=s.mul(SUB, 2);
		int SUM=s.sum(MUL1, 2);
		s.div(SUM, 2);
		
	}
}
