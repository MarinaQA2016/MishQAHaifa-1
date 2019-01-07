package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Inka on 06-Jan-19.
 */
public class ProfilePageHelper extends PageBase{
    @FindBy(xpath = "//span[contains(text(),'Cancel')]")
    WebElement cancelButton;
    @FindBy (xpath = "//mat-icon[@mattooltip='Menu']")
    WebElement iconButton;

    public ProfilePageHelper(WebDriver driver) {
        super(driver);
    }

    public void waitUntilPageLoad(){
        waitUntilElementIsLoaded(driver, cancelButton, 40);
        waitUntilElementIsLoaded(driver, iconButton, 40);
    }

    public void menuButtonClick(){
        iconButton.click();
    }


}
