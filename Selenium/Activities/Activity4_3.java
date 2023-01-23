package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity4_3 {

    public static void main(String args[]){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\002OSE744\\Desktop\\JAVA\\my sel project\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
        System.out.println(driver.getTitle());
       // Find the third header on the page.
        WebElement third_header =driver.findElement(By.xpath("//h3[@class='ui yellow header']"));
        //Find the fifth header on the page and get it's 'colour' CSS Property.
        WebElement fifth_header =driver.findElement(By.xpath("//h5"));
       System.out.println(fifth_header.getCssValue("color"));

       //Find the violet button on the page and print all the class attribute values.

        WebElement violet_button =driver.findElement(By.xpath("//button[contains(text(),'Violet')]"));
        System.out.println(violet_button.getAttribute("class"));

        //Find the grey button on the page with Absolute XPath.

        WebElement grey_btn =driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div[2]/div[3]/button[2]"));

        System.out.println(grey_btn.getText());
        driver.close();




    }

}
