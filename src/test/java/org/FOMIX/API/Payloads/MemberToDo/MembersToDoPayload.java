package org.FOMIX.API.Payloads.MemberToDo;

import org.FOMIX.API.Utils.AppConstants;
import org.FOMIX.API.Utils.DateUtils;
import org.FOMIX.POJO.MemberToDo.Serialize.MemberToDo;

import java.util.Map;

public class MembersToDoPayload {

    public static MemberToDo buildToDoPayload(String category, String status, String occurrence, String startDate, String startTime, String endDate, String endTime){

        MemberToDo memberToDo = new MemberToDo();
        memberToDo.setMember_id(AppConstants.getMemberId());
        memberToDo.setTable("to_do_settings");
        memberToDo.setRecord_id("");

        String categoryID = CategoryIDResolver.getCategoryName(category);
        memberToDo.setTask_category_id(categoryID);
        memberToDo.setTask_category("");

        // Generate meaningful title + description based on category
        Map<String, String> task = TaskDataGenerator.generateTask(category);
        memberToDo.setTitle(task.get("title"));
        memberToDo.setDescription(task.get("description"));

        // Convert to UTC ISO format
        String startDateTime = DateUtils.toUTC(startDate, startTime);
        String endDateTime = DateUtils.toUTC(endDate, endTime);

        // Set time values
        memberToDo.setStart_date(startDateTime);
        memberToDo.setEnd_date(endDateTime);

        memberToDo.setRecurrence(occurrence);
        memberToDo.setTask_time("");
        memberToDo.setTask_order(null);
        memberToDo.setStatus(status);
        memberToDo.setTotal_occurrences(null);
        memberToDo.setCompleted_count(null);

        memberToDo.setCreated_at(startDateTime);
        memberToDo.setUpdated_at(startDateTime);
        memberToDo.setTimezone("Asia/Calcutta");

        return memberToDo;
    }
}
