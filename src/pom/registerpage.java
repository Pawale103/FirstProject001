package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registerpage {
	
	WebDriver driver;
	By link = By.linkText("REGISTER");
	
	public void clicklink()
	{
		driver.findElement(link).click();
	}
	
	public registerpage(WebDriver driver)
	{
		this.driver=driver;
	}

}
