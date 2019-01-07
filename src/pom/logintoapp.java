package pom;

import org.openqa.selenium.WebDriver;

public class logintoapp {

    public static WebDriver driver = null;



    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\NewtonDeploy\\chromedriver_win32\\chromedriver.exe");
        driver.get("www.google.com");


    }

}
