package firstjavapakage;

public class staticstuff {
	static int a;
	public static void test()
	{
		System.out.println("this is static method");	
	}
	static
	{
		System.out.println("this is static block");//static block execute first then sequence continues
	}

	public static void main(String[] args) {
		System.out.println("static variable");
		 a =20;
		System.out.println(a);
		System.out.println("static method");
		test();
		
	}

}
