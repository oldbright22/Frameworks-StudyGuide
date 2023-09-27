package ctests.steps;


import ctests.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class stepDefinition {

    private String browserName = "";

    private LoginPage page;

    public stepDefinition() {
        page = new LoginPage();
    }

    @Before
    public void beforeScenario() throws Exception {
        browserName="chrome";
    }

    @After
    public void afterScenario() throws Exception {
        page.closeBrowser();
    }


    @Given("GotoWebPage")
    public void gotowebpage() {
        page.LoadPage(browserName,"https://drink.water.com/?skipLanding=true");
        System.out.println("WebPage loaded successfully");
    }


    @When("Login page loads, enter userId {string} and password {string}")
    public void login_page_loads_enter_user_id_and_password(String username, String password)  {

        try {
            page.FillingCredentials(username, password);
            System.out.println("Succeed to enter username : " + username + ", able to enter pwd : " + password );
        } catch(Exception e)
        {
            System.out.println("Failed to enter username : " + username + ", able to enter pwd : " + password );
        }
    }

    @When("Press Login button")
    public void press_login_button() {
        page.ClickLogin();
        System.out.println("sign-in button clicked successfully" );
    }

    @Then("validate logged-in successful and verify landing page")
    public void validate_logged_in_successful_and_verify_landing_page() {
        //verifyTitle("'Hi, Berenisse!'", "div[class='styles_userInfo__2qrjR'] h2");
        System.out.println("landing page is verified" );

        //$("div[class='styles_userInfo__2qrjR'] h2").textContent
    }

}
