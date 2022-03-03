package Assignment_day4;

public class Baleno extends Nexa
{
	public void balenomethod()
	{
		System.out.println("This method is of child class baleno");
	}
	public void sum(int a, int b)
	{
		int c=a+b;
		System.out.println("This method is of child class baleno");
	}
	
    public static void main(String[] args) {
    	Baleno B=new Baleno();
    	B.marutimethod();
    	B.nexamethod(5);
    	B.balenomethod();
	
}
}
