package com.akanksha.KeyboardMouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

// Objective -- Mouse and keyboard actions explained
// Launching facebook.com and then clicking on username field, keeping the shift key down, enter user name in capital, release shift key, right click on the element and performing some basic mouse operations

public class KeyBoardMouseActions {

    WebDriver driver;
    Actions myAction;
    Action myseriesofAction;

    String url = "https://login.yahoo.com/";

    public void invokeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\NewtonDeploy\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get(url);
    }

    public void testKeyboardMouseAction(){
        myAction = new Actions(driver);
        myseriesofAction = myAction.moveToElement(driver.findElement(By.xpath("//*[@id=\"login-username\"]"))).click().keyDown(Keys.LEFT_SHIFT).sendKeys("rajan").keyUp(Keys.LEFT_SHIFT).doubleClick().contextClick().build();
        myseriesofAction.perform();
    }

    public static void main (String[]args){
        KeyBoardMouseActions myObj = new KeyBoardMouseActions();
        myObj.invokeBrowser();
        myObj.testKeyboardMouseAction();


    }
}
