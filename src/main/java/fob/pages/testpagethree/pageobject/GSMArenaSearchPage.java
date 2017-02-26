package fob.pages.testpagethree.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

@FindBy(css = ".main-column-full")
public class GSMArenaSearchPage {

    @FindBy(css = ".phonefinder.row.tabs-phone-highlight")
    public WebElement phoneFinderForm;

    @FindBy(xpath = "//*[@id=\"body\"]/form/div[2]/div[1]/div[1]/div/button")
    public WebElement brandSelector;

    @FindBy(xpath = "//*[@id=\"body\"]/form/div[2]/div[1]/div[1]/div/div/ul/li")
    public List<WebElement> brandsList;

    @FindBy(xpath = "//*[@id=\"body\"]/form/div[2]/div[2]/div[1]/div/button")
    public WebElement availabilitySelector;

    @FindBy(xpath = "//*[@id=\"body\"]/form/div[2]/div[2]/div[1]/div/div/ul/li")
    public List<WebElement> availabilityList;

    @FindBy(xpath = "//*[@id=\"body\"]/form/div[2]/div[6]/div[1]/div/button")
    public WebElement osSelector;

    @FindBy(xpath = "//*[@id=\"body\"]/form/div[2]/div[6]/div[1]/div/div/ul/li")
    public List<WebElement> osList;

    @FindBy(xpath = "//*[@id=\"body\"]/form/div[2]/div[6]/div[2]/div/button")
    public WebElement osVersionSelector;

    @FindBy(xpath = "//*[@id=\"body\"]/form/div[2]/div[6]/div[2]/div/div/ul/li")
    public List<WebElement> versionList;

    @FindBy(xpath = "//*[@id=\"body\"]/form/div[2]/div[14]/div[3]/label")
    public WebElement checkboxGPS;

    @FindBy(xpath = "//h3[contains(.,'General')]")
    public WebElement someSpaceUp;

    @FindBy(xpath = "//h3[contains(.,'Platform')]")
    public WebElement someSpaceDown;

    @FindBy(xpath = "//h3[contains(.,'Misc')]")
    public WebElement bottomPlace;

    @FindBy(xpath = "//*[@id=\"body\"]/form/div[4]/span/input")
    public WebElement showResultsButton;

    @FindBy(css = ".section-body")
    public WebElement finderResults;

    @FindBy(xpath = "//*[@id=\"review-body\"]/div/ul/li")
    public List<WebElement> resultsList;

    @FindBy(css = "#specs-list")
    public WebElement phoneSpecsList;

    @FindBy(xpath = "//*[@id=\"specs-list\"]/table[9]/tbody/tr[3]/td")
    public List<WebElement> commSpecsList;
}
