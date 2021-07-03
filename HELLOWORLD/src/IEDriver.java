import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "E:\\mission automation\\InternetExplorerDriver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.akshayacons.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.quit();
	}

}
