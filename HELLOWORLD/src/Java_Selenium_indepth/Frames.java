package Java_Selenium_indepth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "E:\\mission automation\\Chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		// using Index
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		
		// using WebElement
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		Actions a = new Actions(driver);
		
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement target= driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Draggable')]")).click();
		
	}

}
