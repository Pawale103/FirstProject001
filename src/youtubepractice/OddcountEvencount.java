package youtubepractice;

public class OddcountEvencount {

	public static void main(String[] args) {
		
		int num=123456789;
		int oddcount=0;
		int evencount=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			num=num/10;
		}
		System.out.println("odd count is:"+oddcount);
		System.out.println("even count is:"+evencount);
		
	}

}
