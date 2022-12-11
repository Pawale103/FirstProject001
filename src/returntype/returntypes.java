package returntype;

public class returntypes {
	int substraction()
	{
		int a=20;
		int b=30;
		int c=b-a;
		return c;
	}
	void addition()
	{
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
	}
	public int addition1()
	{
		int a=10;
		int b=20;
		int c=a+b;
		return c;
		
	}
	
	

	public static void main(String[] args) {
		returntypes obj =new returntypes();
		System.out.println(obj.substraction());
		obj.addition();
		obj.addition1();
		
		
	}

}
