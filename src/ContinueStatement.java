import java.util.ArrayList;

public class ContinueStatement {

	public static void main(String[] args) {
		int a=10;
		do
		{
			System.out.println(a);
			a--;
		}while(a>=1);
		
		
		for(int i=0;i<=20;i++)
		{
			if(i==5)
			{
				continue;
			}
			{
				System.out.println("the value of i is="+i);// if break statement used then flow of program will stop at 5 
			}
		}
		
//		int i[]=new int[4];
//		i[0]=1;
//		i[1]=2;
//		i[2]=9;
//		i[3]=4;
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		for(int var:i)
//		{
//			list.add(var);
//			
//		}
//		System.out.println(list);
	}
	
	
	
	
	

}
