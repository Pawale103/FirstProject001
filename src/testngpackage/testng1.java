package testngpackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng1 {
	
	@Test(priority=1)
	public void test1()
	{
		System.out.println("this is test 1");
	}
	
	@Test(enabled=false)// this test is skipped because of enabled false 
	public void test2()
	{
		System.out.println("this is test 2");
	}
	
	@Test(priority=3)
	public void test3()
	{
		System.out.println("this is test 3");
	}
	
	@BeforeTest
	public void Beforetest()
	{
		System.out.println("this will execute before each and every test");
	}
	@AfterTest
	public void Aftertest()
	{
		System.out.println("this will execute after every test");
	}
	

}
