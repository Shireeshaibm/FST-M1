package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1_2 {

    public static void main(String args[]){

        System.setProperty("webdriver.gecko.driver","C:\\Users\\002OSE744\\Desktop\\JAVA\\my sel project\\Drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net");

       //
        //Browser Commands
        //Navigation Commands
        //WebElement Commands

        System.out.println(driver.getTitle());
        //driver.close();
        //driver.quit();

        driver.manage().window().maximize();

       // driver.navigate().to("https://www.google.com");
        //driver.manage().window().setSize(0,200);

        //driver.navigate().back();
        //driver.navigate().forward();
        //driver.navigate().refresh();

        WebElement About_btn =driver.findElement(By.id("about-link"));

        System.out.println(About_btn.getText());
        //About_btn.click();
       // driver.navigate().back();

        WebElement About_btn_clsname =driver.findElement(By.className("huge"));
        System.out.println(About_btn_clsname.getText());
       // About_btn.click();
//        driver.navigate().back();

        WebElement About_btn_linkText =driver.findElement(By.linkText("About Us"));
        System.out.println(About_btn.getText());
        //About_btn.click();
        //driver.navigate().back();

        WebElement About_btn_cssid =driver.findElement(By.cssSelector("#about-link"));
        System.out.println(About_btn.getText());
        //About_btn_css.click();
        //driver.navigate().back();

        WebElement About_btn_cssclassname =driver.findElement(By.cssSelector(".green"));
        System.out.println(About_btn.getText());

        driver.close();





    }


}
