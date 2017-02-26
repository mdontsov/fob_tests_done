package fob.pages.testpagetwo.pageobject.second;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@FindBy(css = ".menu_content")
public class MenuSection {

    @FindBy(css = ".sign_in_out.sign_in_button")
    public WebElement signInButton;

    @FindBy(css = ".sign_in_out.sign_out_button")
    public WebElement signOutButton;
}
