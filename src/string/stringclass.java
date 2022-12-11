package string;

public class stringclass {

	public static void main(String[] args) {
		
		String var ="patil";//without using new keyword object creation /constant pull area or /string pull area 
		String var1 ="patil";//duplicates are not allowed i.e. both the patil's store in one place with different reference variable 
		String obj = new String("pawale");//with using new keyword 
		String obj1 = new String("pawale");// duplicates are allowed i.e. the both pawale's store in different location
		System.out.println(var==var1); //true
		System.out.println(obj==obj1);//false
		
		

	}

}
