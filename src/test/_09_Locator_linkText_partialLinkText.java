package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _09_Locator_linkText_partialLinkText {
    public static void main(String[] args) {

        /*
        Go to https://www.google.com
        Validate the Gmail, Images, About and Store links are displayed and enabled
         */
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com/");

        WebElement gmail = driver.findElement(By.linkText("Gmail"));
        WebElement images = driver.findElement(By.linkText("Images"));
        WebElement aboutLink = driver.findElement(By.linkText("About"));
        WebElement store = driver.findElement(By.linkText("Store"));

        System.out.println(gmail.isDisplayed() && gmail.isEnabled() ? "Gmail test Passed" : "Gmail test Failed");
        System.out.println(images.isDisplayed() && images.isEnabled() ? "Images test Passed" : "Images test Failed");
        System.out.println(aboutLink.isDisplayed() && aboutLink.isEnabled() ? "ABout test Passed" : "ABout test Failed");
        System.out.println(store.isDisplayed() && store.isEnabled() ? "STore test Passed" : "STore test Failed");

        Driver.quitDriver();
    }
}
