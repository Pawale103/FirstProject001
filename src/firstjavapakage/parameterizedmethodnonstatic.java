package firstjavapakage;

public class parameterizedmethodnonstatic {//this is non static parameterized method.
	
	public void test()
	{
		System.out.println("this is zero parameter method");
	}
	public void test(int a)
	{
		System.out.println("this is single parameter method");
	}
    public void test (int a ,int b)
    {
    	System.out.println("this is two parameter method");
    }

	public static void main(String[] args) {
		parameterizedmethodnonstatic obj =new parameterizedmethodnonstatic();
		obj.test();
		obj.test(10);
		obj.test(20,20);
	}

}
