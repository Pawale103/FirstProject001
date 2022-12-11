package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class selenium5 {

	public static void main(String[] args) throws InterruptedException {
		// set the system property 
		System.setProperty("webdriver.chrome.driver","C:\\Users/chromedriver.exe");
		
		//initialize the browser
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		System.out.println("program is completed");
	}

}
