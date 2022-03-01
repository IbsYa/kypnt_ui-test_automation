package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.List;

public class QuestionApprovePage extends BasePage {

    public QuestionApprovePage() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//frame[@name='redir_frame']")
    public WebElement frame1;

    @FindBy (xpath = "(//table[@class='MuiTable-root'])[1]")
    public WebElement tableWhole;

    @FindBy (xpath = "(//table[@class='MuiTable-root'])[1]//th")
    public List<WebElement> tableHeaders;

    @FindBy (xpath = "(//table[@class='MuiTable-root'])[1]//tbody/tr")
    public List<WebElement>tablerows;


    public void navigateToQuestionsModule(String questionsModule){

        String questionModuleLocator = "//span[.='" + questionsModule + "']";

        try {
            BrowserUtils.waitForClickablility(By.xpath(questionModuleLocator), 3);
            WebElement questionModule = Driver.get().findElement(By.xpath(questionModuleLocator));
            questionModule.click();

        }catch (Exception e){
            BrowserUtils.clickWithWait(By.xpath(questionModuleLocator),5);
        }

    }

    public void getTableWholeHeader(){

        List<WebElement> headers = tableHeaders;
        for (WebElement headerName : headers) {
            System.out.println(headerName.getText());

        }
    }
    public void getRow(){

        List<WebElement> numRows = Driver.get().
                findElements(By.xpath("(//table[@class='MuiTable-root'])[1]//tbody/tr"));

        for (int i = 1; i <= numRows.size(); i++) {

            WebElement row = Driver.get().
                    findElement(By.xpath("//table[@class='MuiTable-root'])[1]//tbody/tr[" + i + "]"));

//            if (row.getText().equals("PRE_APPROVED")){
//                WebElement preapprove = Driver.get().
//                        findElement(By.xpath("(//table[@class='MuiTable-root'])[1]//tbody/tr[1]/td[6]/div[1]/button[1]/span[1]"));
//                preapprove.click();


            }


        }
    }


