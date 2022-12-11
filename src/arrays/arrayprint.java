package arrays;

import java.util.Arrays;

public class arrayprint {

	public static void main(String[] args) {
		
		int i[]= {1,2,3,4,5};
		
		for(int var=0;var<i.length;var++)
		
			switch(i[var])
			{
			case 1: System.out.println("one");break;
			case 2: System.out.println("two");break;
			case 3: System.out.println("three");break;
			case 4: System.out.println("four");break;
			default: System.out.println("five");
		     System.out.println(Arrays.toString(i));	
	
			}
		
		for(int var:i)
		{
			System.out.print(var);
		}
	    
		for(int var=0;var<i.length;var++)
		{
			System.out.println(i[var]);
		}
		
		

	}

}
