package practicepackage;

import java.util.Arrays;

public class arraysequal {

	public static void main(String[] args) {
		
//	int	ar[][]= {{1,2,3,4} ,{1,2,3,4}};
//	int ar1[][]= {{1,2,3,4},{1,2,3,4}};
//	int ar2[]= {1,2,3,4};
//	int ar3[]= {1,2,3,4};
//	int i[]=new int [7];
////	
//	i[0]=1;
//	i[1]=2;
//	i[2]=3;
//	i[3]=4;
//	i[4]=5;
//	i[5]=6;
//	i[6]=7;
//	for(int value=0;value<i.length;value++)//for(int value=0;value<i.length;i++);
//	{
//		System.out.println(i[value]);
//	}
//	
	int c[]= {1,2,4,5,6,7,8,9,10};
	System.out.println(Arrays.toString(c));
	for(int val=0;val<c.length;val++) {
		
		System.out.println(c[val]);
	}
	
	int d[]= {3,5,79,777,8,8,9};
	
	for(int v=0;v<d.length;v++)
	{
		System.out.println(d[v]);
	}
	
	for(int var:d)
	{
		System.out.println(var);
	}
	
	int [][]z=new int[2][2];
	
	z[0][0]=10;
	z[0][1]=20;
	
	z[1][0]=30;
	z[1][1]=40;
	
	for(int row=0;row<z.length;row++)
	{
		for(int col=0;col<z[row].length;col++)
		{
			System.out.println(z[row][col]);
		}
	}
	
	String s="java";
	String s1=" developers";
	System.out.println(s.concat(s1));
	
	String w=s.concat(s1);
	
	System.out.println(w);
	int i[]= {1,2,3,4};
	for (int var=0;var<i.length;var++)
	{
		
		
			
		
		switch (i[var])
		{
		case 1:System.out.println("one");break;
		case 2:System.out.println("two");break;
		case 3:System.out.println("three");break;
		default :System.out.println("invalid");
	

	

}}}}
