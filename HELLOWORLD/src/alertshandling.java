import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertshandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\mission automation\\\\\\\\Chromedriver\\\\\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys("Dilip");
        driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        
        driver.findElement(By.id("name")).sendKeys("Dilip Sanapala");
        driver.findElement(By.cssSelector("input[id='confirmbtn']")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        
        Thread.sleep(2000);
        driver.close();
	}

}
