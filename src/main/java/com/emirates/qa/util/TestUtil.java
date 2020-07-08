package com.emirates.qa.util;

import com.emirates.qa.base.TestBase;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtil extends TestBase {

    public static long PageLoadTimeOut = 20;
    public static long ImplicitlyWait  = 30;

     public TestUtil() throws IOException {
          super();
     }

     public void switchToFrame() {
        driver
            .switchTo()
            .frame("");
    }

    public static Object ClickOnHiddenTextBox(WebElement myElement) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript("arguments[0].click();", myElement);
    }

    public static void ExplicitWait(String title)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains(title));


    }

}
