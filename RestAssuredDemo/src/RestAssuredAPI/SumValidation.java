package RestAssuredAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import Files.payload;
import io.restassured.path.json.JsonPath;

public class SumValidation {
	//Verify if Sum of all Course prices matches with Purchase Amount
	@Test
	public void sumofCourses()
	{
		int sum = 0;
		JsonPath js = new JsonPath(payload.CoursePrice());
		int count = js.getInt("courses.size()"); 
		for(int i=0; i<count; i++) {
			int CoursePrice = js.getInt("courses["+i+"].price");
			int CopiesSold = js.getInt("courses["+i+"].copies");
			int amount = CoursePrice * CopiesSold;
			System.out.println(amount);
			sum = sum + amount;
		}
		System.out.println("total amount = " + sum);
		int purchaseamount = js.getInt("dashboard.purchaseAmount");
		Assert.assertEquals(sum, purchaseamount);
	}
		
		



}
