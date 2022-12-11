package youtubepractice;

import java.util.Random;

import org.apache.commons.exec.util.StringUtils;

import net.bytebuddy.utility.RandomString;

public class genRanNumAstring {

	public static void main(String[] args) {
		
		//printing random numbers 
		
	//String str=RandomStringUtils.randomNumeric(10);
	//system.out.println(str);
		
		
		// printing random alphabet
		
		//String str=RandomStringUtils.randomAlphabetic(count);
		
		//System.out.println(str);
		
		Random random= new Random();
		
			boolean  str= random.nextBoolean();
		System.out.println(str);
		

		int x= random.nextInt(999999999);
		System.out.println(x);
		
		double y=random.nextDouble();
		System.out.println(y);
		float c=random.nextFloat();
		System.out.println(c);
	
	}

}
