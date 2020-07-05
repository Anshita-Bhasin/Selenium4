package com.emirates.qa.pages;

import com.emirates.qa.base.TestBase;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(name = "username")                             WebElement username;
    @FindBy(name = "password")                             WebElement password;
    @FindBy(xpath = "//button[@id='login-button']")        WebElement submit;
    @FindBy(xpath = "//span[contains(text(),\"Log in\")]") WebElement login;
    @FindBy(xpath = "//img[@src='https://c.ekstatic.net/ecl/destinations/middle-east/united-arab-emirates/dubai-skyline-w1920x480.jpg?h=6KeQVDtrWRXokiu7I66hcQ']")
    WebElement image;

    public LoginPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    public void clickLogin() {
        login.click();
    }

    public boolean verifyLoginImage() {
        return image.isDisplayed();
    }

    public static String verifyTitle() {
        return driver.getTitle();
    }

    public HomePage Login(String un, String pwd) throws IOException {
        username.sendKeys(un);
        password.sendKeys(pwd);
        submit.click();
        return new HomePage();
    }
}
