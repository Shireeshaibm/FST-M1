package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_2 {
    public static void main(String args[]) throws InterruptedException {


        System.setProperty("webdriver.gecko.driver","C:\\Users\\002OSE744\\Desktop\\JAVA\\my sel project\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/tables");

        List<WebElement> No_of_rows =driver.findElements(By.xpath("//table[@class='ui sortable celled table']/tbody/tr"));
        List<WebElement>  No_of_cols = driver.findElements(By.xpath("//table[@class='ui sortable celled table']/tbody/tr[1]/td"));

        System.out.println("No of rows"+No_of_rows.size());
        System.out.println("No of cols"+No_of_cols.size());

        WebElement cellVlaue_2_2_b =driver.findElement(By.xpath("//table[@class='ui sortable celled table']/tbody/tr[2]/td[2]"));
        System.out.println(cellVlaue_2_2_b.getText());
        Thread.sleep(20000);
        WebElement sorted_name =driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[1]"));
        sorted_name.click();
        WebElement cellVlaue_2_2_a =driver.findElement(By.xpath("//table[@class='ui sortable celled table']/tbody/tr[2]/td[2]"));
        System.out.println(cellVlaue_2_2_a.getText());

        //System.out.println(cellVlaue_2_2_a.getText());










    }




}
