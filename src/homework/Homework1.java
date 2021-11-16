package homework;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;




    public class Homework1 extends BaseClass {
        String baseUrl = "https://www.google.co.uk/";


        @Before
        public void setUp() {
            openBrowser(baseUrl);
            driver.findElement(By.id("L2AGLb")).click();
            WebElement input = driver.findElement(By.xpath("//input[@name='q']"));
            input.sendKeys("demo nopCommerce store");
            driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).sendKeys(Keys.ENTER);
            driver.findElement(By.xpath("//h3[contains(text(),'nopCommerce demo store')]")).click();
        }

        @Test
        public void navigateToComputer() {
            driver.findElement(By.linkText("Computers")).click();
            String expectedMessage = "Computers";
            WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
            String actualMessage = message.getText();
            Assert.assertEquals("Computers page is not displayed", expectedMessage, actualMessage);
        }
        @Test
        public void navigateToElectroics() {
            driver.findElement(By.linkText("Electroics")).click();
            String expectedMessage = "Electroics";
            WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Electroics')]"));
            String actualMessage = message.getText();
            Assert.assertEquals("Electroics page is not displayed", expectedMessage, actualMessage);

        }
        @Test
        public void navigateToApparel() {
            driver.findElement(By.linkText("Apparel")).click();
            String expectedMessage = "Apparel";
            WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
            String actualMessage = message.getText();
            Assert.assertEquals("Apparel page is not displayed", expectedMessage, actualMessage);

        }
        @Test
        public void navigateToDigitaldownloads() {
            driver.findElement(By.linkText("Digitaldownloads")).click();
            String expectedMessage = "Digitaldownloads";
            WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Digitaldownloads')]"));
            String actualMessage = message.getText();
            Assert.assertEquals("Digitaldownloads page is not displayed", expectedMessage, actualMessage);
        }
        @Test
        public void navigateToBooks() {
            driver.findElement(By.linkText("Books")).click();
            String expectedMessage = "Books";
            WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
            String actualMessage = message.getText();
            Assert.assertEquals("Books page is not displayed", expectedMessage, actualMessage);

        }
        @Test
        public void navigateToJewellery() {
            driver.findElement(By.linkText("Jewellery")).click();
            String expectedMessage = "Jewellery";
            WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Jewellery')]"));
            String actualMessage = message.getText();
            Assert.assertEquals("Jewellery page is not displayed", expectedMessage, actualMessage);

        }
        @Test
        public void navigateToGiftCards() {
            driver.findElement(By.linkText("GiftCards")).click();
            String expectedMessage = "GiftCards";
            WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'GiftCards')]"));
            String actualMessage = message.getText();
            Assert.assertEquals("GiftCards page is not displayed", expectedMessage, actualMessage);

        }

        @After
        public void close(){closeBrowser();}
    }


