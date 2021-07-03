package Java_Selenium_indepth;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver" , "E:\\mission automation\\Chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#/");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		String ParentId= it.next();
		String ChildId = it.next();
		
		driver.switchTo().window(ChildId);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
	}

}
