package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

    public static void main(String args[]){

        System.setProperty("webdriver.gecko.driver","C:\\Users\\002OSE744\\Desktop\\JAVA\\my sel project\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/dynamic-controls");

        System.out.println(driver.getTitle());

//        Use findElement() to find the checkbox input element.
        WebElement Chk_Box= driver.findElement(By.cssSelector(".willDisappear"));

        // Use the isDisplayed() method to check if it is visible on the page.

       if(Chk_Box.isDisplayed()){

           System.out.println("check box is visible");
       }else{
           System.out.println("check box element is not visible");

       }
     // Click the "Remove Checkbox".

        WebElement rmv_Chkbox= driver.findElement(By.xpath("//button[contains(text(),'Remove checkbox')]"));

       rmv_Chkbox.click();

//    //Print the result of the isDisplayed() method again.

        if(Chk_Box.isDisplayed()){

            System.out.println("check box is visible");
        }else{
            System.out.println("check box element is not visible");

        }

    }



}
