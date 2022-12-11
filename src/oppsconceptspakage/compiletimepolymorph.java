package oppsconceptspakage;

public class compiletimepolymorph {
	void print()
	{
		System.out.println("this is zero parameter method");
	}
	void print(int a)
	{
		System.out.println("this is single parameter method");//method overloading
	}
	void print(int b, int c)
	{
		System.out.println("this is two parameter method");
	}
	void print(String name,int d)
	{
		System.out.println("this is two parameter method with String data type");
	}
	
	public int print(int a,int b,int c)// this is also example of method overloading with return types as a integer return types does not matter
	{
	     int	d=a+b+c;
		return d;
	}

	public static void main(String[] args) {
		compiletimepolymorph obj =new compiletimepolymorph();
		obj.print();
		obj.print(10);
		obj.print(20,20);
		obj.print("john",30);
		int m=obj.print(1, 2, 3);
		System.out.println(m);
		

	}

}
