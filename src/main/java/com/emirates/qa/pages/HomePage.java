package com.emirates.qa.pages;

import static com.emirates.qa.util.TestUtil.ExplicitWait;

import com.emirates.qa.base.TestBase;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(xpath = "//span[text()='Ab']")            WebElement userNameLabel;
    @FindBy(xpath = "//a[contains(text(),'BOOK')]")                                 WebElement bookLink;
    @FindBy(xpath = "//a[@class=\"thirdlevel-title\" and @title=\"Book flights\"]") WebElement bookFlights;
    @FindBy(xpath = "//a[contains(text(),'MANAGE')]")                               WebElement manageLink;
    @FindBy(xpath = "//a[contains(text(),'EXPERIENCE')]")                           WebElement experienceLink;

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
