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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement table = driver.findElement(By.className("tableFixHead"));


        List<WebElement> sixthrow=table.findElements(By.tagName("tr")).get(6).findElements(By.tagName("td"));



        System.out.println(sixthrow.get(0).getText());



        System.out.println(sixthrow.get(1).getText());



        System.out.println(sixthrow.get(2).getText());

        System.out.println(sixthrow.get(3).getText());

        System.out.println(driver.findElement(By.className("totalAmount")).getText());

    }

}
