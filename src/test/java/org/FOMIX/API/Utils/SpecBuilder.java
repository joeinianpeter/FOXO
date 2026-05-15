package org.FOMIX.API.Utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
public class SpecBuilder {

    public static RequestSpecification requestSpecification;

    public static RequestSpecification loginRequest() {
        System.out.println(EnvironmentUtils.getBaseURI());
        return requestSpecification = new RequestSpecBuilder()
                .setBaseUri(EnvironmentUtils.getBaseURI())
                .addHeader("apikey", EnvironmentUtils.getAPIKey())
                .addHeader("authorization", EnvironmentUtils.getAuthorization())
                .setContentType(ContentType.JSON)
                .build();

    }

    public static RequestSpecification logoutRequest() {

        return requestSpecification = new RequestSpecBuilder()
                .setBaseUri(EnvironmentUtils.getBaseURI())
                .addQueryParam("scope", "global")
                .addHeader("apikey", EnvironmentUtils.getAPIKey())
                .addHeader("authorization", "Bearer " + AppConstants.getAccessToken())
                .setContentType(ContentType.JSON)
                .build();

    }

    public static RequestSpecification memberListRequest(){

        return requestSpecification = new RequestSpecBuilder()
                .setBaseUri(EnvironmentUtils.getRequestURI())
                .addHeader("authorization", "Bearer "+AppConstants.getAccessToken())
                .setContentType(ContentType.JSON)
                .build();
    }

    public static RequestSpecification memberToDoRequest(){

        return requestSpecification = new RequestSpecBuilder()
                .setBaseUri(EnvironmentUtils.getRequestURI())
                .addHeader("authorization", "Bearer "+AppConstants.getAccessToken())
                .setContentType(ContentType.JSON)
                .build();

    }

    public static RequestSpecification scheduleRequest(){

        return requestSpecification = new RequestSpecBuilder()
                .setBaseUri(EnvironmentUtils.getRequestURI())
                .addHeader("authorization", "Bearer "+AppConstants.getAccessToken())
                .setContentType(ContentType.JSON)
                .build();
    }

}

