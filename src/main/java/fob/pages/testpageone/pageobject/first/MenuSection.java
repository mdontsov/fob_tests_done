package fob.pages.testpageone.pageobject.first;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@FindBy(css = ".menu_section")
public class MenuSection {

    @FindBy(css = ".menu_item a.menu_button.with_icon.option_directions")
    public WebElement menuDirectionButton;
}
