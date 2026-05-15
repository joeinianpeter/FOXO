package org.FOMIX.API.Payloads.Schedules;

import org.FOMIX.API.Utils.AppConstants;
import org.FOMIX.API.Utils.DateUtils;
import org.FOMIX.API.Utils.Faker;
import org.FOMIX.POJO.Schedules.Serialize.ScheduleSerialize;

public class SchedulesPayload {

    public static ScheduleSerialize buildSchedulePayload(String eventID, String locationID, String startDate, String startTime, String endDate, String endTime, String squad, String careSpecialist) {

        ScheduleSerialize scheduleSerialize = new ScheduleSerialize();
        scheduleSerialize.setMember_id(AppConstants.getMemberId());

        //event id
        String eventId = EventIdResolver.getEventID(eventID);
        scheduleSerialize.setEvent_id(eventId);

        //squad id
        String squadId = SquadIDResolver.getSquadID(squad);
        System.out.println("squad id" + squadId);
        scheduleSerialize.setSquad_id(squadId);

        //care specialist
        String careSpecialistId = CareSpecialistIDResolver.getCareSpecialistId(careSpecialist);
        System.out.println("care specialist id" + careSpecialistId);
        scheduleSerialize.setCare_specialist_id(careSpecialistId);

        //title and description
        String title = Faker.generateTitle();
        String description = Faker.generateDescription();

        scheduleSerialize.setTitle(title);
        scheduleSerialize.setDescription(description);

        // Convert to UTC ISO format
        String startDateTime = DateUtils.toUTC(startDate, startTime);
        String endDateTime = DateUtils.toUTC(endDate, endTime);

        //start and end time
        scheduleSerialize.setStart_time(startDateTime);
        scheduleSerialize.setEnd_time(endDateTime);

        //location
        String locationId = LocationIdResolver.getLocationId(locationID);
        scheduleSerialize.setLocation_id(locationId);

        scheduleSerialize.setMeet_link("");
        scheduleSerialize.setStatus("");
        scheduleSerialize.setIs_internal(false);
        scheduleSerialize.setRecurrence("");
        scheduleSerialize.setParticipants("");
        scheduleSerialize.setDuration("");

        return scheduleSerialize;
    }
}
