import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentchildTraverseDropdown {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\mission automation\\\\\\\\Chromedriver\\\\\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='VTZ']")).click();
		Thread.sleep(2000);
//		driver.close();
}
}
