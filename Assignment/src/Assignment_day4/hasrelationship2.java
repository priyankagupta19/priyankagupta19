package Assignment_day4;

import Assignment_day2.first;

public class hasrelationship2 {

	public void method2(int a,int b)
	{
		System.out.println("This is second method with two parameter");
		
	}
	public static void main(String[] args) {
		hasrelationship1 hasr1=new hasrelationship1(5,7);  //object creation in same package
		hasr1.method1(100); 
		first f=new first();  //Object creation in different package
		f.div(60, 6);
		
	}
	
}
