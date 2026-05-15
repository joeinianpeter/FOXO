package org.FOMIX.API.Payloads.Schedules;

public class EventIdResolver {

    public static String getEventID(String eventName){
        if (eventName == null){
            throw new RuntimeException("Event ID cannot be null");
        }

        return switch (eventName.trim().toLowerCase()) {
            case "behaviour coach appointment" -> "b353f94d-309b-4aea-962d-21d0e286c9c0";
            case "internal squad call" -> "443a5232-a6e2-408b-969e-0591d1fde2c0";
            case "radiology test" -> "8db698d2-0181-4f2c-953f-8179880b9fb0";
            case "doctor bi-weekly catchup" -> "ea638f47-d387-4542-b79d-6ca594fbe06f";
            case "foxo kit & concierge introduction" -> "3023a98d-5ada-440b-be07-1ba52125004e";
            case "blood, urine, stool sample collection" -> "ec8edbf2-d29d-40c6-abc0-2dc38634724b";
            case "health coaching" -> "07cc1479-5bc7-4c42-a93b-83dd50033f21";
            case "foxo nutritionist consultation" -> "5928ff61-f228-4b0b-a419-f9da970f98b2";
            case "nutritionist followup" -> "8a6e1d87-8815-43ad-b301-194007111300";
            case "doctor consultation" -> "8ab55322-639e-4a13-85b5-13545fe084e9";
            case "test collection" -> "433736fa-5f71-4aa3-8ffb-89e909e4c87e";
            case "hormonal health consultation – testosterone panel" -> "634d7f1a-46df-41ca-92d3-32cfddc8a24d";
            case "test" -> "66b930b9-8918-4f44-a07b-f5e1ffef584d";
            case "cardiac and imaging test" -> "dee449be-f466-417d-b394-d67baf2f69f2";
            case "kitchen audit" -> "4f333177-f629-4dae-bfef-9fa14a48cb91";
            case "physio assessment" -> "5707c39a-0025-4632-9af1-3066a8fc7283";
            case "doctor appointment" -> "f2d846b9-98e1-44ec-90f2-9c25095ae2d2";
            case "cgm patch application" -> "113fb091-211a-4495-aeb9-199cfbc4f538";
            case "nutritionist appointment" -> "59bf03d0-0b35-48db-9ea5-326f90b10156";
            case "consent for genetic and gut tests, and msq" -> "dbb88245-e247-433d-a82d-1d96a8a8405a";
            case "doctor consultation - cardiovascular risk review" -> "5e9e409e-65db-45b3-ba26-2c7336cbce48";
            case "doctor onboarding call" -> "0c5cf613-ee86-4175-be8e-20fb9111c896";


            case "playbook v1.0" -> "4f1134fb-5fbd-4a7d-af20-c9b2cbe61535";
            case "weekly catchup - nutrionist" -> "84b3d33b-8778-47d6-a480-d0a63b70d815";
            default -> throw new RuntimeException("Unknown event name: " + eventName);
        };

    }
}
