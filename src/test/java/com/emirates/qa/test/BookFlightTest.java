package com.emirates.qa.test;

import com.emirates.qa.base.TestBase;
import com.emirates.qa.pages.BookFlightsPage;
import com.emirates.qa.pages.HomePage;
import com.emirates.qa.pages.LoginPage;
import com.emirates.qa.util.TestUtil;
import org.testng.annotations.*;

import java.io.IOException;

public class BookFlightTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    TestUtil testUtil;
    BookFlightsPage bookFlightsPage;

    BookFlightTest() throws IOException {
        super();


    }


    @BeforeTest
    public void setup() throws IOException {
        Initializer();
        loginPage = new LoginPage();
        testUtil = new TestUtil();
        homePage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
        bookFlightsPage = homePage.verifyDatesAreVisible();

    }

    @Test(priority = 1)
    public void selectCityTest() throws IOException {
    bookFlightsPage.searchFlight();
        bookFlightsPage.selectDates();
        bookFlightsPage.selectPassengers();
    }

    @AfterMethod
    public void tearDown() {
        // driver.quit();
    }
}
