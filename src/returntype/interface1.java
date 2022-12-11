package returntype;

public interface interface1 {
	int a=20;//in interface any variable is by default static and method is by default abstract.
	void test();//we can not create object of the interface.or an abstract class.
	void print();
	void addition();
	default void test1()
	{
		System.out.println("this is test1 method in interface1");
	}

}
