package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;


public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//span[.='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "(//p)[1]")
    public WebElement errorMessage;

    String password = ConfigurationReader.get("password");

    public void landingLoginPage (){
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
        BrowserUtils.waitForPageToLoad(3);

    }

    public void loginAsSuperAdmin() {
        String userName = ConfigurationReader.get("superAdmin");
        emailInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginButton.click();
        BrowserUtils.waitForPageToLoad(3);

    }

    public void loginAsModerator() {
        String userName = ConfigurationReader.get("moderator");
        emailInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginButton.click();
        BrowserUtils.waitForPageToLoad(3);

    }

    public void loginAsEditor() {
        String userName = ConfigurationReader.get("editor");
        emailInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginButton.click();
        BrowserUtils.waitForPageToLoad(3);

    }

    public void loginAsExpert() {
        String userName = ConfigurationReader.get("expert");
        emailInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginButton.click();
        BrowserUtils.waitForPageToLoad(3);

    }

    public void loginAsSalesman() {
        String userName = ConfigurationReader.get("salesman");
        emailInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginButton.click();
        BrowserUtils.waitForPageToLoad(3);

    }

    public void loginAsStudent() {
        String userName = ConfigurationReader.get("student");
        emailInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginButton.click();
        BrowserUtils.waitForPageToLoad(3);

    }

    public void loginAsSchoolAdmin() {
        String userName = ConfigurationReader.get("schoolAdmin");
        emailInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginButton.click();
        BrowserUtils.waitForPageToLoad(3);

    }

    public void loginAsTeacher() {
        String userName = ConfigurationReader.get("teacher");
        emailInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginButton.click();
        BrowserUtils.waitForPageToLoad(3);

    }

    public void loginWithInvalidCredential(String userName, String password) {
        emailInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginButton.click();

    }

    public void login(String user){

        switch (user) {
            case "superAdmin":
                new LoginPage().loginAsSuperAdmin();
                break;
            case "moderator":
                new LoginPage().loginAsModerator();
                break;
            case "editor":
                new LoginPage().loginAsEditor();
                break;
            case "expert":
                new LoginPage().loginAsExpert();
                break;
            case "salesman":
                new LoginPage().loginAsSalesman();
                break;
            case "student":
                new LoginPage().loginAsStudent();
                break;
            case "schoolAdmin":
                new LoginPage().loginAsSchoolAdmin();
                break;
            case "teacher":
                new LoginPage().loginAsTeacher();
                break;
        }

    }

}
