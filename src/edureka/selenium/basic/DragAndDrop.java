package edureka.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/* for drag and drop and other many other functionalities, we need to use special class called "Action" class

 */

public class DragAndDrop {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\NewtonDeploy\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
        WebElement b1 = ((ChromeDriver) driver).findElementByXPath("//h1[text()='Block 1']");

        WebElement b3 = ((ChromeDriver) driver).findElementByXPath("//h1[text()='Block 3']");



        Actions actions = new Actions(driver);
        actions.dragAndDrop(b1,b3).perform();



    }

}
