package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomepage {


		WebDriver driver;
		public RediffHomepage(WebDriver driver) {
			this.driver = driver;
		}
			
		By Search = By.xpath("//input[@id='srchword']");
		By Searchbutton = By.cssSelector("form#queryTop input.newsrchbtn");
		

		public WebElement Search() {
			return driver.findElement(Search);
		}
		public WebElement Searchbutton() {
			return driver.findElement(Searchbutton);
		}
	}


