import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriver {
	

	public static void main(String[] args) {
 
		System.setProperty("webdriver.gecko.driver", "E:\\mission automation\\FirefoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https:\\www.akshayacons.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
		driver.quit();
	}

}

