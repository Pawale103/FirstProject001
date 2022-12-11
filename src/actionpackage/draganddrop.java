package actionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://jqueryui.com/droppable/");
		
		Actions act = new Actions(driver);
		
		//driver.switchTo().frame(0); or
		WebElement frame = driver.findElement(By.xpath("//*[@src='/resources/demos/droppable/default.html']"));
		driver.switchTo().frame(frame);
	
		WebElement src =driver.findElement(By.xpath("//*[@id='draggable']"));
		
		WebElement trg = driver.findElement(By.xpath("//*[@id='droppable']"));
		
		//1st way
	//	act.clickAndHold(src).moveToElement(trg).release().build().perform();
		//act.clickAndHold().moveToElement().release().build().perform();
		//2nd way
		act.clickAndHold(src).moveToElement(trg).release().build().perform();
		act.doubleClick().build().perform();
		act.contextClick().build().perform();
	//String s=	driver.switchTo().alert().getText();
	//System.out.println(s);
		//act.dragAndDrop(src, trg).build().perform();
		//act.moveToElement(trg).dragAndDropBy(src, 0, 0).build().perform();
		//System.out.println("completed");

	}

}
