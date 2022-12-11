package arrays;

public class multidimensionalarray {

	public static void main(String[] args) {
		
		int i[][]= new int[2][3];
		i[0][0]=10;
		i[0][1]=20;
		i[0][2]=30;
		
		i[1][0]=40;
		
		i[1][1]=50;
		i[1][2]=60;
		System.out.println("the size of array i is:"+i.length);
		
	for(int a=0;a<i.length;a++)
	{
		for(int b=0;b<=2;b++)
		{
			System.out.println(i[a][b]);
		}
		
	}
		
		
	}
}

