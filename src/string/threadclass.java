package string;

public class threadclass {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("this is 1st statement");
		System.out.println("this is 2nd statement");
		System.out.println("this is 3rd statement");
		Thread.sleep(3000);
		System.out.println("this is 4th statement");
	}

}