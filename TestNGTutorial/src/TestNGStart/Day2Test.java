package TestNGStart;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2Test {

	@BeforeTest
	public void beforetest() {
		System.out.println("Prints the test case before all the test case");
	}
	@Test
	public void PersonalLoan() {
		System.out.println("Personal Loan Initiated");
	}
	
	@Test(groups = {"Smoke"})
	public void groups1(){
		System.out.println("Group Test Case 1");
	}
	@Test(groups = {"Smoke"})
	public void PersonalLoanLogin() 
	{
		System.out.println("Peronal Loan Login Initiated");
	}
	@Test
	public void PersonalLoanApproval() 
	{
		System.out.println("Peronal Loan Approval Initiated");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("Prints the test case after all the test cases");
	}
}
