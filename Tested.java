/**
 * Created by Skatukam on 02/08/2018.
 */
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Tested {
    static int num=10;
    @Test
    public void test()
    {
        System.out.println("Test Method");
    }
    @Test
    public void connection()
    {
        RestAssured.baseURI= "https://apicm.develgs.com/";
        RequestSpecification requestSpecification=given();
        given().
                param("").
                param("").
                body("").
                when().
                get("v2.0/api/scorecards/measures/save").
                then().assertThat().statusCode(200);

        requestSpecification.contentType("application/json").
                body("{\"name\":\"Test5\",\"description\":\"\",\"active\":true,\"entityType\":\"ACCOUNT\",\"inputType\":\"MANUAL\",\"levelType\":\"MEASURE\"}");
        //Response response =requestSpecification.get("v2.0/api/scorecards/measures/list");
        Response response = requestSpecification.post("v2.0/api/scorecards/measures/save");

        String json = response.getBody().asString();
        System.out.println(json);

    }
    @Test
    public void getRequestmaps()
    {
        RestAssured.baseURI="https://maps.googleapis.com";
        JsonPath jsonPath=given().
                param("location","-33.8670522,151.1957362").
                param("radius","500").
                param("key","AIzaSyDIQgAh0B4p0SdyYkyW8tlG-y0yJMfss5Y").
                when().
                get("/maps/api/place/nearbysearch/json").
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().body("results[0].name",equalTo("Sydney")).and().
                header("server","scaffolding on HTTPServer2").
                extract().response().jsonPath();
        //System.out.println(jsonPath.get("status"));
        System.out.println(jsonPath.get("icon"));
        //System.out.println(str);
    }
    @Test
    public void postRequest()
    {
        RestAssured.baseURI="https://maps.googleapis.com";
        given().
                queryParam("key","AIzaSyDIQgAh0B4p0SdyYkyW8tlG-y0yJMfss5Y").
                body("");

    }

}
