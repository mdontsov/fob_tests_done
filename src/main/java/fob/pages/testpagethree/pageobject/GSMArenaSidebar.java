package fob.pages.testpagethree.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@FindBy(css = ".sidebar.col.left")
public class GSMArenaSidebar {

    @FindBy(css = ".brandmenu-v2.light.l-box.clearfix")
    public WebElement PhoneFinderMenu;

    @FindBy(css = ".pad-single.pad-finder")
    public WebElement phoneFinderButton;
}
