package abstractpakage;

public interface interface1 {
	void test();
	void print();
	void method();
	default void test1()
	{
		System.out.println("this is default method in interface");
	}

}
