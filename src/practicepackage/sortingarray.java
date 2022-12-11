package practicepackage;

import java.util.Arrays;

public class sortingarray {

	public static void main(String[] args) {
		
		
		int array[]= {20,40,30,10,70,5,65};	
		System.out.println("----before sorting----");
		System.out.println(Arrays.toString(array));
		//for(int i=0;i<=array.length-1;i++)
		//	System.out.println(array[i]);
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
		System.out.println("----after sorting----");
		for(int i=0;i<=6;i++)
		{
			System.out.println(array[i]);
				
		}
		System.out.println("----descending order ----");
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.println(array[i]);
		}
	
		

	}

}
