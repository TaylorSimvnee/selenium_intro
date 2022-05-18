package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class _11_Locator_xpath {
    public static void main(String[] args) {

        /*
        Go to https://www.google.com/

        Validate the links below at the bottom-left of the page
        Advertising
        Business
        How Search works
         */

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com");

        List<WebElement> googleLinks = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']//a"));
        String[] expected = {"Advertising", "Business", "How Search works"};

        for (int i = 0; i < 3; i++) {
            if(googleLinks.get(i).isDisplayed() && googleLinks.get(i).isEnabled() && googleLinks.get(i).getText().equals(expected[i])){
                System.out.println(expected[i] + " PASSED");
            }
            else System.out.println(expected[i] + " FAILED");

        }

        Driver.quitDriver();
        System.out.println("End of program");



    }
}
