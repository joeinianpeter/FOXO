package org.FOMIX.API.Utils;

public class XPathUtils {

    public static String escapeForXpath(String input) {

        if (input.contains("'")) {
            String[] parts = input.split("'");
            StringBuilder stringBuilder = new StringBuilder("concat(");

            for (int i = 0; i < parts.length; i++) {
                stringBuilder.append("'").append(parts[i]).append("'");

                if (i != parts.length - 1) {
                    stringBuilder.append(", \"'\", ");
                }
            }

            stringBuilder.append(")");
            return stringBuilder.toString();
        } else {
            return "'" + input + "'";
        }
    }
}
