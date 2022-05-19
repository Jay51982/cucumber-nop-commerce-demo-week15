package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginPageSteps {


    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);
    }


    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should verify the error message \"([^\"]*)\"$")
    public void iShouldVerifyTheErrorMessage(String errorMessage) {
        Assert.assertEquals("Error message not display", errorMessage, new LoginPage().getErrorMessage());
    }

    @Then("^I should verify logout link is display$")
    public void iShouldVerifyLogoutLinkIsDisplay() {
        String expectedMessage = "Log out";
        String actualMessage = new LoginPage().getlogoutText();
        Assert.assertEquals("LogOut link is not display", expectedMessage, actualMessage);
    }

    @And("^I click on logout button$")
    public void iClickOnLogoutButton() {
        new LoginPage().clickonlogout();
    }

    @Then("^I should verify login link is display$")
    public void iShouldVerifyLoginLinkIsDisplay() {
        String expectedMessage = "Log in";
        String actualMessage = new LoginPage().getloginlink();
        Assert.assertEquals("Login link is not display", expectedMessage, actualMessage);
    }
}


