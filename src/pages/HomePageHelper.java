package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Inka on 23-Dec-18.
 */
public class HomePageHelper extends PageBase{
    @FindBy(xpath = "//span[contains(text(),'Login')]")
    WebElement loginButton;

    @FindBy(xpath = "//span[contains(text(),'Create Account')]")
    WebElement createAccountButton;

    @FindBy(xpath = "//span[contains(text(),'Go to Event list')]")
    WebElement goToEventButton;

    @FindBy (xpath = "//h1[@class='mat-display-3']")
    WebElement header;


    public HomePageHelper(WebDriver driver){
        super(driver);
    }

    public void waitUntilPageLoad() {
        waitUntilElementIsLoaded(driver,
                loginButton,
                45);
        waitUntilElementIsLoaded(driver,
                createAccountButton,40);
    }

    public String getGoToEventButtonName() {
        /*WebElement goToEventsButton = driver.findElement(
                By.className("mat-stroked-button"));*/
        return goToEventButton.getText();
    }

    public void pressGoToEventButton() {
        /*WebElement goToEventsButton = driver.findElement(
                By.className("mat-stroked-button"));*/
        goToEventButton.click();
    }

    public void pressLoginButton() {
        /*WebElement login = driver.findElement(By
                .xpath("//span[contains(text(),'Login')]"));*/
        loginButton.click();
    }

    public void pressCreateAccountButton() {
        createAccountButton.click();
    }


    public String getHeader() {
        return header.getText();
    }
}
