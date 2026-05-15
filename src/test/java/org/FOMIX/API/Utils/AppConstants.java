package org.FOMIX.API.Utils;

import lombok.Getter;

import java.util.Stack;

public class AppConstants {
    @Getter
    private static String accessToken;
    @Getter
    private static String memberId;
    @Getter
    private static String memberToDoTaskTitle;
    @Getter
    private static String title;
    @Getter
    private static String startTime;
    @Getter
    private static String day;
    @Getter
    private static String location;
    @Getter
    private static String eventName;
    @Getter
    private static String endTime;
    @Getter
    private static String phoneNumber;
    @Getter
    private static String memberName;
    @Getter
    private static String eventNameDashboard;
    @Getter
    private static String squadMember;
    @Getter
    private static String careSpecialistName;
    @Getter
    private static String meetingNotes;
    @Getter
    private static String startDay;
    @Getter
    private static String endDay;

    public static void setMemberId(String memberId) {

        AppConstants.memberId = memberId;
    }

    public static void setAccessToken(String accessToken) {

        AppConstants.accessToken = accessToken;
    }

    public static void setMemberToDoTaskTitle(String memberToDoTaskTitle) {
        AppConstants.memberToDoTaskTitle = memberToDoTaskTitle;
    }

    public static void setTitle(String title) {
        AppConstants.title = title;
    }

    public static void setStartTime(String startTime) {
        AppConstants.startTime = startTime;
    }

    public static void setEndTime(String endTime) {
        AppConstants.endTime = endTime;
    }

    public static void setDay(String day) {
        AppConstants.day = day;
    }

    public static void setLocation(String location) {
        AppConstants.location = location;
    }

    public static void setEventName(String eventName) {
        AppConstants.eventName = eventName;
    }

    public static void setPhoneNumber(String phoneNumber) {
        AppConstants.phoneNumber = phoneNumber;
    }

    public static void setMemberName(String memberName) {
        AppConstants.memberName = memberName;
    }

    public static void setEventNameDashboard(String eventNameDashboard) {
        AppConstants.eventNameDashboard = eventNameDashboard;
    }

    public static void setSquadMember(String squadMember) {
        AppConstants.squadMember = squadMember;
    }

    public static void setCareSpecialistName(String careSpecialistName) {
        AppConstants.careSpecialistName = careSpecialistName;
    }

    public static void setMeetingNotes(String meetingNotes) {
        AppConstants.meetingNotes = meetingNotes;
    }

    public static void setStartDay(String startDay) {
        AppConstants.startDay = startDay;
    }

    public static void setEndDay(String endDay) {
        AppConstants.endDay = endDay;
    }
}
