package Prathamesh.QA.com.EX01_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium_01 {

    @Test
    public void test_VerifyVWOLogin() {
        // Write the code which will execute the perform the ui interactions
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getSessionId());
        System.out.println(driver.getTitle());
        driver.quit();
    }

}
