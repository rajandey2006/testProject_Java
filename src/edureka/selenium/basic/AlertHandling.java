package edureka.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class AlertHandling {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\NewtonDeploy\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();
        driver1.get("http://www.popuptest.com/");

        String windowID = driver1.getWindowHandle();
        System.out.println(windowID); // gets the unique window ID which is assigned by Selenium to chrome session


        Set<String> handles = driver1.getWindowHandles(); // now handle contains a set of window IDs
        int handlecount = handles.size();
        int counter = 0;

        for(counter= 0;counter<handlecount; counter++)
        {

           // driver1.switchTo().window(handles);
            String url = driver1.getCurrentUrl();
            System.out.println(url);
            driver1.close();
        }

    }
}
