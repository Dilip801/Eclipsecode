import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalendarSelectionDisabledValidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\mission automation\\\\\\\\Chromedriver\\\\\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='VTZ'])[2]")).click();
		Thread.sleep(2000);
		
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
//		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
		System.out.println("Its Enabled");
		Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

}
