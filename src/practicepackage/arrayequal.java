package practicepackage;

import java.util.Arrays;

public class arrayequal {

	public static void main(String[] args) {
		int ar1[] = { 10, 20, 30 };
		int ar2[] = { 40, 50, 60 };
		int ar3[] = { 40, 50, 60 };
		
	boolean b=Arrays.equals(ar1,ar2 );
	//boolean c=	Arrays.equals(ar2, ar3);
	System.out.println(b);
	if( b==true)
	{
		System.out.println("array are equal");
	}
	else
	{
		System.out.println("arrays are not equal");
	}
	
	


	}

}
