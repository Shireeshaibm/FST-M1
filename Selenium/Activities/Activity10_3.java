package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3 {

    public static void main(String args[]){

        System.setProperty("webdriver.gecko.driver","C:\\Users\\002OSE744\\Desktop\\JAVA\\my sel project\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/drag-drop");
        System.out.println(driver.getTitle());
        WebElement ball = driver.findElement(By.id("draggable"));
        WebElement dropzone1=driver.findElement(By.id("droppable"));
        WebElement dropzone2=driver.findElement(By.id("dropzone2"));

        WebDriverWait wait = new WebDriverWait(driver,20);

        Actions act_ball = new Actions(driver);

        act_ball.clickAndHold(ball).moveToElement(dropzone1).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(dropzone1,"background-color"));
        act_ball.clickAndHold(ball).moveToElement(dropzone2).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(dropzone2,"background-color"));


    }}
