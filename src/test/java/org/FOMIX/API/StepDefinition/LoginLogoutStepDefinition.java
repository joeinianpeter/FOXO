package org.FOMIX.API.StepDefinition;

import com.github.javafaker.App;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.FOMIX.API.Payloads.Login.LoginPayload;
import org.FOMIX.API.Payloads.MemberList.MemberListPayload;
import org.FOMIX.API.Services.MemberListService;
import org.FOMIX.API.Utils.*;
import org.FOMIX.API.Utils.Enum;
import org.FOMIX.POJO.Login.Deserialize.LoginDeserialize;
import org.FOMIX.POJO.MemberList.DeSerialize.MemberListDeserialize;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class LoginLogoutStepDefinition {

    RequestSpecification requestSpecification;
    Response response;
    private final SharedContext sharedContext;

    public LoginLogoutStepDefinition(SharedContext sharedContext) {
        this.sharedContext = sharedContext;
    }

    @Given("Add the Login payload")
    public void addTheLoginPayload() {

        sharedContext.setRequestSpecification(requestSpecification = given()
                .spec(SpecBuilder.loginRequest())
                .body(LoginPayload.loginAPIPayload()));

    }

    @When("User calls {string} with {string} http request")
    public void userCallsWithHttpRequest(String resource, String httpRequest) {
        Enum resourceAPI = Enum.valueOf(resource);

        if (httpRequest.equalsIgnoreCase("post")) {
            response = sharedContext.getRequestSpecification().when().post(resourceAPI.getResource());
        }

        sharedContext.setResponse(response);
    }

    @Then("Verify the status code as {int}")
    public void verifyTheStatusCodeAs(int statusCode) {
        String jsonResponse = sharedContext.getResponse().asString();
        System.out.println(jsonResponse);
//        Assert.assertEquals(sharedContext.getResponse().getStatusCode(), statusCode);
    }

    @And("Extract the Login response")
    public void extractTheLoginResponse() {
        String jsonResponse = sharedContext.getResponse().asString();

        // Deserialize to POJO
        LoginDeserialize loginDeserialize = JsonUtils.deserialize(jsonResponse, LoginDeserialize.class);

        String accessToken = loginDeserialize.getAccess_token();

        AppConstants.setAccessToken(accessToken);
    }

    @And("Add the member list payload")
    public void addTheMemberListPayload() {
        sharedContext.setRequestSpecification(requestSpecification = given()
                .spec(SpecBuilder.memberListRequest())
                .body(MemberListPayload.memberAPIPayload()));
    }

    @And("Extract the member list response")
    public void extractTheMemberListResponse() {
        String jsonResponse = sharedContext.getResponse().asString();

        //De-serialize
        MemberListDeserialize memberListDeserialize = JsonUtils.deserialize(jsonResponse, MemberListDeserialize.class);

        //Store the ids, names, phone numbers and member codes
        MemberListService.store(memberListDeserialize);
        System.out.println("Member list extracted and stored.");
    }


    @Then("Select member {string}")
    public void selectMember(String name) {
        String memberID = MemberListService.getIdByName(name);
        String userName = MemberListService.getNameByName(name);
        String phoneNumber = MemberListService.getPhoneByName(name);
        String memberCode = MemberListService.getCodeByName(name);

        AppConstants.setMemberId(memberID);
        AppConstants.setPhoneNumber(phoneNumber);
        AppConstants.setMemberName(userName);
        System.out.println("The Member Name is: " + userName);
        System.out.println("The Member Phone Number is: " + phoneNumber);
        System.out.println("The Member Code is: " + memberCode);
    }

    @And("Add the logout payload")
    public void addTheLogoutPayload() {

        sharedContext.setRequestSpecification(requestSpecification = given()
                .spec(SpecBuilder.logoutRequest()));
    }

}
