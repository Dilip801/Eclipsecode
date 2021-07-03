import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignmentcheckboxes {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\mission automation\\\\\\\\Chromedriver\\\\\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
		System.out.println(driver.findElement(By.cssSelector("input[value*='option1']")).isSelected());
		driver.findElement(By.cssSelector("input[value*='option1']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[value*='option1']")).isSelected(), "statement is true");
		System.out.println(driver.findElement(By.cssSelector("input[value*='option1']")).isSelected());
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value*='option1']")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[value*='option1']")).isSelected(), "statement is false");
		System.out.println(driver.findElement(By.cssSelector("input[value*='option1']")).isSelected());
		
		Thread.sleep(2000);
		System.out.println(driver.findElements(By.cssSelector("input[type*='checkbox']")).size());
		driver.close();
}
	}
