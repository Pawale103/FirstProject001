package youtubepractice;



public class SearchElementInArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,30,45,67};
		int Element=45;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(Element==a[i])
			{
				System.out.println("element is found at:"+i);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("element is not found");
		}
	}

}
