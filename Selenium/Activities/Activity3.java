package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

    public static void main(String args[]){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\002OSE744\\Desktop\\JAVA\\my sel project\\Drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");

        //Get the title of the page using driver.getTitle() and print out the title.

        System.out.println(driver.getTitle());
       // Use findElement() with name() to find the text fields - firstname and lastname.

        WebElement Firstname=driver.findElement(By.id("firstName"));
        Firstname.sendKeys("shireesha");

        WebElement Lastname=driver.findElement(By.id("lastName"));
        Lastname.sendKeys("M");

        WebElement email= driver.findElement(By.cssSelector("#email"));
        email.sendKeys("sireesha.byravi2@gmail.com");
        WebElement contactnumber =driver.findElement(By.cssSelector("#number"));
        contactnumber.sendKeys("9885211106");

        WebElement submit_btn=driver.findElement(By.className("field"));
        submit_btn.submit();

       driver.close();




    }



}
