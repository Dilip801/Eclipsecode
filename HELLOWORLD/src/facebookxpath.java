import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\mission automation\\\\Chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("8464863734");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Navyad");
		driver.findElement(By.xpath("//*[@name='login']")).click();
		
	}

}
