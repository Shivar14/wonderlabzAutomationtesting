package wonderlabz;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableFixedHeader {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Allowing wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Landing on the page
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //Selecting the table to work in the table
        WebElement table = driver.findElement(By.className("tableFixHead"));

        //Creating a list from the table of the row/column that has Joe postman
        List<WebElement> sixthrow=table.findElements(By.tagName("tr")).get(6).findElements(By.tagName("td"));


        //Printing out 'Joe"
        System.out.println(sixthrow.get(0).getText());

        //Printing out 'Postman'
        System.out.println(sixthrow.get(1).getText());

        //Printing out Chennai
        System.out.println(sixthrow.get(2).getText());

        //Printing out '46'
        System.out.println(sixthrow.get(3).getText());

        //Verifying that the total amount of the table is '246'
        System.out.println(driver.findElement(By.className("totalAmount")).getText());

    }

}
