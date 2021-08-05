package RestassuredAPI_Testing007.RestassuredAPI_Testing007;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
        

public class restassured {
	
	@Test
	public void Get_restassured()
	
	{
		given()
		.when()
		.get("http://192.168.2.177:9090/plugins/userService/userservice?type=add&secret=g9SbOCO7&username=kafka&password=drowssap&name=franz&email=franz@kafka.com\r\n" + 
				"\r\n" + 
				"")
		
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 ");
         
	}
	

}
