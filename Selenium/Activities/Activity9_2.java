package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_2 {


    public static void main(String args[]){

        System.setProperty("webdriver.gecko.driver","C:\\Users\\002OSE744\\Desktop\\JAVA\\my sel project\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/selects");
        WebElement drop_dwn_multi = driver.findElement(By.cssSelector("#multi-select"));

        Select sel_multi= new Select(drop_dwn_multi);

//        Select the 'JavaScript' option by visible text.

        sel_multi.selectByVisibleText("Javascript");
//        Select the 'NodeJS' option by value.
        sel_multi.selectByValue("node");

//                Select the 4th, 5th, and the 6th options by index.
        sel_multi.selectByIndex(4);
        sel_multi.selectByIndex(5);
        sel_multi.selectByIndex(6);
//      Deselect the 'NodeJS' option by value attribute.
        sel_multi.deselectByValue("node");

//        Deselect the 7th option by index.
        sel_multi.selectByIndex(6);
//        Print the first selected option.
        System.out.println(sel_multi.getFirstSelectedOption().getText());
//        Print all selected options one by one and deselect all options.

        List<WebElement> allselects=sel_multi.getAllSelectedOptions();

        for(WebElement eles:allselects){

            System.out.println(eles.getText());
        }

        sel_multi.deselectAll();









}}

