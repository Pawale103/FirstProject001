package testngpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencytest {
	
	@Test
	void starttatamotors()
	{
		System.out.println("tata motors started");
	//	Assert.fail();
	}
	@Test(dependsOnMethods= {"starttatamotors"})
    void drivetatamotors()
    {
		System.out.println("tata motors is driving");
    }
	@Test(dependsOnMethods= {"drivetatamotors"})
	void stoptatamotors()
	{
		System.out.println("stopping tata motors");
	}
	
	@Test(dependsOnMethods= {"drivetatamotors","stoptatamotors"},alwaysRun=true)
	void parktatamotors()
	{
		System.out.println("tata is parked");
	}
}
