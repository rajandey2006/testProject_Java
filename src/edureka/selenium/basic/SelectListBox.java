package edureka.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// For the single select dropdown listbox we use the following class and methods -
// Class -   Select, Collections
// Methods - getOptions(); alloptions(); getText(); add(); ArrayList<>, size(), sort()


public class SelectListBox {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\NewtonDeploy\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/newtours/register.php");

        WebElement listbox = ((ChromeDriver) driver).findElementByName("country");
        Select osel = new Select(listbox);

        /*osel.selectByValue("ARGENTINA"); // selectbyValue
        System.out.println("ARGENTINA selected");
        selectList.selectByIndex(0); // selectbyIndex
        System.out.println("Index 0 selected");
        selectList.selectByVisibleText("BAHAMAS"); // selectByVisibleTextd
        System.out.println("Bahamas selected"); */


        // Q1 - counting number of 'options' in a list box / dropdown box

        List<WebElement> optionlist = osel.getOptions();
        ArrayList<String> allText = new ArrayList<>();

        int sizeoflistoptions = optionlist.size();
        System.out.println("The number of list options is " +sizeoflistoptions);

        // Q2 - fetching all the options from the listbox and sorting them


        for(int i=0;i<sizeoflistoptions;i++){

            String text = optionlist.get(i).getText();
            System.out.println(text);
            allText.add(text); // allText is an arraylist which will keep storing text
        }

        Collections.sort(allText);
        System.out.println("The sorted text is as below" +allText);
        System.out.println("The third country is " +allText.get(3));
    }


}
