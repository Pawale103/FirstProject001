package pom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	WebDriver driver;
	
	By reglink= By.linkText("REGISTER");
	
	public void clicklink()
	{
		driver.findElement(reglink).click();
	}
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	

	

}
