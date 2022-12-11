package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsid {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		 
	By var=By.id("twotabsearchtextbox");
	WebElement element = driver.findElement(var);
	element.sendKeys("mi mobiles");
	
	By var1=By.id("nav-search-submit-button");
	WebElement element1 = driver.findElement(var1);
	element1.click();
	System.out.println("program is completed");
	
				
		
		
	}

}
   