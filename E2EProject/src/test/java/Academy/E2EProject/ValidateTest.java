package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;

import Resources.base;

public class ValidateTest extends base {
	private static Logger log= LogManager.getLogger(ValidateTest.class.getName());
	
@BeforeTest

	public void Initialize() throws IOException 
{
		driver=InitializeDriver();
		log.info("Chrome Driver is initialized");
		
		driver.get(prop.getProperty("url"));
		log.info("Navigation to home transaction initiated");
}
	
	@Test
	
	public void basepageNavigation() throws IOException
	{
		
		LandingPage l = new LandingPage(driver);
//		l.getHome().click();
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		log.info("Text area is validated successfully");
		
	
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
	
	
}
