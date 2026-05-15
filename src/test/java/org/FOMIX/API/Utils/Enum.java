package org.FOMIX.API.Utils;

import io.cucumber.java.af.En;

public enum Enum {
    //enum is a special class in java which has collection of constants or methods

    LoginAPI("auth/v1/verify"),
    LogoutAPI("auth/v1/logout"),
    MemberToDoAPI("api/v2/to_do_settings"),

    ToDoSettingsList("/api/v2/to_do_settings/list"),

    DeleteToDo("/api/v2/to_do_settings/"),
    ScheduleAPI("/api/v2/schedules"),
    ScheduleList("/api/v2/schedules/list"),
    ScheduleDelete("/api/v2/schedules/"),
    MemberListAPI("/api/v2/members/list"),
    PrescriptionListAPI("/api/v2/prescriptions/list"),
    DeletePrescriptionAPI("/api/v2/prescriptions/");


    final String resource;

    Enum(String resource) {
        this.resource = resource;
    }

    public String getResource() {
        return resource;
    }
}
