package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_1 {
    public static void main(String args[]){

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\002OSE744\\Desktop\\JAVA\\my sel project\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/iframes");
        System.out.println(driver.getTitle());

        driver.switchTo().frame(0);
        String frame1_heading = driver.findElement(By.cssSelector("div.content")).getText();

        System.out.println(frame1_heading);

        WebElement button_frame1 =driver.findElement(By.cssSelector("#actionButton"));

        String button_text = driver.findElement(By.cssSelector("#actionButton")).getText();
        String button_color =driver.findElement(By.cssSelector("#actionButton")).getCssValue("color");

        System.out.println(button_text+" "+button_color);
        button_frame1.click();

        String button_text_a = driver.findElement(By.cssSelector("#actionButton")).getText();
        String button_color_a =driver.findElement(By.cssSelector("#actionButton")).getCssValue("color");

        System.out.println(button_text_a+" "+button_color_a);
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        String frame2_heading = driver.findElement(By.cssSelector("div.content")).getText();

        System.out.println(frame2_heading);

        WebElement button_frame2 =driver.findElement(By.cssSelector("#actionButton"));

        String button_text_2 = driver.findElement(By.cssSelector("#actionButton")).getText();
        String button_color_2 =driver.findElement(By.cssSelector("#actionButton")).getCssValue("color");

        System.out.println(button_text_2+" "+button_color_2);

        button_frame2.click();

        String button_text_a2 = driver.findElement(By.cssSelector("#actionButton")).getText();
        String button_color_a2 =driver.findElement(By.cssSelector("#actionButton")).getCssValue("color");

        System.out.println(button_text_a2+" "+button_color_a2);








    }

}
