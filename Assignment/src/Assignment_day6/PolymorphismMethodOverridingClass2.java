package Assignment_day6;

public class PolymorphismMethodOverridingClass2 extends PolymorphismMethodOverridingClass1
{
	public void defaultmethod()
	{
		System.out.println("This is default method of Child class");
	}
	public void MethodOverriding(int a,int b,int c)
	{
		int d;
		d=a*b*c;
		System.out.println("Output of Child multiplication method is "+d);
	}
	public static void main(String[] args) {
		PolymorphismMethodOverridingClass2 obj1=new PolymorphismMethodOverridingClass2(); // Object creation of child class
		obj1.MethodOverriding(4,5,6);  // will call child class method
		obj1.defaultmethod(); //will call default method of Child class
		PolymorphismMethodOverridingClass1 obj2=new PolymorphismMethodOverridingClass1(); // Object creation of Parent class
		obj2.MethodOverriding(6,8,9); // will call Parent class method
		obj2.defaultmethod(); //will call default method of Parent class
	}
}
