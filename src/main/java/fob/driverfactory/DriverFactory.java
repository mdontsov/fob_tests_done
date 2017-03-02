package fob.driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DriverFactory {

    protected static WebDriver webDriver;

    public DriverFactory() {
        System.setProperty("webdriver.chrome.driver", "bin/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--dns-prefetch-disable");
        this.webDriver = new ChromeDriver(chromeOptions);
    }
}
