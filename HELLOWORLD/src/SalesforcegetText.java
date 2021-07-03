import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforcegetText {
	public static void main(String[] args)  {
		 
		System.setProperty("webdriver.chrome.driver", "E:\\mission automation\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("8464863734");
		driver.findElement(By.cssSelector("#password")).sendKeys("sdafdafdaf");
		driver.findElement(By.name("Login")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		driver.close();

}

}
