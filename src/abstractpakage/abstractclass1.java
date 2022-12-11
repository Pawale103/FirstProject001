package abstractpakage;

abstract public class  abstractclass1 {  //abstract class.
	//1.Abstract class-Partial Abstraction
	//2.Interface-Full Abstraction-100%Abstraction
	int a=10;
	void test()
	{
		System.out.println("this is test method is abstractclass1");
	}
	void addition()
	{
		System.out.println("this is adddition method in abstract class");
	}
	abstract void print();
    abstract void method();
   public  abstractclass1()
    {
    System.out.println("this is counstructor in abstract class");	
    }

	public static void main(String[] args) {
		System.out.println("Software testing\nmaterail \navailable");
		
		
	}

}
