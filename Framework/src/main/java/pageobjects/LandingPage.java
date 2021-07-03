package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	WebDriver driver;
	
//	By pageconfirm = By.xpath("//div[contains(@text, 'Recent logins')]");
	By confirminputfields = By.cssSelector("form._featuredLogin__formContainer");
	
	
//	public WebElement getPageText() {
//		return driver.findElement(pageconfirm);
//	}
	public WebElement getPageForm() {
		return driver.findElement(confirminputfields);
	}
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
}
