package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class regtest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		registerpage rgpage = new registerpage(driver);
		
		rgpage.clicklink();
		
		registerpage1  regpage = new registerpage1(driver);
		regpage.setfirstname("Nitesh");
		regpage.setlastname("Poladwar");
		System.out.println("completed");
		registertest obj = new registertest(driver);
	/*obj.clicklink();
	obj.setfirstname("bhaskar");
		obj.setlastname("pawale");
		obj.city("Nanded");*/
	}

}
