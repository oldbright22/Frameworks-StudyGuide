package helper;

import org.openqa.selenium.WebDriver;

public interface IDriverHelper {


    /**
     * Method-Name:  invokeApp
     * This method will:
     *      Launch given browser
     *      Maximize browser to 100
     *      Set wait for 10 seconds
     *      Load the url
     * @param browser - The browser of the application to be launched
     * @param urlLink - The url with https
     */
    public void invokeApp(String browser, String urlLink);

    public WebDriver getDriver();

    /**
     * Method-name:   attBy
     * This method will:
     *      Enter the value to the text field using requested key (id,name,xpath) attribute to locate
     *
     * @param key   - type of locator to be used: id, name, xpath
     * @param value - locator value of the object
     * @param data  - data to be sent to the WebElement
     */
    public boolean attBy(String key, String value, String data);



    /**
     * Method-Name:   verifyTitle
     * This method will verify the title of the browser
     *
     * @param title - The expected title of the browser
     * @return  true of title passed-in is a match, otherwise false
     */
    public boolean verifyTitle(String title, String locator);

    /**
     * This method will verify the given text
     * @param  key  - type of locator to be used : id, xpath
     * @param value - locator value of the object
     * @param text  - The text to be verified
     */
    public void verifyTextBy(String key, String value, String text);




    /**
     * This method will verify the given text
     * @param   key - type of locator to be used : id, xpath
     * @param value - locator value of the object
     * @param text  - The text to be verified
     */
    public void verifyContainsBy(String key, String value, String text);



    /**
     * This method will click the element using locator specified
     * @param key  (locator key) of the element to be clicked  : id, name, className, xpath, by link
     * @param value (locator value) of the element to be clicked
     */
    public void clickBy(String key, String value);





    /**
     * This method will get the text of the element using id as locator
     * @param key  (locator key) of the element from where to obtain text  : id, xpath
     * @param value (locator value) of the element from where to obtain text
     */
    public String getTextBy(String key, String value);



    /**
     * This method will select the drop down visible text using id as locator
     * @param id The id (locator) of the drop down element
     * @param value The value to be selected (visibletext) from the dropdown
     */
    public void selectVisibleTextById(String id, String value);



    /**
     * This method will select the drop down using index as id locator
     * @param id The id (locator) of the drop down element
     * @param value The value to be selected (visibletext) from the dropdown
     */
    public void selectIndexById(String id, String value);



    /**
     * This method will switch to the parent Window
     */
    public void switchToParentWindow();


    /**
     * This method will move the control to the last window
     */
    public void switchToLastWindow();


    /**
     * This method will accept the alert opened
     */
    public void acceptAlert();

    /**
     * This method will close all the browsers
     */
    public void quitBrowser();

}
