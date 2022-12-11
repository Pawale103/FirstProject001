package practicepackage;

import java.util.Scanner;

public class stringrev {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a no1245");
		int no=sc.nextInt();
		StringBuffer sb=new StringBuffer(String.valueOf(no));
		StringBuffer rev=sb.reverse();
		System.out.println(rev);
				
		
		
		
		
		
		

	}

}
