package practicepackage;

public class Palindromno1 {

	public static void main(String[] args) {
		int no =11111;
	    int orgno=no;
		int rev=0;
		while(no!=0)
		{
			rev=rev*10+no%10;
			no=no/10;
		}
		if(orgno==rev)
		{
			System.out.println("no is palindrom");
		}
		else
		{
			System.out.println("no is not palindrom");
		}
	}

}
