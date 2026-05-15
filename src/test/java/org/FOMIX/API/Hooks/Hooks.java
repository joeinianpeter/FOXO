package org.FOMIX.API.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.FOMIX.API.Utils.AppConstants;
import org.FOMIX.API.Utils.Enum;
import org.FOMIX.API.Utils.SharedContext;
import org.FOMIX.API.Utils.SpecBuilder;
import org.testng.Assert;

import static io.restassured.RestAssured.*;

public class Hooks {

    private final SharedContext sharedContext;

    public Hooks(SharedContext sharedContext){
        this.sharedContext = sharedContext;
    }


    @After(value = "@api")
    public void logout(Scenario scenario){

        if (scenario.getSourceTagNames().contains("@SkipAutoLogout")){
            System.out.println("Skipping auto-logout for scenario (tagged @SkipAutoLogout).");
            return;
        } else if (AppConstants.getAccessToken() == null || AppConstants.getAccessToken().isEmpty()){
            System.out.println("No access token available; skipping auto-logout.");
            return;
        }

        System.out.println("Running auto-logout after scenario...");

        // Build logout request (SpecBuilder.logoutRequest will attach access token)
        sharedContext.setRequestSpecification(given()
                .spec(SpecBuilder.logoutRequest()));

        // Call LogoutAPI using Enum
        sharedContext.setResponse(sharedContext.getRequestSpecification()
                .when()
                .post(Enum.LogoutAPI.getResource()));

        Assert.assertEquals(sharedContext.getResponse().getStatusCode(), 204);
    }
}
