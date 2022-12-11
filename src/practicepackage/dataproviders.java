package practicepackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviders {
	
	@Test(dataProvider="logindataprovider",dataProviderClass=dataproviders.class)
	public void logintest(String email, String password)
	{
		System.out.println(email+"   "+password);
	}


		
		@DataProvider(name="logindataprovider")
		
		public Object[][]getdata()
		{
			Object data [][]= {{"asidjisjdioj@gamil","abc"},{"saoifjisdj@gmail.com","dhsdf"},{"sakdfjsdjf@gamil.com","joifjois"}};
			return data;
			
		}

}
