package RestAssuredAPI;

import io.restassured.path.json.JsonPath;


import Files.payload;

public class complexJsonparse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonPath js = new JsonPath(payload.CoursePrice());
		//Print No of courses returned by API
		
		int count = js.getInt("courses.size()");
		System.out.println(count);
		
		//Print Purchase Amount
		int totalAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);
		
		//Print Title of the first course
		String firstcourseTitle = js.get("courses[2].title");
		System.out.println(firstcourseTitle);
		
		//Print All course titles and their respective Prices
		for(int i=0;i<count;i++) {
			String getcourseTitles = js.get("courses["+i+"].title");
			System.out.println(getcourseTitles);
			System.out.println(js.get("courses["+i+"].price").toString());
		}
		
		//Print no of copies sold by RPA Course
		System.out.println("Print no of copies sold by RPA Course"); 
		for(int i=0;i<count;i++) {
			String getcourseTitles = js.get("courses["+i+"].title");
			if(getcourseTitles.equalsIgnoreCase("RPA"))
			{
				//COPIES SOLD
				System.out.println(js.get("courses["+i+"].copies").toString());
				break;
			}
		
		}
		
		

	}

}
