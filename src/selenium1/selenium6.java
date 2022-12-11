package selenium1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium6 {

	public static void main(String[] args) throws InterruptedException {
		// set the system property
		System.setProperty("webdriver.chrome.driver","c:\\Users/chromedriver.exe");
		//initialize the browser
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/");
		String title =driver.getTitle();
		Thread.sleep(2000);
		System.out.println("the title of webpage is:"+title);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.goibibo.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		String page=driver.getTitle();
		if(page.contains("Facebook"))
		{
			System.out.println("verification is sucessful");
		}
		else
		{
			System.out.println("verification is failed");
		}
		Thread.sleep(3000);
		driver.manage().window().setSize(new Dimension(300,300));
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(400,300));
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		String title1 = driver.getTitle();
		if(title1.contains("Amazon"))
		{
			System.out.println("verification is sucessfull");
		}
		else {
			System.out.println("verification is failed");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		System.out.println("program is completed");
		
		
		
		
		
		
	}

}
