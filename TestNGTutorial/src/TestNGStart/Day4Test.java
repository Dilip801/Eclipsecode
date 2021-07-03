package TestNGStart;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day4Test {

	@BeforeMethod
	public void beforeevery() {
		System.out.println("Execute Before every test in the method invokes");
	}
	@Test(groups = {"Smoke"})
	public void group3(){
		System.out.println("Group Test Case 3");
	}
	
	@Test
	public void CarLoanLogin() {
		System.out.println("Car Loan Login Initiated");
	}
	@Test
	public void CarLoanApply() {
		System.out.println("Car Loan Application Initiated");
	}
	@AfterMethod
	public void afterevery() {
		System.out.println("Execute after every test in the method invokes");
	}
	@Test
	public void CarLoanApproval() {
		System.out.println("Car Loan Approval Initiated");
	}
	@Test
	public void CarLoangranted() {
		System.out.println("Car Loan Successfully Initiated");
	}
}
