package example;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fob.pages.testpagethree.BasePage;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ScenarioThree {
    private BasePage basePage;

    @When("^phone finder page is opened$")
    public void phoneFinderPageIsOpened() throws Throwable {

        basePage = new BasePage();
        basePage.getDriver().manage().window().maximize();
        basePage.wait.until(ExpectedConditions.
                visibilityOf(basePage.gsmArenaSidebar.PhoneFinderMenu));
        basePage.gsmArenaSidebar.phoneFinderButton.click();
        basePage.wait.until(ExpectedConditions.
                visibilityOf(basePage.gsmArenaSearchPage.phoneFinderForm));
    }

    @And("^select phone with some specs and show results$")
    public void selectPhoneWithSomeSpecsAndShowResults() throws Throwable {

        //Brand
        basePage.gsmArenaSearchPage.brandSelector.click();
        Thread.sleep(2000);

        //Alcatel
        basePage.gsmArenaSearchPage.brandsList.get(1).click();
        Thread.sleep(2000);

        //Click outside
        basePage.gsmArenaSearchPage.someSpaceUp.click();
        Thread.sleep(2000);

        //Availability
        basePage.gsmArenaSearchPage.availabilitySelector.click();
        Thread.sleep(2000);

        //Available
        basePage.gsmArenaSearchPage.availabilityList.get(0).click();
        Thread.sleep(2000);

        //Click outside
        basePage.gsmArenaSearchPage.someSpaceUp.click();
        Thread.sleep(2000);

        //Scroll down on page
        ((JavascriptExecutor)basePage.getDriver()).
                executeScript("arguments[0].scrollIntoView(true);",
                        basePage.gsmArenaSearchPage.someSpaceDown);

        //OS
        basePage.gsmArenaSearchPage.osSelector.click();
        Thread.sleep(2000);

        //Android
        basePage.gsmArenaSearchPage.osList.get(1).click();
        Thread.sleep(2000);

        //Click outside
        basePage.gsmArenaSearchPage.someSpaceDown.click();
        Thread.sleep(2000);

        //OS version
        basePage.gsmArenaSearchPage.osVersionSelector.click();
        Thread.sleep(2000);

        //Android 6.0 Marshmallow
        basePage.gsmArenaSearchPage.versionList.get(10).click();
        Thread.sleep(2000);

        //Click outside
        basePage.gsmArenaSearchPage.someSpaceDown.click();
        Thread.sleep(2000);

        //Select GPS
        basePage.gsmArenaSearchPage.checkboxGPS.click();
        Thread.sleep(2000);

        //Scroll to page bottom
        ((JavascriptExecutor)basePage.getDriver()).
                executeScript("arguments[0].scrollIntoView(true);",
                        basePage.gsmArenaSearchPage.bottomPlace);

        //Show results
        basePage.gsmArenaSearchPage.showResultsButton.click();
        basePage.wait.until(ExpectedConditions.
                visibilityOf(basePage.gsmArenaSearchPage.finderResults));
    }

    @Then("^selected phone details are shown with gps support listed$")
    public void selectedPhoneDetailsAreShownWithGpsSupportListed() throws Throwable {

        //Select 'alcatel Idol 4'
        basePage.gsmArenaSearchPage.resultsList.get(2).click();
        basePage.wait.until(ExpectedConditions.
                visibilityOf(basePage.gsmArenaSearchPage.phoneSpecsList));

        //Verify that GPS is supported
        Assert.assertTrue(basePage.gsmArenaSearchPage.commSpecsList.get(0).getText().contains("GPS"));
        Assert.assertTrue(basePage.gsmArenaSearchPage.commSpecsList.get(1).getText().contains("Yes"));

        basePage.getDriver().close();
        basePage.getDriver().quit();
    }
}
