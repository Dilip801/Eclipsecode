package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import Resources.base;

public class Homepage extends base {
	private static Logger log= LogManager.getLogger(ValidateNavbar.class.getName());
//	@BeforeTest
//	
//	public void Initialize() throws IOException {
//		
//		driver=InitializeDriver();
//		
//		driver.get(prop.getProperty("url"));
//	}
	
	@Test(dataProvider="getdata")
	
	public void basepageNavigation(String Username, String Password, String text) throws IOException
	{

		driver=InitializeDriver();
		
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		l.signIn().click();
		LoginPage lp= new LoginPage(driver);
		lp.Login().sendKeys(Username);
		lp.Password().sendKeys(Password);
//		System.out.println(text);
		log.info(text);
		lp.SignIn().click();
		

	}
	

	
	@DataProvider
	public Object[][] getdata() 
	{
		Object[][] data= new Object[2][3];
		
		data[0][0]="restrictedUsername@gmail.com";
		data[0][1]="0123456789";
		data[0][2]="RestrictedUser";
		
		data[1][0]="non-restrictedusername@gmail.com";
		data[1][1]="4343225235";
		data[1][2]="Non-RestrictedUser";
		
		return data;
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
}
