package edureka.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


// We have used the following methods - selectByValue, selectByVisibleText, selectByIndex, deselect, isMultiple()




public class Multiselectlistbox {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\NewtonDeploy\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/newtours/register.php");

        WebElement listbox = ((ChromeDriver) driver).findElementByName("country");
        Select optselect = new Select(listbox);

        optselect.selectByIndex(1);
        optselect.selectByVisibleText("ARGENTINA");
        optselect.selectByValue("ANTARCTICA");

        System.out.println(optselect.isMultiple());

    }
}