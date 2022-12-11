package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiallinktextlocator {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.partialLinkText("Home")).click();
		System.out.println("Program is completed");

	}

}
