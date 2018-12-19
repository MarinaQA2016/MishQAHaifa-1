package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCreateAccountAndLogIn extends TestBase {

    @Test
    public void CreateAccount () throws InterruptedException {
        WebElement createAccount = driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
        createAccount.click();
        WebElement mailField = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        mailField.click();
        mailField.sendKeys("jenya25@gmail.com");

        WebElement passwordField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passwordField.click();
        passwordField.sendKeys("555555");

        WebElement repPasswordField = driver.findElement(By.xpath("//input[@formcontrolname='passwordRep']"));
        repPasswordField.click();
        repPasswordField.sendKeys("555555");

        WebElement registrationButton = driver.findElement(By.xpath("//span[contains(text(),'Registration')]"));
        registrationButton.click();

        waitUntilElementIsLoaded (driver,By.xpath("//span[contains(text(),'Cancel')]"),20);

        WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
        Assert.assertTrue(cancelButton.getText().equals("Cancel"));
        cancelButton.click();
    }

@Test
    public void LogOut () throws InterruptedException {

    waitUntilElementIsLoaded (driver,By.xpath("//mat-icon[@mattooltip='Menu']"),20);
    WebElement menuButton = driver.findElement(By.xpath("//mat-icon[@mattooltip='Menu']"));
    menuButton.click();

    WebElement logOutMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));
    logOutMenu.click();

    waitUntilElementIsLoaded (driver,By.xpath("//span[contains(text(),'Go to Event list')]"),20);

    WebElement goToEventsButton = driver.findElement(By.className("mat-stroked-button"));
    Assert.assertTrue(goToEventsButton.getText().equals("Go to Event list"));
}


@Test
    public void Login (){

    WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
    login.click();

    WebElement emailReg = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
    emailReg.click();
    emailReg.sendKeys("jmenka@gmail.com");

    WebElement passReg =  driver.findElement(By.xpath("//input[@formcontrolname='password']"));
    passReg.click();
    passReg.sendKeys("221263");

    WebElement log_In = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
    log_In.click();

    waitUntilElementIsLoaded (driver,By.xpath("//h1[@class='gorisontal-center']"),20);

    WebElement titlePage = driver.findElement(By.xpath("//h1[@class='gorisontal-center']"));
    Assert.assertTrue(titlePage.getText().equals("Find event"));


}

private void waitUntilElementIsLoaded (WebDriver driver, By locator, int time){
        try {
            new WebDriverWait(driver,time).until(ExpectedConditions.presenceOfElementLocated(locator));
        }
        catch (Exception e){
            e.printStackTrace();
        }
}

}
