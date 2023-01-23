package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {

    public static void main(String args[]){

        System.setProperty("webdriver.gecko.driver","C:\\Users\\002OSE744\\Desktop\\JAVA\\my sel project\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/dynamic-attributes");
        System.out.println(driver.getTitle());
        WebElement signup_username=driver.findElement(By.xpath("//input[contains(@class,'-username')]"));

        WebElement signup_password=driver.findElement(By.xpath("//input[contains(@class,'-password')]"));WebElement signup_confirm_password=driver.findElement(By.xpath("//label[contains(text(),'Confirm Password')]/following::input"));

        WebElement signup_email = driver.findElement(By.xpath("//input[contains(@class,'email')]"));
        WebElement signup_btn = driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));

        signup_username.sendKeys("shireesha.m");
        signup_password.sendKeys("Mihi@1590");
        signup_confirm_password.sendKeys("Mihi@1590");
        signup_email.sendKeys("siri1234@gmail.com");
        signup_btn.click();
        WebElement login_message = driver.findElement(By.xpath("//div[@id='action-confirmation']"));
        System.out.println(login_message.getText());








    }
}
