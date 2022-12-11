package selenium1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumclass4 {

	public static void main(String[] args) {
		// set system property
		System.setProperty("webdriver.chrome.driver","C:\\Users/chromedriver.exe");
		//Initialize the browser by creating the object of the ChromeDriver class
		ChromeDriver driver = new ChromeDriver();
		// 3rd step get any url we want to hit by using get method
		driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=CjwKCAiA1aiMBhAUEiwACw25MdiSWX8wJsjKYpnFX3m67jojy8eQn7Jk2FZ2KIt3PS7_UvMJm2DGzxoCV20QAvD_BwE");
	    //set the size of the browser by using dimension class 
		Dimension d = new Dimension(300,300);
		driver.manage().window().setSize(d);
		// 5th step to close the browser
		//driver.close();
		System.out.println("program is completed");
		
		

	}

}
