package com.emirates.qa.base;

import static com.emirates.qa.util.TestUtil.ImplicitlyWait;
import static com.emirates.qa.util.TestUtil.PageLoadTimeOut;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

    public static WebDriver  driver;
    public static Properties prop;

    public TestBase() throws IOException {
        try {
            prop = new Properties();
            FileInputStream fp = new FileInputStream(
                System.getProperty("user.dir")
                    + "/src/main/java/com/emirates/qa/config/config.properties");
            prop.load(fp);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Initializer() {
        String browserName = prop.getProperty("browser");
        if (browserName.equals("Chrome")) {
            WebDriverManager
                .chromedriver()
                .setup();
            driver = new ChromeDriver();
        } else if (browserName.equals("FF")) {
            WebDriverManager
                .chromedriver()
                .setup();
            driver = new FirefoxDriver();
        }
        driver
            .manage()
            .window()
            .maximize();
        driver
            .manage()
            .deleteAllCookies();
        driver
            .manage()
            .timeouts()
            .pageLoadTimeout(PageLoadTimeOut, TimeUnit.SECONDS);
        driver
            .manage()
            .timeouts()
            .implicitlyWait(ImplicitlyWait, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));
    }

}
