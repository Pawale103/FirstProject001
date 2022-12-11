package youtubepractice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a no to reverse it");
	int num= sc.nextInt();
/*	int rev=0;
	
	while(num!=0)
	{
		rev=rev*10+num%10;
		
    num=num/10;
	}
	System.out.println(rev);*/
	
	/*StringBuffer sb= new StringBuffer();
	sb.append(num);
	System.out.println(sb.reverse());*/
	
	StringBuilder sb= new StringBuilder(String.valueOf(num));
	System.out.println(sb.reverse());
	
	

	}

}
