package stepdefinations;

import org.junit.runner.RunWith;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class Stepdefination {

    @Given("^user is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        throw new PendingException();
    }

    @When("^user login into application with u and p$")
    public void user_login_into_application_with_u_and_p() throws Throwable {
        throw new PendingException();
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        throw new PendingException();
    }

    @And("^cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        throw new PendingException();
    }

}