import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		Thread.sleep(6000);
//		driver.findElementByXPath("//android.widget.TextView[@text='Graphics']").click();
//		driver.findElement(By.linkText("CameraPreview")).click();
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Accessibility\")").click();
	}

}
