package youtubepractice;

public class FindDuplicateElements {

	public static void main(String[] args) {
		String arr[]= {"java","c","c++","paython","java","paython"};
		
	
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]==arr[j])
        		{
        			System.out.println("duplicate elment is found:"+arr[i]);
        			flag=true;
        		}
        	}
        }
        if(flag=false)
        {
        	System.out.println("duplicate elments not found");
        }
		

	}

}
