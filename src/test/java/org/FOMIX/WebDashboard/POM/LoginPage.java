package org.FOMIX.WebDashboard.POM;

import org.FOMIX.API.Utils.ConfigReader;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[contains(text(),'Sign in with Phone')]")
    private WebElement signInWithPhoneButton;

    @FindBy(xpath = "//*[@placeholder='Enter 10-digit number']")
    private WebElement enterPhoneNumber;

    @FindBy(xpath = "//*[contains(text(),'Send OTP')]")
    private WebElement sentOTPButton;

    @FindBy(xpath = "//*[@placeholder='Enter 6-digit OTP']")
    private WebElement enterOTP;

    @FindBy(xpath = "//*[contains(text(),'Verify OTP')]")
    private WebElement verifyOTPButton;

    @FindBy(xpath = "//*[starts-with(@class,'font-bold')]")
    private WebElement fomixText;

    @FindBy(xpath = "//*[contains(text(),'Select Member')]")
    private WebElement selectMemberTextBox;

    @FindBy(xpath = "//*[@placeholder='Search members...']")
    private WebElement searchMemberTextBox;

    @FindBy(xpath = "//*[@class='font-medium truncate']")
    private WebElement selectAMember;

    public LoginPage clickOnSignInWithPhoneButton() {
        signInWithPhoneButton.click();
        return this;
    }

    public LoginPage clickOnEnterPhoneNumber() {
        String mobileNumber = ConfigReader.getDecryptedValue("phoneNumberWeb");
        enterPhoneNumber.sendKeys(mobileNumber);
        return this;
    }

    public LoginPage clickOnSentOTPButton() {
        sentOTPButton.click();
        return this;
    }

    public LoginPage clickOnEnterOTP() {
        String OTP = ConfigReader.getDecryptedValue("OTPWeb");
        enterOTP.sendKeys(OTP);
        return this;
    }

    public void clickOnVerifyOTPButton() {
        verifyOTPButton.click();
    }

    public String getWelcomeText() {
        return fomixText.getText();
    }

    public LoginPage clickOnSelectMember() {
        selectMemberTextBox.click();
        return this;
    }

    public LoginPage clickOnSearchMember(String memberName) {
        searchMemberTextBox.sendKeys(memberName);
        return this;
    }

    public void clickOnMemberName() {
        try {
            selectAMember.click();
        } catch (NoSuchElementException e) {
            selectAMember.click();
        }
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.COMMAND).sendKeys("h").keyUp(Keys.COMMAND).build().perform();
    }

    public void clickOnMemberPreviewOptions(String options) {
        WebElement element = driver.findElement(By.xpath("//*[contains(@class,'min-w-max')]//*[contains(text(),'" + options + "')]"));
        element.click();
    }
}
