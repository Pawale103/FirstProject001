import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class locatingelemnts {
	
	WebDriver driver;
	
	@FindBy(how =How.XPATH,using="//*[contains(@class,'nav-logo-link nav-progressive-attribute')]")
	WebElement prime;
	
	public void click()
	{
	 prime.click();
	 System.out.println("this is click method");
	}
	public  locatingelemnts(WebDriver d)
	{
		this.driver=d;
		PageFactory.initElements(driver, this);
		
	}

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Documents\\chromedriver.exe");
				
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//a[contains(@href,'/prime?ref_=nav_cs_primelink_member')]")).click();
		locatingelemnts obj = new locatingelemnts(driver);
		
		obj.click();
		
		
	}

}
