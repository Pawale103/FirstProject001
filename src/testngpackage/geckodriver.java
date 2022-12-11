package testngpackage;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class geckodriver {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\91738\\eclipse-workspace\\firstjavaproject\\servers\\geckodriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\eclipse-workspace\\firstjavaproject\\servers\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://github.com/mozilla/geckodriver/releases");
//		
//		driver.manage().window().maximize();
//		
//		System.out.println("the program is completed");
	    
//		System.setProperty("webdriver.opera.driver","C:\\Users\\91738\\Downloads\\operadriver.exe");
//		
//		WebDriver driver = new OperaDriver();
//		
//		Thread.sleep(2000);
//		
//		driver.manage().window().maximize();
//		
//		driver.get("https://www.youtube.com/");
//		
//		System.out.println("program is completed");
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\91738\\Downloads\\msedgedriver.exe");
		
		//WebDriver driver = new EdgeDriver();
		
		RemoteWebDriver driver=new EdgeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		System.out.println("Program is completed");

	}

}
