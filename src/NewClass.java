import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		driver.navigate().refresh();
		//Once you got the select object initialized then you can access all the methods of select class.
		//Identify the select HTML element:
		Thread.sleep(10000);
		WebElement mySelectElement = driver.findElement(By.name("dropdown"));
		Select dropdown= new Select(mySelectElement);
		//To select an option - selectByVisibleText, selectByIndex, selectByValue
		//selectByVisibleText
		
		List <WebElement>options=dropdown.getOptions();
		for(WebElement option :options)
		{
			System.out.println(option.getText());
		}
		dropdown.selectByVisibleText("Automation Testing");
		
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("bhaskar");
		driver.findElement(By.xpath("//button[@id='onesignal-slidedown-cancel-button']")).click();
		By passfield=By.name("password");
		WebElement pass=driver.findElement(passfield);
		pass.sendKeys("Pawale");
		//WebElement checkbox=driver.findElement(By.xpath("//input[@value='cbqtp']"));
		//checkbox.click();
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//WebElement radiobutton=driver.findElement(By.xpath("//*[@value='radioselenium']"));
		//wait.until(ExpectedConditions.elementToBeClickable(radiobutton));
		
		
		//driver.findElement(By.xpath("//*[@value='radioselenium']")).click();
		
		driver.findElement(By.xpath("//*[@name='comments']")).sendKeys("This is my comment in this text box");
		
		driver.findElement(By.xpath("//*[@id=\"post-1688\"]/div/div[1]/form/p[9]/input[1]")).sendKeys("C:\\Users\\91738\\Desktop\\LOCAL REP\\writer.txt");
		System.out.println("Program is Completed");
	}}
