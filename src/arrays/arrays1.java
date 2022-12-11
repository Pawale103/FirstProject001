package arrays;

public class arrays1 {

	public static void main(String[] args) {
		int a =10;
		int b[]=new int[5];//1st syntax
		int c[]= {2,5,10,20,30,40,50,60,70};//2nd syntax
		System.out.println("the size of the array b is:"+b.length);
		b[0]=10;
		b[1]=20;
		b[2]=30;
		b[3]=40;
		b[4]=50;
		for(int value=0;value<b.length;value++)
		{
			System.out.println(b[value]);
		}
		System.out.println("the size of array c is:"+c.length);
	}

}
