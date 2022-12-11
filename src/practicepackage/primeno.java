package practicepackage;

public class primeno {

	public static void main(String[] args) {
		int no =13;
		boolean flag=false;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=true;
			}
			}
		if(flag==false)
		{
			System.out.println("no is prime");
		}
		else
		{
			System.out.println("no is not prime");
		}

	}
	}
