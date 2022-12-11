package practicepackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class largestelementinarray {

	public static void main(String[] args) {
		int ar[] = {-20, 10, 20, 30, 40, 60, 40, 50, 60, 80, 100 };
		
		Arrays.sort(ar);
		
		System.out.println("highest   "+ar[ar.length-1]);
		System.out.println(ar[0]);
//		TreeSet tr= new TreeSet();
//		for(int num:ar)
//		{
//			tr.add(num);
//		}
//		ArrayList al=new ArrayList(tr);
//		System.out.println("2nd highest no is :"+al.get(al.size()-2));
//		System.out.println("2nd lowest no :"+al.get(1)); 
//		System.out.println("higest   "+al.get(al.size()-1));
//		System.out.println("lowest  "+al.get(0));
//		

	}

}
