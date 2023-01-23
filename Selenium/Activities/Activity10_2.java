package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {
    public static void main(String args[]){

        System.setProperty("webdriver.gecko.driver","C:\\Users\\002OSE744\\Desktop\\JAVA\\my sel project\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println(driver.getTitle());

// Press the key of your first name in caps
        Actions act = new Actions(driver);
        act.keyDown(Keys.SHIFT).sendKeys("shireesha").build().perform();
        WebElement pressed_key=driver.findElement(By.id("keyPressed"));
        System.out.println(pressed_key.getText());
        act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        System.out.println(pressed_key.getText());






//        Press CTRL+a and the CTRL+c to copy all the text on the page.
//        (Paste the text in a text editor to verify results.)




    }




}
