package org.FOMIX.API.Utils;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    // Static block loads properties only once
    static {
        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/global.properties");
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load global.properties file", e);
        }
    }

    // Generic getter for any key
    public static String getProperty(String key){
        return properties.getProperty(key);
    }

    public static String getJsonPath(Response response, String key){
        String endResponse = response.asString();
        JsonPath jsonPath = new JsonPath(endResponse);
        return jsonPath.get(key).toString();
    }

    public static String getDecryptedValue(String value){
        try {
            String encryptedValue = properties.getProperty(value);
            return EncryptDecryptUtils.decrypt(encryptedValue);
        } catch (Exception e){
            throw new RuntimeException("Failed to decrypt property: "+ value, e);
        }
    }
}
