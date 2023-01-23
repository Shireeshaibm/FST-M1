package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_1 {

    public static void main(String args[]) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\002OSE744\\Desktop\\JAVA\\my sel project\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println(driver.getTitle());
        WebElement simple_Alert = driver.findElement(By.cssSelector("#simple"));
        simple_Alert.click();
        System.out.println(driver.switchTo().alert().getText());
        //driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
    }}