package homework;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeWork4 extends BaseClass {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before

    public void setUp() {
        openBrowser(baseUrl);

    }

    @Test
    public void verifyTheText() {

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        String expMsg = "Welcome Javier";
        WebElement msg = driver.findElement(By.xpath("//a[contains(text(),'Welcome')]"));
        String actMsg = msg.getText();
        Assert.assertEquals("Error-welcome message is not displayed", expMsg, actMsg);
        driver.findElement(By.id("welcome")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

        String expectedMsg = "LOGIN Panel";
        WebElement msg1 = driver.findElement(By.xpath("//div[@id='logInPanelHeading']"));
        String actualMsg = msg1.getText();
        Assert.assertEquals("Incorrect message is displayed", expectedMsg, actualMsg);


        closeBrowser();

    }
}