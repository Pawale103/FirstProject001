package youtubepractice;

public class CountLengthofno {

	public static void main(String[] args) {
		long number=1234567353;
		int count=0;
		while(number>0)
		{
			number=number/10;
			count=count+1;
		}
		System.out.println(count);
	}

}
