package pages;

import helper.DriverHelper;

import java.util.Date;

public class BaseForm extends DriverHelper {

    String firstName;
    String lastName;
    typeGender gender;
    String email;
    String phNumber;
    String address1;
    String address2;
    int postalCode;
    Date dob;

    // launch the browser
    @Override
    public void invokeApp(String browser, String urlLink) {
        super.invokeApp(browser, urlLink);
    }
}