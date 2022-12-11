package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktextlocator {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\ocuments\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("Mobiles")).click();
		System.out.println("Program is completed");
		
	}

}
