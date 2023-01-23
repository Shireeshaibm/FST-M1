package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Activity6_1 {

    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\002OSE744\\Desktop\\JAVA\\my sel project\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());
        WebElement toggle_btn = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
        toggle_btn.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement chk_box=driver.findElement(By.cssSelector(".willDisappear"));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".willDisappear")));

        toggle_btn.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".willDisappear")));

        //driver.close();

    }
}
