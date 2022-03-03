package Assignment_day4;

public class ClassC extends ClassA

{
		int b;
		public void single3()
		{
			
			System.out.println("This is method of child classC");
			
		}
		public static void main(String[] args) {
			ClassC ClC=new ClassC();
			ClC.single3();
			ClC.b=90;
			System.out.println("Value of Child class Variable is "+ClC.b);
			ClC.single1();
			ClC.a=40;
			System.out.println("Value of Parent class Variable is "+ClC.a);
		}

}
