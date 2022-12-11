package practicepackage;

public class classprime {
	
	public static void prime(int no)
	{
		int count=0;
		
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				count=count+1;
			}
			
		}
		if(count==0)
		{
			System.out.println("no is prime");
		}
		else
		{
			System.out.println("no is not prime");
		}
	}

	public static void main(String[] args) {
		prime(40);
	
		
		

	}

}
