package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestFaceBook {
    public static void main(String[] args) {
        //Set up driver
        System.setProperty("webdriver.chrome.driver", "/Users/taylorsimone/IdeaProjects/selenium_intro/chromedriver"); //Tells where my executable driver is
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Test - validation
        driver.get("https://www.facebook.com/");

        String titlePage = driver.getTitle();
        String URL = driver.getCurrentUrl();
        WebElement logo = driver.findElement(By.className("fb_logo"));
        WebElement h2 = driver.findElement(By.cssSelector("._8eso"));
        WebElement input1 = driver.findElement(By.cssSelector("#email"));
        WebElement input2 = driver.findElement(By.cssSelector("input[name = 'pass']"));
        WebElement LIButton = driver.findElement(By.xpath("//button[@type='submit']"));
        WebElement FGP = driver.findElement(By.linkText("Forgot password?"));
        WebElement newAcc = driver.findElement(By.linkText("Create new account"));

        /*
                2. CssSelector
                -this is the second fastest after id
                tagName[att='value']

                3. Xpath
                -It is the most flexible one
                //tagName[@att='value']
         */
        if (titlePage.equals("Facebook - log in or sign up")) System.out.println("FB title validation PASSED");
        else System.out.println("FB title validation Failed");

        if (URL.equals("https://www.facebook.com/")) System.out.println("FB URL validation PASSED");
        else System.out.println("FB URL validation Failed");

        if (logo.isDisplayed()) System.out.println("FB logo validation PASSED");
        else System.out.println("FB logo validation Failed");

        if (h2.isDisplayed()) System.out.println("FB h2 validation PASSED");
        else System.out.println("FB h2 validation Failed");

        if (input1.isDisplayed()) System.out.println("FB input1 validation PASSED");
        else System.out.println("FB input1 validation Failed");

        if (input2.isDisplayed()) System.out.println("FB input2 validation PASSED");
        else System.out.println("FB input2 validation Failed");

        if (LIButton.isDisplayed() && LIButton.isEnabled())  System.out.println("FB LOGIN validation PASSED");
        else System.out.println("FB LOGIN validation Failed");

        if (FGP.isDisplayed()) System.out.println("FB FPASS validation PASSED");
        else System.out.println("FB FPASS validation Failed");

        if (newAcc.isDisplayed()) System.out.println("FB NEWACC validation PASSED");
        else System.out.println("FB NEWACC validation Failed");


        //Tear down
        driver.quit();
        System.out.println("End of program");

    }
}
