package com.emirates.qa.test;

import com.emirates.qa.base.TestBase;
import com.emirates.qa.pages.HomePage;
import com.emirates.qa.pages.LoginPage;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage;
    HomePage  homePage;

    public LoginTest() throws IOException {
        super();
    }

    @BeforeMethod()
    public void setUp() throws IOException {
        Initializer();
        loginPage = new LoginPage();
    }

    @Test(priority = 1)
    public void verifyTitle() {
        String title = loginPage.verifyTitle();
        Assert.assertEquals(title, "Login to Emirates | The Emirates Experience | Emirates United Arab Emirates", " Home Page Validation ");
    }

    @Test(priority = 2)
    public void loginPageImageTest() {
        Boolean image = loginPage.verifyLoginImage();
        Assert.assertTrue(image, " HomePage Image Validation");
    }

    @Test(priority = 3)
    public void loginPageRedirectTest() {
        loginPage.clickLogin();
    }

    @Test(priority = 4)
    public void loginTest() throws IOException {
        homePage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @AfterMethod()
    public void tearDown() {
        driver.quit();
    }

}
