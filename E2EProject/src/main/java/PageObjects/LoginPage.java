package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	
	By email= By.xpath("//input[@id='user_email']");
	By password= By.cssSelector("#user_password");
	By Login= By.xpath("//input[@value='Log In']");
	
//	By home= By.xpath("//a[contains(text(), 'Home']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement Login() {
		return driver.findElement(email);
	}
	public WebElement Password() {
		return driver.findElement(password);
	}
	public WebElement SignIn() {
		return driver.findElement(Login);
	}
//	public WebElement getHome() {
//		return driver.findElement(home);
//	}

}
