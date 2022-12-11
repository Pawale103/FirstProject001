package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumclass1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println("the title of website is:"+title);
		System.out.println("program is completed");
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
	}

}
