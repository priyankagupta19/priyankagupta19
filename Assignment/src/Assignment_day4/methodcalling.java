package Assignment_day4;

public class methodcalling {
	
	public void method()
	{
		System.out.println("This is default method");
		this.method5(2,3,4,5,6);
	}
	public void method1(int a)
	{
		System.out.println("This is one parametrised method");
	}
	public void method2(int a,int b)
	{
		System.out.println("This is two parametrised method");
	}
	public void method3(int a,int b,int c )
	{
		System.out.println("This is three parametrised method");
		this.method();
	}
	public void method4(int a,int b,int c,int d)
	{
		System.out.println("This is four parametrised method");
	}
	public void method5(int a,int b,int c,int d,int e)
	{
		this.method1(2);
		this.method2(2,3);
		this.method4(2,3,4,5);
		System.out.println("This is five parametrised method");
	}
	public static void main(String[] args) {
		methodcalling mcal=new methodcalling();
		mcal.method3(2,3,4);
	}
}
	


