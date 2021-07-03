import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffE2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\mission automation\\\\Chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("abcdef");
		driver.findElement(By.cssSelector("input#password")).sendKeys("123456");
		driver.findElement(By.xpath("//input[contains(@name, 'proc')]")).click();
		driver.close();
	}

}
