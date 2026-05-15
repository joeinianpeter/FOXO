package org.FOMIX.API.StepDefinition;

import com.github.javafaker.App;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.FOMIX.API.Payloads.MemberToDo.MembersToDoPayload;
import org.FOMIX.API.Services.ToDoSettingsService;
import org.FOMIX.API.Utils.AppConstants;
import org.FOMIX.API.Utils.JsonUtils;
import org.FOMIX.API.Utils.SharedContext;
import org.FOMIX.API.Utils.SpecBuilder;
import org.FOMIX.POJO.MemberToDo.Deserialize.MembersToDoDeserialize;
import org.FOMIX.POJO.MemberToDo.Serialize.MemberToDo;

import static io.restassured.RestAssured.*;


public class MembersToDoStepDefinition{

    RequestSpecification requestSpecification;

    private final SharedContext sharedContext;

    public MembersToDoStepDefinition(SharedContext sharedContext){
        this.sharedContext = sharedContext;
    }

    @Given("Add the members to-do task payload with category {string}, status {string}, occurrence {string}, start date {string}, and time {string}, end date {string}, and time {string}")
    public void addTheMembersToDoTaskPayloadWithCategoryStatusOccurrenceStartDateAndTimeEndDateAndTime(String category, String status, String occurrence, String startDate, String startTime, String endDate, String endTime) {
        MemberToDo payload = MembersToDoPayload.buildToDoPayload(category, status, occurrence, startDate, startTime, endDate, endTime);

        sharedContext.setRequestSpecification(requestSpecification = given()
                .spec(SpecBuilder.memberToDoRequest())
                .body(payload));
    }

    @And("Extract the response")
    public void extractTheResponse() {
        String jsonResponse = sharedContext.getResponse().asString();

        MembersToDoDeserialize membersToDoDeserialize = JsonUtils.deserialize(jsonResponse, MembersToDoDeserialize.class);
        String taskId = membersToDoDeserialize.getId();
        String category = membersToDoDeserialize.getTask_category();
        String title = membersToDoDeserialize.getTitle();
        String description = membersToDoDeserialize.getDescription();
        String startDateTime = membersToDoDeserialize.getStart_date();
        String endDateTime = membersToDoDeserialize.getEnd_date();
        String recurrence = membersToDoDeserialize.getRecurrence();
        String status = membersToDoDeserialize.getStatus();

        AppConstants.setMemberToDoTaskTitle(title);

        System.out.println(taskId);
        System.out.println(category);
        System.out.println(title);
        System.out.println(description);
        System.out.println(startDateTime);
        System.out.println(endDateTime);
        System.out.println(recurrence);
        System.out.println(status);

    }

    @Given("Delete all existing To-Do tasks for the member")
    public void deleteAllExistingToDoTasksForTheMember() {
        ToDoSettingsService toDoSettingsService = new ToDoSettingsService(AppConstants.getAccessToken());
        toDoSettingsService.deleteAllToDos(AppConstants.getMemberId());
    }
}
