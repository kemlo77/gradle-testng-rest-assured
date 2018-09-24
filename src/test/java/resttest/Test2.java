package resttest;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 {

  @BeforeClass
  void beforeClass(){


  }

  @Test
  void firstTest(){
    given()
        .when()
        .log()
        .all()
        .get("http://date.jsontest.com")
        .then()
        .log()
        .all()
        .statusCode(200);
  }




}
