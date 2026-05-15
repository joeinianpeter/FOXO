package org.FOMIX.WebDashboard.POM;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    public WebDriver driver;
    public LoginPage loginPage;
    public LogoutPage logoutPage;
    public MeetingNotesPage meetingNotesPage;
    public SchedulePage schedulePage;
    public PrescriptionPage prescriptionPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage loginPage() {
        loginPage = new LoginPage(driver);
        return loginPage;
    }

    public LogoutPage logoutPage() {
        logoutPage = new LogoutPage(driver);
        return logoutPage;
    }

    public MeetingNotesPage meetingNotesPage() {
        meetingNotesPage = new MeetingNotesPage(driver);
        return meetingNotesPage;
    }

    public SchedulePage schedulePage() {
        schedulePage = new SchedulePage(driver);
        return schedulePage;
    }

    public PrescriptionPage prescriptionPage(){
        prescriptionPage = new PrescriptionPage(driver);
        return prescriptionPage;
    }

}
