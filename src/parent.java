class parentmethod
{
void method()
	{
		System.out.println("this is parent class method");
	}
}
	
	
	class child1 extends parentmethod
	{
		void print()
		{
			System.out.println("this is print method from class child1");
		}
	}
	
	class child2 extends parentmethod
	{
		void print()
		{
			System.out.println("this is print method form child class2");
		}
	}
	
	class child3 extends parentmethod
	{
	
	void addition()
	{
		int a=20;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	}

public class parent {
	static void print()
	{
		System.out.println("this is pritn method in parent class");
	}
	void sub()
	{
		System.out.println("this is sub method form parent class (non static)");
	}
	public static void main(String[] args) {
		
		child1 obj1 = new child1();
		obj1.print();
		
		child2 obj2 = new child2();
		obj2.print();
		
		child3 obj3 = new child3();
		obj3.addition();
		
		print();
		
		
		
		 

	}

}
