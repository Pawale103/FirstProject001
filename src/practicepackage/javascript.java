package practicepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91738\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		driver.get("https://www.amazon.in/");
		//js.executeScript("alert('hello world');");
		//Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		//js.executeScript("history.go(0)");
		
		//WebElement element= driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		//js.executeScript("arguments[0].click();",element);
		 js.executeScript("window.scrollBy(0,600)");
		
	String text=js.executeScript("return document.title").toString();
	           System.out.println(text);   
	           
	   }
		
		
		

}
