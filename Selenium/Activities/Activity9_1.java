package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1 {

    public static void main(String args[]){

        System.setProperty("webdriver.gecko.driver","C:\\Users\\002OSE744\\Desktop\\JAVA\\my sel project\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/selects");
        WebElement drop_dwn = driver.findElement(By.cssSelector(".ui.selection.dropdown"));

        Select sel = new Select(drop_dwn);
//        Select the second option using selectByVisibleText()
        sel.selectByVisibleText("Option 2");

//        Select the third option using selectByIndex()

         sel.selectByIndex(3);
//        Select the fourth option using selectByValue()
        sel.selectByValue("4");

//        Finally, get all the options in the dropdown and print them one by one.
       List<WebElement> drp_dwn_values=sel.getOptions();

        for(WebElement ele:drp_dwn_values){
            System.out.println(ele.getText());

        }







    }
}
