package org.FOMIX.WebDashboard.StepDefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.FOMIX.API.Utils.AppConstants;
import org.FOMIX.WebDashboard.POM.MeetingNotesPage;
import org.FOMIX.WebDashboard.Utils.TextContextSetup;
import org.testng.Assert;


public class MeetingNotesStepDefinition {

    private final TextContextSetup textContextSetup;

    public MeetingNotesStepDefinition(TextContextSetup textContextSetup) {
        this.textContextSetup = textContextSetup;
    }

    @Then("Enter data under notes in the meeting notes section")
    public void enterDataUnderNotesInTheMeetingNotesSection() {
        MeetingNotesPage meetingNotesPage = textContextSetup.pageObjectManager.meetingNotesPage();
        String meetingNotes = meetingNotesPage.enterMeetingNotes();
        AppConstants.setMeetingNotes(meetingNotes);
    }

    @And("Click on {string}")
    public void clickOn(String option) {
        MeetingNotesPage meetingNotesPage = textContextSetup.pageObjectManager.meetingNotesPage();
        meetingNotesPage.clickOnOptions(option);
    }

    @Then("Verify the meeting notes")
    public void verifyTheMeetingNotes() {
        MeetingNotesPage meetingNotesPage = textContextSetup.pageObjectManager.meetingNotesPage();
        Boolean dashboardNotes = meetingNotesPage.getMeetingNotes(AppConstants.getMeetingNotes());
        Assert.assertTrue(dashboardNotes);
    }

    @And("Click on the name and enter the data under the notes sections")
    public void clickOnTheNameAndEnterTheDataUnderTheNotesSections() throws InterruptedException {
        MeetingNotesPage meetingNotesPage = textContextSetup.pageObjectManager.meetingNotesPage();
        meetingNotesPage.clickOnMemberNameNotes()
                .enterDataIntoDashboardNotes();
    }

    @Then("Save the notes in the dashboard section")
    public void saveTheNotesInTheDashboardSection() throws InterruptedException {
        MeetingNotesPage meetingNotesPage = textContextSetup.pageObjectManager.meetingNotesPage();
        meetingNotesPage.clickOnSaveButton();
        meetingNotesPage.getNotesSuccessMessage();
    }

    @Then("Enter the data and verify the cursor moves only in forward direction under meeting notes section")
    public void enterTheDataAndVerifyTheCursorMovesOnlyInForwardDirectionUnderMeetingNotesSection() {
        MeetingNotesPage meetingNotesPage = textContextSetup.pageObjectManager.meetingNotesPage();
        meetingNotesPage.checkTheCursorPositionInMeetingNotesSection();
    }


    @Then("Enter the data and verify the cursor moves only in forward direction under dashboard section")
    public void enterTheDataAndVerifyTheCursorMovesOnlyInForwardDirectionUnderDashboardSection() {
        MeetingNotesPage meetingNotesPage = textContextSetup.pageObjectManager.meetingNotesPage();
        meetingNotesPage.clickOnMemberNameNotes()
                .checkTheCursorPositionInDashboardSection();
    }

    @Then("Verify meeting notes retain all text when user types while autosave is in progress")
    public void verifyMeetingNotesRetainAllTextWhenUserTypesWhileAutosaveIsInProgress() {
        MeetingNotesPage meetingNotesPage = textContextSetup.pageObjectManager.meetingNotesPage();
        meetingNotesPage.checkDataDeletion();
    }

    @Then("Verify user should be displayed with save and discard pop-up")
    public void verifyUserShouldBeDisplayedWithSaveAndDiscardPopUp() {
        MeetingNotesPage meetingNotesPage = textContextSetup.pageObjectManager.meetingNotesPage();
        Assert.assertTrue(meetingNotesPage.getUnsavedChangesText(), "The Unsaved changes text is not displayed or spelled incorrectly");
        Assert.assertTrue(meetingNotesPage.getUnsavedChangesInfoText(), "The Unsaved changes info text is not displayed or spelled incorrectly");
        Assert.assertTrue(meetingNotesPage.getStaySaveText(), "The Stay & Save  text is not displayed or spelled incorrectly");
        Assert.assertTrue(meetingNotesPage.getDiscardAndLeaveText(), "The Discard & Leave text is not displayed or spelled incorrectly");
        meetingNotesPage.clickOnDiscardAndLeave();
    }

    @And("Verify add meeting notes section should be displayed")
    public void verifyAddMeetingNotesSectionShouldBeDisplayed() {
        MeetingNotesPage meetingNotesPage = textContextSetup.pageObjectManager.meetingNotesPage();
        Assert.assertTrue(meetingNotesPage.addMeetingNoteDisplayed(), "The Add Meeting Note text is not displayed");
    }

    @Then("Verify the meeting notes data should not be visible since user didn't save the content")
    public void verifyTheMeetingNotesDataShouldNotBeVisibleSinceUserDidnTSaveTheContent() throws InterruptedException {
        MeetingNotesPage meetingNotesPage = textContextSetup.pageObjectManager.meetingNotesPage();
        meetingNotesPage.clickOnMemberNameNotes();
        Assert.assertTrue(meetingNotesPage.enterNotesPlaceHolderDashboard(), "Some data is present in the notes textbox");
    }
}
