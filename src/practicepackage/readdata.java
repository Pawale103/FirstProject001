package practicepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class readdata {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver","C:\\Users/chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		//driver.navigate().to("https://www.facebook.com/");
		//driver.manage().window().maximize();
		
//		WebDriverWait wait = new WebDriverWait(driver,30);	
//		wait.until(ExpectedConditions.elementToBeClickable(""));
	//	File file= new File("C:\\Users\\91738\\Desktop\\Testing Course\\automation\\BOOK.xlsx");
		
		FileInputStream fis= new FileInputStream(new File("C:\\Users\\91738\\Desktop\\Course\\automation\\BOOK.xlsx"));
		
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
		int rowcount= sheet.getLastRowNum();
		System.out.println("no of rows in file "+rowcount);
		
		int colcount =sheet.getRow(0).getLastCellNum();
		
		System.out.println("no of coloumns in file is  "+colcount);
		
		for(int i=0;i<=rowcount;i++)
		{
			XSSFRow currentrow = sheet.getRow(i);
			for(int j=0;j<=colcount;j++)
			{
				String value =currentrow.getCell(j).toString();
				System.out.print("     "+value);
			}
			System.out.println();
			
		   }
		
		
		
	}

}
