package com.emirates.qa.pages;

import com.emirates.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

import static com.emirates.qa.util.TestUtil.elementClickable;
import static com.emirates.qa.util.TestUtil.selectDateFromCalender;

public class BookFlightsPage extends TestBase {

    @FindBy(xpath = "//input[@id='search-flight-date-picker--depart']")
    WebElement departuredate;
    @FindBy(xpath = "//input[@id='search-flight-date-picker--return']")
    WebElement arrivaldate;
    @FindBy(xpath = "//input[@name='Passengers']")
    WebElement passenger;
    @FindBy(xpath="//div[@class=\"switch-button-container\"]")
    WebElement dates;
    @FindBy(xpath = "//input[@id=\"input5\"]")
    WebElement flightclass;
    @FindBy(xpath = "//input[@name='Departure airport' and @aria-live='off']")
    WebElement departure;
    @FindBy(xpath = "//input[@name='Arrival airport' and @aria-live='off']")
    WebElement arrival;
    @FindBy(xpath = "//a[@class='cta cta--large cta--primary js-continue-search-flight search-flight__continue--cta ']")
    WebElement searchflight;

    public BookFlightsPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    public void searchFlight() throws IOException {
        departure.clear();
        departure.sendKeys("Delhi");
        arrival.clear();

        arrival.sendKeys("Hamburg");
        searchflight.click();


    }

    public void selectDates() {

        selectDateFromCalender(departuredate, prop.getProperty("departure_date"));
        selectDateFromCalender(arrivaldate, prop.getProperty("arrival_date"));


    }



    public void selectPassengers() {
        dates.click();
       // elementClickable(passenger);
        passenger.click();
       /* Select select=new Select(passenger);
        select.selectByValue("1");*/

    }

    public void selectFlightClass() {

    }



}
