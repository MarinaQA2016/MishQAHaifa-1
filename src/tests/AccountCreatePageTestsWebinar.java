package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountCreatePageHelper;
import pages.HomePageHelper;
import pages.MenuPageHelper;
import pages.ProfilePageHelper;

/**
 * Created by Inka on 07-Jan-19.
 */
public class AccountCreatePageTestsWebinar extends TestBase {
    // we use here Helper-classes from the class(not from webinar)
    HomePageHelper homePage;
    AccountCreatePageHelper accountCreatePage;
    ProfilePageHelper profilePage;
    MenuPageHelper menuPage;

    @BeforeMethod
    public void initPage() {
        homePage = PageFactory
                .initElements(driver, HomePageHelper.class);
        accountCreatePage = PageFactory
                .initElements(driver, AccountCreatePageHelper
                        .class);
        profilePage = PageFactory.initElements(driver,
                ProfilePageHelper.class);
        menuPage = PageFactory
                .initElements(driver, MenuPageHelper.class);
        homePage.waitUntilPageLoad();
    }

    @Test
    public void  createNewAccount(){
        homePage.pressCreateAccountButton();
        accountCreatePage.waitUntilPageLoad();
        accountCreatePage.enterValueToFieldEmailRandom();
        accountCreatePage.enterValueToFieldPassword("example");
        accountCreatePage.enterValueToFieldRepPassword("example");
        accountCreatePage.pressRegistrationButton();
        profilePage.waitUntilPageLoad();

        Assert.assertEquals(profilePage.getHeader(),"Registration");

        profilePage.menuButtonClick();
        menuPage.waitUntilPageLoad();
        menuPage.pressLogOutButton();
        homePage.waitUntilPageLoad();

        Assert.assertEquals(homePage.getHeader(),"Shabbat in the family circle");



    }


}
