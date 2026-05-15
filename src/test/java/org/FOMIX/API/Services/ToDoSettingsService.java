package org.FOMIX.API.Services;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.FOMIX.API.Utils.ConfigReader;
import org.FOMIX.API.Utils.Enum;
import org.FOMIX.API.Utils.EnvironmentUtils;

import java.util.*;

import static io.restassured.RestAssured.*;

public class ToDoSettingsService {

    private final String token;

    public ToDoSettingsService(String token) {
        this.token = token;
        RestAssured.baseURI = EnvironmentUtils.getRequestURI();
    }

    public List<String> getAllToDoSettingsIds(String memberId) {

        Map<String, Object> body = buildListPayload(memberId);

        String response = given().header("authorization", "Bearer " + token)
                .contentType(ContentType.JSON)
                .body(body)
                .when().post(Enum.ToDoSettingsList.getResource())
                .then().statusCode(200)
                .extract().response().asString();

        System.out.println(response);

        JsonPath jsonPath = new JsonPath(response);
        List<String> ids = jsonPath.getList("items.id");

        if (ids.isEmpty()) {
            System.out.println("There are no to-do-settings for this memberId: " + memberId);
            return Collections.emptyList();
        }

        return ids;
    }

    public void deleteAllToDos(String memberId) {
        List<String> ids = getAllToDoSettingsIds(memberId);

        if (ids.isEmpty()) {
            System.out.println("No To-Do tasks present for deletion.");
            return;
        }

        System.out.println("Total To-Do to delete = " + ids.size());

        for (String id : ids) {
            given().header("authorization", "Bearer " + token)
                    .queryParam("cascade", true)
                    .when().delete(Enum.DeleteToDo.getResource() + id)
                    .then().statusCode(200);

            System.out.println("Deleted To-Do ID: " + id);
        }
    }

    private Map<String, Object> buildListPayload(String memberId) {
        Map<String, Object> body = new HashMap<>();
        body.put("page", 1);
        body.put("size", 500);

        List<String> includeRelations = Arrays.asList(
                "member",
                "category",
                "progress_records"
        );
        body.put("include_relations", includeRelations);

        Map<String, Object> filter = new HashMap<>();
        filter.put("field", "member_id");
        filter.put("operation", "eq");
        filter.put("value", memberId);

        Map<String, Object> filterGroup = new HashMap<>();
        filterGroup.put("AND", Collections.singletonList(filter));

        body.put("filters", filterGroup);

        body.put("timezone", "Asia/Calcutta");

        return body;
    }
}
