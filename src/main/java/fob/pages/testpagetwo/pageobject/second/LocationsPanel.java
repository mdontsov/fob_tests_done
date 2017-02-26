package fob.pages.testpagetwo.pageobject.second;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@FindBy(css = ".panel.show.initialized.pdc_collapsed.minimized.landing_page")
public class LocationsPanel {

    @FindBy(css = ".dropdown_list_item.suggestion")
    public List<WebElement> suggestionList;

}
