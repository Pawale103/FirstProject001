package firstjavapakage;

public class statickeyword1 {
	
	static int a=10;
	static int b=20;
	int c=30;
	public static void addition()
	
	{
		
		System.out.println("this is static method");
		System.out.println(a+b);
		System.out.println(a);
		System.out.println(b);
		System.out.println();
	}
	public static void test()
	{
		addition();
		System.out.println(a);
		System.out.println(b);
	}
	void multification()
	
	{
		System.out.println("this is mul block");
		System.out.println(a*b*c);
		addition();
		test();
	}
	public static void substraction()
	{
		System.out.println("this is static method(substraction)");
		addition();
		test();
	}

	public static void main(String[] args) {
		
		addition();
		test();
		substraction();
		statickeyword1 obj1 =new statickeyword1();
		obj1.multification();
		//1.static methods can access only static stuff(directly –without creating an object)
		//2.static methods can also access non static stuff but through object only.
		//3.Non static methods can access both static & non static stuff directly.
		
	}

}
