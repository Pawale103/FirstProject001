package testngpackage;

import org.testng.annotations.Test;

public class testng2 {
	
	@Test(priority=1)
	public void test()
	{
		System.out.println("opening Browser");
	}
	  @Test(priority=2)
	public void login()
	{
		System.out.println("this is login test");
	}
	  @Test(priority=3)
	  public void teardown()
	  {
		 System.out.println("closing browser"); 
	  }

	

}
