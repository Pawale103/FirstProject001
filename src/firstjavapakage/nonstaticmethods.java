package firstjavapakage;

public class nonstaticmethods {
	
	void test()
	{
		System.out.println("this is test mehtod");//non static method that is if we want to call this 
		//method we have to create an object in the main method and then call the method with object reference variable.
	}
	public void addition()
	
	{
		multification();
		int a =20;
		int b=30;
		int c=a+b;
		System.out.println("the additon of a and b is:"+c);
	}
	public void substraction()
	{
		addition();
		int a=20;
		int b=20;
		int c=a-b;
		System.out.println("substraction of a and b is:"+c);
	}
	public static void multification()
	
	{
	
		int a =10;
		int b =10;
		int c=a*b;
		System.out.println("the multification of a and b is:"+c);
	}

	public static void main(String[] args) {
		nonstaticmethods obj =new nonstaticmethods();
		obj.test();
		obj.addition();
		obj.substraction();
		staticmethods.addition();
		staticmethods.substraction();
		staticmethods.division();
		
		
	}

}
