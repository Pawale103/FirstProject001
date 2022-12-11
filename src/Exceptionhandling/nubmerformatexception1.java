package Exceptionhandling;

public class nubmerformatexception1 {

	public static void main(String[] args) {
		System.out.println("program is started");
		System.out.println("program is in progress");
		
		String s ="patil";
		try {
		double b =Double.parseDouble(s);
				System.out.println(b);
		}
		catch(NumberFormatException c)
		{
			System.out.println("we are into catch block");
		}
		
		System.out.println("program is completed");
		
		

	}

}
