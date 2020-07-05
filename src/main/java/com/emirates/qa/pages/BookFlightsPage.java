package com.emirates.qa.pages;

import com.emirates.qa.base.TestBase;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookFlightsPage extends TestBase {

    @FindBy(xpath = "//input[@name=\"seldcity1\"]")                                         WebElement departure;
    @FindBy(xpath = "//input[@name=\"selacity1\"]")                                         WebElement arrival;
    @FindBy(xpath = "//input[@name=\"selddate1\"]")                                         WebElement departuredate;
    @FindBy(xpath = "//input[@name=\"seladate1\"]")                                         WebElement arrivaldate;
    @FindBy(xpath = "//input[name=\"ctl00$MainContent$ctrlSearchFlightWidget$ctl06$pax\"]") WebElement passenger;
    @FindBy(xpath = "//input[@id=\"input5\"]")                                              WebElement flightclass;
    @FindBy(xpath = "//input[@type=\"submit\"]")                                            WebElement searchflight;

    public BookFlightsPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    public void selectDepartureCity() {

    }

    public void selectArrivalCity() {

    }

    public void selectDepartureDate() {

    }

    public void selectArrivalDate() {

    }

    public void selectPassengers() {

    }

    public void selectFlightClass() {

    }

    public void clickOnSearchFlights() {
        searchflight.click();
    }

}
