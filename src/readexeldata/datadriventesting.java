package readexeldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datadriventesting {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		FileInputStream file = new FileInputStream("C:\\Users\\91738\\Desktop\\Testing Course\\automation//Book.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rowcount =sheet.getLastRowNum();
		
		System.out.println("the no of records in the excel sheet is:"+rowcount);
		
		for(int row =1; row<=rowcount; row++)
		{
		XSSFRow currentrow = sheet.getRow(row);
		
		String Firstname = currentrow.getCell(0).getStringCellValue();
		String Lastname = currentrow.getCell(1).getStringCellValue();
		
		driver.findElement(By.id("email")).sendKeys(Firstname);
		
		driver.findElement(By.name("pass")).sendKeys(Lastname);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		}
		
		System.out.println("The script is executed");
		
		
				
	}

}
