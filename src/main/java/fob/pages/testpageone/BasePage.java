package fob.pages.testpageone;

import fob.driverfactory.DriverFactory;
import fob.pages.testpageone.pageobject.first.DirectionsPanel;
import fob.pages.testpageone.pageobject.first.MenuSection;
import fob.pages.testpageone.pageobject.first.RoutePlannerResult;
import fob.pages.testpageone.pageobject.first.SearchBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends DriverFactory {

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

    public DirectionsPanel directionsPanel = PageFactory.initElements(webDriver, DirectionsPanel.class);

    public RoutePlannerResult routePlannerResult = PageFactory.initElements(webDriver, RoutePlannerResult.class);

    public WebDriver getDriver() {
        return this.webDriver;
    }

}
