package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Inka on 26-Dec-18.
 */
public class LoginPageHelper extends PageBase {
    @FindBy (xpath = "//span[contains(text(),'Cancel')]" )
    WebElement cancelButton;
    @FindBy (xpath = "//input[@formcontrolname='email']")
    WebElement emailField;
    @FindBy (xpath = "//input[@formcontrolname='password']")
    WebElement passwordField;
    @FindBy (xpath = "//span[contains(text(),'Log in')]")
    WebElement loginButton;
    @FindBy (xpath =
            "//div[@class='alert alert-danger ng-star-inserted']")
    WebElement alertText;


    public LoginPageHelper(WebDriver driver) {
        super(driver);
    }

    public void waitUntilPageLoad() {
        waitUntilElementIsLoaded(driver,
                cancelButton,
                20);
    }

    public void enterValueToFieldEmail(String value) {
        setValueToField(emailField,value);
    }

    public void enterValueToFieldPassword(String value) {
        setValueToField(passwordField,value);
    }

    public void pressLogInButton() {
        waitUntilElementIsLoaded(driver, loginButton, 20);
        loginButton.click();
    }

    public String getAlertText() {
        waitUntilElementIsLoaded(driver, alertText,20);
    return alertText.getText();

    }
}
