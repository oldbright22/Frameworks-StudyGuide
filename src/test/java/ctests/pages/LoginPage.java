package ctests.pages;


import helper.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage extends DriverHelper {

        @FindBy(id = "username")
        private WebElement usernameField;

        @FindBy(id = "password")
        private WebElement passwordField;

        @FindBy(id = "signInBtn") //chain of responsabilites - shared btw clases
        private WebElement loginButton;


        public LoginPage() {
        }

         public void LoadPage(String browserName, String urlLink){
             invokeApp(browserName,urlLink);
         }

         public void closeBrowser() {
             driver.quit();
         }


        public void FillingCredentials(String id, String password) throws Exception {

            Thread.sleep(1000);
            usernameField.sendKeys(id);
            passwordField.sendKeys(password);
        }
        //driver.findElement(By.id("username")).sendKeys(id);
        //driver.findElement(By.id("password")).sendKeys(password);
        //driver.findElement(By.id("submit")).click();

        public void ClickLogin(){
            loginButton.click();
        }


        public LoginPage checkForUrlContains(String keyword) throws Exception {

                Thread.sleep(6000);
                Assert.assertTrue(driver.getCurrentUrl().contains(keyword));
                return this;
        }

        public LoginPage checkForUrlNotContains(String keyword) throws Exception {

            Thread.sleep(6000);
            Assert.assertFalse(driver.getCurrentUrl().contains(keyword));
            return this;
        }


    }
