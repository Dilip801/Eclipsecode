package ExtentReport.Tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReportDemo {
	ExtentReports extent;

	@BeforeTest
	public void Config() {
		
		// ExtentReports , ExtentSparkReporter
		
		String path = System.getProperty("user.dir")+ "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Test Automation Results");
		reporter.config().setReportName("Web Automation Results");
		
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Dilip Sanapala");
	}
	
	
	@Test
	public void InitialDemo() {
//		ExtentTest test =
		 extent.createTest("Initial Demo");
		System.setProperty("webdriver.chrome.driver", "E:\\mission automation\\Chromedriver\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://aryaved.com/");
		System.out.println(driver.getTitle());
		driver.close();
//		test.fail("Result Do not Match with the Test");
		extent.flush();
	}
}
