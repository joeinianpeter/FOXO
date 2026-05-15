package org.FOMIX.Mobile.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.FOMIX.API.Utils.TextContextSetup;
import org.FOMIX.Mobile.Hooks.MobileHooks;
import org.FOMIX.Mobile.POM.LogoutPage;

public class LogoutStepDefinition {

    private final LogoutPage logoutPage;

    public LogoutStepDefinition(TextContextSetup textContextSetup){
        this.logoutPage = textContextSetup.pageObjectManager.getLogoutPage();
    }

    @And("Logout from the app")
    public void logoutFromTheApp() {
        logoutPage.clickOnSignOutIcon()
                .clickOnSignOutButton()
                .clickOnSignOutOption();
    }
}
