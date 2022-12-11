package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//creating the java scriptExecuter interface object by type casting
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//JavascriptExecutor js =(JavascriptExecutor)driver;
		
		driver.navigate().to("http://demo.guru99.com/V4/");
		
		WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mngr409032");
		
		driver.findElement(By.name("password")).sendKeys("yjErUgY");
		
		//Perform click on login button using JavascriptExecuter
		
		js.executeScript("arguments[0].click();",button);
		
		// to generate alert window using javascriptExecuter. Display the alert message
		
		js.executeScript("alert('welcome to automation');");
		Thread.sleep(3000);
		// to accept the alert
		
		driver.switchTo().alert().accept();
		
		//vertical scroll down by 400 pixel
		js.executeScript("window.scrollBy(0,400)");
		
		//Refresh the browser 
		js.executeScript("history.go(0)");
		
		//to get inner text of Web page
		String sText = (String) js.executeScript("return document.documentElement.innerText;");
		
		System.out.println(sText);
		
		// get the title of the web page
		String stext =js.executeScript("return document.title;").toString();
		System.out.println(stext);
		
		System.out.println("program is completed");
		
		
	
	}

}
