package actionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclick2 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	    driver.navigate().to("https://jqueryui.com/");
	    
	    Actions act = new Actions(driver);
	    
	    WebElement variable = driver.findElement(By.linkText("Contribute"));
	    
	    act.moveToElement(variable).build().perform();
	    
//	    WebElement variable1 = driver.findElement(By.linkText("CLA"));
//	    
//	    act.moveToElement(variable1).click().build().perform();
	    
	    WebElement variable2 = driver.findElement(By.linkText("Code"));
	    act.moveToElement(variable2).click().build().perform();
	    
	    System.out.println("completed");
	    
	    
	    
	    
		
	}

}
