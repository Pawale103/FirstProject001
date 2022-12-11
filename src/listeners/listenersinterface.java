package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenersinterface implements ITestListener {
	
	public void onStart(ITestContext arg)
	{
		System.out.println("start test execution..."+arg.getName());
		
	}
	public void onFinish(ITestContext arg)
	{
		System.out.println("finish test Execution..."+arg.getName());
	}
	public void onTestStart(ITestResult result)
	{
		System.out.println("starts test...."+ result.getName());
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("passed test"+result.getName());
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("failed test"+result.getName());
		
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("skipped test..."+result.getName());
	}
	

}
