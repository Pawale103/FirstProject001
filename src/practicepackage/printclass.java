package practicepackage;

import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class printclass {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @autocomplete='off']")).sendKeys("apple mobiles");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		TakesScreenshot sb= (TakesScreenshot)driver;
		File screenshot= sb.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\91738\\eclipse-workspace\\firstjavaproject\\Drivers\\error1234.jpg");
		FileHandler.copy(screenshot, destination);
		
		

	}

}
