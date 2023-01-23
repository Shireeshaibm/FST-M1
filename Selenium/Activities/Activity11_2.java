package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {

    public static void main(String args[]) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\002OSE744\\Desktop\\JAVA\\my sel project\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println(driver.getTitle());
        WebElement confirm_button = driver.findElement(By.cssSelector("#confirm"));
        confirm_button.click();
        Alert confirm_alert = driver.switchTo().alert();
        System.out.println(confirm_alert.getText());
        confirm_alert.accept();
        confirm_button.click();
        System.out.println(driver.switchTo().alert().getText());
        confirm_alert.dismiss();
    }}