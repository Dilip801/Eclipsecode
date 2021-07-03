import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\mission automation\\\\\\\\Chromedriver\\\\\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value*= 'VTZ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BLR']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

		{

		System.out.println("its disabled");

		Assert.assertTrue(true);

		}

		else

		{

		Assert.assertTrue(false);

		}
		
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']")).click();
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']//option[@value='6']")).click();
//		for(int i=1; i<7; i++)
//		{
//			driver.findElement(By.xpath(xpathExpression))
//		}
		
		
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']//option[@value='USD']")).click();
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		driver.close();
	}

}
