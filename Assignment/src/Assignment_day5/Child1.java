package Assignment_day5;

public class Child1 extends Parent1{
	public Child1()
    {
		super(2); //control will go to default constructor call of Parent class
		
	System.out.println("This is default constructor of child class");// default constructor of Child class
}
    public Child1(int a)
    {
    	this(2,3,4); //control will go to three parameterized constructor call of child class
	System.out.println("This is one parametrised constructor of child class");// One Parameterized constructor of child class
}
    public Child1(int a,int b)
    {
    	this(2); // control will go to one parameterized constructor call of child class
	System.out.println("This is two parametrised constructor of child class");// Two Parameterized constructor of child class
}
    public Child1(int a,int b,int c)
    {
    	this(); //control will go to default constructor call of child class
	System.out.println("This is three parametrised constructor of child class");// Three Parameterized constructor of child class
}
    public static void main(String[] args) {
		Child1 obj=new Child1(2,3); // control will go to two parameterized constructor call of child class
	}
}
