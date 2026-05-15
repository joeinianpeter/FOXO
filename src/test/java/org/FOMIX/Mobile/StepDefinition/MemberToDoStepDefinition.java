package org.FOMIX.Mobile.StepDefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.FOMIX.API.Utils.ConfigReader;
import org.FOMIX.API.Utils.DateUtils;
import org.FOMIX.API.Utils.TextContextSetup;
import org.FOMIX.Mobile.POM.LoginPage;
import org.FOMIX.Mobile.POM.MemberToDoPage;
import org.testng.Assert;

public class MemberToDoStepDefinition {


    private final MemberToDoPage memberToDoPage;

    public MemberToDoStepDefinition(TextContextSetup textContextSetup) {
        this.memberToDoPage = textContextSetup.pageObjectManager.getMemberToDoPage();
    }

    @Then("Verify the To-Do task should be displayed in the app")
    public void verifyTheToDoTaskShouldBeDisplayedInTheApp() {
        Assert.assertTrue(memberToDoPage.isTitleDisplayed());
    }

    @Then("Complete the task and verify the toast message")
    public void completeTheTaskAndVerifyTheToastMessage() {
        memberToDoPage.clickOnTickMark();
        Assert.assertTrue(memberToDoPage.getToastMessage(), "The toast message displayed is: " + memberToDoPage.getToastMessage());
    }

    @When("User clicks on {string}")
    public void userClicksOn(String selectADay) {
        String day = DateUtils.selectADay(selectADay);
        memberToDoPage.clickOnSelectedDays(day);
    }

    @Then("Verify user should not be allowed to complete a future task or task which are created seven days before")
    public void verifyUserShouldNotBeAllowedToCompleteAFutureTaskOrTaskWhichAreCreatedSevenDaysBefore() {
        boolean tickDisplayed = memberToDoPage.isTickMarkPresent();
        System.out.println(tickDisplayed);
        Assert.assertFalse(tickDisplayed, "Tick mark SHOULD NOT be visible for a future task but it is visible.");
    }
}
