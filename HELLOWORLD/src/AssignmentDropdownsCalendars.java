import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDropdownsCalendars {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver.chrome.driver", "E:\\\\mission automation\\\\Chromedriver\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.cleartrip.com/");
	Thread.sleep(5000);
//	System.out.println(driver.switchTo().alert().getText());
//	driver.switchTo().alert().dismiss();
	
	driver.findElement(By.cssSelector("input[id='FromTag']")).sendKeys("New");
	Thread.sleep(2000);
	List<WebElement> options = driver.findElements(By.cssSelector("li[class='list'] a"));
	
	for(WebElement option: options)
	{
		if(option.getText().equalsIgnoreCase("NewDelhi"))
		{
			option.click();
			break;
		}
	}
	
	}

}
