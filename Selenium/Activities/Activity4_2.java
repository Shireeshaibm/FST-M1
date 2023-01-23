package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity4_2 {

    public static void main(String args[]){

        System.setProperty("webdriver.gecko.driver","C:\\Users\\002OSE744\\Desktop\\JAVA\\my sel project\\Drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        System.out.println("Title of the page is "+driver.getTitle());

        WebElement First_name =driver.findElement(By.xpath("//input[@id='firstName']"));
        First_name.sendKeys("sharukh");
        WebElement Last_name =driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
        Last_name.sendKeys("khan");
        WebElement email_id =driver.findElement(By.xpath("//input[@type='email']"));
        email_id.sendKeys("sharukh@gmail.com");
        WebElement Contact_number =driver.findElement(By.xpath("//input[@type='tel']"));
        Contact_number.sendKeys("8922325243");
        WebElement message =driver.findElement(By.xpath("//textarea"));

        message.sendKeys("ooohooo");
        WebElement submit_btn =driver.findElement(By.xpath("//input[@value='submit']"));

        submit_btn.submit();





    }




}
