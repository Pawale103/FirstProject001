package string;

public class stringbufferandbuilder {
	
	public void test()
	{
		System.out.println("this is test method in stringbufferandbuilder");
	}

	public static void main(String[] args) {
		//String pool area i.e. string is not changeable 
		String str="Java";
		str.concat("world");
		System.out.println(str);
		
		//heap area i.e. class StringBuilder and StringBuffer
		 StringBuffer sb =new StringBuffer("java");
		 sb.append(" developers");//string is mutable
		 System.out.println(sb);
		   
		 
		 StringBuilder sb1 = new StringBuilder("hello");
		 sb1.append(" world");
		 System.out.println(sb1);
	
	}

}
