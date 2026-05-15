package org.FOMIX.API.StepDefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.specification.RequestSpecification;
import org.FOMIX.API.Payloads.Schedules.SchedulesPayload;
import org.FOMIX.API.Services.ScheduleService;
import org.FOMIX.API.Utils.AppConstants;
import org.FOMIX.API.Utils.JsonUtils;
import org.FOMIX.API.Utils.SharedContext;
import org.FOMIX.API.Utils.SpecBuilder;
import org.FOMIX.POJO.Schedules.Deserialize.ScheduleDeserialize;
import org.FOMIX.POJO.Schedules.Serialize.ScheduleSerialize;

import static io.restassured.RestAssured.*;

public class ScheduleStepDefinition {

    public SharedContext sharedContext;
    public RequestSpecification requestSpecification;

    public ScheduleStepDefinition(SharedContext sharedContext){
        this.sharedContext = sharedContext;
    }

    @Given("Add the schedule payload with event name {string} location {string}, start date {string}, start time {string}, end date {string}, end time {string}, squad {string}, care specialist {string}")
    public void addTheSchedulePayloadWithEventNameLocationStartDateStartTimeEndDateEndTimeSquadCareSpecialist(String eventName, String locationName, String startDate, String startTime, String endDate, String endTime, String squad, String careSpecialist) {
        ScheduleSerialize payload = SchedulesPayload.buildSchedulePayload(eventName, locationName, startDate, startTime, endDate, endTime, squad, careSpecialist);

        AppConstants.setDay(startDate);
        AppConstants.setLocation(locationName);
        AppConstants.setEventName(eventName);

        sharedContext.setRequestSpecification(requestSpecification = given()
                .spec(SpecBuilder.scheduleRequest())
                .body(payload));
    }

    @Then("Extract the schedule response")
    public void extractTheScheduleResponse() {
        String jsonResponse = sharedContext.getResponse().asString();

        System.out.println(jsonResponse);

        ScheduleDeserialize scheduleDeserialize = JsonUtils.deserialize(jsonResponse, ScheduleDeserialize.class);
        String scheduleId = scheduleDeserialize.getId();
        String memberId = scheduleDeserialize.getMember_id();
        String eventId = scheduleDeserialize.getEvent_id();
        String title = scheduleDeserialize.getTitle();
        String description = scheduleDeserialize.getDescription();
        String startTime = scheduleDeserialize.getStart_time();
        String endTime = scheduleDeserialize.getEnd_time();
        boolean isInternal = scheduleDeserialize.isIs_internal();
        String createdAt = scheduleDeserialize.getCreated_at();

        AppConstants.setTitle(title);
        AppConstants.setStartTime(startTime);
        AppConstants.setEndTime(endTime);

        System.out.println(scheduleId);
        System.out.println(memberId);
        System.out.println(eventId);
        System.out.println(title);
        System.out.println(description);
        System.out.println(startTime);
        System.out.println(endTime);
        System.out.println(isInternal);
        System.out.println(createdAt);
    }

    @Given("Delete all existing schedules for the member")
    public void deleteAllExistingSchedulesForTheMember() {
        ScheduleService scheduleService = new ScheduleService(AppConstants.getAccessToken());
        scheduleService.deleteAllSchedules(AppConstants.getMemberId());
    }
}
