package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumclass3 {
	// class
	
	// 2nd step
	ChromeDriver driver = new ChromeDriver();
	//3rd step
	public void hiturlorgeturl()
	{
		driver.get("https://www.redbus.in/");
	}

	// 4th step
	public void closebrowser()
	{
		//driver.close();
		driver.quit();
	}
	public static void main(String[] args) {
		// set property can be done only in main method.
		System.setProperty("webdriver.chrome.driver","C:\\Users/chromedriver.exe");
		seleniumclass3 obj = new seleniumclass3();
		obj.hiturlorgeturl();
		obj.closebrowser();
		System.out.println("program is completed");
		


	}

}
