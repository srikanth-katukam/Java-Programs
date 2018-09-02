import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

/**
 * Created by Skatukam on 03/04/2018.
 */
public class JIRAApi {
    @Test
    public void testJIRAAPPI()
    {
        RestAssured.baseURI="https://jbarasoftware.jira.com";
        JsonPath jsonPath= given().log().all().
                            contentType(JSON).
                            when().
                            get("/browse/GE-23744").
                            then().assertThat().statusCode(200).and().extract().jsonPath();
        System.out.println(jsonPath.toString());

    }
}
