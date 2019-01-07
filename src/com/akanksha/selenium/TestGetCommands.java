package com.akanksha.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestGetCommands {
    WebDriver driver;
    public String url = "https://paytm.com/";

    public void invokeBrowser() {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\NewtonDeploy\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

    }

    public void getCommands() {
        //try
        {
            driver.get(url);
            System.out.println("The title of the current page is " + driver.getTitle());
            System.out.println("The current url of the page is " + driver.getCurrentUrl());
            // driver.navigate().to("https://www.hotukdeals.com/?page=2");
            // driver.navigate().back();
            //  Thread.sleep(2000);
            // driver.navigate().forward();
            // Thread.sleep(2000);
            //  driver.navigate().refresh();

            // System.out.println(driver.getPageSource());
            // System.out.println(driver.getWindowHandle());
        //} //catch (InterruptedException e) {
        // e.printStackTrace();
    }

}


     public void teardown(){
        driver.close();
        //driver.quit();
     }

    public static void main(String[] args) {
        TestGetCommands tgc = new TestGetCommands();
        tgc.invokeBrowser();
        tgc.getCommands();
        tgc.teardown();



    }


}
