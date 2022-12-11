package youtubepractice;

public class ArraysOperations {

	public static void main(String[] args) {
		
		String str="david";
	
		String str1="david";
		
		System.out.println(str==str1);
		
		String str2=new String("david");
		
		String str3= new String ("david");
		
		System.out.println(str2==str3);
		System.out.println(str2.equals(str3));
		//print odd numbers
		for(int i=1;i<=100;i++)
		{
			if( i%2!=0)
			{
				System.out.println(i);
			}
		}
	
	
	}

}
