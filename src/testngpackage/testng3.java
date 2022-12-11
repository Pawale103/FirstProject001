package testngpackage;

import org.testng.annotations.Test;

public class testng3 {
	@Test(priority=1)
	public void obrowser()
	{
		System.out.println("open the browser");
	}
	 @Test(priority=2)
	 public void searchcustomer()
	 {
		 System.out.println("this is search customer test");
	 }
	 @Test(priority=3)
	 public void addcustomer()
	 {
		 System.out.println("this is addcustomer method");
	 }
	 @Test(priority=4)
	 public void teardown()
	 {
		 System.out.println("browser closing");
	 }

}
