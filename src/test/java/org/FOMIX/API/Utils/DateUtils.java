package org.FOMIX.API.Utils;

import io.cucumber.java.sl.In;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateUtils {
    public static String toUTC(String date, String time) {

        // Clean input to remove extra/malformed spaces
        date = date.trim().toLowerCase();
        time = time.trim().toUpperCase();

        LocalDate localDate = switch (date) {
            case "today" -> LocalDate.now();
            case "yesterday" -> LocalDate.now().minusDays(1);
            case "tomorrow" -> LocalDate.now().plusDays(1);
            case "six days before" -> LocalDate.now().minusDays(6);
            case "seven days before" -> LocalDate.now().minusDays(7);
            default ->
                // Expect format yyyy-MM-dd
                    LocalDate.parse(date);
        };

        LocalTime localTime = null;

        // Try multiple valid patterns
        DateTimeFormatter[] dateTimeFormatters = new DateTimeFormatter[]{
                DateTimeFormatter.ofPattern("h:mm a", Locale.ENGLISH),
                DateTimeFormatter.ofPattern("hh:mm a", Locale.ENGLISH),
                DateTimeFormatter.ofPattern("h a", Locale.ENGLISH),
                DateTimeFormatter.ofPattern("hh a", Locale.ENGLISH)
        };

        for (DateTimeFormatter pattern : dateTimeFormatters) {
            try {
                localTime = LocalTime.parse(time, pattern);
                break;
            } catch (Exception e) {

            }
        }

        if (localTime == null) {
            throw new RuntimeException(" Unsupported time format: " + time);
        }

        // Convert to UTC ISO-8601
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate, localTime, ZoneOffset.UTC);
        return zonedDateTime.toInstant().toString();
    }

    public static String selectADay(String day){
        day = day.trim().toLowerCase();
        LocalDate localDate = LocalDate.now();

        switch (day){
            case "yesterday":
                localDate = LocalDate.now().minusDays(1);
                break;

            case "tomorrow":
                localDate = LocalDate.now().plusDays(1);
                break;

            case "six days before":
                localDate = LocalDate.now().minusDays(6);
                break;

            case "seven days before":
                localDate = LocalDate.now().minusDays(7);
                break;

            default:
                // already today
                break;
        }
        return  String.format("%02d", localDate.getDayOfMonth());

    }

    public static String formatUTCToLocalTime(String utcDateTime){

        Instant instant = Instant.parse(utcDateTime);
        ZonedDateTime localTime = instant.atZone(ZoneId.systemDefault());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a", Locale.ENGLISH);
        return localTime.format(formatter);
    }

    public static String formatRange(String utcStart, String utcEnd){
        String start = formatUTCToLocalTime(utcStart);
        String end = formatUTCToLocalTime(utcEnd);

        return start + " \u2013 " + end;
    }

    public static String getFormattedDate(String input){
        LocalDate date;

        switch (input.trim().toLowerCase()){

            case "today":
                date = LocalDate.now();
                break;

            case "yesterday":
                date = LocalDate.now().minusDays(1);
                break;

            case "tomorrow":
                date = LocalDate.now().plusDays(1);
                break;

            case "dayaftertomorrow":
                date = LocalDate.now().plusDays(2);
                break;

            default:
                // If a real date like "2025-12-05" is given
                date = LocalDate.parse(input);
                break;
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, MMM d", Locale.ENGLISH);
        return date.format(formatter);
    }

    public static String getDurationText(LocalTime start, LocalTime end) {

        Duration duration = Duration.between(start, end);

        long minutes = duration.toMinutes();
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        StringBuilder result = new StringBuilder();

        if (hours > 0) {
            result.append(hours).append(hours == 1 ? " hr" : " hrs");
        }

        if (remainingMinutes > 0) {
            if (result.length() > 0) {
                result.append(" "); // space between hours and mins
            }
            result.append(remainingMinutes).append(" mins");
        }

        return result.toString();
    }

    public static LocalTime toLocalTimeFromUtc(String utcTime) {
        return Instant.parse(utcTime)
                .atZone(ZoneId.of("Asia/Kolkata"))
                .toLocalTime();
    }

    public static String buildUiTimeText(String startUtc, String endUtc) {

        // Convert UTC → IST LocalTimes
        LocalTime start = toLocalTimeFromUtc(startUtc);
        LocalTime end = toLocalTimeFromUtc(endUtc);

        // Your existing method — keep same
        String duration = getDurationText(start, end);

        // Your existing method to get formatted time (e.g., "2:30 PM")
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a", Locale.ENGLISH);
        String startFormatted = start.format(formatter);

        return startFormatted + " · " + duration;
    }

}
