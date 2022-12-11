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

public class readdata1 {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver","C:\\Users/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();

		FileInputStream fis=new FileInputStream(new File("C:\\Users\\91738\\Desktop\\Testing Course\\automation\\BOOK.xlsx"));
		XSSFWorkbook wb=new XSSFWorkbook(fis);
       XSSFSheet sheet=wb.getSheet("sheet1");
       int rowcount =sheet.getLastRowNum();
       int colcount=sheet.getRow(0).getLastCellNum();
       for(int i=0;i<=rowcount;i++)
       {
    	   XSSFRow currentrow=sheet.getRow(i);
    	   for(int j=0;j<colcount;j++)
    	   {
    		   String value=currentrow.getCell(j).toString();
    	   }
       }
	}

}
