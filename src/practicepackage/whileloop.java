package practicepackage;

public class whileloop {
	
	void print(int i)
	{
		System.out.println("this is print method");
	}

	public static void main(String[]args) {
		
		whileloop obj=new whileloop();
		obj.print(10);
		
		whileloop obj1=new whileloop();
		obj1.print(20);
//		int i=1;
//		while(i<=10)
//		{
//			System.out.println(i);
//			i++;
//		}
//		int c=10;
//		while(c>=1)
//		{
//			System.out.println(c);
//			c--;
//		}
		
//		int d=10;
//		do
//		{
//			System.out.println(d);
//			d--;
//		}
//		while(d>=1);
		
//		for(int z=0;z<=100;z++)
//		{
//			System.out.println(z);
//		}
		
		for(int x=100;x>=1;x--)
		{
			System.out.println(x);
		}
	}

}
