package Assignment_day6;

public class ImplicitAndExplicitwithdifferntreturntype {
		
	public int explicitcall(float f)
	{ 
	System.out.println("Result with explicit conversion when return type is different call "+f);
	return (int) f;  // Explicit conversion when return type is different
}
	public float implicitcall(int a)
	{
		System.out.println("Result with implicit conversion when return type is different call "+a);
		return a;  //Implicit conversion
	}
	public static void main(String[] args) {
		ImplicitAndExplicitwithdifferntreturntype obj=new ImplicitAndExplicitwithdifferntreturntype();
		int a=obj.explicitcall(18.8F);
		System.out.println("Ouput after explicit conversion "+a);
		float F=obj.implicitcall(15);
		System.out.println("Ouput after implicit conversion "+F);
	}
}
