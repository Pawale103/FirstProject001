package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import firstjavapakage.arthmaticoperator1;

public class alllcoators {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Documents\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.get("https://in.search.yahoo.com/?fr2=inr");
		driver.get("https://www.amazon.in/");
		Dimension d = new Dimension(200,200);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		driver.manage().window().maximize();	
		Thread.sleep(3000);	
	//  driver.quit();	
		System.out.println("Program is completed");
	    By var = By.id("yschsp");
		WebElement element = driver.findElement(var);
		element.sendKeys("Tata Motors");
		By var1 =By.className("sbb");
		WebElement element1 =driver.findElement(var1);
		element1.click();
		Thread.sleep(4000);
		driver.close();
		driver.findElement(By.name("p")).sendKeys("automobiles");
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);
		driver.quit();
		driver.findElement(By.cssSelector("#yschsp")).sendKeys("tata sons");
		driver.findElement(By.cssSelector("#sf > button")).click();
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("latest mobiles phones");
		driver.findElement(By.cssSelector("button[class='sbb']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//button[@class='sbb']")).click();
		driver.findElement(By.xpath("//a[text()='Fashion']")).click();
		arthmaticoperator1 obj1 = new arthmaticoperator1();
		obj1.addition();
		

		
		

	}

}
