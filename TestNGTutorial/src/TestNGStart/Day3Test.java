package TestNGStart;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class Day3Test {

	@BeforeSuite
	public void beforesuite() {
		System.out.println("i'M THE SUITE MASTER AND EXECUTES BEORE EVERY TEST CASE");
	}
	@Test(groups = {"Smoke"})
	public void group2(){
		System.out.println("Group Test Case 2");
	}
	@Parameters({"URL"})
	@Test
	public void HomeLoan(String UrlName) {
		System.out.println("Home Loan Initiated");
		System.out.println(UrlName);
	}
	@Test(groups = {"Smoke"})
	public void HomeLoanInitiated() {
		System.out.println("Home Loan Login Initiated");
	}
	@Parameters({"URL", "APIKey"})
	@Test
	public void HomeLoanApproval(String urlname, String API ) {
		System.out.println("Home Loan Approval Initiated");
		System.out.println(urlname);
		System.out.println(API);
	}
	@Test
	public void HomeLoanCredited() {
		System.out.println("Home Loan Credited Initiated");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("Execute the Test at the end of the Suite");
	}
}
