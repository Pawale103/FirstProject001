package Exceptionhandling;

public class arthmaticexception1 {

	public static void main(String[] args) {
		System.out.println("program started ");
		System.out.println("program is in progress");
		int a=20;
		int b=20;
		int c=50;
		try
		{
		int d = c/(a-b);
		System.out.println(d);
		}
		catch(Exception k)
		{
			System.out.println("we are into catch block");
		}
		finally
		{
			System.out.println("this is finally block which always executes");
		}
		System.out.println("program is completed");
		System.out.println("program is exicted");

	}

}
