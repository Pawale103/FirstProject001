package practicepackage;

public class countspaces {

	public static void main(String[] args) {
		int count =0;
		String str="ab         c d";
		for(int i=0;i<str.length();i++)
		{
			char str1=str.charAt(i);
			if(str1== ' ')
			{
				count=count+1;
			}
		}
System.out.println("no of spaces in string: "+count);
	}

}
