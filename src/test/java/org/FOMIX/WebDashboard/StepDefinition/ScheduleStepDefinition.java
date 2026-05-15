package org.FOMIX.WebDashboard.StepDefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.FOMIX.API.Utils.AppConstants;
import org.FOMIX.WebDashboard.POM.SchedulePage;
import org.FOMIX.WebDashboard.Utils.TextContextSetup;

public class ScheduleStepDefinition {

    public TextContextSetup textContextSetup;

    public ScheduleStepDefinition(TextContextSetup textContextSetup) {
        this.textContextSetup = textContextSetup;
    }

    @And("Select the {string} or {string} or {string}")
    public void selectTheOrOr(String optionOne, String optionTwo, String optionThree) {
        SchedulePage schedulePage = textContextSetup.pageObjectManager.schedulePage();
        schedulePage.clickOnScheduleOptions(optionOne, optionTwo, optionThree);
    }

    @And("Select the {string} or {string}")
    public void selectTheOr(String optionOne, String optionTwo) {
        SchedulePage schedulePage = textContextSetup.pageObjectManager.schedulePage();
        schedulePage.clickOnScheduleList(optionOne, optionTwo);
    }

    @Then("Click on {string} icon")
    public void clickOnIcon(String options) {
        SchedulePage schedulePage = textContextSetup.pageObjectManager.schedulePage();
        schedulePage.clickOnOptions(options);
    }

    @And("search for {string}")
    public void searchFor(String options) {
        SchedulePage schedulePage = textContextSetup.pageObjectManager.schedulePage();
        schedulePage.clickOnSearchTable(options);
    }

    @Then("Click on {string} and select a event {string}")
    public void clickOnAndSelectAEvent(String eventName, String event) {
        SchedulePage schedulePage = textContextSetup.pageObjectManager.schedulePage();
        schedulePage.clickOnEventName(eventName, event);
        AppConstants.setEventNameDashboard(event);
    }

    @And("Click on Create Schedule")
    public void clickOnCreateSchedule() {
        SchedulePage schedulePage = textContextSetup.pageObjectManager.schedulePage();
        schedulePage.clickOnCreateSchedule();
    }

    @Then("Verify the success message")
    public void verifyTheSuccessMessage() {
        SchedulePage schedulePage = textContextSetup.pageObjectManager.schedulePage();
        schedulePage.getScheduleCreatedSuccessMessage();
    }

    @And("Check the created schedule details")
    public void checkTheCreatedScheduleDetails() {
        SchedulePage schedulePage = textContextSetup.pageObjectManager.schedulePage();
        schedulePage.getCreatedScheduleDetails(AppConstants.getMemberName(), AppConstants.getEventNameDashboard(), AppConstants.getStartDay(), AppConstants.getEndDay());
    }

    @And("Select the Squad Member {string}")
    public void selectTheSquadMember(String squadMember) {
        SchedulePage schedulePage = textContextSetup.pageObjectManager.schedulePage();
        AppConstants.setSquadMember(squadMember);
        schedulePage.clickOnSquadSelectionTextBox()
                .clickOnSearchSquadTextBox(squadMember)
                .clickOnSelectSquadMember();
    }

    @And("Select the care specialist {string}")
    public void selectTheCareSpecialist(String careSpecialistName) {
        SchedulePage schedulePage = textContextSetup.pageObjectManager.schedulePage();
        AppConstants.setCareSpecialistName(careSpecialistName);
        schedulePage.clickOnOptionalField()
                .clickOnAddCareSpecialistButton()
                .clickOnSelectCareSpecialistTextBox()
                .clickOnSearchCareSpecialistTextBox(careSpecialistName)
                .clickOnCareSpecialistName();
    }

    @And("Add the start time {string} {string} {string} and date {string}")
    public void addTheStartTimeAndDate(String hour, String minute, String timePeriod, String day) throws InterruptedException {
        SchedulePage schedulePage = textContextSetup.pageObjectManager.schedulePage();
        schedulePage.clickOnStartTimeCloseIcon()
                .clickOnStartTimeCalendarIcon()
                .selectADay(day)
                .clickOnArrowIcon()
                .selectStartEndTime(hour, minute, timePeriod);
        String startTime = hour + ":" + minute + " " + timePeriod;
        AppConstants.setStartTime(startTime);
        AppConstants.setStartDay(day);
    }

    @And("Add the end time {string} {string} {string} and date {string}")
    public void addTheEndTimeAndDate(String hour, String minute, String timePeriod, String day) throws InterruptedException {
        SchedulePage schedulePage = textContextSetup.pageObjectManager.schedulePage();
        schedulePage.clickOnEndTimeCloseIcon()
                .clickOnEndTimeCalendarIcon()
                .selectADay(day)
                .clickOnArrowIcon()
                .selectStartEndTime(hour, minute, timePeriod);
        String endTime = hour + ":" + minute + " " + timePeriod;
        AppConstants.setEndTime(endTime);
        AppConstants.setEndDay(day);
    }

    @And("Click on the edit icon")
    public void clickOnTheEditIcon() {
        SchedulePage schedulePage = textContextSetup.pageObjectManager.schedulePage();
        schedulePage.editIconOnSchedule();
        System.out.println("edited.....");
    }

    @And("Click on the event name and update it with {string}")
    public void clickOnTheEventNameAndUpdateItWith(String eventName) {
        SchedulePage schedulePage = textContextSetup.pageObjectManager.schedulePage();
        schedulePage.clickOnEventName(AppConstants.getEventNameDashboard(), eventName);
        AppConstants.setEventNameDashboard(eventName);
    }

    @And("Click on Update Schedule")
    public void clickOnUpdateSchedule() {
        SchedulePage schedulePage = textContextSetup.pageObjectManager.schedulePage();
        schedulePage.clickOnUpdateSchedule();
    }

    @And("Add end time {string} {string} {string} and date {string}")
    public void addEndTimeAndDate(String hour, String minute, String timePeriod, String day) throws InterruptedException {
        SchedulePage schedulePage = textContextSetup.pageObjectManager.schedulePage();
        schedulePage.clickOnEndTimeCalendarIcon()
                .selectADay(day)
                .clickOnArrowIcon()
                .selectStartEndTime(hour, minute, timePeriod);
        String endTime = hour + ":" + minute + " " + timePeriod;
        AppConstants.setEndTime(endTime);
        AppConstants.setEndDay(day);
    }

    @Then("Verify schedule updated success message")
    public void verifyScheduleUpdatedSuccessMessage() {
        SchedulePage schedulePage = textContextSetup.pageObjectManager.schedulePage();
        schedulePage.getScheduleUpdatedSuccessMessage();
    }

    @And("Check the updated schedule details")
    public void checkTheUpdatedScheduleDetails() {
        SchedulePage schedulePage = textContextSetup.pageObjectManager.schedulePage();
        schedulePage.getUpdatedScheduleDetails(AppConstants.getMemberName(), AppConstants.getEventNameDashboard(), AppConstants.getStartDay(), AppConstants.getEndDay());
    }
}
