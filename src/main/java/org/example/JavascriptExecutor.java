package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class JavascriptExecutor {


    public static void main(String[] args) throws  InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://www.twoplugs.com");

        String Title = driver.getTitle();
        System.out.println(Title);

        String TitleJS = JavascriptHelper.getTitleByJS(driver);
        System.out.println(TitleJS);
        Thread.sleep(2000);

        Assert.assertEquals(Title,TitleJS);

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File trg = new File("C:\\Users\\admin\\Desktop\\Screenshot\\TestCase03.jpg");
        FileUtils.copyFile(src, trg);

        driver.quit();
    }


}