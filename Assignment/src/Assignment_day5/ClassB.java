package Assignment_day5;

public class ClassB extends ClassA
{
		public void method5()		{
			this.method3(5,6); // calling of two parameterized method of parent class using this keyword
			super.method2(3);  // calling of one parameterized method of parent class using super keyword
			System.out.println("This is default method of child class"); // child class default method
			this.method8(4, 5, 6); // calling of three parameterized method of child class using this keyword i.e call within same call
			this.method6(4);  // calling of one parameterized method of child class using this keyword i.e call within same call
		}
		public void method6(int a)
		{
			System.out.println("This is one parameterized method of child class"); // child class one parameterized method
		}
		public void method7(int a,int b)
		{
			this.method5();
			System.out.println("This is two parameterized method of child class"); // child class two parameterized method
		}
		public void method8(int a, int b, int c)
		{
			System.out.println("This is three parameterized method of child class"); // child class three parameterized method
		}
		
		public static void main(String[] args) {
			ClassB obj=new ClassB();  // Object creation of child class
			obj.method7(2, 3);  // Calling of two parameterized method of child class using object
		}
}
