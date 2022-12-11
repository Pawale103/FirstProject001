package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bytagnamelocators {

	public static void main(String[] args) {
	
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize(); 
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("indian army");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.CLEAR);
		System.out.println("Program is completed");
		
		
	}

}
