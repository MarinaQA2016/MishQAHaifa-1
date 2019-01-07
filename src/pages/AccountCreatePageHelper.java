package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Inka on 06-Jan-19.
 */
public class AccountCreatePageHelper extends PageBase {
    @FindBy (xpath = "//span[contains(text(),'Cancel')]")
    WebElement cancelButton;
    @FindBy (xpath = "//input[@formcontrolname='email']")
    WebElement emailField;
    @FindBy (xpath = "//input[@formcontrolname='password']")
    WebElement passwordField;
    @FindBy (xpath = "//input[@formcontrolname='passwordRep']")
    WebElement repPasswordField;
    @FindBy (xpath = "//span[contains(text(),'Registration')]")
    WebElement registrationButton;

    public AccountCreatePageHelper(WebDriver driver) {
        super(driver);
    }

    public void waitUntilPageLoad() {
        waitUntilElementIsLoaded(driver,cancelButton, 40);
    }

    public void enterValueToFieldEmail(String value) {
        setValueToField(emailField, value);
    }

    public void enterValueToFieldPassword(String value) {
        setValueToField(passwordField,value);
    }

    public void enterValueToFieldRepPassword(String value) {
        setValueToField(repPasswordField,value);
    }
    public void pressRegistrationButton(){
        waitUntilElementIsLoaded(driver, registrationButton,20);
        registrationButton.click();
    }
}
