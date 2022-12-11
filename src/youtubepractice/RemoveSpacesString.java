package youtubepractice;

public class RemoveSpacesString {

	public static void main(String[] args) {
		
		String str= "Welcome   to Naveen    automation";
		System.out.println("before removing white spaces:"+str);
		str=str.replaceAll(" ","");
		System.out.println("after removing white spaces:"+str);
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());

	}

}
