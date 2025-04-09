package Prathamesh.QA.com.EX01_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.sql.Driver;

public class TestSelenium_02 {

    public static  void main(String[] args) throws InterruptedException {

        ChromeDriver Chromium = new ChromeDriver();
        Chromium.get("https://www.facebook.com/");
        Chromium.manage().window().maximize();

        WebElement Forgetpass = Chromium.findElement(By.xpath("//a[contains(@href, 'www.facebook.com/recover/initiate/')]"));
        Forgetpass.click();
        Thread.sleep(5000);


        Assert.assertEquals(Chromium.getCurrentUrl(),"https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");

        //Chromium.quit();





    }
}
