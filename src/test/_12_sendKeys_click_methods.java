package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _12_sendKeys_click_methods {
    public static void main(String[] args) {

        /*
        Go to https://www.wikipedia.org/

            Search for “Tesla”

            Validate the main title of the page is “Tesla”

            NOTE: Use xpath or cssSelector to locate the web elements
         */

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.wikipedia.org/");

        WebElement search = driver.findElement(By.cssSelector("#searchInput"));
        search.sendKeys("Tesla"); //search.sendKeys("Tesla" + Keys.ENTER);
        WebElement button = driver.findElement(By.cssSelector(".pure-button"));
        button.click();
        WebElement title = driver.findElement(By.cssSelector("#firstHeading"));

        if (title.getText().equals("Tesla")) System.out.println("PASSED");
        else System.out.println("FAILED");

        Driver.quitDriver();
    }
}
