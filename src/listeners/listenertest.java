package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.listenersinterface.class)

public class listenertest {
	@Test
	void test1()
	{
		System.out.println("this is test1");
		Assert.assertEquals("A","A");
		System.out.println("test is passed");
	}
	
	@Test
	void test2()
	{
		System.out.println("this is test 2");
		Assert.assertEquals("A","B");
		System.out.println("test is failed");
		
	}
	@Test
	void test3()
	{
		System.out.println("this is test3");
		throw new SkipException("this is skip exception");
	}
	
	

}
