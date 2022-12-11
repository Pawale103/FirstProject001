package abstractpakage;

public class abstractclass2 extends abstractclass1 { 
	
	void print()//concrete class or complete class.
	{
		System.out.println("this is print method from abstractclass1");
	}
	void method()
	{
		System.out.println("this is method from class abstractclass1");
	}
	void methodclass2()
	{
		System.out.println("this is class 2 method");
	}

	public static void main(String[] args) {
		abstractclass2 obj =new abstractclass2();
		obj.print();
		obj.method();
		obj.test();
		obj.addition();
		obj.methodclass2();
		
	}

}
