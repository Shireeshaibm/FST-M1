package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_1 {

    public static void main(String args[]){

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\002OSE744\\Desktop\\JAVA\\my sel project\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/dynamic-attributes");
        System.out.println(driver.getTitle());
        WebElement usrname= driver.findElement(By.xpath("//input[starts-with(@class, 'username')]"));
        usrname.sendKeys("admin");
        WebElement password =driver.findElement(By.xpath("//input[starts-with(@class, 'password')]"));
        password.sendKeys("password");
        WebElement signin = driver.findElement(By.xpath("//button[@onclick='signIn()']"));
        signin.click();
        WebElement login_message = driver.findElement(By.xpath("//div[@id='action-confirmation']"));
        System.out.println(login_message.getText());





    }




}
