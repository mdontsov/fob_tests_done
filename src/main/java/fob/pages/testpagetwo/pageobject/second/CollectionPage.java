package fob.pages.testpagetwo.pageobject.second;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@FindBy(css = ".main_container")
public class CollectionPage {

    @FindBy(css = ".modal")
    public WebElement modalContainer;

    @FindBy(xpath = "//button[contains(.,'Start a collection')]")
    public WebElement startCollection;

    @FindBy(xpath = "//*[@name='hereCreateCollection']")
    public WebElement collectionForm;

    @FindBy(css = "#collection_name")
    public WebElement collectionInputName;

    @FindBy(xpath = "//button[contains(.,'Create')]")
    public WebElement collectionCreateButton;

    @FindBy(css = ".card_content")
    public WebElement collectionCardContent;

    @FindBy(xpath = "//button[contains(.,'Done')]")
    public WebElement collectionDone;

    @FindBy(css = ".collections_rows")
    public WebElement collectionList;

    @FindBy(xpath = "//a[@data-ng-bind='collection.name']")
    public WebElement collectionLinkButton;

    @FindBy(css = ".place_card")
    public WebElement collectionCard;

    @FindBy(xpath = "//h4[@class='title']")
    public WebElement collectionCardLocationName;

    @FindBy(xpath = "//button[contains(.,'Show all collections')]")
    public WebElement showAllCollectionsButton;

    @FindBy(xpath = "//button[@title='Edit']")
    public WebElement collectionEditButton;

    @FindBy(css = ".btn_delete")
    public WebElement collectionDeleteButton;

    @FindBy(css = ".btn_link.confirm")
    public WebElement collectionDeletionConfirmationButton;

    @FindBy(css = ".empty_notice.landing_page")
    public WebElement emptyCollectionList;
}
