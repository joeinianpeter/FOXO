package org.FOMIX.API.Payloads.MemberToDo;

public class CategoryIDResolver {

    public static String getCategoryName(String categoryName) {
        if (categoryName == null) {
            throw new RuntimeException("Category cannot be null");
        }

        return switch (categoryName.trim().toLowerCase()) {
            case "powder supplement" -> "804dc837-15c6-418e-9be6-19cc43d68496";
            case "capsule supplement" -> "c01725b1-d826-4e64-81fa-1592712ed404";
            case "tablet supplement" -> "aaf154bd-98ba-4fc9-9d4b-ac41b7ce20b5";
            case "liquid supplement" -> "263d7d11-31c2-4f10-b4b1-802473dc1f48";
            case "millet" -> "67bd5858-a090-467f-8695-526e211a661d";
            case "vegetable" -> "0307b0b8-e388-467e-a77e-6b121dbe57bc";
            case "hydration" -> "82b58355-050f-4520-b75e-f7a0fb22ad09";
            case "weight" -> "71e4bd86-81bc-4302-8f1f-a7ea064d65d5";
            case "generic" -> "c61ccbd2-8f78-419c-a1a8-b5390b0f2d72";
            case "stool" -> "5dba6a87-8885-417e-b445-e29c7471eb96";
            case "stool consistency" -> "37231a14-3166-42ec-934e-9954a247c0da";

            default -> throw new IllegalStateException("Unexpected value: " + categoryName.trim().toLowerCase());
        };
    }
}
