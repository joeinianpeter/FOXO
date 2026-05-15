package org.FOMIX.Mobile.Utils;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

public class BaseUtils {

    private final AndroidDriver driver;

    public BaseUtils(AndroidDriver driver) {
        this.driver = driver;
    }

    public void scrollToTexts(String text) {
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"" + text + "\"))"));
    }

    public void scrollToText(String text) {
        // Save original implicit wait
        Duration originalWait = driver.manage().timeouts().getImplicitWaitTimeout();

        // Disable implicit wait for fast scrolling
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        int maxSwipes = 10;

        for (int i = 0; i < maxSwipes; i++) {

            // If element is already visible → stop
            List<WebElement> elements = driver.findElements(By.xpath("//*[contains(@text,'" + text + "')]"));

            if (!elements.isEmpty()) {
                // Restore original wait
                driver.manage().timeouts().implicitlyWait(originalWait);
                return;
            }
            // Smooth, short swipe
            swipeUpSmooth();
        }
        // Restore wait before throwing error
        driver.manage().timeouts().implicitlyWait(originalWait);
        throw new RuntimeException("Text not found after scrolling: " + text);
    }

    public void swipeUpSmooth() {
        Dimension size = driver.manage().window().getSize();

        int startX = size.width / 2;
        int startY = (int) (size.height * 0.80);
        int endY = (int) (size.height * 0.35);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);

        swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));

        // Slower scroll → more controlled
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(450),
                PointerInput.Origin.viewport(), startX, endY));

        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(swipe));
    }
}
