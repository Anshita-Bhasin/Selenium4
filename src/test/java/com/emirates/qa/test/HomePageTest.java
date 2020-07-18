package com.emirates.qa.test;

import com.emirates.qa.base.TestBase;
import com.emirates.qa.pages.*;
import com.emirates.qa.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

public class HomePageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    TestUtil testUtil;
    BookFlightsPage bookPage;
    ManagePage managePage;
    ExperiencePage experiencePage;

    public HomePageTest() throws IOException {
        super();
    }

    @BeforeTest()
    public void setUp() throws IOException {
        Initializer();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        bookPage = new BookFlightsPage();
        homePage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Test(priority = 1)
    public void verifyHomePageTitleTest() {
        String expected = "Emirates flights – Book a flight, browse our flight offers and explore the Emirates Experience";
        String title = homePage.verifyHomePageTitle(expected);
        Assert.assertEquals(title, "Emirates flights – Book a flight, browse our flight offers and explore the Emirates Experience",
                " Home Page Title Validation");
    }


    @Test(priority = 2)
    public void verifyUserNameTest() {
        Boolean label = homePage.verifyUserNameLabel();
        Assert.assertTrue(label, " UserName Validation");
    }

    @Test(priority = 3)
    public void verifyDateTest() throws IOException {

        bookPage=  homePage.verifyDatesAreVisible();

    }

    /*@Test(priority = 3)
    public void verifyBookLinkTest() throws IOException {
        bookPage = homePage.clickOnBookLink();
    }

    @Test(priority = 4)
    public void verifyManageLinkTest() {
        managePage = homePage.clickOnManageLink();
    }

    @Test(priority = 5)
    public void verifyExperienceLinkTest() {
        experiencePage = homePage.clickOnExperienceLink();
    }
*/
    @AfterMethod
    public void teardown() {
        driver.quit();
    }

}
