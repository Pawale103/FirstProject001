package youtubepractice;

import java.util.HashSet;

public class FindDuplicateElements1 {

	public static void main(String[] args) {
		String arr[]= {"java","c","c++","paython","Java"};
		
		HashSet langs=new HashSet();
		boolean flag=false;
		for(String var:arr)
		{
			if(langs.add(var)==false)
			{
				System.out.println("found duplicate element:"+var);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("not found duplicate values");
		}
	}

}
