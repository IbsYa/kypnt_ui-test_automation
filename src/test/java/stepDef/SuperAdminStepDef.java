package stepDef;

import io.cucumber.java.en.*;
import pages.SuperAdminPage;


public class SuperAdminStepDef {

    SuperAdminPage superAdminPage = new SuperAdminPage();

    @And("the user clicks {string} button to create")
    public void theUserClicksButtonToCreate(String buttonName) {
        superAdminPage.clickAddButtonToCreate(buttonName);

    }


    @When("User inputs the moderator information")
    public void user_inputs_the_moderator_information() {
        superAdminPage.enteringModeratorInfo();

    }

    @When("User clicks {string} button")
    public void user_clicks_save_button(String saveButton) {
        superAdminPage.clickSaveButton(saveButton );

    }

    @Then("User verifies the created moderator.")
    public void user_verifies_the_created_moderator() {

        superAdminPage.verifyCreatedUser();
    }


}
