package string;

public class stringclass1 {

	public static void main(String[] args) {
		String s ="Java Developers ";
		String t = "Web Application";
        System.out.println(s.isEmpty());
        System.out.println(t.isEmpty());
        System.out.println(s.length());
        int size =s.length();
        System.out.println(size);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.indexOf("e"));
        System.out.println(s.lastIndexOf("e"));
        System.out.println(s.charAt(8));
        System.out.println(s.concat(t));
        System.out.println(s.contains(s));
        
        
	}

}
