package scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class scannernew {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Documents\\chromedriver.exe");
		
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.flipkart.com/");	
		//TakesScreenshot src = (TakesScreenshot)driver;
	//	File screenshot= src.getScreenshotAs(OutputType.FILE);
		
		By t=By.name("q");
		WebElement element= driver.findElement(t);
		element.sendKeys("samsung mobiles");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu' and @type='submit']")).click();
		
		//File dest = new File("C:\\Users\\91738\\eclipse-workspace\\firstjavaproject\\Drivers\\error5.jpg");
		
		//FileUtils.copyFile(screenshot, dest);
		
//		 Scanner obj = new Scanner(System.in);
//		 System.out.println("ENTER THE COMPANY NAME");
//		 String str= obj.nextLine();
//		 System.out.println("company name is "+str);
//		 System.out.println("enter the age");
//		 int out = obj.nextInt();
//		 System.out.println("this is age "+out);
		 
	}

}
