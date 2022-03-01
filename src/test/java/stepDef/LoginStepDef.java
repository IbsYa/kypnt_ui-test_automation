package stepDef;

import static org.junit.Assert.*;
import pages.DashboardPage;
import utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.ConfigurationReader;



public class LoginStepDef {

    LoginPage loginPage = new LoginPage();

    @Given("the user navigates landing page")
    public void the_user_navigates_landing_age() {

        loginPage.landingLoginPage();
    }

    @When("the user logs in as {string}")
    public void the_user_logs_in_as(String userType) {

        loginPage.login(userType);

    }

    @Then("the user should see the {string} email in Settings & Profile")
    public void the_user_should_see_the_email_in_Settings_Profile(String userType) {

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Settings");
        String expectedEmail = ConfigurationReader.get(userType);
        System.out.println("Expected Email = " + expectedEmail);
        String actualEmail = dashboardPage.getEmailAddress(expectedEmail);
        System.out.println("Actual Email = " + actualEmail);
        assertEquals("Email did NOT match", expectedEmail, actualEmail);

    }

    @When("the user enters invalid {string} and {string}")
    public void the_user_enters_invalid_and(String userName, String password) {

        loginPage.loginWithInvalidCredential(userName, password);

    }

    @Then("the user should NOT be able to login")
    public void the_user_should_NOT_be_able_to_login() {

        loginPage.loginButton.click();

    }

    @Then("the user should get an error message")
    public void the_user_should_get_an_error_message() {

        BrowserUtils.waitForVisibility(loginPage.errorMessage, 5);
        BrowserUtils.verifyElementDisplayed(loginPage.errorMessage);


    }

}
