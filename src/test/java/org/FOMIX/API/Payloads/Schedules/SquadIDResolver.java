package org.FOMIX.API.Payloads.Schedules;

public class SquadIDResolver {

    public static String getSquadID(String squadName){
        if (squadName == null){
            throw new RuntimeException("Squad ID cannot be NULL");
        }

        return switch (squadName.trim().toLowerCase()){
            case "Abhishek" -> "155746e7-1f08-4485-a48b-c17b759648e6";
            case "Akash Squad" -> "7ce6d306-f346-475f-9cd9-51f4d8e66302";
            case "Ankit Squad FOXO" -> "f16918c2-9efa-4176-9028-c417c922e1d9";
            case "Canny" -> "91ac5473-d228-4219-9883-891eb52b09a7";
            case "Dhruv" -> "def3910d-abb6-48f9-8eea-9d68133a327f";
            case "Dr. Anika Sharma" -> "64e1cc81-aa3d-4a4f-babe-e0368a45eef1";
            case "Dr. Rashmi" -> "f16a80ca-e1ef-4a64-9d96-659b5caa5781";
            case "FOXO Cook" -> "bb0452ef-6e59-41ab-b480-e7280bea6730";
            case "Hitakshi Sharma" -> "e2027c41-35a8-4b62-83b1-e6ec236f4f6f";
            case "joe" -> "a490a1c0-9cf1-4775-8085-07393a370adf";
            case "Jyotirmaya" -> "d2dffe96-d854-4f14-90fe-94c7b18bba09";
            case "Mehak Aneja" -> "f4b2c48-eb0b-42db-a1c0-53d12d44d095";
            case "Nayantara" -> "a256d2fe-7904-4653-b3e9-77427af59573";
            case "Niki Gomez" -> "dc4061c8-c699-4d5b-a67b-e14ff65f850b";
            case "OME" -> "643312c2-a592-4047-bb42-48c192273d0b";
            case "Pradyumna" -> "2e1eb518-94da-484c-9568-b35bbb43d444";
            case "Pratik FOXO" -> "4fe02199-7ce6-43a7-b9f4-5d80910e675a";
            case "Priyanka" -> "1d534657-9046-4054-bf89-9ed3d17f26b9";
            case "Radhika" -> "8dadd0b3-8043-4c9a-b532-4bc610f810a2";
            case "Ravisha" -> "ddf2ac42-b88b-4858-9d46-afd5d61cb2cc";
            case "Sahil" -> "7a5670f2-f712-4ca4-ac7b-18198effc16b";
            case "Sandeep S." -> "a857c8b4-c32c-48e3-8b26-23a650acb6b2";
            case "Sanmaya" -> "f02e3da6-de77-4f27-a441-171491ee84aa";
            case "Shinda" -> "f98f9fd1-2522-4533-88b4-6e9dbb4d5bbd";
            case "Sindhu" -> "81f33e2d-0a17-4481-974e-d25db61f772f";
            case "Subhendu" -> "1b61a2d1-143d-4169-ad7e-fbc96cc3a6ad";
            case "Supratik" -> "25874658-518d-4354-b6ff-e29840a6d7ff";
            case "Test" -> "4dabec4a-b363-4e9c-b0bc-a68bcee12333";
            case "Vishal" -> "e456fdfb-4853-4248-a4b8-18011f36232d";



            default -> throw new RuntimeException("Unknown squad name: " + squadName);
        };
    }
}
