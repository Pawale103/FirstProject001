package string;

public class stringclass2 {

	public static void main(String[] args) {
		String str="java ";
		String str1="Developers";//string is immutable i.e. it is not changeable 
		System.out.println(str.concat(str1));
		String str2 =str.concat(str1);
		System.out.println(str2);
		str.concat(str1);
		System.out.println(str);

	}

}
