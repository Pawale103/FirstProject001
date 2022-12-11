package practicepackage;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter a no");
		 int num= sc.nextInt();
		 int orgno=num;
		 int rev=0;
		 
		 while(num!=0)
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
			 System.out.println("no is not palindrom");
		 }

	}

}
