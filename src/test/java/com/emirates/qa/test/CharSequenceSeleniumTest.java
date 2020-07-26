package com.emirates.qa.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CharSequenceSeleniumTest {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        StringBuffer data1 = new StringBuffer().append("Chitkara").append(" ").append("University").append(Keys.TAB);
        StringBuilder data2 = new StringBuilder().append("Punjab").append(" ").append("University").append(Keys.TAB);

        WebElement searchText = driver.findElement(By.xpath("//input[@id='search']"));
        searchText.sendKeys(data1);


    }

}
