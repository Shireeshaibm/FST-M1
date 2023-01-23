package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Scanner;

public class Activity12_3 {
    public static void main(String args[]){

//        Scanner sc = new Scanner(System.in);
//        String s=sc.next();
//        for(int i =s.length()-1;i>=0;i--){
//
//            System.out.print(s.charAt(i));
//
//        }

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\002OSE744\\Desktop\\JAVA\\my sel project\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/popups");
        System.out.println(driver.getTitle());

        Actions act = new Actions(driver);
//        Find the Sign in button and hover over it. Print the tooltip message.

        WebElement SignIn_btn= driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));

       act.moveToElement(SignIn_btn).pause(Duration.ofSeconds(1)).build().perform();
       String tooltip_txt= SignIn_btn.getAttribute("data-tooltip");

       System.out.println(tooltip_txt);
//        Click the button to open the Sign in form.
        SignIn_btn.click();
//      Enter the credentials
//        username: admin
//        password: password

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#signInModal")));

        driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
        driver.findElement(By.cssSelector("input#password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();


//        Click login and print the message on the page after logging in.
       System.out.println(driver.findElement(By.cssSelector("div#action-confirmation")).getText());


//        Finally, close the browser.









    }
}
