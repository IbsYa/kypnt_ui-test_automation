package pages;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtils;

import java.util.List;

public class SuperAdminPage extends BasePage {

    @FindBy(xpath = "(//*[@class='MuiDialogContent-root']/div/div/input)")
    public List<WebElement> moderatorInfoInputs;

    @FindBy(xpath = "//tbody/tr/td[3]")
    public WebElement email;

    Faker faker = new Faker();

    String expectedEmail;


    public void enteringModeratorInfo() {

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        expectedEmail = firstName.toLowerCase() + "_" + lastName.toLowerCase() + "@example.com";
        String mobile = faker.number().digits(10);
        String password = "Test123456!";

        moderatorInfoInputs.get(0).sendKeys(expectedEmail);
        moderatorInfoInputs.get(1).sendKeys(firstName);
        moderatorInfoInputs.get(2).sendKeys(lastName);
        moderatorInfoInputs.get(3).sendKeys(mobile);
        moderatorInfoInputs.get(4).sendKeys(password);

    }

    public void clickSaveButton(String saveButton) {

        BrowserUtils.waitFor(3);
        navigateToModule(saveButton);
        BrowserUtils.waitFor(3);

    }

    public void verifyCreatedUser(){

        String actualEmail = email.getText();
        Assert.assertEquals("emails do NOT match", expectedEmail, actualEmail);

    }

}
