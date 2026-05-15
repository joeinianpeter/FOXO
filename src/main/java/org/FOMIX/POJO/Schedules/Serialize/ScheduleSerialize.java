package org.FOMIX.POJO.Schedules.Serialize;

public class ScheduleSerialize {

    private boolean is_internal;
    private String member_id;
    private String event_id;
    private String title;
    private String description;
    private String start_time;
    private String end_time;
    private String duration;
    private String recurrence;
    private String meet_link;
    private String location_id;
    private String squad_id;
    private String care_specialist_id;
    private String status;
    private String participants;

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getLocation_id() {
        return location_id;
    }

    public void setLocation_id(String location_id) {
        this.location_id = location_id;
    }

    public String getSquad_id() {
        return squad_id;
    }

    public void setSquad_id(String squad_id) {
        this.squad_id = squad_id;
    }

    public String getCare_specialist_id() {
        return care_specialist_id;
    }

    public void setCare_specialist_id(String care_specialist_id) {
        this.care_specialist_id = care_specialist_id;
    }

    public String getMeet_link() {
        return meet_link;
    }

    public void setMeet_link(String meet_link) {
        this.meet_link = meet_link;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getRecurrence() {
        return recurrence;
    }

    public void setRecurrence(String recurrence) {
        this.recurrence = recurrence;
    }

    public String getParticipants() {
        return participants;
    }

    public void setParticipants(String participants) {
        this.participants = participants;
    }

    public boolean isIs_internal() {
        return is_internal;
    }

    public void setIs_internal(boolean is_internal) {
        this.is_internal = is_internal;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
