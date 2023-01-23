package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class Activity11_4 {

    public static void main(String args[]) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\002OSE744\\Desktop\\JAVA\\my sel project\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/tab-opener");
        System.out.println(driver.getTitle());
        String parent_handle=driver.getWindowHandle();
        WebElement click_me_btn=driver.findElement(By.xpath("//a[contains(text(),'Click Me!')]"));
        click_me_btn.click();

        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        Set<String> all_windows= driver.getWindowHandles();
        System.out.println(all_windows);
        for(String handle : driver.getWindowHandles()){

            driver.switchTo().window(handle);
        }
        System.out.println(driver.getWindowHandle());
        wait.until(ExpectedConditions.titleIs("Newtab"));
        //to print the new tab title
        System.out.println(driver.getTitle());

        WebElement another_tab = driver.findElement(By.xpath("//a[contains(text(),'Open Another One!')]"));
        another_tab.click();

        WebElement heading = driver.findElement(By.cssSelector("div.content"));



        //Open Another Tab
        driver.findElement(By.linkText("Open Another One!")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));

        //Make sure the new tab's handle is part of the handles set
      Set<String>  allWindowHandles = driver.getWindowHandles();
        System.out.println("All window handles: " + allWindowHandles);

        //Loop through the handles set till we get to the newest handle
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        //Print the handle of the current window
        System.out.println("New tab handle: " + driver.getWindowHandle());

        //Wait for the newest tab to load completely
        wait.until(ExpectedConditions.titleIs("Newtab2"));

        //Print New Tab Title
        System.out.println("New Tab Title is: " + driver.getTitle());

        //Get heading on new page
       String newTabText = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("New tab heading is: " + newTabText);

        //Close the browser
        driver.quit();






    }}
