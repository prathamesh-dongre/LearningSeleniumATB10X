package Prathamesh.QA.com.EX01_Selenium_Basics.Katlonautomate;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class TestSelenium_03_KatlonBasic {

    public static void main(String[] args) {
        // Setup ChromeDriver using WebDriverManager
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Open site and maximize window
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        // Explicit wait setup
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        // Click "Make Appointment" button
        WebElement makeAppointment = wait.until(ExpectedConditions.elementToBeClickable(By.id("btn-make-appointment")));
        makeAppointment.click();

        // Wait for login input to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt-username")));


        WebElement Username= driver.findElement(By.xpath("//input[@placeholder='Username'] "));
        // System.out.println("Login form is visible!");
         Username.sendKeys("John Doe");
        // Close browser
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


       // driver.quit();

    }
}
