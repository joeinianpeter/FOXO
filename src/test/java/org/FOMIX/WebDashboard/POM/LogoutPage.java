package org.FOMIX.WebDashboard.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    public WebDriver driver;

    public LogoutPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[contains(@class,'log-out')]")
    private WebElement logoutIcon;

    public void clickOnLogoutIcon(){
        try {
            logoutIcon.click();
        } catch (Exception e){
            logoutIcon.click();
        }
    }

}
