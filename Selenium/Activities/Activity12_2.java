package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_2 {

    public static void main(String args[]){

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\002OSE744\\Desktop\\JAVA\\my sel project\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/nested-iframes");
        System.out.println(driver.getTitle());
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        String frame1_heading = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println(frame1_heading);
        driver.switchTo().parentFrame();
        driver.switchTo().frame(1);
        String frame2_heading = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println(frame2_heading);



    }}
