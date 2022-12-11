package pom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegTest {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Documents\\chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();
					
					driver.get("http://demo.guru99.com/test/newtours/");
					//driver.findElement(By.linkText("REGISTER")).click();
					
					RegisterPage obj= new RegisterPage(driver);
					obj.clicklink();
					RegisterPage1 obj1= new RegisterPage1(driver);
					obj1.setfirstname("bhaskar");
					obj1.setlastname("Patil");
					obj1.setphonenumber("7387885587");
					obj1.setemail("pawalejfsfjs@gmail.com");
					obj1.setaddress("AT: Umri");
					obj1.setcity("Nanded");
					obj1.setstate("maharashtra");
					obj1.setpcode("431811");
					obj1.selectcountry("INDIA");
					
				}

	}


