package Demo.Framework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import pageobjects.Loginpage;
import resources.base;

public class Homepage extends base {
	private static Logger log = LogManager.getLogger(Homepage.class.getName());

WebDriver driver;


@BeforeTest
public void Initialize() throws IOException {
	driver = InitializeDriver();
	log.info("Chrome driver is invoked");
	
	driver.get("https://www.facebook.com/");
	log.info("Webpage is invoked");
}
	
@Test
public void Homepage() throws IOException {
	
	LandingPage l=new LandingPage(driver);
//	l.getPageText().getText();
//	log.info("Header Text in the landing page is retrieved");
	l.getPageForm().getText();
	log.fatal("Get the entire text of the form page");
	Loginpage lp=new Loginpage(driver);
	lp.getuserid().sendKeys("8464863734");
	log.info("User ID is entered");
	lp.getpassword().sendKeys("Navyad");
	log.info("Password is entered");
	lp.getSubmitbtn().click();
	log.info("submit button is initiated");
	
}
@AfterTest
public void logout() {
	driver.close();
	log.info("Chrome driver is closed");
}
	
}
