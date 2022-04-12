package com.step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.pages.LoginPage;
import com.pages.MainPage;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;

public class Login_Stepdefinition {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


    @Given("I am on the Sauce Demo Login Page")
    public void i_am_on_the_sauce_demo_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        wait.until(ExpectedConditions.urlContains("saucedemo"));
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.loginButton));
    }
    @When("I fill the account information for account StandardUser into the Username field and the Password field")
    public void i_fill_the_account_information_for_account_standard_user_into_the_username_field_and_the_password_field() {
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username1"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password1"));
    }


    @And("I click the Login Button")
    public void i_click_the_login_button() {
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.loginButton));
        loginPage.loginButton.click();
    }

    @Then("I am redirected to the Sauce Demo Main Page")
    public void i_am_redirected_to_the_sauce_demo_main_page() {
        wait.until(ExpectedConditions.urlContains("inventory"));
    }

    @And("I verify the App Logo exists")
    public void i_verify_the_app_logo_exists() {
        Assert.assertTrue(mainPage.appLogo.isDisplayed());
    }

    @When("I fill the account information for account LockedOutUser into the Username field and the Password field")
    public void i_fill_the_account_information_for_account_locked_out_user_into_the_username_field_and_the_password_field() {
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username2"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password2"));
    }

    @Then("I verify the Error Message contains the text {string}")
    public void i_verify_the_error_message_contains_the_text(String string) {
        Assert.assertTrue(loginPage.errorMessage.getText().contains(string));
    }
}
