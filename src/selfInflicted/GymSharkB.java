package selfInflicted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GymSharkB {
    public static void main(String[] args) throws InterruptedException {

        //Set up
        System.setProperty("webdriver.chrome.driver", "/Users/taylorsimone/IdeaProjects/selenium_intro/chromedriver"); //Tells where my executable driver is
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
           /*
                2. CssSelector
                -this is the second fastest after id
                tagName[att='value']

                3. Xpath
                -It is the most flexible one
                //tagName[@att='value']
         */

        //automation
        driver.get("https://www.gymshark.com");
        driver.findElement(By.cssSelector(".Styles__Search-sc-4mixh6-0")).click();
        driver.findElement(By.cssSelector("#search-input")).sendKeys("PAUSE SEAMLESS BRALETTE");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@title='Pause Seamless Bralette'/MayaBlue]")).click();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//










        //tear down
        driver.quit();

        System.out.println("End of program");


    }
}
