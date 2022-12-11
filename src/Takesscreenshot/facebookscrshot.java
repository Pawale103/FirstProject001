package Takesscreenshot;

import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class facebookscrshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("bhaskar");	
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("patil");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("lastname");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("pawalebhaskar@gmail.com");
		// to take screenshot we have to create the object of TakesScreenshot interface
		
		TakesScreenshot shot = (TakesScreenshot)driver;
		
		//Store the taken screenshot as image
		
		File screenshot = shot.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\91738\\eclipse-workspace\\firstjavaproject\\Drivers\\error.jpg");
		FileHandler.copy(screenshot, destination);
		System.out.println("completed");
		
		
		
		
		
		
	}

}
