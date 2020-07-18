package com.emirates.qa.util;

import com.emirates.qa.base.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class TestUtil extends TestBase {

    public static long PageLoadTimeOut = 20;
    public static long ImplicitlyWait = 30;

    public TestUtil() throws IOException {
        super();
    }

    public void switchToFrame(String frameName) {
        driver
                .switchTo()
                .frame(frameName);
    }

    public static Object clickOnHiddenTextBox(WebElement myElement) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript("arguments[0].click();", myElement);
    }

    public static void explicitWaitTitle(String title) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains(title));


    }

    public static void waitForElementToAppear(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void elementClickable(WebElement element) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void selectDateFromCalender(WebElement element, String datevalue) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','" + datevalue + "');", element);
    }

    public static void takeScreenshotOfWebElement(WebElement element, String fileName) {

        File src = element.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "/screenshots/" + fileName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        public static void takeScreenshot (String methodName) {

            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "/screenshots/"+methodName + System.currentTimeMillis() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
