package wonderlabz;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrames {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Allowing wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Landing on page
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //Verifying that page contains an iFrame
        System.out.println(driver.getPageSource().contains("iframe"));

        //Switching to iFrame on the page
        driver.switchTo().frame("courses-iframe");

        //Clicking on 'Blog' button on iFrame
        driver.findElement(By.xpath("//div[@class='nav-outer clearfix']//a[normalize-space()='Blog']")).click();

    }

}
