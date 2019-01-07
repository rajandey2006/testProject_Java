package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyClass {

    public static void main(String[] args) {
        // declaration and instantiation of objects/variables

        //System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();

        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\NewtonDeploy\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://test.salesforce.com/";
        String expectedTitle = "Login | Salesforce";
        String expectedTitle1 = "Salesforce - Enterprise Edition";
        //String actTitle ="";


        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                       // get the actual value of the title
        //actTitle = driver.getTitle();
        //System.out.println(driver.getTitle());

        if (driver.getTitle().contentEquals(expectedTitle)){
            System.out.println(" Result1: Test Passed!");
        } else {
            System.out.println(" Result1: Test Failed");
        }


        WebElement Username = ((ChromeDriver) driver).findElementById("username");
        WebElement Password = ((ChromeDriver) driver).findElementByName("pw");
        WebElement Login = ((ChromeDriver) driver).findElementById("Login");

        Username.sendKeys("rajan.dey@newtoneurope.com.ffdev");
        Password.sendKeys("Dev%2018");
        Login.click();


        //System.out.print(driver.getTitle());

        if(driver.getTitle().contentEquals(expectedTitle1)) {
            System.out.println("Result2: Hurrah !!! Logged in successfully");
        } else {
            System.out.println("Result2: Login failure");

        }


        WebElement ExpenseEntry = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"sidebarDiv\"]/div[2]/div[2]/ul/li[5]/a");
        ExpenseEntry.click();
        ExpenseEntry.click();

        WebElement AddNewRows = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"expPage:expEntryForm:itemsBlock:pbb\"]/input[1]");


        WebElement selectProject = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"expPage:expEntryForm:itemsBlock:j_id84:tblRepeat:0:assignmentnamePanel\"]");
        selectProject.click();

        WebElement search = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"assigORProjSearchString\"]");
        search.sendKeys("Ainscough Crane Hire Ltd : AINS001 - Operating Model Assessment");

        WebElement Go = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"assigOverlay_Go_Button\"]");
        Go.click();

        //driver.close();

    }
}
