package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {

    public static void main(String args[]) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\002OSE744\\Desktop\\JAVA\\my sel project\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println(driver.getTitle());
        WebElement prompt_button = driver.findElement(By.cssSelector("#prompt"));
        prompt_button.click();
        Alert prompt_alert = driver.switchTo().alert();
        prompt_alert.sendKeys("Yes, you are!");
        prompt_alert.accept();

    }}
