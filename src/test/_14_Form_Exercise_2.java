package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _14_Form_Exercise_2 {
    public static void main(String[] args) {
        /*
        Go to https://www.techglobalschool.com/
            Scroll down to the bottom of the page

            Send keys to subscribe form and make sure the keys sent are passed
            Enter “John” to “Enter your first name” input box
            Enter “Doe” to “Enter your last name” input box
            Enter “john.doe@gmail.com” to “Add your email” input box
            Validate the keys sent are passed in the DOM
         */

        WebDriver driver = Driver.getDriver();
        driver.get(" https://www.techglobalschool.com/");

        WebElement firstNameInputBox = driver.findElement(By.id("input_comp-khwayxk9"));
        WebElement lastNameInputBox = driver.findElement(By.id("input_comp-khwaz4h2"));
        WebElement emailNameInputBox = driver.findElement(By.id("input_comp-khwb0zsz"));

        firstNameInputBox.sendKeys("John");
        lastNameInputBox.sendKeys("Doe");
        emailNameInputBox.sendKeys("john.doe@gmail.com");

        System.out.println(firstNameInputBox.getText().equals("Subscribe") ? "Form header validation PASSED" : "Form header validation FAILED");
        System.out.println(lastNameInputBox.getText().equals("Subscribe") ? "Form header validation PASSED" : "Form header validation FAILED");
        System.out.println(emailNameInputBox.getText().equals("Subscribe") ? "Form header validation PASSED" : "Form header validation FAILED");





        Driver.quitDriver();
    }

}
