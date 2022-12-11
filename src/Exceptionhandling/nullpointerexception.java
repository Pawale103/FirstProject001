package Exceptionhandling;

public class nullpointerexception {

	public static void main(String[] args) {
		System.out.println("program is started");
		System.out.println("program is in progress");
		try
		{
			String p =null;
			
			System.out.println(p.length());	
			
		}
		catch(Exception a)
		{
			System.out.println("we are in catch block");
		}
		finally
		{
			System.out.println("we are in finally block");
		}
		System.out.println("program is completed");
		
	}

}
