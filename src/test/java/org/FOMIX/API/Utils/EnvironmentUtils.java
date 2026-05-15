package org.FOMIX.API.Utils;

public class EnvironmentUtils {

    private static String getEnvironment() {
        return ConfigReader.getProperty("environment").trim().toLowerCase();
    }

    private static String getValue(String key) {
        String env = getEnvironment();
        return ConfigReader.getProperty(env + "." + key);
    }

    private static String getDecryptedValue(String key) {
        String env = getEnvironment();
        return ConfigReader.getDecryptedValue(env + "." + key);
    }

    public static String getBaseURI(){
        return getValue("baseURI");
    }

    public static String getAPIKey(){
        return getDecryptedValue("apiKey");
    }

    public static String getAuthorization(){
        return getDecryptedValue("authorization");
    }

    public static String getAPIKeyLogout(){
        return getDecryptedValue("apiKeyLogout");
    }

    public static String getRequestURI(){
        return getValue("requestURI");
    }

}
