package org.FOMIX.Mobile.StepDefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.FOMIX.API.Utils.AppConstants;
import org.FOMIX.API.Utils.ConfigReader;
import org.FOMIX.API.Utils.TextContextSetup;
import org.FOMIX.Mobile.Hooks.MobileHooks;
import org.FOMIX.Mobile.POM.LoginPage;
import org.testng.Assert;

public class LoginStepDefinition {
    private final LoginPage loginPage;

    public LoginStepDefinition(TextContextSetup textContextSetup) {
        this.loginPage = textContextSetup.pageObjectManager.getLoginPage();
    }

    @And("Verify the mobile app is launched")
    public void verifyTheMobileAppIsLaunched() {
        Assert.assertTrue(loginPage.getLoginFoxoText(), "App is not launched");
    }


    @Given("Login to the mobile app with mobile number and OTP")
    public void loginToTheMobileAppWithMobileNumberAndOTP() throws InterruptedException {
        String mobileNumber = ConfigReader.getDecryptedValue("validMobileNumber");
        String OTP = ConfigReader.getDecryptedValue("OTP");

        loginPage.enterMobileNumber(mobileNumber)
                .clickOnSignInButton()
                .enterOTP(OTP);
    }

    @And("Login to the mobile app")
    public void loginToTheMobileApp() throws InterruptedException {
        String OTP = ConfigReader.getDecryptedValue("OTP");

        loginPage.enterMobileNumber(AppConstants.getPhoneNumber())
                .clickOnSignInButton()
                .enterOTP(OTP);
    }

    @When("User enter a phone number of a member who is not registered under foxo")
    public void userEnterAPhoneNumberOfAMemberWhoIsNotRegisteredUnderFoxo() {
        String unRegisteredMobileNumber = ConfigReader.getDecryptedValue("un-registeredMobileNumber");

        loginPage.enterMobileNumber(unRegisteredMobileNumber)
                .clickOnSignInButton();
    }

    @Then("User should be displayed with proper user information message")
    public void userShouldBeDisplayedWithProperUserInformationMessage() {
        Assert.assertTrue(loginPage.getUnregisteredMobileNumberErrorMessage(), "Error message did not appear");
    }

    @Given("Verify whether the Sign In button is enabled before the phone number is entered")
    public void verifyWhetherTheSignInButtonIsEnabledBeforeThePhoneNumberIsEntered() {
        Assert.assertFalse(loginPage.isSignInButtonEnabled());
    }

    @Given("Verify whether the Sign In button is enabled when user enter phone number less than ten digits")
    public void verifyWhetherTheSignInButtonIsEnabledWhenUserEnterPhoneNumberLessThanTenDigits() {
        String lessThan10Digits = ConfigReader.getDecryptedValue("lessThan10Digit");

        loginPage.enterMobileNumber(lessThan10Digits);
        Assert.assertFalse(loginPage.isSignInButtonEnabled());
    }

    @Given("Verify whether the Sign In button is enabled when user enter phone number more than ten digits")
    public void verifyWhetherTheSignInButtonIsEnabledWhenUserEnterPhoneNumberMoreThanTenDigits() {
        String moreThan10Digits = ConfigReader.getDecryptedValue("moreThan10Digit");

        System.out.println(moreThan10Digits);
        loginPage.enterMobileNumber(moreThan10Digits);
        Assert.assertFalse(loginPage.isSignInButtonEnabled());
    }

    @Given("Verify whether the Sign In button is enabled when user type alphabets, special characters in the phone number field")
    public void verifyWhetherTheSignInButtonIsEnabledWhenUserTypeAlphabetsSpecialCharactersInThePhoneNumberField() {
        String stringAndSpecialCharacters = ConfigReader.getDecryptedValue("stringSpecialCharacters");

        loginPage.enterMobileNumber(stringAndSpecialCharacters);
        Assert.assertFalse(loginPage.isSignInButtonEnabled());
        System.out.println(loginPage.isSignInButtonEnabled());
    }

    @Given("When user enter Valid phone number and In-valid OTP")
    public void whenUserEnterValidPhoneNumberAndInValidOTP() throws InterruptedException {
        String mobileNumber = ConfigReader.getDecryptedValue("phoneNumberMobile");
        String OTP = ConfigReader.getDecryptedValue("invalidOTP");

        loginPage.enterMobileNumber(mobileNumber)
                .clickOnSignInButton()
                .enterOTPInvalid(OTP);

    }

    @Then("Verify user should be displayed with error message")
    public void verifyUserShouldBeDisplayedWithErrorMessage() {
        Assert.assertTrue(loginPage.getInvalidOTPErrorMessageDisplayed());
    }

    @Given("User enter the phone number and click on the sign in button")
    public void userEnterThePhoneNumberAndClickOnTheSignInButton() {
        String mobileNumber = ConfigReader.getDecryptedValue("phoneNumberMobile");

        loginPage.enterMobileNumber(mobileNumber)
                .clickOnSignInButton();
    }

    @When("User should be displayed with OTP screen")
    public void userShouldBeDisplayedWithOTPScreen() {
        Assert.assertTrue(loginPage.getVerifyMobileNumberText(), "Verify your mobile number text is not displayed");
    }

    @Then("When user clicks on the {string} text button, user should be back to the user login section")
    public void whenUserClicksOnTheTextButtonUserShouldBeBackToTheUserLoginSection(String value) {
        Assert.assertTrue(loginPage.getChangeTextDisplayed(value), "change text is not displayed");
        System.out.println(loginPage.getChangeTextDisplayed(value));
        loginPage.clickOnChangeText(value)
                .getLoginFoxoText();
    }

    @Then("Verify the timer text should be displayed")
    public void verifyTheTimerTextShouldBeDisplayed() {
        Assert.assertTrue(loginPage.getAnotherOTPText(), "Request for another OTP in text is not displayed");
    }

    @And("Verify the text displayed after {int} seconds")
    public void verifyTheTextDisplayedAfterSeconds(int time) {
        Assert.assertTrue(loginPage.getRequestAnotherOtpText(time));
    }

    @Then("Verify the {string} button should be disabled, before the OTP is entered")
    public void verifyTheButtonShouldBeDisabledBeforeTheOTPIsEntered(String value) {
        Assert.assertTrue(loginPage.getVerifyButton(value), "Verify button is Enabled");
    }

    @And("Clear the phone number field")
    public void clearThePhoneNumberField() {
        String mobileNumber = ConfigReader.getDecryptedValue("phoneNumberMobile");
       loginPage.clearPhoneNumberField(mobileNumber);
    }

    @Given("Verify all the text displayed in the login screen")
    public void verifyAllTheTextDisplayedInTheLoginScreen() {
        Assert.assertTrue(loginPage.getLoginFoxoText(),"Sign in to FOXO Club text is not displayed");
        Assert.assertTrue(loginPage.getMobileNumberText(),"Mobile number text is not displayed");
        Assert.assertTrue(loginPage.getEnterYourMobileNumber(), "Enter your mobile number text is not displayed");
        Assert.assertTrue(loginPage.getSignInText(), "Sign in text is not displayed");
        Assert.assertTrue(loginPage.getInviteText(), "FOXO Club is invite only. text should be displayed");
        Assert.assertTrue(loginPage.getUserInformationMessage1(),"Already part of the club but can’t get in? text is not displayed");
        Assert.assertTrue(loginPage.getUserInformationMessage2(),"Ping your text is not displayed");
        Assert.assertTrue(loginPage.getConciergeText(), "Concierge text is not displayed");
        Assert.assertTrue(loginPage.getUserInformationMessage3(), "– we’ve got you. text is not displayed");
        Assert.assertTrue(loginPage.getCautionIcon(), "Caution icon should be displayed");
    }

    @Then("Verify all the text displayed in the OTP screen")
    public void verifyAllTheTextDisplayedInTheOTPScreen() {
        Assert.assertTrue(loginPage.getVerifyMobileNumberText(), "Verify your mobile number text should be displayed");
        Assert.assertTrue(loginPage.getOneTimePasswordText(), "We have sent you a one-time password (OTP) on your phone +91 text should be displayed");
        Assert.assertTrue(loginPage.getEnterOTPText(), "Enter OTP text is not displayed");
        Assert.assertTrue(loginPage.getAnotherOTPText(), "Request for another OTP in text should be displayed");
        Assert.assertTrue(loginPage.getVerifyText(), "Verify text should be displayed");
        Assert.assertTrue(loginPage.getUserInformationMessage1(),"Already part of the club but can’t get in? text is not displayed");
        Assert.assertTrue(loginPage.getUserInformationMessage2(),"Ping your text is not displayed");
        Assert.assertTrue(loginPage.getConciergeText(), "Concierge text is not displayed");
        Assert.assertTrue(loginPage.getUserInformationMessage3(), "– we’ve got you. text is not displayed");
        Assert.assertTrue(loginPage.getCautionIcon(), "Caution icon should be displayed");
    }

}
