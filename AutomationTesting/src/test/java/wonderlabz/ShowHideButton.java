package wonderlabz;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShowHideButton {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Allowing wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Landing on the page
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //Clicking on the hide button to hide element
        driver.findElement(By.id("hide-textbox")).click();

        //Verifying that the hide button is enabled and hidden and the textbox is hidden, should print true or false
        System.out.println(driver.findElement(By.id("hide-textbox")).isEnabled());

        //Clicking on the show button
        driver.findElement(By.id("show-textbox")).click();

        //Verifying that thw show button is clicked on and the textbox is enabled and shown, should print true or false
        System.out.println(driver.findElement(By.id("show-textbox")).isEnabled());

    }

}
