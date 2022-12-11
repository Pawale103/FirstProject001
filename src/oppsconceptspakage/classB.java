package oppsconceptspakage;

public class classB extends classA {
	int b=30;
	void display()
	{
		System.out.println("this is class B method");
	}

	public static void main(String[] args) {
		classB obj =new classB();
		obj.test();
		obj.display();
	    System.out.println(obj.a);
		

	}

}
