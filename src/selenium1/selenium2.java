package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class selenium2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","\"C:\\Users\\91738\\Documents\\chromedriver_win32\\chromedriver.exe\"");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=flipkart&oq=&aqs=chrome.0.35i39i362l2j46i39i362l2j35i39i362l4...8.28187057j0j7&sourceid=chrome&ie=UTF-8&shem=ssmd");
		String title = driver.getTitle();
		System.out.println("the title of the web page is:"+title);
		driver.close();
		System.out.println("program is completed");
		

	}

}
