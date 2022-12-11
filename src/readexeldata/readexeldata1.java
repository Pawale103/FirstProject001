package readexeldata;

import java.io.File;  
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexeldata1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException  {
		
	File file = new File("C:\\Users\\91738\\Desktop\\Testing Course\\automation//Book.xlsx");
	
	FileInputStream fis = new FileInputStream(file);
	
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
	int rowcount = sheet.getLastRowNum();
	
	System.out.println("the row number is:"+rowcount);
	
	int colcount =sheet.getRow(0).getLastCellNum();
	
	System.out.println("the cell no is:"+colcount);

	//nested for loop
	for(int i=0;i<=rowcount;i++)
	{
		XSSFRow currentrow = sheet.getRow(i);
		for(int j=0;j<colcount;j++)
		{
			String value =currentrow.getCell(j).toString();
			System.out.println(value);
		}
		System.out.println();
		
	   }


	}

}
