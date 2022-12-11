package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatersidflipkart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Documents\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");  
	    By var =  By.name("q");
	    WebElement element = driver.findElement(var);
	    element.sendKeys("samsung mobiles");
	  // driver.findElement(By.name("q")).sendKeys("samsung washing machine");
	    element.sendKeys(Keys.ENTER);
	     System.out.println("program is completed");
		

	}

}
