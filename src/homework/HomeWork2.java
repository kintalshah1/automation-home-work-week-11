package homework;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Random;

public class HomeWork2 extends BaseClass {


    String baseUrl = "https://demo.nopcommerce.com/";

    @Before

    public void setUp() {
        openBrowser(baseUrl);


    }

    @Test
    public void register() {
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
        driver.findElement(By.xpath("//input[@id='gender-male']")).click();
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Kintal");
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Shah");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("20");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("05");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1999");
        driver.findElement(By.id("Email")).click();
        Random randomEmail = new Random();
        int randomInt = randomEmail.nextInt(1000);
        ;
        driver.findElement(By.id("Email")).sendKeys("username" + randomInt + "@gmail.com");

        driver.findElement(By.name("Company")).sendKeys("Prime Testing");
        driver.findElement(By.name("Newsletter")).click();
        driver.findElement(By.name("Password")).sendKeys("abcd123");
        driver.findElement(By.name("ConfirmPassword")).sendKeys("abcd123");
        driver.findElement(By.xpath("//button[@id='register-button']")).click();


        closeBrowser();

    }
}
