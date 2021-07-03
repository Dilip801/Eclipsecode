package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	WebDriver driver;

	
	By SignIN = By.cssSelector("a[href*='sign_in']");
	By title= By.cssSelector(".text-center>h2");
	By navbar= By.cssSelector(".nav.navbar-nav.navbar-right");
	
	public WebElement getNavbar() {
		return driver.findElement(navbar);
	}
	public WebElement getTitle() {
		return driver.findElement(title);
	}

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}

	public WebElement signIn() {
		return driver.findElement(SignIN);
	}
}

