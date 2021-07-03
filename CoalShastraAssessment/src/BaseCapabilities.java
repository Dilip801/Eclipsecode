import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;


public class BaseCapabilities {
AndroidDriver<AndroidElement> driver;
public WebDriverWait wait;


@BeforeMethod
	public void Capabilities() throws MalformedURLException, InterruptedException, InvocationTargetException  {
		// TODO Auto-generated method stub

		  
		File f = new File("src");
		File fs = new File(f, "app-debug.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "VirtualDevice");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		cap.setCapability("platformName", "Android");
//	    cap.setCapability("platformVersion", "8.0");
	    cap.setCapability("skipUnlock","true");
	    cap.setCapability("noReset","false");
		cap.setCapability("appPackage", "com.coalshastralive.android.app");
		cap.setCapability("appActivity", "com.coalshastralive.android.app.OnBoardScreen.OnBoardScreen");
		
   driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);	
   wait = new WebDriverWait(driver, 15);

	}
	
	@Test
	public void Register() {
	
		WebDriverWait wait= new WebDriverWait(driver, 60);
		WebElement ele = driver.findElementById("com.coalshastralive.android.app:id/creataccountpage");
		//WebElement ele = driver.findElement(By.xpath("//.*[text()='Create Account']"));
		wait.until(ExpectedConditions.visibilityOf(ele));

		if(ele.isDisplayed())
		{
			System.out.println("djfkd");
		} else {
			System.out.println("no");
		}

		   driver.findElementById("com.coalshastralive.android.app:id/creataccountpage").click();	
		
	}
	

	@AfterMethod
	public void after()
	{
		
	}



}
