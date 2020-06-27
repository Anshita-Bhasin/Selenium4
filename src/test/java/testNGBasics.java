public class testNGBasics {



    /*System.setProperty("webdriver.gecko.driver","C://Users/Downloads/geckodriver.exe")
Webdriver driver = new FirefoxDriver();
driver.get("http://www.google.com");
driver.manag().window().maximize()
driver.manage().\
deleteAllCookies()

#Title
String title=driver.getTitle();
Strin Result=(title.equals("Google"))?"Pass":"Fail;
System.out.Println(" validating title  and result is " + Result);
driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Anshita");
Select select = new Select(driver.findElement(By.id('12'));
select.SelectByVisibleText("Orange");

#Popup - Alert
driver.switchTo().alert();
thread.sleep(5000); //miliseconds - 5 seconds
driver.manage().timeouts().implicitlyWait(30, timeUnit.seconds);

driver.findElement(By.xpath(//a[contains(text(),'Contacts')]")).click();
driver.switchTo().frame();

#MouseHover
Actions action=new Actions(driver);
action.moveToElement().build().perform();
action.clickAndHold(driver.findElement()).moveToElement(driver.findElement()).release(driver.findElement))
.build().perform();
driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.Seconds);
driver.manage().timeouts().implicitlyWait(6,TimeUnit.seconds);
driver.findElement(By.xpath("//input[contains(text,'ABC')]);
driver.findElement(By.xpath("//input[contains(@class,'ABC')]);

dynamic Id:
driver.findElement(By.xpath("  //input[starts-with(@id,'123')
driver.findElement(By.xpath("//input[ends-with(@id,'test')]")

driver.findElement(By.xpath("//a[contains(text(),'My Account')]")
driver.findElement(By.xpath("//a[@href='']")
List<WebElements> webelement = driver.findElements(By.tagName("a"))
webelement.size();

#Taking Screenshot
File src =((TakeScreenshot)driver).getScreenshotAs(OutputType.File);
FileUtils.copyFile(src,NewFile("//path"));

#ExplicitlyWait
WebdriverWait(driver,timeout.seconds).ignoring(StaleElementReferenceException.class)
.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.Xpath("//input[@id,'12'])")));
locator.click();

#Window Pop Up
set<String> handler = driver.getWindowHandles();
Iterator<String> it = handle.iterate();
String childwindow=it.next();
driver.switchTo().window(childwindow);

#Properties File
Properties pr = new Properties();
FileInputStream fp = new FileInputStream("path of property file");
pr.load(fp);
String url =pr.getProperty("url");

String browser=pr.getProperty("browser");

If (browser.equals("CHROME")){
System.setProperty("webdriver.chrome.driver","path of chromedriver.exe");
driver=new ChromeDriver();}
elseIf(browser.equals("FIREFOX")){
System.setProperty("webdriver.gecko.driver","path of geckodriver.exe");
driver = new FirefoxDriver();
}
driver.get(url);
JavaScriptExecutor jp = ((JavaScriptExecutor)driver);
String bg = element.getcssValue("backgroundColor);
JavaScriptExecutor js =((JavaScriptExecutor)driver);


#Broken Links And Images

List<Webelement> links = driver.findElements(By.tagName("a"));
links.addAll(driver.findEements(By.tagName("img"));

List<Weblement> activeLinks = new ArrayList<Weblement>

for(int i =0; i<links.size(); i ++)
{
if(links.get(i).getAttribute("href")!=null
&& !(links.get(i).getAttribute("href").contains("javascript")))
{
activelinks.addAll(links.get(i));
}}

for(int j=0;j<activeLinks.size();j++)
{
HttpURLConnection connection = (HttpUrlConnection)new URL(activeLinks.get(j).getAttribute("href"))
.openConnection();
connection.connect();
String message = connection.getResponseMessage();
connection.disconnect();
System.out.println(" printing http response messages for activeLinks.get(i).getAttribute("href")
 is ----- "+ response );




#BootStrap Dropdown
List<Webelement> list =driver.findElements(By.xpath("//ul[@class,'ABC']//a//li//labels"));
for(int i =0; i<list.size(); i++){
list.get(i).click(); // if want to select all the values from dropdown
if(list.get(i).getText().contains("TEST"))
{
list.get(i).click();
break();
}}


#BootStrap Example 2:
List<Webelement> ls = driver.findElements(By.xpath("//div[contains(@class,'dropdown')]//div//a"));
ls.size();

#DropDown
Select sl = new Select(weblement);
sl.selectByIndex(10);
List<Webelement> days=sl.getOptions();
days.size();
for(int i=0;i<days.size();i++)
{
days.get(i).getText();
d
}}


#xpath of select tag
List<webelement> yearList=driver.findElements(By.xpath("//select[@id,'year']//options"));
yearList.size();
for(int i =0;i<yearList.size();i++)
{
yearList.get(i).click();
if(yearList.get(i).getText().contains("1991"))
{
yearList.get(i).click();
}
}





#GetRect - Complete dimension of a specific webelement - Selenium4
Height, Widhth,X,Y Coordinates

Webelement loginButton=driver.findElement(By.xpath("//input[@id,'login']"));
//Selenium3
Dimension dim = loginButton.getSize();
loginButton.getHeight();
loginButton.getWidth();

Point p = loginButton.getLocation();
p.getX();
p.getY();

//Selenium4
Rectangle rectref= loginButton.getRect();
loginButton.getHeight();
loginButton.getWidth();
loginButton.getX();
loginButton.getY();



//pagefactory - method
public class login

@FindBy(id="username")
private WebElement username;


public LoginPage()
{
PageFactory.initElements(driver,this);
}


public void ProcessLogin()
{
username.sendKeys("TEST");
}





js.executeScript("arguments[0].style.background = " + color +"'",element)



*/

}
