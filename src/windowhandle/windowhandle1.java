package windowhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle1 {

	public static void main(String[] args) throws InterruptedException {
		 
        System.setProperty("webdriver.chrome.driver","C:\\Users/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demo.guru99.com/popup.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Click Here")).click();
		
		System.out.println(driver.getTitle());
		
		String parent=driver.getWindowHandle();
		
		Set<String> s=driver.getWindowHandles();
		
		Iterator <String> it=s.iterator();
		
		while(it.hasNext())//it will return boolean value that is true or false
		{
			String childwindow =it.next();
			
			if(!parent.equalsIgnoreCase(childwindow))//true !PARENT== parent
			{
				driver.switchTo().window(childwindow);
				
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("pawale@gmail.com");
				
				driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
			}
			
		}
		/* 
		 String parent= driver.getWindowHandle();
		 Set<String>s= driver.getWindowHandles();
		 Iterator<String> it=s.Iterator();
		 while(it.hasNext())
		 {
		 String childwindow= it.next();
		 
		 if(!parent.equalIgnoreCase(childwindow))
		 
		 
		  
		  
		 */
		Thread.sleep(3000);
		
		driver.switchTo().window(parent);
		
		Thread.sleep(3000);
		
		driver.close();
		
		System.out.println("completed");
		
		
		
		
		
		

	}

}
