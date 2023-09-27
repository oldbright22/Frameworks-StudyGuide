package helper;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.Set;

public class DriverHelper implements IDriverHelper {

    public WebDriver driver;
    String parentWindow;

    @Override
    public void invokeApp(String browser, String urlLink) {
        try {
            // Step 1: Launch Browser
            if(browser.equals("chrome")){
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = new ChromeDriver();
            } else if(browser.equals("Firefox")){
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
                driver = new FirefoxDriver();
            }

            //delete cookies
            driver.manage().deleteAllCookies();

            // wait
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

            // load URL
            driver.get(urlLink);

            // maximize window
            driver.manage().window().maximize();

            // initialize elements for @FindBy
            PageFactory.initElements(driver, this);

            System.out.println("The browser :"+browser+"  with URL: "+urlLink+"  launched successfully.");

        } catch (Exception e) {
            System.out.println("The browser :"+browser+" could not be launched.");
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    @Override
    public boolean attBy(String key, String value, String data) {

        WebElement element = driver.findElement(By.cssSelector("["+key+"='"+value+"']"));
        if (element != null) {
            element.sendKeys(data);
            return true;
        }

        return false;
    }

    @Override
    public boolean verifyTitle(String title, String locator) {

        WebElement element = driver.findElement(By.cssSelector(locator));
        String currentTitle = element.getDomProperty("textContent");
        if (title != currentTitle)
            return true;

        return false;
    }

    @Override
    public void verifyTextBy(String key, String value, String text) {

    }

    @Override
    public void verifyContainsBy(String key, String value, String text) {

    }

    @Override
    public void clickBy(String key, String value) {

    }

    @Override
    public String getTextBy(String key, String value) {
        return null;
    }

    @Override
    public void selectVisibleTextById(String id, String value) {

    }

    @Override
    public void selectIndexById(String id, String value) {

    }

    @Override
    public void switchToParentWindow() {

        try {
            driver.switchTo().window(parentWindow);
            System.out.println("Switched to Parent Window Successfully");
        } catch (NoSuchWindowException e) {
            System.out.println("The Parent Window is not Found");;
        } catch (Exception e){
            System.out.println("Some other Exception occurred");
        }

    }

    @Override
    public void switchToLastWindow() {
        try {
            parentWindow = driver.getWindowHandle();
            Set<String> allActiveWindow = driver.getWindowHandles();
            for (String setWindow : allActiveWindow) {
                driver.switchTo().window(setWindow);
            }
            System.out.println("Switched to Child Window Successfully");
        } catch (NoSuchWindowException e) {
            System.out.println("The Window was not found");
        }catch (WebDriverException e){
            System.out.println("The browser got closed and not accessible");
        } catch (Exception e){
            System.out.println("Some other Unhandled exception");
        }

    }

    @Override
    public void acceptAlert() {

        try {
            driver.switchTo().alert().accept();
        } catch (NoAlertPresentException e) {
            System.out.println("Alert not found");
        }  catch(WebDriverException e){
            System.out.println("The browser got closed and alert is not accessible");
        } catch(Exception e){
            System.out.println("Something went wrong. look at snapshot");
        }
    }

    @Override
    public void quitBrowser() {

        try {
            driver.quit();
            System.out.println("The browser was closed successfully");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("The browser was not closed successfully");
        }
    }
}
