package practicepackage;

public class revno {

	public static void main(String[] args) {
		
        long nu=123456789;
        StringBuffer sb= new StringBuffer(String.valueOf(nu));
        StringBuffer c=sb.reverse();
        System.out.println(c);
        

		int no=1234567890;
		StringBuffer sbq=new StringBuffer(String.valueOf(no));
		
		StringBuffer s=sbq.reverse();
		
		System.out.println(s);
		
		StringBuilder sb1= new StringBuilder("12345678");
		StringBuilder d= sb1.reverse();
		System.out.println(d);
		
		
	

	
	

	}

}
