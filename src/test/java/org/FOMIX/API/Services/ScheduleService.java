package org.FOMIX.API.Services;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.FOMIX.API.Utils.Enum;
import org.FOMIX.API.Utils.EnvironmentUtils;

import java.util.*;

import static io.restassured.RestAssured.given;

public class ScheduleService {
    private final String token;

    public ScheduleService(String token) {
        this.token = token;
        RestAssured.baseURI = EnvironmentUtils.getRequestURI();
    }

    public List<String> getAllScheduleIds(String memberId) {

        int page = 1;
        int totalPage = 1;
        List<String> allIds = new ArrayList<>();

        do {
            Map<String, Object> body = buildListPayload(page, memberId);

            System.out.println(Enum.ScheduleList.getResource());

            String response = given().header("authorization", "Bearer " + token)
                    .contentType(ContentType.JSON)
                    .body(body)
                    .when().post(Enum.ScheduleList.getResource())
                    .then().statusCode(200)
                    .extract().response().asString();

            System.out.println(response);

            JsonPath jsonPath = new JsonPath(response);
            List<String> ids = jsonPath.getList("items.id");

            if (ids.isEmpty()) {
                System.out.println("There are no schedules for this memberId: " + memberId);
                break;
            }

            allIds.addAll(ids);

            totalPage = jsonPath.getInt("pagination.pages");
            page++;
        } while (page <= totalPage);
        return allIds;
    }

    public void deleteAllSchedules(String memberId) {
        List<String> ids = getAllScheduleIds(memberId);

        if (ids.isEmpty()) {
            System.out.println("No schedules present for deletion.");
            return;
        }

        System.out.println("Total schedule to delete = " + ids.size());

        for (String id : ids) {
            given().header("authorization", "Bearer " + token)
                    .queryParam("cascade", true)
                    .when().delete(Enum.ScheduleDelete.getResource() + id)
                    .then().statusCode(200);

            System.out.println("Deleted schedules ID: " + id);
        }
    }

    private Map<String, Object> buildListPayload(int page, String memberId) {
        Map<String, Object> body = new HashMap<>();
        body.put("page", page);
        body.put("size", 10);

        List<String> includeRelations = Arrays.asList(
                "member",
                "squad",
                "care_specialist",
                "schedule");

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
