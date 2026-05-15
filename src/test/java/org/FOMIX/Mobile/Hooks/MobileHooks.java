package org.FOMIX.Mobile.Hooks;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.FOMIX.API.Utils.TextContextSetup;
import org.FOMIX.Mobile.POM.PageObjectManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class MobileHooks {

    private final TextContextSetup textContextSetup;

    public MobileHooks(TextContextSetup textContextSetup){
        this.textContextSetup = textContextSetup;
    }

    public static AppiumDriverLocalService service;

    @Before("@mobile")
    public void startServer(Scenario scenario) throws MalformedURLException {

        System.out.println("Starting Appium server...");

        Map<String, String> environment = new HashMap<>();

        String androidHome = System.getenv("ANDROID_HOME");
        if (androidHome == null || androidHome.isEmpty()) {
            androidHome = System.getenv("ANDROID_SDK_HOME");
        }

        environment.put("ANDROID_HOME", androidHome);
        environment.put("ANDROID_SDK_HOME", androidHome);

        service = new AppiumServiceBuilder()
                .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .withEnvironment(environment)
                .withLogFile(new File(System.getProperty("user.dir") + "/logs/appium.log"))
                .build();

        service.start();

        UiAutomator2Options options = new UiAutomator2Options();
        options.setApp(System.getProperty("user.dir") + "/src/test/resources/apk/foxo-app 1.4.2 react-compiler v2.apk");
        options.setDeviceName("Pixel 9 Pro XL API 37.0");
        options.setCapability("ignoreHiddenApiPolicyError", true);
        options.setCapability("appium:fullReset", true);
        options.setCapability("appium:noReset", false);

        // ✅ ADD THESE HERE (Correct location)
        options.setCapability("unicodeKeyboard", true);
        options.setCapability("resetKeyboard", true);

        textContextSetup.driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        textContextSetup.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Initialize PageObjectManager AFTER driver is created
        textContextSetup.pageObjectManager = new PageObjectManager(textContextSetup.driver);

        System.out.println("Appium started and mobile app launched.");

    }

    @After("@mobile")
    public void stopServer(Scenario scenario) {

        try {
            byte[] screenShot = textContextSetup.driver
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());
        } catch (Exception e){
            System.out.println("Failed to get the screen shot: "+e.getMessage());
        }

        System.out.println("Stopping Appium server...");

        try {
            if (textContextSetup.driver != null) {
                System.out.println("Quitting driver...");
                textContextSetup.driver.quit();
            }
        } catch (Exception e) {
            System.out.println("Driver was already closed by Appium. Skipping quit.");
            System.out.println("Reason: " + e.getMessage());
        }

        try {
            if (service != null) {
                System.out.println("Stopping Appium service...");
                service.stop();
            }
        } catch (Exception e) {
            System.out.println("Failed to stop Appium service: " + e.getMessage());
        }

    }
}
