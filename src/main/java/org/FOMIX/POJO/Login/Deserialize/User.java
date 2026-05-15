package org.FOMIX.POJO.Login.Deserialize;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    private User_metadata user_metadata;

    public User_metadata getUser_metadata() {
        return user_metadata;
    }

    public void setUser_metadata(User_metadata user_metadata) {
        this.user_metadata = user_metadata;
    }
}
