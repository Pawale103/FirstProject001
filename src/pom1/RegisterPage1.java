package pom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage1 {
	

	WebDriver driver;
	By firstname=By.name("firstName");	
	By lastname=By.name("lastName");
	By phone=By.name("phone");
	By email =By.name("userName");	
	By address= By.name("address1");
	By city=By.name("city");
	By state= By.name("state");
	By postalcode=By.name("postalCode");	
	By selectelement= By.name("country");
	
	
	public void setfirstname(String fn)
	{
		driver.findElement(firstname).sendKeys(fn);
	}
	
	public void setlastname(String ln)
	{
		driver.findElement(lastname).sendKeys(ln);
	}
	
	public void setphonenumber(String no)
	{
		driver.findElement(phone).sendKeys(no);
	}
	public void setemail (String mail)
	{
		driver.findElement(email).sendKeys(mail);
	}
	public void setaddress(String add)
	{
		driver.findElement(address).sendKeys(add);
	}
	public void setcity(String cityname)
	{
		driver.findElement(city).sendKeys(cityname);
	}
	public void setstate(String states)
	{
		driver.findElement(state).sendKeys(states);
	}
	public void setpcode(String pcode)
	{
		driver.findElement(postalcode).sendKeys(pcode);
	}
	public void selectcountry(String cont)
	{
	WebElement secele=driver.findElement(selectelement);
		Select sec= new Select(secele);
		sec.selectByVisibleText(cont);
	}
	public RegisterPage1(WebDriver d)
	{
		driver=d;
		
	}
	
	

	

}
