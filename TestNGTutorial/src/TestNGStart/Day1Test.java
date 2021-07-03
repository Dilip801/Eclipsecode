package TestNGStart;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day1Test {

	@BeforeClass
	public void beforeclass() {
		System.out.println("Executes Before every method in a class");
	}
	
	@Test
	public void demo()
	{
		System.out.println("hello");
	}
	@Test
	public void WebAutomation()
	{
		System.out.println("Tested with Selenium Automation");
	}
	@Test
	public void MobileAutomation()
	{
		System.out.println("Tested with Appium Automation Tool");
	}
	@Test
	public void RestAPIAutomation()
	{
		System.out.println("Tested with SoupUI Automation Tool");
	}
	
}
