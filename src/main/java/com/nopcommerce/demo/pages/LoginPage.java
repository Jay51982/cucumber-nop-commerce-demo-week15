package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginlink;

    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        log.info("Getting welcome text " + welcomeText.getText() + "<br>");
        return message;
    }

    public void enterEmailId(String email) {
//        int random = (int) (Math.random() * 10000);
//        sendTextToElement(emailField, email + random + "@domain.co.uk");
         sendTextToElement(emailField, email);
        log.info("Enter email " + email + " to email field " + emailField.getText() + "<br>");
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Enter password " + password + " to password field " + passwordField.getText() + "<br>");
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Clicking on Login Button <br>");
    }

    public String getErrorMessage() {
        String message = getTextFromElement(errorMessage);
        log.info("Getting error message : " + errorMessage.getText() + "<br>");
        return message;
    }

    public String getlogoutText() {
        return getTextFromElement(logoutText);
    }

    public void clickonlogout() {
        clickOnElement(logoutText);
    }

    public String getloginlink() {
        return getTextFromElement(loginlink);
    }
}
