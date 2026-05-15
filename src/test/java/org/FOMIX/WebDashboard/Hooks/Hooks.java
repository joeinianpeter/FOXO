package org.FOMIX.WebDashboard.Hooks;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.FOMIX.WebDashboard.POM.LogoutPage;
import org.FOMIX.WebDashboard.Utils.TextContextSetup;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Hooks {

    public TextContextSetup textContextSetup;

    public Hooks(TextContextSetup textContextSetup) {
        this.textContextSetup = textContextSetup;
    }

    @After(value = "@web", order = 2)
    public void captureScreenshot(Scenario scenario) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) textContextSetup.testBase.driver;

        File source = ts.getScreenshotAs(OutputType.FILE);

        String fileName = scenario.getName().replaceAll(" ", "_") + "_" + System.currentTimeMillis() + ".png";

        File destination = new File("target/screenshots/" + fileName);
        FileUtils.copyFile(source, destination);

        ExtentCucumberAdapter.addTestStepScreenCaptureFromPath("target/screenshots/" + fileName);
    }

    @After(value = "@web", order = 1)
    public void logout() {
        try {
            LogoutPage logoutPage = textContextSetup.pageObjectManager.logoutPage();
            logoutPage.clickOnLogoutIcon();
        } catch (ElementClickInterceptedException e) {
            LogoutPage logoutPage = textContextSetup.pageObjectManager.logoutPage();
            logoutPage.clickOnLogoutIcon();
        }
    }

    @After(value = "@web", order = 0)
    public void quitDriver() {
        textContextSetup.testBase.driver.quit();
    }


}
