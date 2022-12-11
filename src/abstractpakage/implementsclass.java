package abstractpakage;

public class implementsclass implements interface1 { 
public	void test()
	{
		System.out.println("this is test method");
	}
	public void print()
	{
		System.out.println("this is print method");
	}
public	void method()
	{
		System.out.println("thsi is method");
	}
	public void test1()
	{
		System.out.println("this is newly implemented test1 method");
	}

	public static void main(String[] args) {
		implementsclass obj=new implementsclass();
		obj.test();
		obj.print();
		obj.method();
		obj.test1();
		
		
	}

}
