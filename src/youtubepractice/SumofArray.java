package youtubepractice;

public class SumofArray {

	public static void main(String[] args) {
		
		int a[]= {10,34,67,867,54,43,34};
		int sum=0;
		/*for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);*/
		 
		//using inhanced for loop
		
		for(int var:a)
		{
			sum=sum+var;
		}
		System.out.println(sum);
		
		

	}

}
