package org.FOMIX.Mobile.POM;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class LoginPage {
    private AndroidDriver driver;

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Sign in to FOXO Club']")
    private WebElement loginFoxoText;

    @FindBy(xpath = "//*[@text='Enter your mobile number']")
    private WebElement mobileNumberTextBox;

    @FindBy(xpath = "//*[@text='Sign in']")
    private WebElement signInButton;

    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    private WebElement permissionAllowPopUp;

    @FindBy(xpath = "//android.widget.TextView[@text='Enable Notifications']")
    private WebElement enableNotification;

    @FindBy(xpath = "//android.widget.TextView[@text='Continue']")
    private WebElement welcomeMessageContinue;

    @FindBy(xpath = "//android.widget.TextView[@text='We’re rolling out mindfully — one member at a time.']")
    private WebElement invalidLoginErrorMessage;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='Sign in']")
    private WebElement isSignInEnabled;

    @FindBy(xpath = "//android.widget.TextView[@text='Hmm, that code didn’t match. Give it another go.']")
    private WebElement invalidOTPErrorMessage;

    @FindBy(xpath = "//android.widget.TextView[@text='Verify your mobile number']")
    private WebElement verifyMobileNumberText;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Request for another OTP in')]")
    private WebElement anotherOTPText;

    @FindBy(xpath = "//android.widget.TextView[@text='Request for another OTP']")
    private WebElement requestAnotherOTPText;

    @FindBy(xpath = "//android.widget.TextView[@text='Mobile number']")
    private WebElement mobileNumberText;

    @FindBy(xpath = "//android.widget.TextView[@text='FOXO Club is invite only.']")
    private WebElement inviteText;

    @FindBy(xpath = "//android.widget.TextView[@text='Already part of the club but can’t get in?']")
    private WebElement userInformationMessage1;

    @FindBy(xpath = "//android.widget.TextView[@text='Ping your ']")
    private WebElement userInformationMessage2;

    @FindBy(xpath = "//android.widget.TextView[@text=' – we’ve got you.']")
    private WebElement userInformationMessage3;

    @FindBy(xpath = "//android.widget.TextView[@text='Concierge']")
    private WebElement conciergeText;

    @FindBy(xpath = "//com.horcrux.svg.CircleView")
    private WebElement cautionIcon;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'We have sent you a one-time password (OTP) on your phone +91 ')]")
    private WebElement oneTimePasswordText;

    @FindBy(xpath = "//android.widget.TextView[@text='Enter OTP']")
    private WebElement enterOTPText;

    @FindBy(xpath = "//android.widget.TextView[@text='Verify']")
    private WebElement verifyButton;

    public boolean getLoginFoxoText() {
        try {
            return loginFoxoText.isDisplayed();
        } catch (NoSuchElementException e) {
            return loginFoxoText.isDisplayed();
        }
    }

    public LoginPage enterMobileNumber(String mobileNumber) {
        mobileNumberTextBox.sendKeys(mobileNumber);
        return this;
    }

    public LoginPage clickOnSignInButton() {
        try {
            signInButton.click();
        } catch (StaleElementReferenceException e) {
            signInButton.click();
        }
        return this;
    }

    public void enterOTP(String OTP) throws InterruptedException {

        int maxAttempts = 3;
        String currentMonth = LocalDate.now()
                .getMonth()
                .getDisplayName(TextStyle.FULL, Locale.ENGLISH)
                .trim();

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {

            System.out.println("OTP entry attempt: " + attempt);

            Thread.sleep(1000);
            // STEP 1 — Type OTP
            for (char ch : OTP.toCharArray()) {
                try {
                    AndroidKey key = AndroidKey.valueOf("DIGIT_" + ch);
                    driver.pressKey(new KeyEvent(key));
                } catch (Exception e) {
                    System.out.println("Failed to type digit: " + ch);
                }
            }

            Thread.sleep(1000);

            try {
                enableNotification.click();
                permissionAllowPopUp.click();
                welcomeMessageContinue.click();
            } catch (Exception e) {
                System.out.println("No permission pop-up displayed");
            }

            // STEP 2 — Check if the CURRENT MONTH is visible (successful login)
            try {
                boolean monthNameDisplayed = !driver.findElements(AppiumBy.accessibilityId(currentMonth)).isEmpty();
                if (monthNameDisplayed) {
                    System.out.println("✅ Login successful. Month found: " + currentMonth);
                    return;
                }
            } catch (Exception ignore) {

            }

            // STEP 3 — Not logged in → Clear OTP & Retry
            System.out.println("OTP incorrect/missed. Retrying...");

            // Clear 6-digit OTP by pressing backspace 6 times
            for (int i = 0; i < 6; i++) {
                driver.pressKey(new KeyEvent(AndroidKey.DEL));
                System.out.println("deleting");
                Thread.sleep(200);
            }

            Thread.sleep(1000);
        }

        throw new RuntimeException("Login failed after " + maxAttempts + " OTP attempts");
    }

    public boolean getUnregisteredMobileNumberErrorMessage() {
        return invalidLoginErrorMessage.isDisplayed();
    }

    public boolean isSignInButtonEnabled() {
        return isSignInEnabled.isEnabled();
    }

    public boolean getInvalidOTPErrorMessageDisplayed() {
        return invalidOTPErrorMessage.isDisplayed();
    }

    public void enterOTPInvalid(String OTP) throws InterruptedException {

        Thread.sleep(1000);
        for (char ch : OTP.toCharArray()) {
            try {
                AndroidKey key = AndroidKey.valueOf("DIGIT_" + ch);
                driver.pressKey(new KeyEvent(key));
            } catch (Exception e) {
                System.out.println("Failed to type digit: " + ch);
            }
        }
    }

    public boolean getVerifyMobileNumberText(){
        return verifyMobileNumberText.isDisplayed();
    }

    public boolean getChangeTextDisplayed(String value){
        WebElement changeTextDisplayed = driver.findElement(By.xpath("//android.widget.TextView[@text='"+value+"']"));
        return changeTextDisplayed.isDisplayed();
    }

    public LoginPage clickOnChangeText(String value){
        WebElement changeText = driver.findElement(By.xpath("//android.widget.TextView[@text='"+value+"']"));
        changeText.click();
        return this;
    }

    public boolean getAnotherOTPText(){
        return anotherOTPText.isDisplayed();
    }

    public boolean getRequestAnotherOtpText(int time){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOf(requestAnotherOTPText));

        return requestAnotherOTPText.isDisplayed();
    }

    public boolean getVerifyButton(String value){
        WebElement verifyButton = driver.findElement(By.xpath("//android.widget.TextView[@text='"+value+"']"));
        return verifyButton.isDisplayed();
    }

    public void clearPhoneNumberField(String phoneNumber){
        WebElement phoneNumberField = driver.findElement(By.xpath("//android.widget.EditText[@text='"+phoneNumber+"']"));
        phoneNumberField.click();
        phoneNumberField.clear();
    }

    public boolean getMobileNumberText(){
        return mobileNumberText.isDisplayed();
    }

    public boolean getInviteText(){
        return inviteText.isDisplayed();
    }

    public boolean getUserInformationMessage1(){
        return userInformationMessage1.isDisplayed();
    }

    public boolean getUserInformationMessage2(){
        return userInformationMessage2.isDisplayed();
    }

    public boolean getUserInformationMessage3(){
        return userInformationMessage3.isDisplayed();
    }

    public boolean getConciergeText(){
        return conciergeText.isDisplayed();
    }

    public boolean getEnterYourMobileNumber(){
        return mobileNumberTextBox.isDisplayed();
    }

    public boolean getSignInText(){
        return signInButton.isDisplayed();
    }

    public boolean getCautionIcon(){
        return cautionIcon.isDisplayed();
    }

    public boolean getOneTimePasswordText(){
        return oneTimePasswordText.isDisplayed();
    }

    public boolean getEnterOTPText(){
        return enterOTPText.isDisplayed();
    }

    public boolean getVerifyText(){
        return verifyButton.isDisplayed();
    }

}
