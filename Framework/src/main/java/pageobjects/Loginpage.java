package pageobjects;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

WebDriver driver;
//Properties props = new Properties();
//FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Framework\\src\\main\\java\\pageobjects\\data.properties");

	
	By Userid = By.xpath("//input[@id='email']");
	By password = By.cssSelector("input#pass");
	By Submit = By.name("login");
	
	
	public WebElement getuserid() {
		return driver.findElement(Userid);
	}
	public WebElement getpassword() {
		return driver.findElement(password);
	}
	public WebElement getSubmitbtn() {
		return driver.findElement(Submit);
	}
	
	public Loginpage(WebDriver driver) {
		this.driver = driver;
	}
}
