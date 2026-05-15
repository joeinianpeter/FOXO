package org.FOMIX.Mobile.POM;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    public AndroidDriver driver;

    public LogoutPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.Button[3]/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
    private WebElement signOutIcon;

    @FindBy(xpath = "//android.widget.TextView[@text='Sign out']")
    private WebElement signOutButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Sign Out']")
    private WebElement signOutOption;

    public LogoutPage clickOnSignOutIcon(){
        signOutIcon.click();
        return this;
    }

    public LogoutPage clickOnSignOutButton(){
        signOutButton.click();
        return this;
    }

    public void clickOnSignOutOption(){
        signOutOption.click();
    }


}
