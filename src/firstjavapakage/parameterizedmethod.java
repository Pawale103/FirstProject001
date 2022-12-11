package firstjavapakage;

public class parameterizedmethod {//this is static parameterized method.
	public static void test()
	{
		System.out.println("this is zero parameter method");
	}
	public static void test(int a)
	{
		System.out.println("this is single parameter method");
	}
    public static void test (int a ,int b)
    {
    	System.out.println("this is two parameter method");
    }
	public static void main(String[] args) {
		test();
		test(10);
		test(10,10);
	}

}
