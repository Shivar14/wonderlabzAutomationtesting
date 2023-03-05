package wonderlabz;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Suggestion {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Allowing wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Landing on the page
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //Typing in the search field 'South')
        driver.findElement(By.id("autocomplete")).sendKeys("South ");

        //Clicking down arrow to select the 'South africa' field
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

        //Verifying that south africa was selected, should print out South Africa
        System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));

        //Clearing the search field
        driver.findElement(By.id("autocomplete")).clear();
        //Typing in the search field Republic
        driver.findElement(By.id("autocomplete")).sendKeys("Republic");
        //Clicking down arrow to select the first option listed
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
        //Verifying that the first option (Central african republic) was selected, should print Central African Republic
        System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
    }

}
