import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsslider {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\sudhakar pawale\\Desktop\\Testing Course\\VELOCITY\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://jqueryui.com/slider/");
		
		Actions act = new Actions(driver);
		
		driver.switchTo().frame(0);
		
		WebElement slider1= driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		
		act.moveToElement(slider1).dragAndDropBy(slider1, 150, 0).build().perform();
		
		System.out.println("completed");
	}

}
