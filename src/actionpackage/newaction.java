package actionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class newaction {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	    driver.navigate().to("https://jqueryui.com/");
	    
	    Actions act = new Actions(driver);
	    WebElement var = driver.findElement(By.xpath("//*[@href='https://contribute.jquery.org/']"));
	    act.moveToElement(var).build().perform();
	    WebElement variable2 = driver.findElement(By.linkText("Code"));
	    act.moveToElement(variable2).click().build().perform();
	    System.out.println("program is completed");
	    
	    
	}

}
