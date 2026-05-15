package org.FOMIX.Mobile.POM;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.FOMIX.API.Utils.AppConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.Arrays;

public class MemberToDoPage {

    public AndroidDriver driver;

    public MemberToDoPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isTitleDisplayed() {
        WebElement title = driver.findElement(By.xpath("//android.widget.TextView[@text='" + AppConstants.getMemberToDoTaskTitle() + "']"));
        return title.isDisplayed();
    }

    public void clickOnTickMark() {
        WebElement tickMark = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='" + AppConstants.getMemberToDoTaskTitle() + "']/android.view.ViewGroup[1]"));
        tickMark.click();
    }

    public boolean isTickMarkPresent(){
        String xpath = "//android.view.ViewGroup[@content-desc='" + AppConstants.getMemberToDoTaskTitle() + "']/android.view.ViewGroup[1]";
        return !driver.findElements(By.xpath(xpath)).isEmpty();
    }

    public boolean getToastMessage() {
        WebElement toastMessage = driver.findElement(By.xpath("//*[contains(@text, '\"" + AppConstants.getMemberToDoTaskTitle() + "\" marked as completed!')]"));
        return toastMessage.isDisplayed();
    }

    public void clickOnSelectedDays(String day) {

        String xpath = "//android.widget.TextView[@text='" + day + "']";

        // STEP 1: try clicking it directly (yesterday/today/tomorrow usually visible)
        try {
            driver.findElement(By.xpath(xpath)).click();
            return;
        } catch (NoSuchElementException ignore) {
            try {
                driver.findElement(AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true))" +
                                ".setAsHorizontalList()" +
                                ".setMaxSearchSwipes(2)" +
                                ".scrollIntoView(new UiSelector().text(\"" + day + "\"));"
                ));

                // after scrolling, click the day
                driver.findElement(By.xpath(xpath)).click();
                return;

            } catch (Exception ignored) {
                // keep looping
            }
        }

        // STEP 3: fail only after all scroll attempts
        throw new RuntimeException("Unable to find day: " + day + " even after scrolling.");
    }

}
