package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_1 {

    public static void main(String args[]){

        System.setProperty("webdriver.gecko.driver","C:\\Users\\002OSE744\\Desktop\\JAVA\\my sel project\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/tables");
        List<WebElement> No_of_rows =driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr"));
        List<WebElement>  No_of_cols = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[1]/td"));

        System.out.println(No_of_cols.size());
        System.out.println(No_of_rows.size());

        List<WebElement> Third_row =driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[3]/td"));

        for(WebElement cellValue:Third_row){

            System.out.println(cellValue.getText());
        }

        WebElement cellVlaue_2_2 =driver.findElement(By.xpath("//table[@class='ui celled striped table']/tbody/tr[2]/td[1]"));

        System.out.println(cellVlaue_2_2.getText());











    }

}
