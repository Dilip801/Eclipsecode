package Java_Selenium_indepth;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_Products_To_Cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\mission automation\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		Thread.sleep(3000);
		String[] veggies = {"Cucumber", "Brocolli", "Beetroot"};
		
		adddetails(veggies, driver);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		
	}
	
	public static void adddetails(String[] veggies, WebDriver driver) {
int j =0;
List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i< products.size(); i++)
		{
		   String[] name= products.get(i).getText().split("-");
		   String formattedName = name[0].trim();
		   
		   List veggieList = Arrays.asList(veggies);
		   
		   if(veggieList.contains(formattedName))
		   {
			   j++;
			   
			   driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

			   if(j==3)
			   {
				   break;
			   }
		   }
		}
	}

}
