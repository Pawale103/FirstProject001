package testngpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testexecutioncycle {
	
	@BeforeClass
	void beforeclass()
	{
		System.out.println("this will execute before every class");
	}

	@AfterClass
	void aftrclass()
	{
		System.out.println("this will execute after every class");
	}
	@BeforeMethod
	void beformehtod()
	{
		System.out.println("this will execute before every method");
	}
	@AfterMethod()
	void aftermethod()
	{
		System.out.println("this will execute after every method");
	}
	
	@Test(priority=1)
	public void test1()
	{
		System.out.println("this is test1");
	}
	
	@Test(priority=2)
	public void test2()
	{
		System.out.println("this is test2");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("this will execute before everytest");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("this will execute after every test");
	}
	
}
