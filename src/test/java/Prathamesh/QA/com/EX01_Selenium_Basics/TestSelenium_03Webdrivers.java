package Prathamesh.QA.com.EX01_Selenium_Basics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium_03Webdrivers {
    public static void main(String[] args) {

        // SearchContext(I)
        // -> WebDriver(I)
        // -> RemoteWebDriver(C)
        // -> ChromiumDriver(C)
        // -> ChromeDriver(C) , EdgeDriver(C) , BraveBrowser (

        SearchContext SC= new EdgeDriver();
        SearchContext driver1 = new FirefoxDriver();

    }
}
