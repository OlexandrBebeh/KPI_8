import endpoints.ImgurBaseEndpoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matchers;

import static io.restassured.RestAssured.given;


public class StepsForFindUser {

    String username;
    @Given("Username {string}")
    public void setUsername(String str) {
        username = str;
    }

    @When("I want to find user")
    public void getUserPage(){
        new ImgurBaseEndpoints().getUserByName(username)
                .then()
                .assertThat()
                .body(Matchers.notNullValue())
                .and().statusCode(404);
    }

    @Then("I should get user page")
    public void viewAboutPage(){
        given()
                .log().uri()
                .baseUri("https://imgur.com/user/")
                .get(username+"/about")
                .then().statusCode(200);
    }
}
