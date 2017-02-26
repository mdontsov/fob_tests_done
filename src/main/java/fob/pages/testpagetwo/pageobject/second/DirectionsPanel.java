package fob.pages.testpagetwo.pageobject.second;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@FindBy(css = ".panel.show.initialized.pdc_collapsed.directions")
public class DirectionsPanel {

    @FindBy(xpath = "//button[@title='Collect']")
    public WebElement starButton;
}
