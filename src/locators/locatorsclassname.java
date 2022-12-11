package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsclassname {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.calculator.net/");
	driver.findElement(By.className("inlongest")).sendKeys("distance calculator");
	
	driver.findElement(By.id("bluebtn")).click();
	System.out.println("Program is completed");
		
		
				
	
	}

}
