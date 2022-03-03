package Assignment_day2;

public class practice {

	float c;
	
public void sum (float a,int b)
{
	c= (int) (a+b);
	System.out.println("sum is" + c);

}
public static void main(String[] args) {
	practice pr=new practice();
	pr.sum(10, 20);
}

}

