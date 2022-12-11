package practicepackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	
	@Test(dataProvider="logindataprovider")
	public void logintest(String email  , String password)
	{
		System.out.println(email +"               "+password);
	}
	

	@DataProvider(name="logindataprovider")
	public Object[][]getdata()
	{
	 Object data[][]= {{"abc@gmail.com","abc"},{"bcd@gmail.com","jkl"}};
	 return data;
	 
	}
	
}
