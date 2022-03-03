package Assignment_day6;

public class PolymorphismMethodOverloding {
public int methodoverloading(int a,int b,int c)
{
	int d;
	d=a*b*c;
	System.out.println("Multiplicaion output is "+d);
	return d;
}
public void methodoverloading(int a,int b)
{
	int d;
	d=a/b;
	System.out.println("Division output is "+d);
}
public static void main(String[] args) {
	PolymorphismMethodOverloding obj=new PolymorphismMethodOverloding();
	int e=obj.methodoverloading(7, 8, 8);
	obj.methodoverloading(e,7);
}
}