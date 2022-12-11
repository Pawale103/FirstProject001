package actionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actionclass1 {
	
	public static void main(String[]args)
	{
       System.setProperty("webdriver.chrome.driver","C:\\Users\\sudhakar pawale\\Desktop\\Testing Course\\VELOCITY\\chromedriver.exe");
      
       
		
		WebDriver driver = new ChromeDriver();
		// WebDriverWait wait= new WebDriverWait(driver,10);
		
		driver.manage().window().maximize();
		
	    driver.navigate().to("https://jqueryui.com/");
	    
	    //Actions act = new Actions(driver);
	    Actions act = new Actions(driver);
	    
//	    WebElement variable = driver.findElement(By.linkText("Contribute"));
//	    act.moveToElement(variable).build().perform();
//	    
//	    System.out.println("program is completed");
		WebElement var = driver.findElement(By.xpath("//*[@href='https://contribute.jquery.org/']"));
		act.moveToElement(var).build().perform();
		System.out.println("completed");
		
	}

}
