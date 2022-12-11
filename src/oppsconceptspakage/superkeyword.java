package oppsconceptspakage;

public class superkeyword {
	superkeyword()
	{
		this(10);
		System.out.println("this is zero parameter constructor");
	}
	superkeyword(int a)
	{
		System.out.println("this is single parameter constructor");
	}
	void method1()
	{
		System.out.println("this is methd one from class superkeyword");
	}

	public static void main(String[] args) {
		superkeyword obj =new superkeyword();
		obj.method1();
		new superkeyword(10);
	

	}
}
