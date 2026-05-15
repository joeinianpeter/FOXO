package org.FOMIX.POJO.Login.Serialize;

import java.util.Map;

public class LoginSerialize {
    private String phone;
    private String token;
    private String type;
    private Map<String, Object> gotrue_meta_security;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, Object> getGotrue_meta_security() {
        return gotrue_meta_security;
    }

    public void setGotrue_meta_security(Map<String, Object> gotrue_meta_security) {
        this.gotrue_meta_security = gotrue_meta_security;
    }

}
