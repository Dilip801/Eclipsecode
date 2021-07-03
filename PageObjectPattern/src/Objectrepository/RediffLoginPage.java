package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

	WebDriver driver;
	public RediffLoginPage(WebDriver driver) {
		this.driver = driver;
	}
		
		By Username = By.xpath("//input[@id='login1']");
		By Password = By.xpath("//input[@id='password']");
		By Enter = By.name("proceed");
		By Home = By.linkText("rediff.com");

		public WebElement Emailid() {
			return driver.findElement(Username);
		}
		public WebElement Password() {
			return driver.findElement(Password);
		}
		public WebElement SignIn() {
			return driver.findElement(Enter);
		}
		public WebElement Home() {
			return driver.findElement(Home);
		}
}


