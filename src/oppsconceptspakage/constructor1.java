package oppsconceptspakage;

public class constructor1 {
	void test()
	{
		System.out.println("this is test method");
	}
	constructor1()
	{
		System.out.println("this is constructor with no parameter");
	}
	constructor1(int a)
	{
		System.out.println("this is one parameter constructor");
	}
	
	static 
	{
		System.out.println("this is static block");
	}
	{
		System.out.println("this is non static block");
	}


	public static void main(String[] args) {
		new constructor1();
		new constructor1(10);
		
		

	}

}
