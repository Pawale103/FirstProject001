package testngpackage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testng4 {
	
	@BeforeClass
	void beforeclass()
	{
		System.out.println("this method will execute before every class");
	}
	
	@AfterClass
	void afterclass()
	{
		System.out.println("this method will execute after every class");
	}
	
	@BeforeSuite
	void beforesuite()
	{
		System.out.println("this will execute before every suite");
	}
	
	@AfterSuite//to execute the method more than one class is required
	void aftersuite()
	{
		System.out.println("this will execute after every suite");
	}
	
	@Test
	void test3()
	{
		System.out.println("this is test 3");
	}
	@Test
	void test4()
	{
		System.out.println("this is test4");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
