package Java_Selenium_indepth;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintThelinksCountinaPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver" , "E:\\mission automation\\Chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//1. get all links the entire page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2. get links in the footer section 
		WebElement footerDriver= driver.findElement(By.id("gf-BIG")); // limiting the scope to specific section in web page
	    System.out.println(footerDriver.findElements(By.tagName("a")).size());
	    
	    // 3. get links from a column in the footer
	    WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	    System.out.println(columnDriver.findElements(By.tagName("a")).size());
	    
	    // 4. click on each link of column-1 to check whether links are opening or not
	    for (int i=0; i<columnDriver.findElements(By.tagName("a")).size(); i++)
	    {
	    	String ColumnClick= Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	columnDriver.findElements(By.tagName("a")).get(i).sendKeys(ColumnClick);
	    }
	    
	    //5. opens all the tabs and get title
	    Set<String> abc= driver.getWindowHandles();
	    Iterator<String> it = abc.iterator();
	    
	    while(it.hasNext())
	    {
	    	driver.switchTo().window(it.next());
	    	System.out.println(driver.getTitle());
	    }
	}

}
