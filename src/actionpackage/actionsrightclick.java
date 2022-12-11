package actionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsrightclick {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo/menu-title.html");
		
		Actions act = new Actions(driver);
		
		WebElement rightclickvar=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		act.contextClick(rightclickvar).build().perform();
		
		driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']")).click();
		
		String str =driver.switchTo().alert().getText();
		
		System.out.println(str);
		
		Thread.sleep(4000);
		
		driver.switchTo().alert().accept();
		
		System.out.println("completed");
		
		System.out.println("completed");
	}

}
