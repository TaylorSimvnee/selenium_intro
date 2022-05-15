package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _01_Validate_Apple_Title {
    public static void main(String[] args) {

        /*
        TEST CASE
        1. Go to "https://www.apple.com/"
        2. Validate the title of the page is displayed as "Apple"
         */

        //Selenium is a tool to automate browsers


        //1. Set up Driver
        System.setProperty("webdriver.chrome.driver", "/Users/taylorsimone/IdeaProjects/selenium_intro/chromedriver"); //Tells where my executable driver is
        WebDriver driver = new ChromeDriver(); //launch browser
        driver.manage().window().maximize(); // maximize browser to ensure test gives accurate results
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // gives a wait up to (30, seconds)


        //2. Validation
        driver.get("https://www.apple.com"); //navigates into application
        if (driver.getTitle().equals("Apple")) System.out.println("Apple title validation PASSED");
        else System.out.println("Apple title validation FAILED");

        //3. Quit driver -- completely shuts it down... cannot validate anything else after quit
        driver.quit();

        System.out.println("End of program");




    }
}
