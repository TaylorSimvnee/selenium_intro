package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _08_Locator_tagName {
    public static void main(String[] args) {
        /*
        Go to https://www.wikipedia.org/
        Validate the WIKIPEDIA heading1 is displayed
        Validate the WIKIPEDIA LOGO is displayed
        Validate the search input box is displayed
        Validate the search button is displayed
        Validate the search button is enabled
         */


        WebDriver driver = Driver.getDriver();

        driver.get("https://www.wikipedia.org/");

        WebElement heading1 = driver.findElement(By.tagName("h1"));
        WebElement logo = driver.findElement(By.cssSelector(".central-featured-logo"));
        WebElement inputBox = driver.findElement(By.id("searchInput"));
        WebElement searchDisplay = driver.findElement(By.className("pure-button"));


        if (heading1.isDisplayed()) System.out.println("WIKI heading validation PASSED");
        else System.out.println("WIKI heading validation Failed");

        if (logo.isDisplayed()) System.out.println("WIKI logo validation PASSED");
        else System.out.println("WIKI logo validation Failed");

        if (inputBox.isDisplayed()) System.out.println("WIKI inputBox validation PASSED");
        else System.out.println("WIKI inputBox validation Failed");

        if (searchDisplay.isDisplayed()) System.out.println("WIKI search display validation PASSED");
        else System.out.println("WIKI search display validation Failed");

        if (searchDisplay.isEnabled()) System.out.println("WIKI search display enabled validation PASSED");
        else System.out.println("WIKI search Display enabled validation Failed");

        Driver.quitDriver();


    }
}
