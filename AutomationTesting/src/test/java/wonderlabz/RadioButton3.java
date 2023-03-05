package wonderlabz;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton3 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.xpath("//input[@value='radio3']")).click();

        System.out.println(driver.findElement(By.xpath("//input[@value='radio1']")).isSelected());
        System.out.println(driver.findElement(By.xpath("//input[@value='radio2']")).isSelected());
        System.out.println(driver.findElement(By.xpath("//input[@value='radio3']")).isSelected());

    }

}

