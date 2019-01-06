package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.Random;


public class TestBase {
    public WebDriver driver;
    @BeforeMethod
    public void initWebDriver(){
        driver = new ChromeDriver();
        driver.get("https://mish.sheygam.com/#/wellcome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    public void waitUntilElementIsLoaded(WebDriver driver,
                                          By locator, int time)
    {
        try {
            new WebDriverWait(driver, time).until(ExpectedConditions
                    .presenceOfElementLocated(locator));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static String latinDigitString(int length){
        String str = "";
        char ch;
        int number;
        Random gen = new Random();
        int i = 0;
        do {
            number = '0' + gen.nextInt('z' - '0' +1);
            if ((number <= '9') || (number >= 'A' && number <= 'Z') || (number >= 'a'))
            {
                str = str + (char)number;
            }
        }while(str.length()<length);
        return str;
    }
}
