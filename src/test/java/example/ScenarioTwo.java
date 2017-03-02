package example;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fob.pages.testpagetwo.BasePage;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.hamcrest.CoreMatchers.containsString;

public class ScenarioTwo {
    private BasePage basePage;
    private String locationName;
    private String suggestedValue;
    private String collectionStatus;
    private String collectionName;

    @Given("^open webpage$")
    public void openWebpage() throws Throwable {

        basePage = new BasePage();
        basePage.getDriver().manage().window().maximize();
        basePage.wait.until(ExpectedConditions.
                visibilityOf(basePage.searchBar.searchBarButton));
        basePage.searchBar.searchBarButton.click();
        Thread.sleep(1000);
    }

    @And("^user is signed in$")
    public void userIsSignedIn() throws Throwable {

        basePage.menuSection.signInButton.click();
        Thread.sleep(2000);

        basePage.getDriver().switchTo().frame(basePage.signInForm.frameBody);
        Assert.assertTrue(basePage.signInForm.frameBodyContainer.isDisplayed());

        basePage.signInForm.emailForm.sendKeys("md_test@test.test");
        Thread.sleep(1000);

        basePage.signInForm.passwordForm.sendKeys("A123456a");
        Thread.sleep(1000);

        basePage.signInForm.rememberCheckbox.click();

        basePage.signInForm.signInButton.click();
        Thread.sleep(1000);
    }

    @Then("^search for an address from map$")
    public void searchForAnAddressFromMap() throws Throwable {

        locationName = "Astangu 56";
        basePage.searchBar.inputSearchField.sendKeys(locationName);
        Thread.sleep(3000);
    }

    @When("^the address is found$")
    public void theAddressIsFound() throws Throwable {

        suggestedValue = basePage.locationsPanel.suggestionList.get(0).getText();
        basePage.locationsPanel.suggestionList.get(0).click();

        Thread.sleep(3000);
    }

    @Then("^collect a star for it$")
    public void collectAStarForIt() throws Throwable {

        basePage.directionsPanel.starButton.click();
    }

    @And("^start a new collection$")
    public void startANewCollection() throws Throwable {

        Assert.assertTrue(basePage.collectionPage.modalContainer.isDisplayed());
        basePage.wait.until(ExpectedConditions.visibilityOf(basePage.collectionPage.startCollection));

        basePage.collectionPage.startCollection.click();
        Assert.assertTrue(basePage.collectionPage.collectionForm.isDisplayed());

        collectionName = "Cool place";
        basePage.collectionPage.collectionInputName.sendKeys(collectionName);
        basePage.wait.until(ExpectedConditions.visibilityOf(basePage.collectionPage.collectionCreateButton));

        basePage.collectionPage.collectionCreateButton.click();

        basePage.wait.until(ExpectedConditions.visibilityOf(basePage.collectionPage.collectionCardContent));

        basePage.collectionPage.collectionDone.click();
        Thread.sleep(5000);

        collectionStatus = basePage.directionsPanel.starButton.getAttribute("class");
        Assert.assertEquals(collectionStatus, "active");
    }

    @When("^done open then your collection$")
    public void doneOpenThenYourCollection() throws Throwable {

        basePage.searchBar.searchBarButton.click();
        Thread.sleep(1000);

        basePage.searchBar.openCollectionsButton.click();
        Thread.sleep(1000);
    }

    @And("^verify that collected place exists$")
    public void verifyThatCollectedPlaceExists() throws Throwable {

        Assert.assertTrue(basePage.collectionPage.collectionList.isDisplayed());
        Assert.assertEquals(basePage.collectionPage.collectionLinkButton.getAttribute("title"), collectionName);

        basePage.collectionPage.collectionLinkButton.click();
        Thread.sleep(1000);

        Assert.assertTrue(basePage.collectionPage.collectionCard.isDisplayed());
        Assert.assertThat(basePage.collectionPage.collectionCardLocationName.getText(), containsString(locationName));
    }

    @And("^remove all existing collections to start over$")
    public void removeAllExistingCollectionsToStartOver() throws Throwable {

        basePage.collectionPage.showAllCollectionsButton.click();
        Thread.sleep(1000);

        Assert.assertTrue(basePage.collectionPage.collectionList.isDisplayed());

        basePage.collectionPage.collectionEditButton.click();
        basePage.collectionPage.collectionDeleteButton.click();
        basePage.collectionPage.collectionDeletionConfirmationButton.click();

        basePage.wait.until(ExpectedConditions.
                visibilityOf(basePage.collectionPage.emptyCollectionList));

        basePage.searchBar.searchBarButton.click();
        Thread.sleep(1000);

        basePage.menuSection.signOutButton.click();
        Thread.sleep(1000);

        basePage.getDriver().close();
        basePage.getDriver().quit();
    }
}
