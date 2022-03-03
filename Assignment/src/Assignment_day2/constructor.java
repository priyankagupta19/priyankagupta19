package Assignment_day2;

public class constructor {

	
	public constructor() {
		this(8,9,10);
		System.out.println("Non parametrised constructor");// TODO Auto-generated constructor stub
	}
	public constructor(int a) {
		this(2,3,4,5);
		System.out.println("One parametrised constructor");// TODO Auto-generated constructor stub
	}
	public constructor(int a,int b) {
		this();
		System.out.println("Two parametrised constructor");// TODO Auto-generated constructor stub
	}
	public constructor(int a,int b,int c) {
		System.out.println("Three parametrised constructor");// TODO Auto-generated constructor stub
	}
	public constructor(int a,int b,int c,int d) {
		this(6,7);
		System.out.println("Four parametrised constructor");// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
	constructor cons=new constructor(11);
	}
	
}
