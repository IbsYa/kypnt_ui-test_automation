package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.List;

public class ExpertPage extends BasePage {


    @FindBy(xpath = "(//table[@class='MuiTable-root'])[1]")
    public WebElement tableWhole;

    @FindBy(xpath = "//span[.='Approve']")
    public WebElement approveButton;


    public void clickWaitingApprovalOrPreApproval(String status) {

        List<WebElement> statusColumn  = Driver.get().findElements(By.xpath("//tbody/tr/td[5]"));
        for (int i = 0; i < statusColumn.size(); i++) {

            if (statusColumn.get(i).getText().equals(status)){
                System.out.println(statusColumn.get(i).getText());
                String editButton = "//tbody/tr["+(i+1)+"]/td[6]/div/button";
                Driver.get().findElement(By.xpath(editButton)).click();
                break;

            }

        }

    }

    public void clickApproveOrRejectButton (String button) {

        WebElement reviewApprovePopUp= Driver.get().findElement(By.xpath("//div[@class='tox-icon']"));
        reviewApprovePopUp.click();
        String approveOrRejectButton = "//span[.='"+button+"']";
        Driver.get().findElement(By.xpath(approveOrRejectButton)).click();
        BrowserUtils.waitFor(3);

    }
}


