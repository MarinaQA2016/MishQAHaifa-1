import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Inka on 09-Dec-18.
 */
public class CreateNewAccountAndLogIn {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mish.sheygam.com/#/wellcome");
        driver.manage().window().maximize();
        Thread.sleep(10000);

        WebElement createAccount = driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
        createAccount.click();

        WebElement mailField = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        mailField.click();
        mailField.sendKeys("jenka25@gmail.com");


        WebElement passwordField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passwordField.click();
        passwordField.sendKeys("122557");

        WebElement repPasswordField = driver.findElement(By.xpath("//input[@formcontrolname='passwordRep']"));
        repPasswordField.click();
        repPasswordField.sendKeys("122557");

        WebElement registrationButton = driver.findElement(By.xpath("//span[contains(text(),'Registration')]"));
        registrationButton.click();
        Thread.sleep(15000);

        WebElement cancelButton = driver
                .findElement(By.xpath("//button[@type='button']//span[contains(text(),'Cancel')]/.."));

        cancelButton.click();
        Thread.sleep(3000);

        WebElement menuButton = driver.findElement(By.xpath("//mat-icon[@mattooltip='Menu']"));
        //menuButton = driver.findElement(By.cssSelector('mat-icon.but.mat-icon'));
        menuButton.click();

        WebElement logOutMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));
        logOutMenu.click();
        Thread.sleep(3000);

        //----------Login created user----------

        WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        login.click();

        WebElement emailReg = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        emailReg.click();
        emailReg.sendKeys("jenka25@gmail.com");
        Thread.sleep(2000);

        WebElement passReg =  driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passReg.click();
        passReg.sendKeys("122557");

        WebElement log_In = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        log_In.click();
        Thread.sleep(8000);
        driver.quit();

    }
}
