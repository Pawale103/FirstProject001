package youtubepractice;

public class StringPalindrom {

	public static void main(String[] args) {
		String str="MADAM";
		String rev="";
		
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
	    if(str.equals(rev))		
	    {
	    	System.out.println("strign is palindrom");
	    }
	    else
	    {
	    	System.out.println("string is not palindrom");
	    }
		

	}

}
