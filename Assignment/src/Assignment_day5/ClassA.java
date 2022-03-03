package Assignment_day5;

public class ClassA {
	public void method1()
	{
		System.out.println("This is default method of Parent class"); // Parent class default method
	}
	public void method2(int a)
	{
		System.out.println("This is one parameterized method of Parent class"); // Parent class one parameterized method
	}
	public void method3(int a,int b)
	{
		this.method4(3, 4, 5);
		this.method1();
		System.out.println("This is two parameterized method of Parent class"); // Parent class two parameterized method
	}
	public void method4(int a, int b, int c)
	{
		System.out.println("This is three parameterized method of Parent class"); // Parent class three parameterized method
	}

}
