package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locator_Id {

    public static void main(String[] args) {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();// maximize window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //we give implicit time to driver
        driver.get(baseUrl);


        //Id Locator

        WebElement userNameBox = driver.findElement(By.id("divUsername"));  //Find the element
        userNameBox.click();  // Action on Element  (Type or  send the text)


    }
}
