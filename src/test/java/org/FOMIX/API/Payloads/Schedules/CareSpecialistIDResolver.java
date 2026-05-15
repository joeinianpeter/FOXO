package org.FOMIX.API.Payloads.Schedules;

public class CareSpecialistIDResolver {

    public static String getCareSpecialistId(String careSpecialistName) {
        if (careSpecialistName == null) {
            throw new RuntimeException("CareSpecialist name cannot be empty");
        }

        return switch (careSpecialistName.trim().toLowerCase()) {
            case "ankit test care" -> "debae054-f1b1-4f7f-9f3e-ae3016a8b723";
            case "Dr. Anika Sharma" -> "01ee909f-3c60-4705-ba51-76f54034b3fa";
            case "Health Coach Ankit" -> "1d5b4d1c-dbac-463f-ad14-99268bd4e47e";
            case "Mahesh Manjunath" -> "78249554-734f-4839-a19d-a01d2a3b85ad";
            case "Subhani" -> "19efe7ad-70e2-4136-9fe4-8be911b34d96";

            default -> throw new RuntimeException("Unknown Care specialist name: " + careSpecialistName);

        };
    }
}
