package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagandclasslocator {

	    public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("patil");
		
		System.out.println("program is completed");

	}

}
