package Assignment1;

public class Student {
	
	//declare variables
	int age;
	int roll_no;
	
	//method creation
	
	public void display1()
	{
		System.out.println("Welcome to all of you");
		
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args)
	{
		//object of class creation
		Student S=new Student();
		//variables calling and value assignment
		S.age=1234;
		S.roll_no=29;
		// print variables
		System.out.println(S.age);
		System.out.println(S.roll_no);
		//method calling
		S.display1();
		S.display2();
		
	}
	}
	
	


