package firstjavapakage;

public class arthmaticoperator1 {
	
public int a=20;
	
	public int b=30;
	
	public void addition()
	{
		System.out.println(a+b);
	}
	
	public void dance()
	{
		 
		System.out.println("this is the dance mehtod in default package");
	}
	public static void main(String[]args) {
		
		String str="stirngvalue";//try to store the variable in integer with parse int function
		try
		{
		int i = Integer.parseInt(str);
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			System.out.println("finally block always executes");
		}
		
		int a =10;
		int b=20;
		int c=a+b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
        System.out.println("we are doing arthmatic operations");
		System.out.println("the sum of a and b :"+(a+b));
		System.out.println("the substraction of a and b is:"+(a-b));
		System.out.println("the sum of a and b is:"+a+b);
		System.out.println("multi of a and b is:"+(a*b));
		System.out.println("the division a and b is:"+(a/b));
		System.out.println("the divison of b and a is:"+(b/a));
		
		
	
	}

}
