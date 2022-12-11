package arrays;

public class objectarray {

	public static void main(String[] args) {
		// for homogeneous data we use normal array
		int i[] = new int [5];
		i [0]=1;
		i [1]=2;
		i[2]=3;
		i[3]=4;
		i[4]=5;
		for (int var=0;var<i.length;var++)
		{
			System.out.println(var);
		}
		//for storing heterogeneous data object array is used
		
		Object a[]=new Object[5];	
		a[0]=10;
		a[1]="patil";
		a[2]=20.00;
		a[3]=20.000f;
		a[4]='c';
		System.out.println("the size of array is:"+a.length);
		System.out.println("this is for loop");
		for(int value=0;value<a.length;value++)
		{
			System.out.println(a[value]);
		}
		//for each loop
		System.out.println("this is for each loop");
		for (Object var:a)
		{
			System.out.println(var);
		}
		
		Object b[]= {"java",40,40.55,'c',1.1f,true,false,"end"};
		
		for(int j=0;j<b.length;j++)
		{
			System.out.println(b[j]);
		}
		
		

	}

}
