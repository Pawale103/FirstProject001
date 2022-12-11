package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclass1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php");
		//driver.get("https://www.facebook.com/");
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id='u_0_2_0i']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("bhaskar");	
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("patil");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("lastname");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("pawalebhaskar@gmail.com");
		
		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		Select seldate = new Select(date);
		//seldate.selectByIndex(10);
		//seldate.selectByValue("11");
		seldate.selectByIndex(7);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select selmonth = new Select(month);
		//selmonth.selectByValue("2");
		//selmonth.selectByIndex(7);
		selmonth.selectByVisibleText("Aug");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select selyear = new Select(year);
		//selyear.selectByVisibleText("2000");
		selyear.selectByValue("1997");
		//driver.findElement(By.xpath("//label[@for='u_0_7_0H']")).click();
		
		System.out.println("completed");
	
		
		
		
		
	}

}
