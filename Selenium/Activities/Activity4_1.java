package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

    public static void main(String args[]){

        System.setProperty("webdriver.gecko.driver","C:\\Users\\002OSE744\\Desktop\\JAVA\\my sel project\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/");
        System.out.println(driver.getTitle());
        WebElement Abt_us= driver.findElement(By.xpath("//a[@id='about-link']"));
        Abt_us.click();
        System.out.println("new page title is "+driver.getTitle());

        driver.close();

    }
}
