package fob.pages.testpageone.pageobject.first;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@FindBy(css = "#searchbar")
public class SearchBar {

    @FindBy(css = ".menu_access_btn.icon_btn")
    public WebElement searchBarButton;

}
