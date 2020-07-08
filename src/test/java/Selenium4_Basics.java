import static org.testng.AssertJUnit.assertEquals;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium4_Basics {

    WebDriver driver;
    Properties prop = new Properties();
    Logger    log = Logger.getLogger(Selenium4_Basics.class);

    @BeforeMethod
    public void setUp() {
        WebDriverManager
            .chromedriver()
            .setup();

    }

    @Test
    public void getTitle() throws IOException {
        driver = new ChromeDriver();
        prop = new Properties();
        FileInputStream fp = new FileInputStream(
            System.getProperty("user.dir")
                + "/src/main/java/com/emirates/qa/config/config.properties");
        prop.load(fp);
        log.info(" *****************Opening Browser***************");
        System.out.println(prop.getProperty("url"));
        driver.get(prop.getProperty("url"));
        String Title = driver.getTitle();
        log.warn(" ***********Title***********");
        assertEquals("Title Validation", "Google", Title);
        log.error(" Title Mismatch");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
        log.info(" ****************Test Case Executed *******************");
    }

}
