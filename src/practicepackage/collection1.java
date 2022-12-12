package practicepackage;

import java.util.Stack;
import java.util.Vector;

public class collection1 {

	public static void main(String[] args) {
		Vector list = new Vector();
		//Stack list = new Stack();
		
		list.add(10);
		list .add(20);
		list.add("string");
		list.add('a');
		list.add(123);
		list.add(345);
		
		
		System.out.println(list);
		
		String str="vel  vel ocity ";
		
		int count=0;
		
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
