package org.FOMIX.API.Utils;

import java.util.Locale;

public class Faker {

    public static final com.github.javafaker.Faker faker = new com.github.javafaker.Faker(new Locale("en"));

    public static String generateTitle() {

        return faker.book().title();
    }

    public static String generateDescription() {
        return faker.company().catchPhrase() + " " + faker.harryPotter().quote();
    }

    public static String generateMeetingNotes() {
        return faker.company().catchPhrase() + ". "
                + faker.job().position() + " discussion. "
                + faker.company().bs() + ".";
    }
}
