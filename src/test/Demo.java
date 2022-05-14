package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) throws InterruptedException {

        //1. Set up driver
        System.setProperty("webdriver.chrome.driver", "/Users/taylorsimone/IdeaProjects/selenium_intro/chromedriver"); //Defines what browser, and path of the driver
        WebDriver driver = new ChromeDriver(); //Instantiate Chrome Browser
        //2. Maximize driver
        driver.manage().window().maximize(); //Maximize the driver --> (we want it to be maximized, so that all HTML web elements are shown)
        //3. Define implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Typically 30.. sometimes 60, 120

        //should execute these 4 first ^^ now we can execute our test case...

        //4. Navigate to Google website
        driver.get("https://www.google.com/");

        //5. Validate the title is Google
        System.out.println("The title of the page is = " + driver.getTitle());

        if (driver.getTitle().equals("Google")) System.out.println("Google title validation PASSED");
        else System.out.println("Google title validation FAILED!!!");

        System.out.println("End of program");

        //6. Quit driver

        Thread.sleep(3000); //  Waiting for demo purposes
        driver.quit();






    }
}
