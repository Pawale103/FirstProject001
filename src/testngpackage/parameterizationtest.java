package testngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class parameterizationtest {
	
	WebDriver driver;
	
	@Test(priority=1)
	
	@Parameters({"browser"})
	
	void verifytitle(String browserName) throws InterruptedException
	{
	if(browserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\91738\\eclipse-workspace\\firstjavaproject\\servers\\chromedriver.exe");
		driver =new ChromeDriver();	
	}
	else if(browserName.equalsIgnoreCase("opera"))
	{
		System.setProperty("webdriver.opera.driver","C:\\Users\\91738\\Downloads\\operadriver.exe");
		driver=new OperaDriver();	
	}
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
	
	System.out.println(driver.getTitle());
	
	Thread.sleep(2000);
	
	
	}
	@Test(priority=2)
	
	void teardown()
	{
		driver.quit();
	}

}
