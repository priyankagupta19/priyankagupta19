package Assignment_day4;

public class samevarname {
int a;
public void method(int a)
{
	a=a;
}

public static void main(String[] args) {
	samevarname svname=new samevarname();
	svname.method(5);
	System.out.println("Result of a without this keyword "+svname.a);
}
}
