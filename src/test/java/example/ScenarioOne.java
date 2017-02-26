package example;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fob.pages.testpageone.BasePage;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

public class ScenarioOne {
    private BasePage basePage;

    @Given("^webpage is opened$")
    public void webpageIsOpened() throws Throwable {

        basePage = new BasePage();
        basePage.getDriver().manage().window().maximize();
        basePage.searchBar.searchBarButton.click();
        Thread.sleep(1000);
    }

    @When("^directions is selected$")
    public void directionsIsSelected() throws Throwable {

        basePage.menuSection.menuDirectionButton.click();
        Thread.sleep(1000);
    }

    @And("^starting point is set$")
    public void startingPointIsSet() throws Throwable {

        basePage.directionsPanel.inputFromField.click();
        basePage.directionsPanel.inputFromField.sendKeys("Nisu 32 Tallinn");
        Thread.sleep(5000);
        basePage.directionsPanel.suggestedValue.click();
    }

    @And("^destination point is set$")
    public void destinationPointIsSet() throws Throwable {

        basePage.directionsPanel.inputToField.click();
        basePage.directionsPanel.inputToField.sendKeys("Paldiski mnt 29 Tallinn");
        Thread.sleep(5000);
        basePage.directionsPanel.suggestedValue.click();
    }

    @Then("^different route options are calculated and shown$")
    public void differentRouteOptionsAreCalculatedAndShown() throws Throwable {

        basePage.wait.until(ExpectedConditions.
                visibilityOf(basePage.routePlannerResult.routeView));

        Assert.assertTrue(basePage.routePlannerResult.driveResult.isDisplayed());
        Assert.assertTrue(basePage.routePlannerResult.bicycleResult.isDisplayed());
        Assert.assertTrue(basePage.routePlannerResult.transportResult.isDisplayed());
        Assert.assertTrue(basePage.routePlannerResult.walkResult.isDisplayed());

        assertThat(basePage.routePlannerResult.allRoutesInformation.isEmpty(), is(false));

        Thread.sleep(10000);

        basePage.getDriver().close();
        basePage.getDriver().quit();
    }
}
