package fob.pages.testpagethree;


import fob.driverfactory.DriverFactory;
import fob.pages.testpagethree.pageobject.GSMArenaSearchPage;
import fob.pages.testpagethree.pageobject.GSMArenaSidebar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends DriverFactory {

    private String url = "http://www.gsmarena.com";

    public String getUrl() {
        return this.url;
    }

    public BasePage() {
        super();
        this.webDriver.get(getUrl());
        PageFactory.initElements(webDriver, this);
    }
    public WebDriverWait wait = new WebDriverWait(webDriver, 30);

    public GSMArenaSidebar gsmArenaSidebar = PageFactory.initElements(webDriver, GSMArenaSidebar.class);

    public GSMArenaSearchPage gsmArenaSearchPage = PageFactory.initElements(webDriver, GSMArenaSearchPage.class);

    public WebDriver getDriver() {
        return this.webDriver;
    }
}
