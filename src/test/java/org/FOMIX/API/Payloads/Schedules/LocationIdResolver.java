package org.FOMIX.API.Payloads.Schedules;

public class LocationIdResolver {

    public static String getLocationId(String locationName){
        if (locationName == null){
            throw new RuntimeException("Location Name cannot be NULL");
        }

        return switch (locationName.trim().toLowerCase()) {
            case "sanmaya home" -> "1d096916-c0a0-4eaf-ab63-bed4a0c0cc50";
            case "akash home" -> "e49154d6-1a44-4214-87a7-fc3e672341bf";
            case "celara - bangalore" -> "d2b75604-d92d-4130-8880-25d3d04dafa6";
            case "charu's home" -> "e163211c-f217-4ef0-9cd2-9c6f5e8fa3dc";
            case "devanshu' home" -> "a142d8bf-d192-461d-bc5a-b7855c646b21";
            case "foxo" -> "1b587882-eb43-4ea8-b0e2-3af0b8adfaf2";
            case "gireesh's home" -> "7881453e-f24a-4f0a-8829-2def08069fe1";
            case "inzen noida" -> "a686a420-bfb7-401a-8e57-35025b7125ac";
            case "izen lab" -> "6eca63f4-7001-41c9-a2aa-4c6fe819a856";
            case "kanva diagnostic services pvt ltd" -> "f726d070-97c5-4f9c-926e-4e5d30ee3c96";
            case "lalith's home" -> "645e5d9b-9075-4594-8cfd-2d99b5ac9c73";
            case "location with lab has lat long" -> "4d6214c5-aff5-4894-adad-b5dcf475f5c2";
            case "online" -> "a23086ea-3d66-4529-985e-dc0c241f4748";
            case "rajat's home" -> "3c2f4b1e-a2f5-43f3-afd7-97cd8a5753cb";
            case "rapid sport fitness & physiotherapy - rsf" -> "25ebce79-97a3-4b00-b27c-67555f90141b";
            case "sajith's home" -> "ff69bce4-cc81-4ff6-acaf-0f0ba6d82dff";
            case "smriti singh" -> "6fbdb933-adcb-4324-8b27-4738bad40b78";
            case "sneh' home" -> "69b0455e-2825-46ce-a8ec-8d43003ca1bd";
            case "sushmita's home" -> "dfc77595-ef7e-4662-92a1-55d23f0af28d";

            default -> throw new RuntimeException("Unknown location name: " + locationName);
        };
    }
}
