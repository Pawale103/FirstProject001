package Exceptionhandling;

public class arrayindexoutofboundexception {

	public static void main(String[] args) {
		System.out.println("program is started");
		System.out.println("program is in progress");
		
		int a[] =new int[10];
		a[0]=1;
		try
		{
		a[15]=50;
		System.out.println(a[15]);
		}
		catch(ArrayIndexOutOfBoundsException b)
		{
			System.out.println("we are into catch block");
			System.out.println(a[0]);
			System.out.println("program is completed");
		}
		

	}

}
