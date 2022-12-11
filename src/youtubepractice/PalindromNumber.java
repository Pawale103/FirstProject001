package youtubepractice;

public class PalindromNumber {

	public static void main(String[] args) {
		
		
		int num=11111;
		int orgno=num;
		int rev=0;
		while(num>0)

		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(orgno==rev)
		{
			System.out.println("no is palindrom");
		}
		else
		{
			System.out.println("is not palindrom");
		}
		
	}}
