package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _05_Locator_id {
    public static void main(String[] args) {

   /*
    Go to https://www.techglobalschool.com

    Validate the company signature
        Logo must be displayed in the header section
        Company name must be displayed in the header section
        Company quote must be displayed in the header section
     */

            WebDriver driver = Driver.getDriver();

            driver.get("https://www.techglobalschool.com");

            WebElement logo = driver.findElement(By.id("img_comp-kuiqjide2"));
            WebElement companyName = driver.findElement(By.id("comp-kuiqjidf"));
            WebElement companyQuote = driver.findElement(By.id("comp-kuiqjidf"));

            if(logo.isDisplayed()) System.out.println("The logo validation PASSED");
            else System.out.println("Logo validation FAILED!!!");

            if(companyName.isDisplayed()) System.out.println("The company name validation PASSED");
            else System.out.println("Company nam validation FAILED!!!");

            if(companyQuote.isDisplayed()) System.out.println("The company quote validation PASSED");
            else System.out.println("Company quote validation FAILED!!!");


            Driver.quitDriver();
    }
}
