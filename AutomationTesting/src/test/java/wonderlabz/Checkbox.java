package wonderlabz;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Allowing wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Landing on the page
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //Clicking on checkbox option1
        driver.findElement(By.id("checkBoxOption1")).click();
        //Clicking on checkbox option2
        driver.findElement(By.id("checkBoxOption2")).click();
        //Clicking on checkbox option3
        driver.findElement(By.id("checkBoxOption3")).click();

        //Verifying that checkbox options are selected, should print true or false
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
        System.out.println(driver.findElement(By.id("checkBoxOption2")).isSelected());
        System.out.println(driver.findElement(By.id("checkBoxOption3")).isSelected());

        //Unchecking on checkbox option1
        driver.findElement(By.id("checkBoxOption1")).click();

        //Verifying that checkbox option 1 and 2 is selected
        System.out.println(driver.findElement(By.id("checkBoxOption2")).isSelected());
        System.out.println(driver.findElement(By.id("checkBoxOption3")).isSelected());

    }

}

