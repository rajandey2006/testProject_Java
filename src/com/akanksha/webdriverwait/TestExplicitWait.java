package com.akanksha.webdriverwait;

import com.akanksha.selenium.TestGetCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestExplicitWait {

    WebDriver driver;
    WebDriverWait myWait;

    public void getCommands() {
        try {
            System.out.println("The title of the current page is " + driver.getTitle());
            System.out.println("The current url of the page is " + driver.getCurrentUrl());
            driver.navigate().to("https://www.hotukdeals.com/?page=2");
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().forward();
            Thread.sleep(2000);
            driver.navigate().refresh();

            // System.out.println(driver.getPageSource());
            // System.out.println(driver.getWindowHandle());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void validate() {
            myWait = new WebDriverWait(driver, 10);
            myWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[1]/div[1]/div/div[1]/div[3]/div[1]/div/i[1]"))));

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[1]/div[1]/div/div[1]/div[3]/div[1]/div/i[1]")).click();
        }

        public static void main (String[]args){
            TestGetCommands tgc = new TestGetCommands();
            TestExplicitWait vexplicitwait = new TestExplicitWait();
            tgc.invokeBrowser();
            tgc.getCommands();
            //tgc.teardown();
            vexplicitwait.validate();


        }
    }
