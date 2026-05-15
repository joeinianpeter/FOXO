package org.FOMIX.API.Payloads.Login;

import org.FOMIX.API.Utils.ConfigReader;
import org.FOMIX.POJO.Login.Serialize.LoginSerialize;
import java.util.Collections;

public class LoginPayload {

    public static LoginSerialize loginAPIPayload() {
        LoginSerialize loginSerialize = new LoginSerialize();
        loginSerialize.setPhone(ConfigReader.getDecryptedValue("phoneNumber"));
        loginSerialize.setToken(ConfigReader.getDecryptedValue("OTP"));
        loginSerialize.setType("sms");
        loginSerialize.setGotrue_meta_security(Collections.EMPTY_MAP);
        return loginSerialize;
    }
}
