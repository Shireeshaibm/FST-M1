package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

    public static void main(String args[]){

    System.setProperty("webdriver.gecko.driver","C:\\Users\\002OSE744\\Desktop\\JAVA\\my sel project\\Drivers\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.get("https://www.training-support.net/selenium/input-events");
    System.out.println(driver.getTitle());
//  Left click and print the value of the side in the front.
     Actions act = new Actions(driver);
     WebElement cube =driver.findElement(By.id("wrapD3Cube"));
     //cube.getText();
        act.click(cube).build().perform();
        WebElement cube_val = driver.findElement(By.xpath("//div[@class='active']"));
        System.out.println(cube_val.getText());
        // Double click to show a random side and print the number.
       act.doubleClick(cube).build().perform();

       // Right click and print the value shown on the front of the cube.
        cube_val = driver.findElement(By.xpath("//div[@class='active']"));

        System.out.println(cube_val.getText());

        act.contextClick(cube).build().perform();

        cube_val = driver.findElement(By.xpath("//div[@class='active']"));

        System.out.println(cube_val.getText());

}}
