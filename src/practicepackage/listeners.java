package practicepackage;

import org.testng.ITestContext;
import org.testng.ITestResult;

public class listeners  {
	// this belongs to ITestListeners and will execute before starting of test set/batch
	
	public void onStart(ITestContext arg)
	{
		System.out.println("starts tests executions..."+ arg.getName());
	}
	//end of test set/batch
	public void onFinish(ITestContext arg)
	{
		System.out.println("finish test execution..."+ arg.getName());
	}
	
	//this belongs to itestlisteners and will execute before the main test method stat 
	//ie @test
	public void onTestStart(ITestResult result)
	{
		System.out.println("Passed Test "+result.getName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("test passed"+result.getName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("failed test "+ result.getName());
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("skipped test"+ result.getName());
	}
	
	
}
