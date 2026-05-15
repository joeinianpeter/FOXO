package org.FOMIX.Mobile.POM;

import io.appium.java_client.android.AndroidDriver;

public class PageObjectManager {

    private final AndroidDriver driver;

    public PageObjectManager(AndroidDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        return new LoginPage(driver);
    }

    public LogoutPage getLogoutPage() {
        return new LogoutPage(driver);
    }

    public MemberToDoPage getMemberToDoPage() {
        return new MemberToDoPage(driver);
    }

    public SchedulesPage getSchedulesPage() {
        return new SchedulesPage(driver);
    }
}
