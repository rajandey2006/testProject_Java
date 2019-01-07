package edureka.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\NewtonDeploy\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Frames.html");

        ((ChromeDriver) driver).findElementByXPath("//a[@href='#Multiple']").click();

        WebElement Multiframe = ((ChromeDriver) driver).findElementByXPath("//iframe[@src='MultipleFrames.html']");
        driver.switchTo().frame(Multiframe);
        driver.switchTo().frame(0);

        ((ChromeDriver) driver).findElementByXPath("//input[@type='text']").sendKeys("Rajan Dey");

    }

}
