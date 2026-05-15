package org.FOMIX.WebDashboard.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {

    public WebDriver driver;

    public WebDriver WebDriverManager() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/global.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);

        String url = properties.getProperty("URL");

        if (driver == null){

            if (properties.getProperty("browser").equalsIgnoreCase("chrome")){
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--incognito");
                chromeOptions.addArguments("--disable notifications");
                driver = new ChromeDriver(chromeOptions);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                driver.manage().window().maximize();
                driver.get(url);
            } else if (properties.getProperty("browser").equalsIgnoreCase("firefox")){
                //firefox driver
            }
        }
        return driver;
    }
}
