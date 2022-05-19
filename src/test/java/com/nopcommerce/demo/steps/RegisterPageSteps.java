package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegisterPageSteps {
    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @And("^I see the Register Text$")
    public void iSeeTheRegisterText() {
        Assert.assertEquals("Register link not display", "Register", new RegisterPage().getRegisterText());
    }


    @And("^I can fill mandetory field \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iCanFillMandetoryField(String gendor, String fname, String lname, String date, String month, String year, String email, String password, String conpassword) {
        new RegisterPage().selectGender(gendor);
        new RegisterPage().enterFirstName(fname);
        new RegisterPage().enterLastName(lname);
        new RegisterPage().selectDateOfBirth(date, month, year);
        new RegisterPage().enterEmail(email);
        new RegisterPage().enterPassword(password);
        new RegisterPage().enterConfirmPassword(conpassword);
    }

    @And("^I can click register Button$")
    public void iCanClickRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("^I can Verify message Your registration completed$")
    public void iCanVerifyMessageYourRegistrationCompleted() {
        Assert.assertEquals("Text not matched", "Your registration completed", new RegisterPage().getYourRegCompletedText());
    }

    @Then("^I can Verify the error message First name is required$")
    public void iCanVerifyTheErrorMessageFirstNameIsRequired() {
        Assert.assertEquals("First name is required.",
                new RegisterPage().getValidationErrorMessageForField("FirstName"),
                "FirstName field error message not displayed");
    }


    @Then("^I should verify the error message for mandatory field$")
    public void iShouldVerifyTheErrorMessageForMandatoryField() {
        Assert.assertEquals("First Name field error message not displayed",
                new RegisterPage().getValidationErrorMessageForField("FirstName"),
                "First name is required.");
        Assert.assertEquals("Last Name field error message not displayed",
                new RegisterPage().getValidationErrorMessageForField("LastName"),
                "Last name is required.");
        Assert.assertEquals("Email field error message not displayed",
                new RegisterPage().getValidationErrorMessageForField("Email"),
                "Email is required.");
        Assert.assertEquals("Password field error message not displayed",
                new RegisterPage().getValidationErrorMessageForField("Password"),
                "Password is required.");
        Assert.assertEquals("ConfirmPassword field error message not displayed",
                new RegisterPage().getValidationErrorMessageForField("ConfirmPassword"),
                "Password is required.");
    }
}
