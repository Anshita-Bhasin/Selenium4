package com.emirates.qa.pages;

import com.emirates.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static com.emirates.qa.util.TestUtil.explicitWaitTitle;

public class HomePage extends TestBase {


    @FindBy(xpath = "//span[text()='Ab']")
    WebElement userNameLabel;
    @FindBy(xpath = "//a[contains(text(),'BOOK')]")
    WebElement bookLink;
    @FindBy(xpath = "//a[@class=\"thirdlevel-title\" and @title=\"Book flights\"]")
    WebElement bookFlights;
    @FindBy(xpath = "//a[contains(text(),'MANAGE')]")
    WebElement manageLink;
    @FindBy(xpath = "//a[contains(text(),'EXPERIENCE')]")
    WebElement experienceLink;
    @FindBy(xpath = "//input[@name='Departure airport' and @aria-live='off']")
    WebElement departure;
    @FindBy(xpath = "//input[@name='Arrival airport' and @aria-live='off']")
    WebElement arrival;


    public HomePage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    public String verifyHomePageTitle(String title) {
        explicitWaitTitle(title);
        return driver.getTitle();
    }


    public boolean verifyUserNameLabel() {

        return userNameLabel.isDisplayed();
    }


    public BookFlightsPage verifyDatesAreVisible() throws IOException {
        departure.isDisplayed();
        arrival.isDisplayed();
        return new BookFlightsPage();

    }


    public BookFlightsPage clickOnBookLink() throws IOException {
        bookLink.click();
        bookFlights.click();
        return new BookFlightsPage();
    }

    public ManagePage clickOnManageLink() {
        manageLink.click();
        return new ManagePage();
    }

    public ExperiencePage clickOnExperienceLink() {
        experienceLink.click();
        return new ExperiencePage();
    }

}
