package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Documents\\chromedriver.exe");
		//Thread.sleep(200000);
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		//Thread.sleep(200000);
		driver.manage().window().maximize();
		int totalframes= driver.findElements(By.tagName("iframe")).size();
		System.out.println("total frames are"+totalframes);
		//Switching to the frame
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("//*[@src='Jmeter720.png']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("patil pawale");
		System.out.println("program is completed");
		
		
		
		
		
	}

}
