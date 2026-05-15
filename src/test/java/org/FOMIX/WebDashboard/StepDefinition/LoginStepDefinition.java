package org.FOMIX.WebDashboard.StepDefinition;

import io.cucumber.java.en.*;
import org.FOMIX.WebDashboard.POM.LoginPage;
import org.FOMIX.WebDashboard.Utils.TextContextSetup;
import org.testng.Assert;

public class LoginStepDefinition {

    public TextContextSetup textContextSetup;

    public LoginStepDefinition(TextContextSetup textContextSetup) {
        this.textContextSetup = textContextSetup;
    }

    @Given("Launch the browser")
    public void launch_the_browser() {
        System.out.println("launching");
    }

    @When("User enter the valid username and password")
    public void user_enter_the_valid_username_and_password() {
        LoginPage loginPage = textContextSetup.pageObjectManager.loginPage();
        loginPage.clickOnSignInWithPhoneButton()
                .clickOnEnterPhoneNumber()
                .clickOnSentOTPButton()
                .clickOnEnterOTP()
                .clickOnVerifyOTPButton();
    }

    @Then("User should be displayed with the Welcome screen")
    public void user_should_be_displayed_with_the_welcome_screen() {
        LoginPage loginPage = textContextSetup.pageObjectManager.loginPage();
        Assert.assertEquals(loginPage.getWelcomeText(), "FOMIX");
    }

    @And("Select the member {string}")
    public void selectTheMember(String memberName) {
        LoginPage loginPage = textContextSetup.pageObjectManager.loginPage();
        loginPage.clickOnSelectMember()
                .clickOnSearchMember(memberName)
                .clickOnMemberName();
    }

    @And("Select {string}")
    public void select(String option) {
        LoginPage loginPage = textContextSetup.pageObjectManager.loginPage();
        loginPage.clickOnMemberPreviewOptions(option);
    }
}
