package Assignment_day4;

public class samevarnamewiththis {
	int a;
	public void method(int a)
	{
		this.a=a;
	}

	public static void main(String[] args) {
		samevarnamewiththis svname1=new samevarnamewiththis();
		svname1.method(5);
		System.out.println("Result of a with this keyword is  "+svname1.a);
	}
}
