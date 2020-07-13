package com.emirates.qa.pages;

import com.emirates.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static com.emirates.qa.util.TestUtil.ClickOnHiddenTextBox;
import static com.emirates.qa.util.TestUtil.ExplicitWait;

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
    @FindBy(xpath = "//*[@id='f8d06921-ccf4-4d2a-a4a4-ef17a55ac5bb']")
    WebElement departure;
    @FindBy(xpath = "//*[@id='0c4574cf-f808-47b3-97cf-162db4676d9d']")
    WebElement arrival;


    public HomePage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    public String verifyHomePageTitle(String title) {
        ExplicitWait(title);
        return driver.getTitle();
    }


    public boolean verifyUserNameLabel() {

        return userNameLabel.isDisplayed();
    }


    public BookFlightsPage searchFlight() throws IOException {
        ClickOnHiddenTextBox(departure);
        departure.sendKeys("Delhi");
        ClickOnHiddenTextBox(arrival);
        arrival.sendKeys("Dubai");
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
