package oppsconceptspakage;

public class thiskeyword {
	/*1.this can be used to refer current class instance variable.
    2.this can be used to invoke  current class method.
    3.this() can be used to invoke current class constructor.*/
	String ename;
	int edeptno;
	double esalary;
	void test(String ename,int edeptno,double esalary)
	{
		this.ename=ename;
		this.edeptno=edeptno;
		this.esalary=esalary;
		System.out.println(ename);
		System.out.println(edeptno);
		System.out.println(esalary);
		this.print();
	}
void	print()
	{
	this.addition();
		System.out.println("this is print method of current class");
	}
    void display()
    {
    	System.out.println("this is current class display method");
    }
    thiskeyword()
    {
    
    	System.out.println("this is zero parameter constructor");
    }
    thiskeyword(int a)
    {
    	this();
    	System.out.println("this is one parameter constructor");
    }
    thiskeyword(int a,int b)
    {
    this();
    }
    void addition()
    {
    	int a=10,b=20;
    	System.out.println(a+b);
    }
    
	public static void main(String[] args) {
		thiskeyword obj =new thiskeyword(10);
		
	}

}
