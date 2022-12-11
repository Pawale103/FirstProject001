package firstjavapakage;

public class nonstaticstuff {
	
	int a;
	public void test()
	{
		System.out.println("this is non static method");
	}
	{
		System.out.println("this is non static block");//non static block execute at the time of object creation
		
	}
	static
	{
		System.out.println("this is static block");
	}

	public static void main(String[] args) {
		System.out.println("we are executing non static stuff");
		nonstaticstuff obj=new nonstaticstuff();
		obj.a=20;
		System.out.println(obj.a);
		obj.test();
		

	}

}
