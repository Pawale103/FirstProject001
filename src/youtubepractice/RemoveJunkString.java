package youtubepractice;

public class RemoveJunkString {

	public static void main(String[] args) {
		String str="344534@#$%^%^^*fjgjgk@%$%^$dfjdfjpatil";
		str=str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(str);
		System.out.println(str.substring(2,8));
	}

}
