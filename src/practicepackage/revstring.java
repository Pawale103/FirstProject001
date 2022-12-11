package practicepackage;

public class revstring {

	public static void main(String[] args) {
		String org="sanjay25";
		String rev=" ";
		
		for (int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		System.out.println("original string is: "+org);
		System.out.println("rev string is: "+rev);
		
		
	}
	}
