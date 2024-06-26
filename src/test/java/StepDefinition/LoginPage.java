package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.LoginPage.*;

public class LoginPage {

    @Given("User navigates to the portal login page")
    public void user_navigates_to_the_portal_login_page() throws InterruptedException {
        click_Hamburger_Menu();
        click_signIn_Link();
    }
    @When("User successfully enters the login details")
    public void user_successfully_enters_the_login_details() throws InterruptedException {
        Thread.sleep(2000);
    }
    @Then("User should be able to view the Homepage")
    public void user_should_be_able_to_view_the_homepage() throws InterruptedException {
        Thread.sleep(2000);
        click_signIn_Link2();

    }

}
