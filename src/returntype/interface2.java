package returntype;

public interface interface2 extends interface1 {
	void call();
	void derivatives();
	void slr();
	default void print()
	{
		System.out.println("this is print method in interface2");
	}

}
