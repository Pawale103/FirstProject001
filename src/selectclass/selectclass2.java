package selectclass;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class selectclass2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php");
		
		WebElement date = driver.findElement(By.id("day"));
		
		Select seldate= new Select(date);
		
		seldate.selectByIndex(0);
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(30, TimeUnit.SECONDS) 			
				.pollingEvery(3, TimeUnit.SECONDS) 			
				.ignoring(NoSuchElementException.class);

		
		driver.findElement(By.xpath("//input[@type='radio' and @class='_8esa' and @name='sex' and @value='1']")).click();
		
		
	}

}
