package org.FOMIX.API.Payloads.MemberToDo;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class TaskDataGenerator {
    private static final Faker faker = new Faker();

    public static Map<String, String> generateTask(String category) {
        Map<String, String> taskData = new HashMap<>();
        String title = "";
        String description = "";

        switch (category.toLowerCase()) {

            case "powder supplement":
                title = "Powder Supplement";
                description = "Take two spoons of powder supplement everyday";
                break;

            case "capsule supplement":
                title = "Capsule Supplement";
                description = "Take two capsules every day";
                break;

            case "tablet supplement":
                title = "Tablet Supplement";
                description = "Take tablet supplement advised by the doctor regularly";
                break;

            case "liquid supplement":
                title = "Liquid Supplement";
                description = "Take liquid supplement advised by the doctor regularly";
                break;

            case "millet":
                title = "Millet";
                description = "Consume millet regularly";
                break;

            case "vegetable":
                title = "Vegetable";
                description = "Consume vegetables regularly";
                break;

            case "hydration":
                title = "Water";
                description = "Consume 10 glass of water per day";
                break;

            case "weight":
                title = "Weight";
                description = "Record weight when there is a change";
                break;

            case "generic":
                title = "Generic";
                description = "Compete the task regularly";
                break;

            case "stool":
                title = "Stool";
                description = "Complete the stool task regularly";
                break;

            case "stool consistency":
                title = "Stool Consistency";
                description = "Different kinds of stool consistency available. Make sure to select the proper one.";
                break;

            default:
                title = faker.book().title();
                description = faker.lorem().sentence();
                break;
        }

        taskData.put("title", title);
        taskData.put("description", description);
        return taskData;
    }
}
