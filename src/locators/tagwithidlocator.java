package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagwithidlocator {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("samsung mobile");
		
		driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
		
		System.out.println("Program is Completed");
		
		
		

	}

}
