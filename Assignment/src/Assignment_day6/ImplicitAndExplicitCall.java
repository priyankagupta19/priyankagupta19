package Assignment_day6;

public class ImplicitAndExplicitCall {
	int a;
	public void normalcall(int b)
	{
		a=b;
		System.out.println("Result without conversion "+a);
	}
	public void implicitcall()
	{
		char c = 70;
	     a=c;   //implicit conversion
	System.out.println("Result with implicit call "+a);
}
	public void explicitcall(float f)
	{
		a=(int) f;  //Explicit conversion
		System.out.println("Result with explicit call "+a);
	}
	public static void main(String[] args) {
		ImplicitAndExplicitCall obj=new ImplicitAndExplicitCall();
		obj.normalcall(19);
		obj.implicitcall();
		obj.explicitcall(16.7F);
	}
}
