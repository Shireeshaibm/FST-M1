package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

    public static void main(String args[]) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\002OSE744\\Desktop\\JAVA\\my sel project\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(" https://training-support.net/selenium/ajax");
        System.out.println(driver.getTitle());

        WebElement chng_content =driver.findElement(By.xpath("//button[contains(text(),'Change Content')]"));
        chng_content.click();
        WebDriverWait wait= new WebDriverWait(driver,20);
        WebElement page_context =driver.findElement(By.xpath("//h1[contains(text(),'HELLO!')]"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'HELLO!')]")));
        System.out.println(page_context.getText());
        WebElement late_context=driver.findElement(By.xpath("//h3"));
        wait.until(ExpectedConditions.textToBe(By.xpath("//h3"),"I'm late!"));
        System.out.println(late_context.getText());




    }
}
