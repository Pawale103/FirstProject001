import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class findurl {

	public static void main(String[] args) throws IOException {
		
		Properties prop  = new Properties();
		
		String filepath= System.getProperty("user.dir")+"\\config.properties";
		
		FileInputStream fis= new FileInputStream(filepath);
		
		prop.load(fis);
		
		String url=prop.getProperty("password");
		
		System.out.println(url);
		
		

	}

}
