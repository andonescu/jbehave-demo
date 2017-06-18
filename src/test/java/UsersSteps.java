import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;


public class UsersSteps {


    StringBuilder url = new StringBuilder("https://api.github.com/");


    @Given("the github $path api")
    public void aGitHubApi(String path) {
        url.append(path);
    }

    @When("accessing $resource profile")
    public void specificResource(String resource) {
        url.append("/").append(resource);
    }

    @Then("the name of the is `$name`")
    public void theResourceNameIs(String name) {
        when().
                get(url.toString()).
        then().
                statusCode(200).
                body("name", equalTo(name));
    }

}
