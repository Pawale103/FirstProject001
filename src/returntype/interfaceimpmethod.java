package returntype;

public class interfaceimpmethod implements interface2,interface3 {
public	void test()
	{
		System.out.println("this is test method of interface1");
	}
public	void addition()
	{
		System.out.println("this is addition method of interface1");
	}
public void print()
{
	System.out.println("this is print method of interface 1");
}
public void call()
{
	System.out.println("this is call method from interface2");
}
public void derivatives()
{
	System.out.println("this is derivatives method from interface2");
}
public void slr() {
	System.out.println("this is slr method");
	
}
@Override
public void enter() {
	System.out.println("this is enter method");
	
}
@Override
public void home() {
	System.out.println("this is home of interface3");
}

	public static void main(String[] args) {
		interfaceimpmethod obj = new interfaceimpmethod();
		obj.test();
		obj.addition();
		obj.print();
		obj.call();
		obj.derivatives();
		obj.slr();
		obj.enter();
		obj.home();
		
		
	}
	
	

}
