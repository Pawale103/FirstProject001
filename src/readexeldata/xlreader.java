package readexeldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xlreader {

	public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		File path = new File("C:\\\\Users\\\\91738\\\\Desktop\\\\Testing Course\\\\automation//Book.xlsx");
		FileInputStream path1 = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(path1);
		
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
		int rowcount = sheet.getLastRowNum();
		
		
		
		
		

	}

}
