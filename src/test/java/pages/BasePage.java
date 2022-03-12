package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

public abstract class BasePage {

    WebDriver driver = Driver.get();

    public BasePage() {


        PageFactory.initElements(driver, this);
    }

    public void navigateToModule(String module) {

        String moduleLocator = "//span[.='" + module + "']";
        try {
            BrowserUtils.waitForClickablility(By.xpath(moduleLocator), 5);
            WebElement moduleElement = driver.findElement(By.xpath(moduleLocator));
            moduleElement.click();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(moduleLocator), 5);
        }
    }

    public String getEmailAddress(String email) {

        String emailLocator = "//span[.='" + email + "']";
        BrowserUtils.waitForClickablility(By.xpath(emailLocator), 5);
        WebElement emailElement = Driver.get().findElement(By.xpath(emailLocator));

        return emailElement.getText();
    }

    public void clickAddButtonToCreate (String buttonName){

        WebElement element = driver.findElement(By.xpath("//span[.='"+buttonName+"']"));
        BrowserUtils.waitForClickablility(element,5);
        element.click();

    }
}
