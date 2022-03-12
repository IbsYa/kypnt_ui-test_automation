package stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ExpertPage;
import utilities.BrowserUtils;

public class QuestionApproveStepDef {

    ExpertPage expertPage = new ExpertPage();

    @When("the user navigates to {string} menu")

    public void the_user_navigates_to_menu(String navigateModule) {
        expertPage.navigateToModule(navigateModule);

    }

    @When("the user clicks {string} edit button")
    public void the_user_clicks_edit_button(String statusCode) {

        BrowserUtils.waitForVisibility(expertPage.tableWhole, 5);
        expertPage.clickWaitingApprovalOrPreApproval(statusCode);
    }


    @When("the user clicks {string} button")
    public void the_user_clicks_button(String approveOrRejectButton) {
       expertPage.clickApproveOrRejectButton(approveOrRejectButton);

    }

    @Then("the user clicks All Questions")
    public void the_user_clicks_All_Questions() {

    }

    @Then("the user should see the status of question is approved")
    public void the_user_should_see_the_status_of_question_is_approved() {

    }


}
