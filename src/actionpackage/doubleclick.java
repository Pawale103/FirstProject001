package actionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act = new Actions(driver);
		
		WebElement doubleclick = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		act.doubleClick(doubleclick).perform();
		
		Thread.sleep(2000);
		
		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		System.out.println("Completed");
		

	}

}
