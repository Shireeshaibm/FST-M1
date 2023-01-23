package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {


        public static void main(String args[]) throws InterruptedException {

            System.setProperty("webdriver.gecko.driver","C:\\Users\\002OSE744\\Desktop\\JAVA\\my sel project\\Drivers\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.training-support.net/selenium/dynamic-controls");

            System.out.println(driver.getTitle());

//        Use findElement() to find the checkbox input element.
            WebElement text_Box= driver.findElement(By.xpath("//div[@id='dynamicText']"));

            // Use the isDisplayed() method to check if it is visible on the page.

            if(text_Box.isEnabled()){

                System.out.println("textbox is enabled");
            }else{
                System.out.println("textbox  is not enabled");

            }
            // Click the "Remove Checkbox".

            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[contains(text(),'Enable Input')]")).click();

//    //Print the result of the isDisplayed() method again.
            if(text_Box.isEnabled()){

                System.out.println("textbox is enabled");
            }else{
                System.out.println("textbox  is not enabled");

            }


            driver.close();

        }



    }




