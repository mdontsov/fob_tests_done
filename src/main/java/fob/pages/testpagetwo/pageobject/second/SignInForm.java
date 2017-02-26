package fob.pages.testpagetwo.pageobject.second;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@FindBy(css = "#sign-in-form")
public class SignInForm {

    @FindBy(css = "#here-account-sdk")
    public WebElement frameBody;

    @FindBy(css = "#container-body")
    public WebElement frameBodyContainer;

    @FindBy(css = "#inputs #sign-in-email")
    public WebElement emailForm;

    @FindBy(css = "#inputs #sign-in-password-encrypted")
    public WebElement passwordForm;

    @FindBy(xpath = "//input[@id='sign-in-remember-me']")
    public WebElement rememberCheckbox;

    @FindBy(xpath = "//button[@data-ng-click='signIn()']")
    public WebElement signInButton;
}
