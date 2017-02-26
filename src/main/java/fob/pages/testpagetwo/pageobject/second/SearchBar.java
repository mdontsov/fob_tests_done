package fob.pages.testpagetwo.pageobject.second;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@FindBy(css = "#searchbar")
public class SearchBar {

    @FindBy(css = ".menu_access_btn.icon_btn")
    public WebElement searchBarButton;

    @FindBy(css = ".input_search")
    public WebElement inputSearchField;

    @FindBy(xpath = "//a[@href='/collections']")
    public WebElement openCollectionsButton;

}
