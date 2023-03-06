package practicepackage;

public class largestnoinarray {

	public static void main(String[] args) {
		int[] arr={28,3,15,9,17,4,33,2};
		
		int val=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>arr[0])
			{
				val=arr[i];
			}
		}
		System.out.println(val);

	}

}
