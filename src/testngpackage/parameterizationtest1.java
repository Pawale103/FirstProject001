package testngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class parameterizationtest1 {
	WebDriver driver;
	
	@Test(priority=1)
	@Parameters({"Browser"})
	
	void verifytitle(String browserName) throws InterruptedException
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91738\\Documents\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("opera"))
		{
			System.setProperty("webdriver.opera.driver","C:\\Users\\91738\\eclipse-workspace\\firstjavaproject\\Drivers\\operadriver.exe");
			driver= new OperaDriver();
			
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

		


	public static void main(String[] args) {
		

}}
