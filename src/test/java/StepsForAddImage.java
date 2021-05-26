import endpoints.ImgurEndpoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matchers;

import static org.junit.Assert.assertEquals;

public class StepsForAddImage {
//    String url;
//    String id;
//    String deletionId;
//    @Given("Image {string}")
//    public void setUrlToImage(String str) {
//        url = str;
//    }
//
//    @When("I want do add image with url")
//    public void postImage(){
//        ValidatableResponse response = new ImgurEndpoints()
//                .postImageByURL(url)
//                .then().log().headers()
//                .and().log().body()
//                .and().assertThat()
//                .body(Matchers.notNullValue());
//        id = response.extract().path("data.id");
//        deletionId = response.extract().path("data.deletehash");
//    }
//
//    @Then("I should get id of added image and delete it")
//    public void verifyImagePosted(){
//        new ImgurEndpoints().getImageByID(id)
//                .then()
//                .log().headers()
//                .and().log().body()
//                .and().assertThat()
//                .body(Matchers.notNullValue())
//                .statusCode(200);
//        String test = new ImgurEndpoints().getImageByID(id)
//                .then()
//                .log().headers()
//                .and().log().body()
//                .and().assertThat()
//                .body(Matchers.notNullValue())
//                .statusCode(200).extract().path("data.id");
//        assertEquals(test,id);
//
//        new ImgurEndpoints()
//                .deleteImageByID(deletionId)
//                .then()
//                .log().headers()
//                .and().log().body()
//                .and().assertThat()
//                .body(Matchers.notNullValue())
//                .statusCode(200);
//    }
}
