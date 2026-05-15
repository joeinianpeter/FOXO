package org.FOMIX.API.Utils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static <T> T deserialize(String json, Class<T> targetClass) {
        try {
            return mapper.readValue(json, targetClass);
        } catch (Exception e) {
            throw new RuntimeException("Failed to deserialize Json", e);
        }
    }
}
