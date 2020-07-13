import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Emirates {


    public static WebDriver  driver;
    public static Properties prop;

    @FindBy(xpath = "//input[@id=\"sso-email\"]")          WebElement username;
    @FindBy(xpath = "//input[@id=\"sso-password\"]")       WebElement password;
    @FindBy(xpath = "//button[@id='login-button']")        WebElement submit;
    @FindBy(xpath = "//span[contains(text(),\"Log in\")]") WebElement login;
    @FindBy(xpath = "//img[@src=\"https://c.ekstatic.net/ecl/aircraft-exterior/boeing-777/emirates-boeing-777-sun-setting-down-w1920x480.jpg?h=rMsBF4BtmbIpKm75O--Fkg\"]")
    WebElement image;
    @FindBy(xpath = "//span[text()='Ab']") WebElement getUsername;

    @BeforeTest()
    public void Initialize() throws IOException {
        prop = new Properties();
        FileInputStream fp = new FileInputStream(
            System.getProperty("user.dir")
                + "/src/main/java/com/emirates/qa/config/config.properties");
        prop.load(fp);

        String browserName = prop.getProperty("browser");
        if (browserName.equals("Chrome")) {
            WebDriverManager
                .chromedriver()
                .setup();
            driver = new ChromeDriver();
        } else {
        }

        driver.get("https://www.emirates.com/ae/english/");

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
            .implicitlyWait(10, TimeUnit.SECONDS);
        driver
            .manage()
            .timeouts()
            .pageLoadTimeout(30, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    public WebElement CheckWait(WebElement wb) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        return wait.until(ExpectedConditions.elementToBeClickable(wb));
    }

    public Object EnterTextInHiddenTextBox(String inputText, WebElement myElement) {

        String js = "arguments[0].setAttribute('value','" + inputText + "')";
        return ((JavascriptExecutor) driver).executeScript(js, myElement);
    }

    public Object ClickOnHiddenTextBox(WebElement myElement) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript("arguments[0].click();", myElement);
    }

    @Test(priority = 0)
    public void VerifyTitle() {

        driver.getTitle();
        Assert.assertEquals(driver.getTitle(),
            "Emirates flights – Book a flight, browse our flight offers and explore the Emirates Experience", " Title validation");

    }

    @Test(priority = 1)
    public void VerifyImage() {
        Assert.assertTrue(image.isDisplayed(), " Image Validation");

    }

    @Test(priority = 2)
    public void EnterCredentials() {
        login.click();
        ClickOnHiddenTextBox(username);
        username.sendKeys(prop.getProperty("username"));
        ClickOnHiddenTextBox(password);
        password.sendKeys(prop.getProperty("password"));
        submit.click();
        driver.manage().deleteAllCookies();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains(
            "Emirates flights – Book a flight, browse our flight offers and explore the Emirates Experience"));



    }

    @Test(priority = 3)
    public void VerifyUserName() {
        Assert.assertTrue(getUsername.isDisplayed());
    }

    @AfterTest
    public void teardown() {

    }

}
