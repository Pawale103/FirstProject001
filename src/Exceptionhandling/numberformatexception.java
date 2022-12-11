package Exceptionhandling;

public class numberformatexception {

	public static void main(String[] args) {
		System.out.println("program is started");
		System.out.println("program is in progress");
		String c="patil";
		try
		{
		int i =Integer.parseInt(c);
		System.out.println(i);
		}
		catch(Exception a)
		{
			System.out.println("we are in catch block");
		}
		System.out.println("program is completed");
		
		
	}

}
