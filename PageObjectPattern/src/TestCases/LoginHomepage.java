package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Objectrepository.RediffHomepage;
import Objectrepository.RediffLoginPage;

public class LoginHomepage {
	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\mission automation\\Chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		RediffLoginPage rd = new RediffLoginPage(driver);
		rd.Emailid().sendKeys("sanapaladilipkumar@gmail.com");
		rd.Password().sendKeys("Titan@2030");
		rd.SignIn().click();
		rd.Home().click();
		RediffHomepage rh = new RediffHomepage(driver);
		rh.Search().sendKeys("GOOGLE.COM");
		rh.Searchbutton().click();
	}

	

		
	

}
