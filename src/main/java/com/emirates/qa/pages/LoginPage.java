package com.emirates.qa.pages;

import static com.emirates.qa.util.TestUtil.ClickOnHiddenTextBox;

import com.emirates.qa.base.TestBase;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class
LoginPage extends TestBase {

    @FindBy(xpath = "//input[@id=\"sso-email\"]")          WebElement username;
    @FindBy(xpath = "//input[@id=\"sso-password\"]")       WebElement password;
    @FindBy(xpath = "//button[@id='login-button']")        WebElement submit;
    @FindBy(xpath = "//span[contains(text(),\"Log in\")]") WebElement login;
    @FindBy(xpath = "//img[@src=\"https://c.ekstatic.net/ecl/aircraft-exterior/boeing-777/emirates-boeing-777-sun-setting-down-w1920x480.jpg?h=rMsBF4BtmbIpKm75O--Fkg\"]")
    WebElement image;
    @FindBy(xpath = "//span[text()='Ab']") WebElement getUsername;

    public LoginPage() throws IOException {

        PageFactory.initElements(driver, this);
    }

    public static String verifyTitle() {
        return driver.getTitle();
    }

    public boolean verifyLoginImage() {
        return image.isDisplayed();
    }

    public HomePage Login(String un, String pwd) throws IOException {
        login.click();
        ClickOnHiddenTextBox(username);
        username.sendKeys(un);
        ClickOnHiddenTextBox(password);
        password.sendKeys(pwd);
        submit.click();
        driver
            .manage()
            .deleteAllCookies();
        return new HomePage();
    }
}
