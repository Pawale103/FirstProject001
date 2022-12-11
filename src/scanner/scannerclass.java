package scanner;

import java.util.Scanner;

public class scannerclass {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Name of the Employee");
		String name=sc.nextLine();
		System.out.println("Employee name is:"+name);
		
		System.out.println("Enter the Age:");
		int age= sc.nextInt();
		System.out.println("Age of the Employee is:"+age);
		
		System.out.println("Enter the service period:");
		int service=sc.nextInt();
		System.out.println("service period is:"+service);
		
	}

}
