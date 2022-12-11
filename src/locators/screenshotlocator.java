package locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshotlocator {

	public static void main(String[] args) throws  IOException {
System.setProperty("webdriver.chrome.driver","C:\\Users/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("samsung mobiles");
            
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		// to take screen shot we are calling an interface
		
		TakesScreenshot src = (TakesScreenshot) driver;
		// we are calling getScreenshotAs method to capture the screenshot
		
		File screenshot = src.getScreenshotAs(OutputType.FILE);
		// we have to store the captured screenshot to local memory so we
		// have to give the path to that
	
		
		File dest = new File("C:\\Users\\91738\\eclipse-workspace\\firstjavaproject\\src\\arrays.jpg");
		
		FileHandler.copy(screenshot, dest);
		
		
		System.out.println("program is completed");
		
		
	}

}
