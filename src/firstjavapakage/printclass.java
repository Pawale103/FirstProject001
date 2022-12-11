package firstjavapakage;

public class printclass {
	
	public static void  test()
	{
		System.out.println("this is test method(static)");
	}
	void print()
	{
		System.out.println("this is print method");
	}
	public static void main(String[] args) {
	System.out.println("hellow world");
	test();
	printclass.test();
	printclass obj= new printclass();
	obj.print();
	}

}
