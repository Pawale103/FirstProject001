import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudhakar pawale\\Desktop\\Testing Course\\VELOCITY\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
	//	WebElement dismissButton=driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		
	//	dismissButton.click();
		
		Thread.sleep(5000);
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			WebElement element=links.get(i);
			
		    String url=element.getAttribute("href");
		    
		    URL link= new URL(url);
		    
		    HttpURLConnection httpConn= (HttpURLConnection)link.openConnection();
		    
		    Thread.sleep(2000);
		    
		    httpConn.connect();
		    
		int resCode= httpConn.getResponseCode();
		
		if(resCode>400)
		{
			System.out.println(url +"  - "+"is  borken link");
		}
		else
		{
			System.out.println(url +" - "+ "is valid link");
		}
		
		}
	}

}
