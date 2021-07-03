package Resources;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	public WebDriver driver;
    public Properties prop;
	 public WebDriver InitializeDriver() throws IOException {
	    	prop = new Properties();
	    	FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
	    	prop.load(fis);
	    	String browserName = prop.getProperty("browser");
	    	
	    	if (browserName.equals("chrome")) {
	    		System.setProperty("webdriver.chrome.driver" , "E:\\mission automation\\Chromedriver\\chromedriver.exe");
	    		driver = new ChromeDriver();
	    		driver.manage().window().maximize();
	    	}
	    	else if (browserName.equals("firefox"))
	    	{
	    		System.setProperty("webdriver.gecko.driver" , "E:\\mission automation\\FirefoxDriver\\geckodriver.exe");
	    		driver= new FirefoxDriver();
	    		driver.manage().window().maximize();
	    	}
	    	else if (browserName.equals("IE"))
	    	{
	    		System.setProperty("webdriver.ie.driver" , "E:\\mission automation\\InternetExplorerDriver\\IEDriverServer.exe");
	    		driver= new InternetExplorerDriver();
	    		driver.manage().window().maximize();
	    	}
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	return driver;
	 }
}
