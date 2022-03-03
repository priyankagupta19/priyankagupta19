package Assignment_day4;

public class ClassB extends ClassA
{
	int b;
	public void single2()
	{
		
		System.out.println("This is method of child classB");
		
	}
	public static void main(String[] args) {
		ClassB ClB=new ClassB();
		ClB.single2();
		ClB.b=70;
		System.out.println("Value of Child class Variable is "+ClB.b);
		ClB.single1();
		ClB.a=50;
		System.out.println("Value of Parent class Variable is "+ClB.a);
	}

}
