package actionpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentclass {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	    driver.navigate().to("https://www.amazon.in/");
	    
//	    int element =driver.findElements(By.tagName("a")).size();
//	    
//	    System.out.println("amazon webpage has:"+element+" links availabel");
	    
	    List <WebElement> element1= driver.findElements(By.tagName("a"));
	    
	    int liksnumber = element1.size();
	    
	    System.out.println("no of links availabel on amazon webpage is:"+liksnumber);
	    
	    
		
	}

}
