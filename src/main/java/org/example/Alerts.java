package org.example;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alerts {

    public static WebDriver dr = null;

    @Test
    public static void alertOne() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        dr = new ChromeDriver();
        dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        dr.manage().window().maximize();

        dr.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
        Thread.sleep(3000);

        dr.switchTo().frame("iframeResult");
        WebElement alertButton = dr.findElement(By.cssSelector("html>body>button"));
        alertButton.click();
        Thread.sleep(3000);

        String expectedAlertMessage = "I am an alert box!";
        String actualAlertMessage = dr.switchTo().alert().getText();
        Assert.assertEquals(expectedAlertMessage,actualAlertMessage);
        dr.switchTo().alert().accept();

        Thread.sleep(3000);

        dr.quit();
    }


    @Test
    public static void alertTwo() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        dr = new ChromeDriver();
        dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        dr.manage().window().maximize();


        dr.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        Thread.sleep(3000);


        dr.switchTo().frame("iframeResult");
        WebElement confirmButton = dr.findElement(By.cssSelector("html>body>button"));
        WebElement actualConfirmMessage = dr.findElement(By.cssSelector("#demo"));
        confirmButton.click();
        dr.switchTo().alert().accept();
        Thread.sleep(3000);


        Assert.assertEquals("You pressed OK!", actualConfirmMessage.getText());
        confirmButton.click();
        dr.switchTo().alert().dismiss();
        Assert.assertEquals("You pressed Cancel!",actualConfirmMessage.getText());

        Thread.sleep(3000);
        dr.quit();
    }

    @Test
    public static void alertThree() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        dr = new ChromeDriver();
        dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        dr.manage().window().maximize();

        dr.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        Thread.sleep(3000);

        dr.switchTo().frame("iframeResult");
        WebElement promptButton = dr.findElement(By.cssSelector("html>body>button"));
        WebElement actualPromptMessage = dr.findElement(By.cssSelector("#demo"));
        promptButton.click();

        dr.switchTo().alert().sendKeys("SW Test Academy");
        Thread.sleep(3000);

        dr.switchTo().alert().accept();
        Assert.assertEquals("Hello SW Test Academy! How are you today?",actualPromptMessage.getText());
        Thread.sleep(3000);

        dr.quit();
    }

    @Test()
    public void alertFour() {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseURL = "http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
        driver.get(baseURL);

        WebElement TryitFrame = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(TryitFrame);

        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Try it')]"))).click();
        driver.findElement(By.xpath("//button[contains(text(),'Try it')]"));

        //StringSelection SS = new StringSelection("C:\\Karthik.jpg");
        //Toolkit.getDefaultToolkit().getSystemClipboard().setContents(SS, null);

        Robot robo;
        try {
            robo = new Robot();

            robo.keyPress(KeyEvent.VK_ENTER);

        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        // driver.switchTo().defaultContent();
        // driver.switchTo().frame(TryitFrame);

        String AlertText = driver.findElement(By.id("demo")).getText();
        Assert.assertEquals("You pressed Cancel!", AlertText);
        System.out.println(AlertText);

        driver.quit();

    }
}
