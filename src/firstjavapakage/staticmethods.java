package firstjavapakage;

public class staticmethods {
	
	public static void addition()
	{
		int a =10;
		int b= 30;
		int v=a+b;
		System.out.println("addition of a and b is:"+v);
	}
	public static void substraction()
	{
		int a=20;
		int b=20;
		int c=a-b;
		System.out.println("substraction of a and b is:"+c);
	}
	public static void division()
	{
		int a=22;
		int b=3;
		int c= a/b;
		System.out.println("the division of a and b is:"+c);
	}

	public static void main(String[] args) {
		addition();
		substraction();
		division();
		staticmethods.addition();
		staticmethods.substraction();
		staticmethods.division();
		
		
		
	}

}
