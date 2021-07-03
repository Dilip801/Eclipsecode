import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathcss {
	public static void main(String[] args)  {
		 
		System.setProperty("webdriver.chrome.driver", "E:\\mission automation\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("8464863734");
		driver.findElement(By.cssSelector("#pass")).sendKeys("Navyad");
		driver.findElement(By.name("login")).click();


}
}
