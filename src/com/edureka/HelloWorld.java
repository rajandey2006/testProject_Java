package com.edureka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {


    public static void main(String[] args) {

        System.out.println(" Hello World : this is the first program");
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\NewtonDeploy\\chromedriver_win32\\chromedriver.exe");
        // WebDriver is an interface
        // By new, we are instantiating ChromeDriver class, so that we can use the functions like manage(), maximize() etc
       // WebDriver driver = new FirefoxDriver();

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.getTitle();
        System.out.println("The webpage tile is: " +driver.getTitle());
      }
}
