package actionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionslider {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudhakar pawale\\Desktop\\Testing Course\\VELOCITY\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/");
		
		Actions act = new Actions(driver);
		
		driver.switchTo().frame(0);
		
		WebElement slider = driver.findElement(By.xpath("//*[@tabindex='0'and @class='ui-slider-handle ui-corner-all ui-state-default']"));
		
		act.moveToElement(slider).dragAndDropBy(slider,180,0).build().perform();
		
		System.out.println("completed");
		
		
		
		
		
		
		
		
		
		
	}

}
