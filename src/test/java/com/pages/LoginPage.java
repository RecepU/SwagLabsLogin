package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utilities.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user-name")
//    @FindBy(xpath = "//*[@id='user-name']")
    public WebElement username;

    @FindBy(id = "password")
//    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(id = "login-button")
//    @FindBy(xpath = "//*[@id='login-button']")
    public WebElement loginButton;

    @FindBy(xpath = "//h3[@data-test='error']")
    public WebElement errorMessage;
}
