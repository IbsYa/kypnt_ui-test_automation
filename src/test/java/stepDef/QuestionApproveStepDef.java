package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.DashboardPage;
import pages.QuestionApprovePage;
import utilities.BrowserUtils;
import java.util.List;

public class QuestionApproveStepDef {

    DashboardPage dashboardPage = new DashboardPage();
    QuestionApprovePage questionApprovePage = new QuestionApprovePage();

    @When("the user navigates to {string} menu")
    public void the_user_navigates_to_menu(String Questions) {
        dashboardPage.navigateToModule(Questions);

    }
    @And("the user clicks {string}")
    public void the_User_Clicks(String questionModule) {

        questionApprovePage.navigateToQuestionsModule(questionModule);
        BrowserUtils.waitFor(3);
    }

    @When("the user click edit button on waiting approval question")
    public void the_user_click_edit_button_on_waiting_approval_question() {

        BrowserUtils.waitForVisibility(questionApprovePage.tableWhole, 5);
        questionApprovePage.getTableWholeHeader();
        questionApprovePage.getRow();

    }

    @When("the user clicks approve button")
    public void the_user_clicks_approve_button() {

    }

    @Then("the user clicks All Questions")
    public void the_user_clicks_All_Questions() {

    }

    @Then("the user should see the status of question is approved")
    public void the_user_should_see_the_status_of_question_is_approved() {

    }



}
