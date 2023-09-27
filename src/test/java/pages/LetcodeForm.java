package pages;

import org.junit.*;

import static org.junit.Assert.fail;

public class LetcodeForm extends BaseForm {

    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {

        //invoke new browser, with specified baseUrl
        baseUrl = "https://letcode.in/forms";
        invokeApp("chrome",baseUrl);
    }

    @Test
    public void fillForm() throws Exception {

        String x ="";

    }

    @After
    public void tearDown() throws Exception {

        //close all browser windows
        quitBrowser();


        String verificationErrorString = verificationErrors.toString();

        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

}
