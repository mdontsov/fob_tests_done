package fob.pages.testpageone.pageobject.first;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@FindBy(css = ".route_planner")
public class RoutePlannerResult {

    @FindBy(css = "#route_view")
    public WebElement routeView;

    @FindBy(css = ".route_card_car.route_list_result")
    public WebElement driveResult;

    @FindBy(css = ".route_card_bicycle.route_list_result")
    public WebElement bicycleResult;

    @FindBy(css = ".route_card")
    public WebElement transportResult;

    @FindBy(css = ".route_card_pedestrian.route_list_result")
    public WebElement walkResult;

    @FindBy(css = ".route_card_information")
    public List<WebElement> allRoutesInformation;
}
