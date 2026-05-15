package org.FOMIX.Mobile.StepDefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import org.FOMIX.API.Utils.TextContextSetup;
import org.FOMIX.Mobile.POM.SchedulesPage;
import org.testng.Assert;

public class ScheduleStepDefinition {

    private final SchedulesPage schedulesPage;

    public ScheduleStepDefinition(TextContextSetup textContextSetup) {
        this.schedulesPage = textContextSetup.pageObjectManager.getSchedulesPage();

    }

    @Then("Verify the created schedule should be displayed in the app")
    public void verifyTheCreatedScheduleShouldBeDisplayedInTheApp() {
        Assert.assertTrue(schedulesPage.isTitleDisplayed(), "The Expected Schedule Title Displayed is INVALID/INCORRECT");
        Assert.assertTrue(schedulesPage.isStartEndTimeDisplayed(), "The Expected Time Displayed is INVALID/INCORRECT");
    }

    @And("Click on the schedule")
    public void clickOnTheSchedule() {
        schedulesPage.clickOnSchedule();
    }

    @Then("Verify the detailed display of the schedule with {string} and {string} options for behaviour coach appointment")
    public void verifyTheDetailedDisplayOfTheScheduleWithAndOptionsForBehaviourCoachAppointment(String reminder, String reschedule) {
        //day, month, date, start time, duration and end time
        Assert.assertTrue(schedulesPage.isDateDayMonthDisplayed(), "The DAY, MONTH DATE displayed is INVALID/INCORRECT");
        Assert.assertTrue(schedulesPage.isStartTimeDurationDisplayed(), "The start time and Duration displayed is INVALID/INCORRECT");
        schedulesPage.clickOnStartTimeDuration();
        Assert.assertTrue(schedulesPage.isStartEndTimeDisplayed(), "The Expected Time Displayed is INVALID/INCORRECT");

        //location
        Assert.assertTrue(schedulesPage.isLocationNameDisplayed(), "The Location name displayed is INVALID/INCORRECT");

        //reminder and reschedule
        Assert.assertTrue(schedulesPage.isReminderIconDisplayed(reminder), "The Reminder Icon is NOT Displayed");
        Assert.assertTrue(schedulesPage.isReminderOptionDisplayed(reminder), "The Reminder option is NOT Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedOne(reschedule), "The Reschedule Icon 1 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedTwo(reschedule), "The Reschedule Icon 2 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleOptionDisplayed(reschedule), "The Reschedule option is not Displayed");

        //squad member
        Assert.assertTrue(schedulesPage.isSquadMemberTitleDisplayed(), "The Squad Member title displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadMemberAssignedTextDisplayed(), "The Squad Member Assigned text is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadDetailsInfoTextDisplayed(), "The Squad Details info text is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadDetailsOneDisplayed(), "The Squad Details info details displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadDetailsTwoDisplayed(), "The Squad Details info details displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadDetailsThreeDisplayed(), "The Squad Details info details displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadDetailsFourDisplayed(), "The Squad Details info details displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadDetailsFiveDisplayed(), "The Squad Details info details displayed is INCORRECT/INVALID");

        //back
        schedulesPage.clickOnBack();
    }

    @Then("Verify the detailed display of the schedule with {string}, {string} and {string} options for internal squad call")
    public void verifyTheDetailedDisplayOfTheScheduleWithAndOptionsForInternalSquadCall(String reminder, String reschedule, String navigate) {
        //day, month, date, start time, duration and end time
        Assert.assertTrue(schedulesPage.isDateDayMonthDisplayed(), "The DAY, MONTH DATE displayed is INVALID/INCORRECT");
        Assert.assertTrue(schedulesPage.isStartTimeDurationDisplayed(), "The start time and Duration displayed is INVALID/INCORRECT");
        schedulesPage.clickOnStartTimeDuration();
        Assert.assertTrue(schedulesPage.isStartEndTimeDisplayed(), "The Expected Time Displayed is INVALID/INCORRECT");

        //location
        Assert.assertTrue(schedulesPage.isLocationNameDisplayed(), "The Location name displayed is INVALID/INCORRECT");

        //reminder and reschedule
        Assert.assertTrue(schedulesPage.isReminderIconDisplayed(reminder), "The Reminder Icon is NOT Displayed");
        Assert.assertTrue(schedulesPage.isReminderOptionDisplayed(reminder), "The Reminder option is NOT Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedOne(reschedule), "The Reschedule Icon 1 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedTwo(reschedule), "The Reschedule Icon 2 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleOptionDisplayed(reschedule), "The Reschedule option is not Displayed");
        Assert.assertTrue(schedulesPage.isNavigateIconDisplayed(navigate), "The Navigate Icon is not displayed");
        Assert.assertTrue(schedulesPage.isNavigateOptionDisplayed(navigate), "The Navigate Icon is not displayed");

        //squad member
        Assert.assertTrue(schedulesPage.isSquadMemberTitleDisplayed(), "The Squad Member title displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadMemberAssignedTextDisplayed(), "The Squad Member Assigned text is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadDetailsInfoTextDisplayed(), "The Squad Details info text is INCORRECT/INVALID");

        //Agenda
        Assert.assertTrue(schedulesPage.isAgendaTextDisplayed(), "The Agenda text displayed is INCORRECT/INVALID");

        //schedule test
        Assert.assertTrue(schedulesPage.isScheduleTestText(), "The schedule test text displayed is INCORRECT/INVALID");

        //what to expect
        Assert.assertTrue(schedulesPage.isWhatToExpectText(), "The what to expect text displayed is INCORRECT/INVALID");

        //prepare for test
        Assert.assertTrue(schedulesPage.isPrepareTestText(), "The prepare test text displayed is INCORRECT/INVALID");

        //why to take these tests
        Assert.assertTrue(schedulesPage.isWhyTakingTestText(), "The why taking test text displayed is INCORRECT/INVALID");

        //post sample collection
        Assert.assertTrue(schedulesPage.isSampleCollectionText(), "The sample collection text displayed is INCORRECT/INVALID");

        //bask
        schedulesPage.clickOnBack();
    }

    @Then("Verify the detailed display of the schedule with {string}, {string} and {string} options for radiology test")
    public void verifyTheDetailedDisplayOfTheScheduleWithAndOptionsForRadiologyTest(String reminder, String reschedule, String navigate) {
        //day, month, date, start time, duration and end time
        Assert.assertTrue(schedulesPage.isDateDayMonthDisplayed(), "The DAY, MONTH DATE displayed is INVALID/INCORRECT");
        Assert.assertTrue(schedulesPage.isStartTimeDurationDisplayed(), "The start time and Duration displayed is INVALID/INCORRECT");
        schedulesPage.clickOnStartTimeDuration();
        Assert.assertTrue(schedulesPage.isStartEndTimeDisplayed(), "The Expected Time Displayed is INVALID/INCORRECT");

        //location
        Assert.assertTrue(schedulesPage.isLocationNameDisplayed(), "The Location name displayed is INVALID/INCORRECT");

        //reminder and reschedule
        Assert.assertTrue(schedulesPage.isReminderIconDisplayed(reminder), "The Reminder Icon is NOT Displayed");
        Assert.assertTrue(schedulesPage.isReminderOptionDisplayed(reminder), "The Reminder option is NOT Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedOne(reschedule), "The Reschedule Icon 1 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedTwo(reschedule), "The Reschedule Icon 2 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleOptionDisplayed(reschedule), "The Reschedule option is not Displayed");
        Assert.assertTrue(schedulesPage.isNavigateIconDisplayed(navigate), "The Navigate Icon is not displayed");
        Assert.assertTrue(schedulesPage.isNavigateOptionDisplayed(navigate), "The Navigate Icon is not displayed");

        //squad member
        Assert.assertTrue(schedulesPage.isSquadMemberTitleDisplayed(), "The Squad Member title displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadMemberAssignedTextDisplayed(), "The Squad Member Assigned text is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadDetailsInfoTextDisplayed(), "The Squad Details info text is INCORRECT/INVALID");

        //Agenda
        Assert.assertTrue(schedulesPage.isAgendaTextDisplayed(), "The Agenda text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isIndexOneDisplayed(), "The Index number ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isAgendaOneDisplayed(), "The detailed agenda ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isIndexTwoDisplayed(), "The Index number TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isAgendaTwoDisplayed(), "The detailed agenda TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isIndexThreeDisplayed(), "The Index number THREE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isAgendaThreeDisplayed(), "The detailed agenda THREE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isIndexFourDisplayed(), "The Index number FOUR displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isAgendaFourDisplayed(), "The detailed agenda four displayed is INCORRECT/INVALID");

        //schedule test
        Assert.assertTrue(schedulesPage.isScheduleTestText(), "The schedule test text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isEventNameDisplayed(), "The Event Name text displayed is INCORRECT/INVALID");

        //what to expect
        Assert.assertTrue(schedulesPage.isWhatToExpectText(), "The What to expect text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isWhatToExpectInfoPartOneDisplayed(), "The what to expect info displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isWhatToExpectInfoPartTwoDisplayed(), "The what to expect info displayed is INCORRECT/INVALID");

        //prepare you're test
        Assert.assertTrue(schedulesPage.isPrepareTestText(), "The what to expect info displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isPrepareTestOneDisplayed(), "The Prepare test ONE text Displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isPrepareTestTwoDisplayed(), "The Prepare test TWO text Displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isPrepareTestThreeDisplayed(), "The Prepare test THREE text Displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isPrepareTestFourDisplayed(), "The Prepare test FOUR text Displayed is INCORRECT/INVALID");

        //test together
        Assert.assertTrue(schedulesPage.isTestTogetherTextDisplayed(), "The Test together text headline is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHelpsUsTextDisplayed(), "The Help us text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isTestTogetherInfoOne(), "The Test together info ONE is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isTestTogetherInfoTwo(), "The Test together info ONE is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isTestTogetherInfoThree(), "The Test together info ONE is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isTestTogetherInfoFour(), "The Test together info ONE is INCORRECT/INVALID");

        //back
        schedulesPage.clickOnBack();
    }

    @Then("Verify the detailed display of the schedule with {string} and {string} options for Doctor bi-weekly catchup")
    public void verifyTheDetailedDisplayOfTheScheduleWithAndOptionsForDoctorBiWeeklyCatchup(String reminder, String reschedule) {
        //day, month, date, start time, duration and end time
        Assert.assertTrue(schedulesPage.isDateDayMonthDisplayed(), "The DAY, MONTH DATE displayed is INVALID/INCORRECT");
        Assert.assertTrue(schedulesPage.isStartTimeDurationDisplayed(), "The start time and Duration displayed is INVALID/INCORRECT");
        schedulesPage.clickOnStartTimeDuration();
        Assert.assertTrue(schedulesPage.isStartEndTimeDisplayed(), "The Expected Time Displayed is INVALID/INCORRECT");

        //location
        Assert.assertTrue(schedulesPage.isLocationNameDisplayed(), "The Location name displayed is INVALID/INCORRECT");

        //reminder and reschedule
        Assert.assertTrue(schedulesPage.isReminderIconDisplayed(reminder), "The Reminder Icon is NOT Displayed");
        Assert.assertTrue(schedulesPage.isReminderOptionDisplayed(reminder), "The Reminder option is NOT Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedOne(reschedule), "The Reschedule Icon 1 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedTwo(reschedule), "The Reschedule Icon 2 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleOptionDisplayed(reschedule), "The Reschedule option is not Displayed");

        //squad member
        Assert.assertTrue(schedulesPage.isSquadMemberTitleDisplayed(), "The Squad Member title displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadMemberAssignedTextDisplayed(), "The Squad Member Assigned text is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadDetailsInfoTextDisplayed(), "The Squad Details info text is INCORRECT/INVALID");

        //what to expect
        Assert.assertTrue(schedulesPage.isWhatToExpectText(), "The What to expect text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isWhatToExpectBiWeeklyTextDisplayed(), "The what to expect info displayed is INCORRECT/INVALID");

        //prepare for the appointment
        Assert.assertTrue(schedulesPage.isPrepareForYourAppointmentDisplayed(), "The prepare for your appointment displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isAppointmentInfoDisplayed(), "The Appointment info displayed is INCORRECT/INVALID");

        //appointment together
        Assert.assertTrue(schedulesPage.isAppointmentTogetherDisplayed(), "The appointment together text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isAppointmentTogetherInfoDisplayed(), "The appointment together info text displayed is INCORRECT/INVALID");

        //back
        schedulesPage.clickOnBack();
    }

    @Then("Verify the detailed display of the schedule with {string} and {string} options for FOXO kit & concierge introduction")
    public void verifyTheDetailedDisplayOfTheScheduleWithAndOptionsForFOXOKitConciergeIntroduction(String reminder, String reschedule) {
        //day, month, date, start time, duration and end time
        Assert.assertTrue(schedulesPage.isDateDayMonthDisplayed(), "The DAY, MONTH DATE displayed is INVALID/INCORRECT");
        Assert.assertTrue(schedulesPage.isStartTimeDurationDisplayed(), "The start time and Duration displayed is INVALID/INCORRECT");
        schedulesPage.clickOnStartTimeDuration();
        Assert.assertTrue(schedulesPage.isStartEndTimeDisplayed(), "The Expected Time Displayed is INVALID/INCORRECT");

        //location
        Assert.assertTrue(schedulesPage.isLocationNameDisplayed(), "The Location name displayed is INVALID/INCORRECT");

        //reminder and reschedule
        Assert.assertTrue(schedulesPage.isReminderIconDisplayed(reminder), "The Reminder Icon is NOT Displayed");
        Assert.assertTrue(schedulesPage.isReminderOptionDisplayed(reminder), "The Reminder option is NOT Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedOne(reschedule), "The Reschedule Icon 1 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedTwo(reschedule), "The Reschedule Icon 2 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleOptionDisplayed(reschedule), "The Reschedule option is not Displayed");

        //squad member
        Assert.assertTrue(schedulesPage.isSquadMemberTitleDisplayed(), "The Squad Member title displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadMemberAssignedTextDisplayed(), "The Squad Member Assigned text is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadDetailsInfoTextDisplayed(), "The Squad Details info text is INCORRECT/INVALID");

        //what to expect
        Assert.assertTrue(schedulesPage.isWhatToExpectText(), "The What to expect text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isWhatToExpectFoxoIntroDisplayed(), "The what to expect welcome box text should be displayed");

        //prepare for your test
        Assert.assertTrue(schedulesPage.isPrepareTestText(), "The prepare test text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isPrepareYourTestInfoOneDisplayed(), "The prepare your test information ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isPrepareYourTestInfoTwoDisplayed(), "The prepare your test information TWO displayed is INCORRECT/INVALID");

        //test together
        Assert.assertTrue(schedulesPage.isWhyTakingTestText(), "The why taking test text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isTestTogetherOneDisplayed(), "The test together info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isTestTogetherTwoDisplayed(), "The test together info TWO displayed is INCORRECT/INVALID");

        //post sample collection
        Assert.assertTrue(schedulesPage.isSampleCollectionText(), "The sample collection text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isPostSampleCollectionInfoDisplayed(), "The sample collection info displayed is INCORRECT/INVALID");

        //back
        schedulesPage.clickOnBack();
    }

    @Then("Verify the detailed display of the schedule with {string} and {string} options for blood, urine, stool sample collection")
    public void verifyTheDetailedDisplayOfTheScheduleWithAndOptionsForBloodUrineStoolSampleCollection(String reminder, String reschedule) {
        //day, month, date, start time, duration and end time
        Assert.assertTrue(schedulesPage.isDateDayMonthDisplayed(), "The DAY, MONTH DATE displayed is INVALID/INCORRECT");
        Assert.assertTrue(schedulesPage.isStartTimeDurationDisplayed(), "The start time and Duration displayed is INVALID/INCORRECT");
        schedulesPage.clickOnStartTimeDuration();
        Assert.assertTrue(schedulesPage.isStartEndTimeDisplayed(), "The Expected Time Displayed is INVALID/INCORRECT");

        //location
        Assert.assertTrue(schedulesPage.isLocationNameDisplayed(), "The Location name displayed is INVALID/INCORRECT");

        //reminder and reschedule
        Assert.assertTrue(schedulesPage.isReminderIconDisplayed(reminder), "The Reminder Icon is NOT Displayed");
        Assert.assertTrue(schedulesPage.isReminderOptionDisplayed(reminder), "The Reminder option is NOT Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedOne(reschedule), "The Reschedule Icon 1 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedTwo(reschedule), "The Reschedule Icon 2 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleOptionDisplayed(reschedule), "The Reschedule option is not Displayed");

        //squad member
        Assert.assertTrue(schedulesPage.isSquadMemberTitleDisplayed(), "The Squad Member title displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadMemberAssignedTextDisplayed(), "The Squad Member Assigned text is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadDetailsInfoTextDisplayed(), "The Squad Details info text is INCORRECT/INVALID");

        //Agenda
        Assert.assertTrue(schedulesPage.isAgendaTextDisplayed(), "The Agenda text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isBloodUrineStoolAgendaInfoDisplayed(), "The blood, urine stool sample agenda info text displayed is INCORRECT/INVALID");

        //scheduled test
        Assert.assertTrue(schedulesPage.isScheduleTestText(), "The schedule test text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isBloodUrineStoolScheduleTestInfoDisplayed(), "The schedule test info displayed is INCORRECT/INVALID");

        //what to expect
        Assert.assertTrue(schedulesPage.isWhatToExpectText(), "The What to expect text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isBloodUrineStoolExpectInfoOneDisplayed(), "The what to expect in blood, urine, stool info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isBloodUrineStoolExpectInfoTwoDisplayed(), "The what to expect in blood, urine, stool info ONE displayed is INCORRECT/INVALID");

        //prepare for your test
        Assert.assertTrue(schedulesPage.isPrepareTestText(), "The prepare test text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isBloodUrineStoolPrepareTestInfoDisplayed(), "The prepare test in blood, urine, stool info displayed is INCORRECT/INVALID");

        //why to task these tests together
        Assert.assertTrue(schedulesPage.isWhyTakingTestText(), "The why taking test text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isBloodUrineStoolTestTogetherInfoDisplayed(), "The test together in blood, urine, stool info displayed is INCORRECT/INVALID");

        //post sample collection
        Assert.assertTrue(schedulesPage.isSampleCollectionText(), "The sample collection text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isBloodUrineStoolSampleCollectionInfoDisplayed(), "The sample collection in blood, urine, stool info displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isBloodUrineStoolSampleCollectionInfoOne(), "The sample collection in blood, urine, stool info ONE displayed is INCORRECT/INVALID ");
        Assert.assertTrue(schedulesPage.isBloodUrineStoolSampleCollectionInfoTwo(), "The sample collection in blood, urine, stool info TWO displayed is INCORRECT/INVALID ");
        Assert.assertTrue(schedulesPage.isBloodUrineStoolSampleCollectionInfoThree(), "The sample collection in blood, urine, stool info THREE displayed is INCORRECT/INVALID ");
        Assert.assertTrue(schedulesPage.isBloodUrineStoolSampleCollectionInfoFour(), "The sample collection in blood, urine, stool info FOUR displayed is INCORRECT/INVALID ");

        //back
        schedulesPage.clickOnBack();
    }

    @Then("Verify the detailed display of the schedule with {string} and {string} options for health coaching")
    public void verifyTheDetailedDisplayOfTheScheduleWithAndOptionsForHealthCoaching(String reminder, String reschedule) {
        //day, month, date, start time, duration and end time
        Assert.assertTrue(schedulesPage.isDateDayMonthDisplayed(), "The DAY, MONTH DATE displayed is INVALID/INCORRECT");
        Assert.assertTrue(schedulesPage.isStartTimeDurationDisplayed(), "The start time and Duration displayed is INVALID/INCORRECT");
        schedulesPage.clickOnStartTimeDuration();
        Assert.assertTrue(schedulesPage.isStartEndTimeDisplayed(), "The Expected Time Displayed is INVALID/INCORRECT");

        //location
        Assert.assertTrue(schedulesPage.isLocationNameDisplayed(), "The Location name displayed is INVALID/INCORRECT");

        //reminder and reschedule
        Assert.assertTrue(schedulesPage.isReminderIconDisplayed(reminder), "The Reminder Icon is NOT Displayed");
        Assert.assertTrue(schedulesPage.isReminderOptionDisplayed(reminder), "The Reminder option is NOT Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedOne(reschedule), "The Reschedule Icon 1 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedTwo(reschedule), "The Reschedule Icon 2 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleOptionDisplayed(reschedule), "The Reschedule option is not Displayed");

        //what to expect
        Assert.assertTrue(schedulesPage.isWhatToExpectText(), "The What to expect text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHealthCoachingExpectInfoOne(), "The what to expect in health coaching info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHealthCoachingExpectInfoTwo(), "The what to expect in health coaching info TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHealthCoachingExpectInfoThree(), "The what to expect in health coaching info THREE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHealthCoachingExpectInfoFour(), "The what to expect in health coaching info FOUR displayed is INCORRECT/INVALID");

        //prepare for the appointment
        Assert.assertTrue(schedulesPage.isPrepareForYourAppointmentDisplayed(), "The prepare for your appointment displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHealthCoachingPrepareForYourAppointmentInfoOne(), "The prepare for your appointment in health coaching info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHealthCoachingPrepareForYourAppointmentInfoTwo(), "The prepare for your appointment in health coaching info TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHealthCoachingPrepareForYourAppointmentInfoThree(), "The prepare for your appointment in health coaching info THREE displayed is INCORRECT/INVALID");

        //appointment together
        Assert.assertTrue(schedulesPage.isAppointmentTogetherDisplayed(), "The appointment together text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHealthCoachingAppointmentTogetherInfoOne(), "The appointment together in health coaching info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHealthCoachingAppointmentTogetherInfoTwo(), "The appointment together in health coaching info TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHealthCoachingAppointmentTogetherInfoThree(), "The appointment together in health coaching info THREE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHealthCoachingAppointmentTogetherInfoFour(), "The appointment together in health coaching info FOUR displayed is INCORRECT/INVALID");

        //back
        schedulesPage.clickOnBack();
    }

    @Then("Verify the detailed display of the schedule with {string} and {string} options for FOXO Nutritionist consultation")
    public void verifyTheDetailedDisplayOfTheScheduleWithAndOptionsForFOXONutritionistConsultation(String reminder, String reschedule) {
        //day, month, date, start time, duration and end time
        Assert.assertTrue(schedulesPage.isDateDayMonthDisplayed(), "The DAY, MONTH DATE displayed is INVALID/INCORRECT");
        Assert.assertTrue(schedulesPage.isStartTimeDurationDisplayed(), "The start time and Duration displayed is INVALID/INCORRECT");
        schedulesPage.clickOnStartTimeDuration();
        Assert.assertTrue(schedulesPage.isStartEndTimeDisplayed(), "The Expected Time Displayed is INVALID/INCORRECT");

        //location
        Assert.assertTrue(schedulesPage.isLocationNameDisplayed(), "The Location name displayed is INVALID/INCORRECT");

        //reminder and reschedule
        Assert.assertTrue(schedulesPage.isReminderIconDisplayed(reminder), "The Reminder Icon is NOT Displayed");
        Assert.assertTrue(schedulesPage.isReminderOptionDisplayed(reminder), "The Reminder option is NOT Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedOne(reschedule), "The Reschedule Icon 1 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedTwo(reschedule), "The Reschedule Icon 2 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleOptionDisplayed(reschedule), "The Reschedule option is not Displayed");

        //what to expect
        Assert.assertTrue(schedulesPage.isWhatToExpectText(), "The What to expect text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistConsultationWhatToExpectInfoOneDisplayed(), "The what to expect in nutritionist consultation info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistConsultationWhatToExpectInfoTwoDisplayed(), "The what to expect in nutritionist consultation info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistConsultationWhatToExpectInfoThreeDisplayed(), "The what to expect in nutritionist consultation info ONE displayed is INCORRECT/INVALID");

        //prepare for the appointment
        Assert.assertTrue(schedulesPage.isPrepareForYourAppointmentDisplayed(), "The prepare for your appointment displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistConsultationPrepareForYourAppointmentInfoOneDisplayed(), "The prepare for your appointment in nutritionist consultation info ONE is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistConsultationPrepareForYourAppointmentInfoTwoDisplayed(), "The prepare for your appointment in nutritionist consultation info TWO is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistConsultationPrepareForYourAppointmentInfoThreeDisplayed(), "The prepare for your appointment in nutritionist consultation info THREE is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistConsultationPrepareForYourAppointmentInfoFourDisplayed(), "The prepare for your appointment in nutritionist consultation info FOUR is INCORRECT/INVALID");

        //appointment together
        Assert.assertTrue(schedulesPage.isAppointmentTogetherDisplayed(), "The appointment together text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistConsultationAppointmentTogetherInfoOneDisplayed(), "The appointment together in nutritionist consultation info One is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistConsultationAppointmentTogetherInfoTwoDisplayed(), "The appointment together in nutritionist consultation info  is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistConsultationAppointmentTogetherInfoThreeDisplayed(), "The appointment together in nutritionist consultation info One is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistConsultationAppointmentTogetherInfoFourDisplayed(), "The appointment together in nutritionist consultation info One is INCORRECT/INVALID");

        //back
        schedulesPage.clickOnBack();
    }

    @Then("Verify the detailed display of the schedule with {string} and {string} options for Nutritionist Followup")
    public void verifyTheDetailedDisplayOfTheScheduleWithAndOptionsForNutritionistFollowup(String reminder, String reschedule) {
        //day, month, date, start time, duration and end time
        Assert.assertTrue(schedulesPage.isDateDayMonthDisplayed(), "The DAY, MONTH DATE displayed is INVALID/INCORRECT");
        Assert.assertTrue(schedulesPage.isStartTimeDurationDisplayed(), "The start time and Duration displayed is INVALID/INCORRECT");
        schedulesPage.clickOnStartTimeDuration();
        Assert.assertTrue(schedulesPage.isStartEndTimeDisplayed(), "The Expected Time Displayed is INVALID/INCORRECT");

        //location
        Assert.assertTrue(schedulesPage.isLocationNameDisplayed(), "The Location name displayed is INVALID/INCORRECT");

        //reminder and reschedule
        Assert.assertTrue(schedulesPage.isReminderIconDisplayed(reminder), "The Reminder Icon is NOT Displayed");
        Assert.assertTrue(schedulesPage.isReminderOptionDisplayed(reminder), "The Reminder option is NOT Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedOne(reschedule), "The Reschedule Icon 1 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedTwo(reschedule), "The Reschedule Icon 2 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleOptionDisplayed(reschedule), "The Reschedule option is not Displayed");

        //what to expect
        Assert.assertTrue(schedulesPage.isWhatToExpectText(), "The What to expect text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionFollowupWhatToExpectInfoOneDisplayed(), "The what to expect in nutrition followup info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionFollowupWhatToExpectInfoTwoDisplayed(), "The what to expect in nutrition followup info TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionFollowupWhatToExpectInfoThreeDisplayed(), "The what to expect in nutrition followup info THREE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionFollowupWhatToExpectInfoFourDisplayed(), "The what to expect in nutrition followup info FOUR displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionFollowupWhatToExpectInfoFiveDisplayed(), "The what to expect in nutrition followup info FIVE displayed is INCORRECT/INVALID");

        //prepare for the appointment
        Assert.assertTrue(schedulesPage.isPrepareForYourAppointmentDisplayed(), "The prepare for your appointment displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionFollowupPrepareForYourAppointmentInfoOneDisplayed(), "The prepare for your appointment in nutrition followup info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionFollowupPrepareForYourAppointmentInfoTwoDisplayed(), "The prepare for your appointment in nutrition followup info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionFollowupPrepareForYourAppointmentInfoThreeDisplayed(), "The prepare for your appointment in nutrition followup info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionFollowupPrepareForYourAppointmentInfoFourDisplayed(), "The prepare for your appointment in nutrition followup info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionFollowupPrepareForYourAppointmentInfoFiveDisplayed(), "The prepare for your appointment in nutrition followup info ONE displayed is INCORRECT/INVALID");

        //appointment together
        Assert.assertTrue(schedulesPage.isAppointmentTogetherDisplayed(), "The appointment together text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionFollowupAppointmentTogetherInfo(), "The appointment together in nutrition followup info displayed is INCORRECT/INVALID");

        //back
        schedulesPage.clickOnBack();
    }

    @Then("Verify the detailed display of the schedule with {string} and {string} options for Doctor Consultation")
    public void verifyTheDetailedDisplayOfTheScheduleWithAndOptionsForDoctorConsultation(String reminder, String reschedule) {
        //day, month, date, start time, duration and end time
        Assert.assertTrue(schedulesPage.isDateDayMonthDisplayed(), "The DAY, MONTH DATE displayed is INVALID/INCORRECT");
        Assert.assertTrue(schedulesPage.isStartTimeDurationDisplayed(), "The start time and Duration displayed is INVALID/INCORRECT");
        schedulesPage.clickOnStartTimeDuration();
        Assert.assertTrue(schedulesPage.isStartEndTimeDisplayed(), "The Expected Time Displayed is INVALID/INCORRECT");

        //location
        Assert.assertTrue(schedulesPage.isLocationNameDisplayed(), "The Location name displayed is INVALID/INCORRECT");

        //reminder and reschedule
        Assert.assertTrue(schedulesPage.isReminderIconDisplayed(reminder), "The Reminder Icon is NOT Displayed");
        Assert.assertTrue(schedulesPage.isReminderOptionDisplayed(reminder), "The Reminder option is NOT Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedOne(reschedule), "The Reschedule Icon 1 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedTwo(reschedule), "The Reschedule Icon 2 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleOptionDisplayed(reschedule), "The Reschedule option is not Displayed");

        //Agenda
        Assert.assertTrue(schedulesPage.isAgendaTextDisplayed(), "The Agenda text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorConsultationAgendaInfoOneDisplayed(), "The agenda in doctor consultation info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorConsultationAgendaInfoTwoDisplayed(), "The agenda in doctor consultation info TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorConsultationAgendaInfoThreeDisplayed(), "The agenda in doctor consultation info THREE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorConsultationAgendaInfoFourDisplayed(), "The agenda in doctor consultation info FOUR displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorConsultationAgendaInfoFiveDisplayed(), "The agenda in doctor consultation info FIVE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorConsultationAgendaInfoSixDisplayed(), "The agenda in doctor consultation info SIX displayed is INCORRECT/INVALID");

        //scheduled appointment
        Assert.assertTrue(schedulesPage.isScheduledAppointmentTextDisplayed(), "The scheduled appointment in doctor appointment text displayed is INCORRECT/INVALID");

        //what to expect
        Assert.assertTrue(schedulesPage.isWhatToExpectText(), "The What to expect text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorConsultationWhatToExpectInfoDisplayed(), "The what to expect in doctor consultation info displayed is INCORRECT/INVALID");

        //prepare for the appointment
        Assert.assertTrue(schedulesPage.isPrepareForYourAppointmentDisplayed(), "The prepare for your appointment displayed is INCORRECT/INVALID");

        //appointment together
        Assert.assertTrue(schedulesPage.isAppointmentTogetherDisplayed(), "The appointment together text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorConsultationAppointmentTogetherInfo(), "The appointment together in doctor consultation info displayed is INCORRECT/INVALID");

        //back
        schedulesPage.clickOnBack();
    }

    @Then("Verify the detailed display of the schedule with {string} and {string} options for test collection")
    public void verifyTheDetailedDisplayOfTheScheduleWithAndOptionsForTestCollection(String reminder, String reschedule) {
        //day, month, date, start time, duration and end time
        Assert.assertTrue(schedulesPage.isDateDayMonthDisplayed(), "The DAY, MONTH DATE displayed is INVALID/INCORRECT");
        Assert.assertTrue(schedulesPage.isStartTimeDurationDisplayed(), "The start time and Duration displayed is INVALID/INCORRECT");
        schedulesPage.clickOnStartTimeDuration();
        Assert.assertTrue(schedulesPage.isStartEndTimeDisplayed(), "The Expected Time Displayed is INVALID/INCORRECT");

        //location
        Assert.assertTrue(schedulesPage.isLocationNameDisplayed(), "The Location name displayed is INVALID/INCORRECT");

        //reminder and reschedule
        Assert.assertTrue(schedulesPage.isReminderIconDisplayed(reminder), "The Reminder Icon is NOT Displayed");
        Assert.assertTrue(schedulesPage.isReminderOptionDisplayed(reminder), "The Reminder option is NOT Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedOne(reschedule), "The Reschedule Icon 1 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedTwo(reschedule), "The Reschedule Icon 2 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleOptionDisplayed(reschedule), "The Reschedule option is not Displayed");

        //squad member
        Assert.assertTrue(schedulesPage.isSquadMemberTitleDisplayed(), "The Squad Member title displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadMemberAssignedTextDisplayed(), "The Squad Member Assigned text is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadDetailsInfoTextDisplayed(), "The Squad Details info text is INCORRECT/INVALID");

        //back
        schedulesPage.clickOnBack();
    }

    @Then("Verify the detailed display of the schedule with {string} and {string} options for Hormonal Health Consultation – Testosterone Panel")
    public void verifyTheDetailedDisplayOfTheScheduleWithAndOptionsForHormonalHealthConsultationTestosteronePanel(String reminder, String reschedule) {
        //day, month, date, start time, duration and end time
        Assert.assertTrue(schedulesPage.isDateDayMonthDisplayed(), "The DAY, MONTH DATE displayed is INVALID/INCORRECT");
        Assert.assertTrue(schedulesPage.isStartTimeDurationDisplayed(), "The start time and Duration displayed is INVALID/INCORRECT");
        schedulesPage.clickOnStartTimeDuration();
        Assert.assertTrue(schedulesPage.isStartEndTimeDisplayed(), "The Expected Time Displayed is INVALID/INCORRECT");

        //location
        Assert.assertTrue(schedulesPage.isLocationNameDisplayed(), "The Location name displayed is INVALID/INCORRECT");

        //reminder and reschedule
        Assert.assertTrue(schedulesPage.isReminderIconDisplayed(reminder), "The Reminder Icon is NOT Displayed");
        Assert.assertTrue(schedulesPage.isReminderOptionDisplayed(reminder), "The Reminder option is NOT Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedOne(reschedule), "The Reschedule Icon 1 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedTwo(reschedule), "The Reschedule Icon 2 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleOptionDisplayed(reschedule), "The Reschedule option is not Displayed");

        //squad member
        Assert.assertTrue(schedulesPage.isSquadMemberTitleDisplayed(), "The Squad Member title displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadMemberAssignedTextDisplayed(), "The Squad Member Assigned text is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadDetailsInfoTextDisplayed(), "The Squad Details info text is INCORRECT/INVALID");

        //Agenda
        Assert.assertTrue(schedulesPage.isAgendaTextDisplayed(), "The Agenda text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isIndexOneDisplayed(), "The Index number ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationAgendaInfoOneDisplayed(), "The agenda in HormonalHealthConsultation info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isIndexTwoDisplayed(), "The Index number TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationAgendaInfoTwoDisplayed(), "The agenda in HormonalHealthConsultation info TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isIndexThreeDisplayed(), "The Index number THREE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationAgendaInfoThreeDisplayed(), "The agenda in HormonalHealthConsultation info THREE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isIndexFourDisplayed(), "The Index number FOUR displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationAgendaInfoFourDisplayed(), "The agenda in HormonalHealthConsultation info FOUR displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isIndexFiveDisplayed(), "The Index number FOUR displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationAgendaInfoFiveDisplayed(), "The agenda in HormonalHealthConsultation info FOUR displayed is INCORRECT/INVALID");

        //scheduled appointment
        Assert.assertTrue(schedulesPage.isScheduledAppointmentTextDisplayed(), "The scheduled appointment text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationScheduleAppointmentInfoOneDisplayed(), "The schedule appointment in Hormonal Health Consultation info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationScheduleAppointmentInfoOTwoDisplayed(), "The schedule appointment in Hormonal Health Consultation info ONE displayed is INCORRECT/INVALID");

        //what to expect
        Assert.assertTrue(schedulesPage.isWhatToExpectText(), "The What to expect text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationWhatToExpectInfoOneDisplayed(), "The what to expect in Hormonal Health Consultation info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationWhatToExpectInfoTwoDisplayed(), "The what to expect in Hormonal Health Consultation info TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationWhatToExpectInfoThreeDisplayed(), "The what to expect in Hormonal Health Consultation info THREE displayed is INCORRECT/INVALID");

        //prepare for the appointment
        Assert.assertTrue(schedulesPage.isPrepareForYourAppointmentDisplayed(), "The prepare for your appointment displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationPrepareForYourAppointmentInfoOneDisplayed(), "The prepare for your appointment in Hormonal Health Consultation info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationPrepareForYourAppointmentInfoTwoDisplayed(), "The prepare for your appointment in Hormonal Health Consultation info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationPrepareForYourAppointmentInfoThreeDisplayed(), "The prepare for your appointment in Hormonal Health Consultation info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationPrepareForYourAppointmentInfoFourDisplayed(), "The prepare for your appointment in Hormonal Health Consultation info ONE displayed is INCORRECT/INVALID");

        //appointment together
        Assert.assertTrue(schedulesPage.isAppointmentTogetherDisplayed(), "The appointment together text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationAppointmentTogetherInfoOneDisplayed(), "The appointment together in Hormonal Health Consultation info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationAppointmentTogetherInfoTwoDisplayed(), "The appointment together in Hormonal Health Consultation info TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationAppointmentTogetherInfoThreeDisplayed(), "The appointment together in Hormonal Health Consultation info THREE displayed is INCORRECT/INVALID");

        //post sample collection
        Assert.assertTrue(schedulesPage.isSampleCollectionText(), "The sample collection text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationSampleCollectionInfoOneDisplayed(), "The post sample collection in Hormonal Health Consultation info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationSampleCollectionInfoTwoDisplayed(), "The post sample collection in Hormonal Health Consultation info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationSampleCollectionInfoThreeDisplayed(), "The post sample collection in Hormonal Health Consultation info ONE displayed is INCORRECT/INVALID");

        //caution symbol
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationCautionInfoOneDisplayed(), "The caution in Hormonal Health Consultation info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationCautionInfoTwoDisplayed(), "The caution in Hormonal Health Consultation info TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationCautionInfoThreeDisplayed(), "The caution in Hormonal Health Consultation info THREE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationCautionSymbolDisplayed(), "The caution symbol in Hormonal Health Consultation is NOT DISPLAYED");

        //back
        schedulesPage.clickOnBack();

    }

    @Then("Verify the detailed display of the schedule with {string} and {string} options for test")
    public void verifyTheDetailedDisplayOfTheScheduleWithAndOptionsForTest(String reminder, String reschedule) {
        //day, month, date, start time, duration and end time
        Assert.assertTrue(schedulesPage.isDateDayMonthDisplayed(), "The DAY, MONTH DATE displayed is INVALID/INCORRECT");
        Assert.assertTrue(schedulesPage.isStartTimeDurationDisplayed(), "The start time and Duration displayed is INVALID/INCORRECT");
        schedulesPage.clickOnStartTimeDuration();
        Assert.assertTrue(schedulesPage.isStartEndTimeDisplayed(), "The Expected Time Displayed is INVALID/INCORRECT");

        //location
        Assert.assertTrue(schedulesPage.isLocationNameDisplayed(), "The Location name displayed is INVALID/INCORRECT");

        //reminder and reschedule
        Assert.assertTrue(schedulesPage.isReminderIconDisplayed(reminder), "The Reminder Icon is NOT Displayed");
        Assert.assertTrue(schedulesPage.isReminderOptionDisplayed(reminder), "The Reminder option is NOT Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedOne(reschedule), "The Reschedule Icon 1 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedTwo(reschedule), "The Reschedule Icon 2 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleOptionDisplayed(reschedule), "The Reschedule option is not Displayed");

        //squad member
        Assert.assertTrue(schedulesPage.isSquadMemberTitleDisplayed(), "The Squad Member title displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadMemberAssignedTextDisplayed(), "The Squad Member Assigned text is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadDetailsInfoTextDisplayed(), "The Squad Details info text is INCORRECT/INVALID");

        //Agenda
        Assert.assertTrue(schedulesPage.isAgendaTextDisplayed(), "The Agenda text displayed is INCORRECT/INVALID");

        //schedule test
        Assert.assertTrue(schedulesPage.isScheduleTestText(), "The schedule test text displayed is INCORRECT/INVALID");

        //back
        schedulesPage.clickOnBack();
    }

    @Then("Verify the detailed display of the schedule with {string} and {string} options for Cardiac and Imaging Test")
    public void verifyTheDetailedDisplayOfTheScheduleWithAndOptionsForCardiacAndImagingTest(String reminder, String reschedule) {
        //day, month, date, start time, duration and end time
        Assert.assertTrue(schedulesPage.isDateDayMonthDisplayed(), "The DAY, MONTH DATE displayed is INVALID/INCORRECT");
        Assert.assertTrue(schedulesPage.isStartTimeDurationDisplayed(), "The start time and Duration displayed is INVALID/INCORRECT");
        schedulesPage.clickOnStartTimeDuration();
        Assert.assertTrue(schedulesPage.isStartEndTimeDisplayed(), "The Expected Time Displayed is INVALID/INCORRECT");

        //location
        Assert.assertTrue(schedulesPage.isLocationNameDisplayed(), "The Location name displayed is INVALID/INCORRECT");

        //reminder and reschedule
        Assert.assertTrue(schedulesPage.isReminderIconDisplayed(reminder), "The Reminder Icon is NOT Displayed");
        Assert.assertTrue(schedulesPage.isReminderOptionDisplayed(reminder), "The Reminder option is NOT Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedOne(reschedule), "The Reschedule Icon 1 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedTwo(reschedule), "The Reschedule Icon 2 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleOptionDisplayed(reschedule), "The Reschedule option is not Displayed");

        //squad member
        Assert.assertTrue(schedulesPage.isSquadMemberTitleDisplayed(), "The Squad Member title displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadMemberAssignedTextDisplayed(), "The Squad Member Assigned text is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadDetailsInfoTextDisplayed(), "The Squad Details info text is INCORRECT/INVALID");

        //Agenda
        Assert.assertTrue(schedulesPage.isAgendaTextDisplayed(), "The Agenda text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestAgendaInfoTitleDisplayed(), "The agenda in Cardiac And Imaging Test info displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isIndexOneDisplayed(), "The Index number ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestAgendaInfoOneDisplayed(), "The agenda in Cardiac And Imaging Test info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isIndexTwoDisplayed(), "The Index number ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestAgendaInfoTwoDisplayed(), "The agenda in Cardiac And Imaging Test info TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isIndexThreeDisplayed(), "The Index number ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestAgendaInfoThreeDisplayed(), "The agenda in Cardiac And Imaging Test info THREE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isIndexFourDisplayed(), "The Index number ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestAgendaInfoFourDisplayed(), "The agenda in Cardiac And Imaging Test info FOUR displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isIndexFiveDisplayed(), "The Index number ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestAgendaInfoFiveDisplayed(), "The agenda in Cardiac And Imaging Test info FIVE displayed is INCORRECT/INVALID");

        //schedule test
        Assert.assertTrue(schedulesPage.isScheduleTestText(), "The schedule test text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestScheduleTestInfoTitleOneDisplayed(), "The schedule test in Cardiac And Imaging Test info Title One displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestScheduleTestInfoOneDisplayed(), "The schedule test in Cardiac And Imaging Test info One displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestScheduleTestInfoTitleTwoDisplayed(), "The schedule test in Cardiac And Imaging Test info Title One displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestScheduleTestInfoTwoDisplayed(), "The schedule test in Cardiac And Imaging Test info One displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestScheduleTestInfoTitleThreeDisplayed(), "The schedule test in Cardiac And Imaging Test info Title One displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestScheduleTestInfoThreeDisplayed(), "The schedule test in Cardiac And Imaging Test info One displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestScheduleTestInfoTitleFourDisplayed(), "The schedule test in Cardiac And Imaging Test info Title One displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestScheduleTestInfoFourDisplayed(), "The schedule test in Cardiac And Imaging Test info One displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestScheduleTestInfoTitleFiveDisplayed(), "The schedule test in Cardiac And Imaging Test info Title One displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestScheduleTestInfoFiveDisplayed(), "The schedule test in Cardiac And Imaging Test info One displayed is INCORRECT/INVALID");

        //what to expect
        Assert.assertTrue(schedulesPage.isWhatToExpectText(), "The What to expect text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestWhatToExpectInfoDisplayed(), "The what to expect in Cardiac And Imaging Test info displayed is INCORRECT/INVALID");

        //prepare for test
        Assert.assertTrue(schedulesPage.isPrepareTestText(), "The prepare test text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestPrepareForYourTestInfoOneDisplayed(), "The prepare for your test in Cardiac And Imaging Test info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestPrepareForYourTestInfoTwoDisplayed(), "The prepare for your test in Cardiac And Imaging Test info TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestPrepareForYourTestInfoThreeDisplayed(), "The prepare for your test in Cardiac And Imaging Test info THREE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestPrepareForYourTestInfoFourDisplayed(), "The prepare for your test in Cardiac And Imaging Test info FOUR displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestPrepareForYourTestInfoFiveDisplayed(), "The prepare for your test in Cardiac And Imaging Test info FIVE displayed is INCORRECT/INVALID");

        //why to take these tests
        Assert.assertTrue(schedulesPage.isWhyTakingTestText(), "The why taking test text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestTogetherInfoOneDisplayed(), "The test together in Cardiac And Imaging Test info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestTogetherInfoTwoDisplayed(), "The test together in Cardiac And Imaging Test info TWO displayed is INCORRECT/INVALID");

        //post sample collection
        Assert.assertTrue(schedulesPage.isSampleCollectionText(), "The sample collection text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestPostSampleCollectionInfoDisplayed(), "The post sample collection in Cardiac And Imaging Test info displayed is INCORRECT/INVALID");

        //caution
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestCautionInfoDisplayed(), "The caution in Cardiac And Imaging Test info displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationCautionSymbolDisplayed(), "The caution symbol in Hormonal Health Consultation is NOT DISPLAYED");

        //back
        schedulesPage.clickOnBack();
    }

    @Then("Verify the detailed display of the schedule with {string} and {string} options for Kitchen Audit")
    public void verifyTheDetailedDisplayOfTheScheduleWithAndOptionsForKitchenAudit(String reminder, String reschedule) {
        //day, month, date, start time, duration and end time
        Assert.assertTrue(schedulesPage.isDateDayMonthDisplayed(), "The DAY, MONTH DATE displayed is INVALID/INCORRECT");
        Assert.assertTrue(schedulesPage.isStartTimeDurationDisplayed(), "The start time and Duration displayed is INVALID/INCORRECT");
        schedulesPage.clickOnStartTimeDuration();
        Assert.assertTrue(schedulesPage.isStartEndTimeDisplayed(), "The Expected Time Displayed is INVALID/INCORRECT");

        //location
        Assert.assertTrue(schedulesPage.isLocationNameDisplayed(), "The Location name displayed is INVALID/INCORRECT");

        //reminder and reschedule
        Assert.assertTrue(schedulesPage.isReminderIconDisplayed(reminder), "The Reminder Icon is NOT Displayed");
        Assert.assertTrue(schedulesPage.isReminderOptionDisplayed(reminder), "The Reminder option is NOT Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedOne(reschedule), "The Reschedule Icon 1 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedTwo(reschedule), "The Reschedule Icon 2 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleOptionDisplayed(reschedule), "The Reschedule option is not Displayed");

        //squad member
        Assert.assertTrue(schedulesPage.isSquadMemberTitleDisplayed(), "The Squad Member title displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadMemberAssignedTextDisplayed(), "The Squad Member Assigned text is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadDetailsInfoTextDisplayed(), "The Squad Details info text is INCORRECT/INVALID");

        //what to expect
        Assert.assertTrue(schedulesPage.isWhatToExpectText(), "The What to expect text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isKitchenAuditWhatToExpectInfoDisplayed(), "The what to expect in Kitchen Audit info displayed is INCORRECT/INVALID");

        //prepare for your test
        Assert.assertTrue(schedulesPage.isPrepareTestText(), "The prepare test text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isKitchenAuditPrepareForYourTestInfoDisplayed(), "The prepare for your test in Kitchen Audit info displayed is INCORRECT/INVALID");

        //why to take these tests
        Assert.assertTrue(schedulesPage.isWhyTakingTestText(), "The why taking test text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isKitchenAuditTestTogetherInfoDisplayed(), "The test together in Kitchen Audit info displayed is INCORRECT/INVALID");

        //post sample collection
        Assert.assertTrue(schedulesPage.isSampleCollectionText(), "The sample collection text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isKitchenAuditPostSampleCollectionInfoDisplayed(), "The post sample collection in Kitchen Audit info displayed is INCORRECT/INVALID");

        //back
        schedulesPage.clickOnBack();

    }

    @Then("Verify the detailed display of the schedule with {string} and {string} options for Physio Assessment")
    public void verifyTheDetailedDisplayOfTheScheduleWithAndOptionsForPhysioAssessment(String reminder, String reschedule) {
        //day, month, date, start time, duration and end time
        Assert.assertTrue(schedulesPage.isDateDayMonthDisplayed(), "The DAY, MONTH DATE displayed is INVALID/INCORRECT");
        Assert.assertTrue(schedulesPage.isStartTimeDurationDisplayed(), "The start time and Duration displayed is INVALID/INCORRECT");
        schedulesPage.clickOnStartTimeDuration();
        Assert.assertTrue(schedulesPage.isStartEndTimeDisplayed(), "The Expected Time Displayed is INVALID/INCORRECT");

        //location
        Assert.assertTrue(schedulesPage.isLocationNameDisplayed(), "The Location name displayed is INVALID/INCORRECT");

        //reminder and reschedule
        Assert.assertTrue(schedulesPage.isReminderIconDisplayed(reminder), "The Reminder Icon is NOT Displayed");
        Assert.assertTrue(schedulesPage.isReminderOptionDisplayed(reminder), "The Reminder option is NOT Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedOne(reschedule), "The Reschedule Icon 1 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedTwo(reschedule), "The Reschedule Icon 2 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleOptionDisplayed(reschedule), "The Reschedule option is not Displayed");

        //squad member
        Assert.assertTrue(schedulesPage.isSquadMemberTitleDisplayed(), "The Squad Member title displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadMemberAssignedTextDisplayed(), "The Squad Member Assigned text is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadDetailsInfoTextDisplayed(), "The Squad Details info text is INCORRECT/INVALID");

        //what to expect
        Assert.assertTrue(schedulesPage.isWhatToExpectText(), "The What to expect text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isPhysioAssessmentWhatToExpectInfoDisplayed(), "The what to expect in physio assessment info displayed is INCORRECT/INVALID");

        //prepare for your test
        Assert.assertTrue(schedulesPage.isPrepareTestText(), "The prepare test text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isPhysioAssessmentPrepareFourYourTestTitleDisplayed(), "The Prepare four your test in physio assessment title displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isPhysioAssessmentPrepareFourYourTestInfoOneDisplayed(), "The Prepare four your test in physio assessment info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isPhysioAssessmentPrepareFourYourTestInfoTwoDisplayed(), "The Prepare four your test in physio assessment info TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isPhysioAssessmentPrepareFourYourTestInfoThreeDisplayed(), "The Prepare four your test in physio assessment info THREE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isPhysioAssessmentPrepareFourYourTestInfoFourDisplayed(), "The Prepare four your test in physio assessment info FOUR displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isPhysioAssessmentPrepareFourYourTestInfoFiveDisplayed(), "The Prepare four your test in physio assessment info FIVE displayed is INCORRECT/INVALID");

        //why to take these tests
        Assert.assertTrue(schedulesPage.isWhyTakingTestText(), "The why taking test text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isPhysioAssessmentTestTogetherInfo(), "The test together in physio assessment info displayed is INCORRECT/INVALID");

        //caution
        Assert.assertTrue(schedulesPage.isCardiacAndImagingTestCautionInfoDisplayed(), "The caution in Cardiac And Imaging Test info displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationCautionSymbolDisplayed(), "The caution symbol in Hormonal Health Consultation is NOT DISPLAYED");

        //back
        schedulesPage.clickOnBack();

    }

    @Then("Verify the detailed display of the schedule with {string} and {string} options for Doctor Appointment")
    public void verifyTheDetailedDisplayOfTheScheduleWithAndOptionsForDoctorAppointment(String reminder, String reschedule) {
        //day, month, date, start time, duration and end time
        Assert.assertTrue(schedulesPage.isDateDayMonthDisplayed(), "The DAY, MONTH DATE displayed is INVALID/INCORRECT");
        Assert.assertTrue(schedulesPage.isStartTimeDurationDisplayed(), "The start time and Duration displayed is INVALID/INCORRECT");
        schedulesPage.clickOnStartTimeDuration();
        Assert.assertTrue(schedulesPage.isStartEndTimeDisplayed(), "The Expected Time Displayed is INVALID/INCORRECT");

        //location
        Assert.assertTrue(schedulesPage.isLocationNameDisplayed(), "The Location name displayed is INVALID/INCORRECT");

        //reminder and reschedule
        Assert.assertTrue(schedulesPage.isReminderIconDisplayed(reminder), "The Reminder Icon is NOT Displayed");
        Assert.assertTrue(schedulesPage.isReminderOptionDisplayed(reminder), "The Reminder option is NOT Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedOne(reschedule), "The Reschedule Icon 1 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedTwo(reschedule), "The Reschedule Icon 2 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleOptionDisplayed(reschedule), "The Reschedule option is not Displayed");

        //squad member
        Assert.assertTrue(schedulesPage.isSquadMemberTitleDisplayed(), "The Squad Member title displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadMemberAssignedTextDisplayed(), "The Squad Member Assigned text is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadDetailsInfoTextDisplayed(), "The Squad Details info text is INCORRECT/INVALID");

        //what to expect
        Assert.assertTrue(schedulesPage.isWhatToExpectText(), "The What to expect text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorAppointmentWhatToExpectInfoOneDisplayed(), "The what to expect in doctor appointment info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorAppointmentWhatToExpectInfoTwoDisplayed(), "The what to expect in doctor appointment info TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorAppointmentWhatToExpectInfoThreeDisplayed(), "The what to expect in doctor appointment info THREE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorAppointmentWhatToExpectInfoFourDisplayed(), "The what to expect in doctor appointment info FOUR displayed is INCORRECT/INVALID");

        //prepare for the appointment
        Assert.assertTrue(schedulesPage.isPrepareForYourAppointmentDisplayed(), "The prepare for your appointment displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorAppointmentPrepareForYourAppointmentInfoOneDisplayed(), "The prepare for your appointment in doctor appointment info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorAppointmentPrepareForYourAppointmentInfoTwoDisplayed(), "The prepare for your appointment in doctor appointment info TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorAppointmentPrepareForYourAppointmentInfoThreeDisplayed(), "The prepare for your appointment in doctor appointment info THREE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorAppointmentPrepareForYourAppointmentInfoFourDisplayed(), "The prepare for your appointment in doctor appointment info FOUR displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorAppointmentPrepareForYourAppointmentInfoFiveDisplayed(), "The prepare for your appointment in doctor appointment info FIVE displayed is INCORRECT/INVALID");

        //post sample collection
        Assert.assertTrue(schedulesPage.isSampleCollectionText(), "The sample collection text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorAppointmentPostSampleCollectionInfoOneDisplayed(), "The post sample collection in doctor appointment info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorAppointmentPostSampleCollectionInfoTwoDisplayed(), "The post sample collection in doctor appointment info TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorAppointmentPostSampleCollectionInfoThreeDisplayed(), "The post sample collection in doctor appointment info THREE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorAppointmentPostSampleCollectionInfoFourDisplayed(), "The post sample collection in doctor appointment info FOUR displayed is INCORRECT/INVALID");

        //caution
        Assert.assertTrue(schedulesPage.isDoctorAppointmentCautionInfoOneDisplayed(), "The caution in doctor appointment info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorAppointmentCautionInfoTwoDisplayed(), "The caution in doctor appointment info TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorAppointmentCautionInfoThreeDisplayed(), "The caution in doctor appointment info THREE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationCautionSymbolDisplayed(), "The caution symbol in Hormonal Health Consultation is NOT DISPLAYED");

        //back
        schedulesPage.clickOnBack();
    }

    @Then("Verify the detailed display of the schedule with {string} and {string} options for CGM Patch Application")
    public void verifyTheDetailedDisplayOfTheScheduleWithAndOptionsForCGMPatchApplication(String reminder, String reschedule) {
        //day, month, date, start time, duration and end time
        Assert.assertTrue(schedulesPage.isDateDayMonthDisplayed(), "The DAY, MONTH DATE displayed is INVALID/INCORRECT");
        Assert.assertTrue(schedulesPage.isStartTimeDurationDisplayed(), "The start time and Duration displayed is INVALID/INCORRECT");
        schedulesPage.clickOnStartTimeDuration();
        Assert.assertTrue(schedulesPage.isStartEndTimeDisplayed(), "The Expected Time Displayed is INVALID/INCORRECT");

        //location
        Assert.assertTrue(schedulesPage.isLocationNameDisplayed(), "The Location name displayed is INVALID/INCORRECT");

        //reminder and reschedule
        Assert.assertTrue(schedulesPage.isReminderIconDisplayed(reminder), "The Reminder Icon is NOT Displayed");
        Assert.assertTrue(schedulesPage.isReminderOptionDisplayed(reminder), "The Reminder option is NOT Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedOne(reschedule), "The Reschedule Icon 1 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedTwo(reschedule), "The Reschedule Icon 2 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleOptionDisplayed(reschedule), "The Reschedule option is not Displayed");

        //squad member
        Assert.assertTrue(schedulesPage.isSquadMemberTitleDisplayed(), "The Squad Member title displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadMemberAssignedTextDisplayed(), "The Squad Member Assigned text is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadDetailsInfoTextDisplayed(), "The Squad Details info text is INCORRECT/INVALID");

        //why to take these tests
        Assert.assertTrue(schedulesPage.isWhyTakingTestText(), "The why taking test text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCGMPatchApplicationTestTogetherInfoOneDisplayed(), "The test together in CGM patch application info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCGMPatchApplicationTestTogetherInfoTwoDisplayed(), "The test together in CGM patch application info TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCGMPatchApplicationTestTogetherInfoThreeDisplayed(), "The test together in CGM patch application info THREE displayed is INCORRECT/INVALID");

        //post sample collection
        Assert.assertTrue(schedulesPage.isSampleCollectionText(), "The sample collection text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isCGMPatchApplicationPostSampleCollectionInfoDisplayed(), "The post sample collection in CGM patch application info displayed is INCORRECT/INVALID");

        //caution
        Assert.assertTrue(schedulesPage.isCGMPatchApplicationCautionInfoDisplayed(), "The caution in CGM patch application info displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationCautionSymbolDisplayed(), "The caution symbol in Hormonal Health Consultation is NOT DISPLAYED");

        //back
        schedulesPage.clickOnBack();
    }

    @Then("Verify the detailed display of the schedule with {string} and {string} options for Nutritionist Appointment")
    public void verifyTheDetailedDisplayOfTheScheduleWithAndOptionsForNutritionistAppointment(String reminder, String reschedule) {
        //day, month, date, start time, duration and end time
        Assert.assertTrue(schedulesPage.isDateDayMonthDisplayed(), "The DAY, MONTH DATE displayed is INVALID/INCORRECT");
        Assert.assertTrue(schedulesPage.isStartTimeDurationDisplayed(), "The start time and Duration displayed is INVALID/INCORRECT");
        schedulesPage.clickOnStartTimeDuration();
        Assert.assertTrue(schedulesPage.isStartEndTimeDisplayed(), "The Expected Time Displayed is INVALID/INCORRECT");

        //location
        Assert.assertTrue(schedulesPage.isLocationNameDisplayed(), "The Location name displayed is INVALID/INCORRECT");

        //reminder and reschedule
        Assert.assertTrue(schedulesPage.isReminderIconDisplayed(reminder), "The Reminder Icon is NOT Displayed");
        Assert.assertTrue(schedulesPage.isReminderOptionDisplayed(reminder), "The Reminder option is NOT Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedOne(reschedule), "The Reschedule Icon 1 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedTwo(reschedule), "The Reschedule Icon 2 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleOptionDisplayed(reschedule), "The Reschedule option is not Displayed");

        //squad member
        Assert.assertTrue(schedulesPage.isSquadMemberTitleDisplayed(), "The Squad Member title displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadMemberAssignedTextDisplayed(), "The Squad Member Assigned text is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadDetailsInfoTextDisplayed(), "The Squad Details info text is INCORRECT/INVALID");

        //Agenda
        Assert.assertTrue(schedulesPage.isAgendaTextDisplayed(), "The Agenda text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentAgendaTitleOneDisplayed(), "The agenda title in nutritionist appointment info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentAgendaInfoOneDisplayed(), "The agenda in nutritionist appointment info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentAgendaInfoTwoDisplayed(), "The agenda in nutritionist appointment info TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentAgendaInfoThreeDisplayed(), "The agenda in nutritionist appointment info THREE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentAgendaInfoFourDisplayed(), "The agenda in nutritionist appointment info FOUR displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentAgendaInfoFiveDisplayed(), "The agenda in nutritionist appointment info FIVE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentAgendaInfoSixDisplayed(), "The agenda in nutritionist appointment info SIX displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentAgendaTitleTwoDisplayed(), "The agenda title in nutritionist appointment info TWO displayed is INCORRECT/INVALID");

        //scheduled appointment
        Assert.assertTrue(schedulesPage.isScheduledAppointmentTextDisplayed(), "The scheduled appointment in doctor appointment text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentScheduledAppointmentInfoOneDisplayed(), "The scheduled appointment title in nutritionist appointment info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentScheduledAppointmentInfoTwoDisplayed(), "The scheduled appointment title in nutritionist appointment info TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentScheduledAppointmentInfoThreeDisplayed(), "The scheduled appointment title in nutritionist appointment info THREE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentScheduledAppointmentInfoFourDisplayed(), "The scheduled appointment title in nutritionist appointment info FOUR displayed is INCORRECT/INVALID");

        //what to expect
        Assert.assertTrue(schedulesPage.isWhatToExpectText(), "The What to expect text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentWhatToExpectInfoOneDisplayed(), "The scheduled appointment title in nutritionist appointment info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentWhatToExpectInfoTwoDisplayed(), "The scheduled appointment title in nutritionist appointment info TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentWhatToExpectInfoThreeDisplayed(), "The scheduled appointment title in nutritionist appointment info THREE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentWhatToExpectInfoFourDisplayed(), "The scheduled appointment title in nutritionist appointment info FOUR displayed is INCORRECT/INVALID");

        //prepare for the appointment
        Assert.assertTrue(schedulesPage.isPrepareForYourAppointmentDisplayed(), "The prepare for your appointment displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentPrepareForYourAppointmentInfoOneDisplayed(), "The prepare for your appointment in nutritionist appointment info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentPrepareForYourAppointmentInfoTwoDisplayed(), "The prepare for your appointment in nutritionist appointment info TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentPrepareForYourAppointmentInfoThreeDisplayed(), "The prepare for your appointment in nutritionist appointment info THREE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentPrepareForYourAppointmentInfoFourDisplayed(), "The prepare for your appointment in nutritionist appointment info FOUR displayed is INCORRECT/INVALID");

        //appointment together
        Assert.assertTrue(schedulesPage.isAppointmentTogetherDisplayed(), "The appointment together text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentAppointmentTogetherInfoOneDisplayed(), "The appointment together in nutritionist appointment info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentAppointmentTogetherInfoTwoDisplayed(), "The appointment together in nutritionist appointment info TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentAppointmentTogetherInfoThreeDisplayed(), "The appointment together in nutritionist appointment info THREE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentAppointmentTogetherInfoFourDisplayed(), "The appointment together in nutritionist appointment info FOUR displayed is INCORRECT/INVALID");

        //post sample collection
        Assert.assertTrue(schedulesPage.isSampleCollectionText(), "The sample collection text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentPostSampleCollectionInfoOneDisplayed(), "The post sample collection in nutritionist appointment info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentPostSampleCollectionInfoTwoDisplayed(), "The post sample collection in nutritionist appointment info TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentPostSampleCollectionInfoThreeDisplayed(), "The post sample collection in nutritionist appointment info THREE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isNutritionistAppointmentPostSampleCollectionInfoFourDisplayed(), "The post sample collection in nutritionist appointment info FOUR displayed is INCORRECT/INVALID");

        //back
        schedulesPage.clickOnBack();
    }

    @Then("Verify the detailed display of the schedule with {string} and {string} options for Consent for genetic and gut tests, and MSQ")
    public void verifyTheDetailedDisplayOfTheScheduleWithAndOptionsForConsentForGeneticAndGutTestsAndMSQ(String reminder, String reschedule) {
        //day, month, date, start time, duration and end time
        Assert.assertTrue(schedulesPage.isDateDayMonthDisplayed(), "The DAY, MONTH DATE displayed is INVALID/INCORRECT");
        Assert.assertTrue(schedulesPage.isStartTimeDurationDisplayed(), "The start time and Duration displayed is INVALID/INCORRECT");
        schedulesPage.clickOnStartTimeDuration();
        Assert.assertTrue(schedulesPage.isStartEndTimeDisplayed(), "The Expected Time Displayed is INVALID/INCORRECT");

        //location
        Assert.assertTrue(schedulesPage.isLocationNameDisplayed(), "The Location name displayed is INVALID/INCORRECT");

        //reminder and reschedule
        Assert.assertTrue(schedulesPage.isReminderIconDisplayed(reminder), "The Reminder Icon is NOT Displayed");
        Assert.assertTrue(schedulesPage.isReminderOptionDisplayed(reminder), "The Reminder option is NOT Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedOne(reschedule), "The Reschedule Icon 1 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedTwo(reschedule), "The Reschedule Icon 2 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleOptionDisplayed(reschedule), "The Reschedule option is not Displayed");

        //squad member
        Assert.assertTrue(schedulesPage.isSquadMemberTitleDisplayed(), "The Squad Member title displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadMemberAssignedTextDisplayed(), "The Squad Member Assigned text is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadDetailsInfoTextDisplayed(), "The Squad Details info text is INCORRECT/INVALID");

        //what to expect
        Assert.assertTrue(schedulesPage.isWhatToExpectText(), "The What to expect text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isConsentForGeneticAndGutTestsAndMSQWhatToExpectInfoDisplayed(), "The what to expect in Consent For Genetic And Gut Tests And MSQ info displayed is INCORRECT/INVALID");

        //prepare for the appointment
        Assert.assertTrue(schedulesPage.isPrepareForYourAppointmentDisplayed(), "The prepare for your appointment displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isConsentForGeneticAndGutTestsAndMSQPrepareForYourAppointmentInfoDisplayed(), "The prepare for your appointment in Consent For Genetic And Gut Tests And MSQ info displayed is INCORRECT/INVALID");

        //appointment together
        Assert.assertTrue(schedulesPage.isAppointmentTogetherDisplayed(), "The appointment together text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isConsentForGeneticAndGutTestsAndMSQAppointmentTogetherInfoDisplayed(), "The appointment together in Consent For Genetic And Gut Tests And MSQ info displayed is INCORRECT/INVALID");

        //post sample collection
        Assert.assertTrue(schedulesPage.isSampleCollectionText(), "The sample collection text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isConsentForGeneticAndGutTestsAndMSQPostSampleCollectionInfoDisplayed(), "The post sample collection in Consent For Genetic And Gut Tests And MSQ info displayed is INCORRECT/INVALID");

        //back
        schedulesPage.clickOnBack();
    }

    @Then("Verify the detailed display of the schedule with {string}, {string} and {string} options for Doctor Onboarding Call")
    public void verifyTheDetailedDisplayOfTheScheduleWithAndOptionsForDoctorOnboardingCall(String reminder, String reschedule, String navigate) {
        //day, month, date, start time, duration and end time
        Assert.assertTrue(schedulesPage.isDateDayMonthDisplayed(), "The DAY, MONTH DATE displayed is INVALID/INCORRECT");
        Assert.assertTrue(schedulesPage.isStartTimeDurationDisplayed(), "The start time and Duration displayed is INVALID/INCORRECT");
        schedulesPage.clickOnStartTimeDuration();
        Assert.assertTrue(schedulesPage.isStartEndTimeDisplayed(), "The Expected Time Displayed is INVALID/INCORRECT");

        //location
        Assert.assertTrue(schedulesPage.isLocationNameDisplayed(), "The Location name displayed is INVALID/INCORRECT");

        //reminder and reschedule
        Assert.assertTrue(schedulesPage.isReminderIconDisplayed(reminder), "The Reminder Icon is NOT Displayed");
        Assert.assertTrue(schedulesPage.isReminderOptionDisplayed(reminder), "The Reminder option is NOT Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedOne(reschedule), "The Reschedule Icon 1 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedTwo(reschedule), "The Reschedule Icon 2 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleOptionDisplayed(reschedule), "The Reschedule option is not Displayed");
        Assert.assertTrue(schedulesPage.isNavigateIconDisplayed(navigate), "The Navigate Icon is not displayed");
        Assert.assertTrue(schedulesPage.isNavigateOptionDisplayed(navigate), "The Navigate Icon is not displayed");

        //squad member
        Assert.assertTrue(schedulesPage.isSquadMemberTitleDisplayed(), "The Squad Member title displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadMemberAssignedTextDisplayed(), "The Squad Member Assigned text is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadDetailsInfoTextDisplayed(), "The Squad Details info text is INCORRECT/INVALID");

        //what to expect
        Assert.assertTrue(schedulesPage.isWhatToExpectText(), "The What to expect text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorOnboardingCallWhatToExpectTitleDisplayed(), "The what to expect in Doctor Onboarding Call title displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorOnboardingCallWhatToExpectInfoOneDisplayed(), "The what to expect in Doctor Onboarding Call info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorOnboardingCallWhatToExpectInfoTwoDisplayed(), "The what to expect in Doctor Onboarding Call info TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorOnboardingCallWhatToExpectInfoThreeDisplayed(), "The what to expect in Doctor Onboarding Call info THREE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorOnboardingCallWhatToExpectInfoFourDisplayed(), "The what to expect in Doctor Onboarding Call info FOUR displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorOnboardingCallWhatToExpectInfoFiveDisplayed(), "The what to expect in Doctor Onboarding Call info FIVE displayed is INCORRECT/INVALID");

        //prepare for the appointment
        Assert.assertTrue(schedulesPage.isPrepareForYourAppointmentDisplayed(), "The prepare for your appointment displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorOnboardingCallPrepareForYourAppointmentTitleDisplayed(), "The prepare for your appointment in Doctor Onboarding Call title displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorOnboardingCallPrepareForYourAppointmentInfoOneDisplayed(), "The prepare for your appointment in Doctor Onboarding Call info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorOnboardingCallPrepareForYourAppointmentInfoTwoDisplayed(), "The prepare for your appointment in Doctor Onboarding Call info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorOnboardingCallPrepareForYourAppointmentInfoThreeDisplayed(), "The prepare for your appointment in Doctor Onboarding Call info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorOnboardingCallPrepareForYourAppointmentInfoFourDisplayed(), "The prepare for your appointment in Doctor Onboarding Call info ONE displayed is INCORRECT/INVALID");

        //appointment together
        Assert.assertTrue(schedulesPage.isAppointmentTogetherDisplayed(), "The appointment together text displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorOnboardingCallAppointmentTogetherInfoDisplayed(), "The appointment together in Doctor Onboarding Call info displayed is INCORRECT/INVALID");

        //caution
        Assert.assertTrue(schedulesPage.isDoctorOnboardingCallCautionInfoOneDisplayed(), "The caution in Doctor Onboarding Call info ONE displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isDoctorOnboardingCallCautionInfoTwoDisplayed(), "The caution in Doctor Onboarding Call info TWO displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isHormonalHealthConsultationCautionSymbolDisplayed(), "The caution symbol in Hormonal Health Consultation is NOT DISPLAYED");

        //back
        schedulesPage.clickOnBack();
    }

    @Then("Verify the detailed display of the schedule with {string}, {string} and {string} options for Doctor Consultation - Cardiovascular Risk Review")
    public void verifyTheDetailedDisplayOfTheScheduleWithAndOptionsForDoctorConsultationCardiovascularRiskReview(String reminder, String reschedule, String navigate) {
        //day, month, date, start time, duration and end time
        Assert.assertTrue(schedulesPage.isDateDayMonthDisplayed(), "The DAY, MONTH DATE displayed is INVALID/INCORRECT");
        Assert.assertTrue(schedulesPage.isStartTimeDurationDisplayed(), "The start time and Duration displayed is INVALID/INCORRECT");
        schedulesPage.clickOnStartTimeDuration();
        Assert.assertTrue(schedulesPage.isStartEndTimeDisplayed(), "The Expected Time Displayed is INVALID/INCORRECT");

        //location
        Assert.assertTrue(schedulesPage.isLocationNameDisplayed(), "The Location name displayed is INVALID/INCORRECT");

        //reminder and reschedule
        Assert.assertTrue(schedulesPage.isReminderIconDisplayed(reminder), "The Reminder Icon is NOT Displayed");
        Assert.assertTrue(schedulesPage.isReminderOptionDisplayed(reminder), "The Reminder option is NOT Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedOne(reschedule), "The Reschedule Icon 1 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleIconDisplayedTwo(reschedule), "The Reschedule Icon 2 is not Displayed");
        Assert.assertTrue(schedulesPage.isRescheduleOptionDisplayed(reschedule), "The Reschedule option is not Displayed");
        Assert.assertTrue(schedulesPage.isNavigateIconDisplayed(navigate), "The Navigate Icon is not displayed");
        Assert.assertTrue(schedulesPage.isNavigateOptionDisplayed(navigate), "The Navigate Icon is not displayed");

        //squad member
        Assert.assertTrue(schedulesPage.isSquadMemberTitleDisplayed(), "The Squad Member title displayed is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadMemberAssignedTextDisplayed(), "The Squad Member Assigned text is INCORRECT/INVALID");
        Assert.assertTrue(schedulesPage.isSquadDetailsInfoTextDisplayed(), "The Squad Details info text is INCORRECT/INVALID");

        //what to expect
        Assert.assertTrue(schedulesPage.isWhatToExpectText(), "The What to expect text displayed is INCORRECT/INVALID");

        //prepare for the appointment
        Assert.assertTrue(schedulesPage.isPrepareForYourAppointmentDisplayed(), "The prepare for your appointment displayed is INCORRECT/INVALID");

        //appointment together
        Assert.assertTrue(schedulesPage.isAppointmentTogetherDisplayed(), "The appointment together text displayed is INCORRECT/INVALID");

        //appointment together
        Assert.assertTrue(schedulesPage.isAppointmentTogetherDisplayed(), "The appointment together text displayed is INCORRECT/INVALID");

        //back
        schedulesPage.clickOnBack();
    }

    @And("Click on the calendar icon")
    public void clickOnTheCalendarIcon() {
        schedulesPage.clickOnCalendarIcon();
    }

    @Then("Verify the schedules displayed under {string} section")
    public void verifyTheSchedulesDisplayedUnderSection(String option) {
        Assert.assertTrue(schedulesPage.isScheduleTextDisplayed());
        schedulesPage.clickOnOptions(option);
    }
}
