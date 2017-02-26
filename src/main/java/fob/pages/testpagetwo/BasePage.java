package fob.pages.testpagetwo;

import fob.driverfactory.DriverFactory;
import fob.pages.testpagetwo.pageobject.second.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends DriverFactory{

    private String url = "https://wego.here.com";

    public String getUrl() {
        return this.url;
    }

    public BasePage() {
        super();
        this.webDriver.get(getUrl());
        PageFactory.initElements(webDriver, this);
    }
    public WebDriverWait wait = new WebDriverWait(webDriver, 30);

    public SearchBar searchBar = PageFactory.initElements(webDriver, SearchBar.class);

    public MenuSection menuSection = PageFactory.initElements(webDriver, MenuSection.class);

    public SignInForm signInForm = PageFactory.initElements(webDriver, SignInForm.class);

    public LocationsPanel locationsPanel = PageFactory.initElements(webDriver, LocationsPanel.class);

    public DirectionsPanel directionsPanel = PageFactory.initElements(webDriver, DirectionsPanel.class);

    public CollectionPage collectionPage = PageFactory.initElements(webDriver, CollectionPage.class);

    public WebDriver getDriver() {
        return this.webDriver;
    }
}
