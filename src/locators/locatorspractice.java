package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class locatorspractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.get("https://www.amazon.in/");
		
		// by id locator
		
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple mobiles");
		
//		By var = By.id("twotabsearchtextbox");
//		
//		WebElement element = driver.findElement(var);
//		
//		element.sendKeys("apple mobiles");
//		
//		By var1 = By.id("nav-search-submit-button");
//		
//		WebElement element1=driver.findElement(var1);
//		
//		element1.click();
//		
		// by name
		
		driver.get("https://www.flipkart.com");
//		
//		driver.findElement(By.name("q")).sendKeys("apple mobiles");
//		// by class name
//		
//		driver.findElement(By.className("L0Z3Pu")).click();
		
//		driver.navigate().to("https://www.calculator.net/");
//		
//		driver.findElement(By.className("inlongest")).sendKeys("patil");
//		driver.findElement(By.id("bluebtn")).click();
//		System.out.println("completed");
		
//		driver.get("https://www.google.com/");
//		driver.findElement(By.tagName("input")).sendKeys("patil brothers");
//		driver.findElement(By.className("gNO89b")).click();
		
		//By link text
		
//		driver.get("https://www.amazon.in/");
//		driver.findElement(By.linkText("Amazon Pay")).click();
		
		// by partial link text
		
//		driver.get("https://www.amazon.in/");
//		driver.findElement(By.partialLinkText("Amazon")).click();
//		driver.findElement(By.partialLinkText("cu")).click();
		// By css selector ie By tag#id
	
//		driver.get("https://www.amazon.in/");
//		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("samsung mobiles");
//		driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
		
//		By tag.class
		
//		driver.get("https://www.facebook.com/");
//		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("patil@123");
//		driver.findElement(By.cssSelector("input#email")).sendKeys("patil@345");
		
		// By tag and attribute
		
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("samsung mobiles");
//		// By tag class and attrubute
//		
//		driver.findElement(By.cssSelector( "button.L0Z3Pu[type='submit']")).click();
		
		// by tagname
		
//		driver.findElement(By.xpath("//*[@href=\"/viewcart?otracker=Cart_Icon_Click\"]")).click();
		
		Select obj = new Select(driver.findElement(By.className("_28p97w")));
		
		obj.selectByValue("Sell on Flipkart");
		
		System.out.println("completed");
		
		
	
		
		
		
		
		
		 
		
		

	}

}
