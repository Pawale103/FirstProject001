package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class registertest {
	
	WebDriver driver;
	
	@FindBy(how=How.LINK_TEXT,using="REGISTER")
	
	WebElement link;
	
	@FindBy(xpath="//*[@name='firstName']")
	WebElement fname;
	
	@FindBy(name="lastname")
	WebElement lname;
	
	@FindBy(name="phone")
	WebElement phone;
	
	@FindBy(name="address1")
	WebElement address;
	
	@FindBy(xpath="//*[@id='userName']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement city;
	
	public void clicklink()
	{
		link.click();
	}
	
	public void city(String cityname)
	{
		city.sendKeys(cityname);
	}
	
	public void setfirstname(String fn)
	{
		fname.sendKeys(fn);
	}
	public void setlastname(String ln)
	{
		lname.sendKeys(ln);
	}
	public registertest(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver, this);
	}
	

}
