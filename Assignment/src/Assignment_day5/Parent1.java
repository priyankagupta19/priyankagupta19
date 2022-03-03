package Assignment_day5;

public class Parent1 {
      public Parent1()
      {
    	  this(4,5,6); //control will go to three parameterized constructor call of Parent class
	System.out.println("This is default constructor of Parent class");// default constructor of Parent class
}
      public Parent1(int a)
      {
    	  this(3,4);  //control will go to two parameterized constructor call of Parent class
	System.out.println("This is one parametrised constructor of Parent class");// One Parameterized constructor of Parent class
}
      public Parent1(int a,int b)
      {
    	  this();  //control will go to default constructor call of Parent class
	System.out.println("This is two parametrised constructor of Parent class");// Two Parameterized constructor of Parent class
}
      public Parent1(int a,int b,int c)
      {
	System.out.println("This is three parametrised constructor of Parent class");// Three Parameterized constructor of Parent class
}
     
}
