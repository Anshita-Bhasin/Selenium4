import static org.testng.AssertJUnit.assertEquals;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium4_Basics {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager
            .chromedriver()
            .setup();

    }

    @Test
    public void getTitle() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        String Title = driver.getTitle();
        assertEquals("Title Validation", "Google123", Title);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
