package Takesscreenshot;

import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class mysqlcompilersrcshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\eclipse-workspace\\firstjavaproject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://onecompiler.com/mysql");
		
		
		TakesScreenshot src =(TakesScreenshot)driver;
		File screenshot = src.getScreenshotAs(OutputType.FILE);
	    File destination = new File("C:\\Users\\91738\\eclipse-workspace\\firstjavaproject\\Drivers\\error2.jpg");
	    
	    FileHandler.copy(screenshot, destination);
	    
	    System.out.println("screenshot is captured");
	

	}

}
