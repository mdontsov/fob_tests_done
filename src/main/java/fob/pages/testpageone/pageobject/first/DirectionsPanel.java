package fob.pages.testpageone.pageobject.first;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@FindBy(css = ".panel.show.initialized.pdc_collapsed.directions")
public class DirectionsPanel {

    @FindBy(css = "#itinerary_item_input_0")
    public WebElement inputFromField;

    @FindBy(css = "#itinerary_item_input_1")
    public WebElement inputToField;

    @FindBy(css = ".dropdown_list_item.hovered.suggestion")
    public WebElement suggestedValue;
}
