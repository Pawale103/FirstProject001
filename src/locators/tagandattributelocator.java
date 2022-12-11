package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagandattributelocator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.flipkart.com/");
		// by using tag and attribute 
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("samsung mobiles");
		
		// by using tag.class and attribute
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		System.out.println("program is completed");
		
		
	}

}
