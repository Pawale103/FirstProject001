package Exceptionhandling;

public class arthmaticexception {

	public static void main(String[] args) {
		System.out.println("program start");
		System.out.println("program in progress");
		try
		{
			int i =50/0;
			System.out.println(i);
		}
		catch(NullPointerException a)
		{
			System.out.println("we are into catch block 1");
		}
		catch(ArithmeticException a)
		{
			System.out.println("we are into catch block 2");
		}
		System.out.println("program is completed ");
		System.out.println("program is Exited");

	}

}
