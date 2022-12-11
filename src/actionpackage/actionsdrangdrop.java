package actionpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class actionsdrangdrop {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sudhakar pawale\\Desktop\\Testing Course\\VELOCITY\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	    driver.navigate().to("https://jqueryui.com/droppable/");
	    
	    List<WebElement> element = driver.findElements(By.tagName("iframe"));
	
//	    int element = driver.findElements(By.tagName("iframe")).size();
//	    System.out.println(element);
	   
	    int sizeofelements =element.size();
	   
	    System.out.println(sizeofelements);
	   
	    System.out.println("completed");
		

	}

}
