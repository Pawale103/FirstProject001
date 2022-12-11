package testngpackage;

import org.testng.annotations.Test;

public class groupingtest {
	
	@Test(groups= {"smoke"})
    public void test1()
    {
		System.out.println("this is test1");
		
    }
	
	@Test(groups= {"smoke"})
	public void test2()
	{
		System.out.println("this is test2");
	}
	
	@Test(groups= {"sanity"})
	public void test3()
	{
		System.out.println("this is test 3rd");
	}
	
	@Test(groups= {"sanity"})
	public void test4()
	{
		System.out.println("this is test 4");
	}
	
	@Test(groups= {"sanity"})
	public void test5()
	{
		System.out.println("this is test 5");
	}

}
