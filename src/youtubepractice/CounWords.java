package youtubepractice;

public class CounWords {//issue

	public static void main(String[] args) {
		
		String str="Welcome To Java Program";
		int count=0;
		 for(int i=0;i<str.length();i++)
		 {
			 if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' '));
			 {
				 count =count+1;
			 }
		 }
		 System.out.println(count);
		 System.out.println(str.length());
		
	}

}
