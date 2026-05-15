package org.FOMIX.WebDashboard.POM;

import org.FOMIX.API.Utils.AppConstants;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PrescriptionPage {
    public WebDriver driver;

    public PrescriptionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@title='Create Prescription']")
    private WebElement createPrescription;

    @FindBy(xpath = "//*[contains(text(),'Success')]")
    private WebElement successMessage;

    @FindBy(xpath = "//*[contains(text(),'Prescription created successfully')]")
    private WebElement createdSuccessMessage;

    @FindBy(xpath = "//*[contains(text(),'prescription Details')]")
    private WebElement prescriptionDetailsHeaderText;

    @FindBy(xpath = "//*[contains(text(),'draft')]")
    private WebElement draftText;

    @FindBy(xpath = "//*[contains(@class,'circle-alert')]")
    private WebElement draftCircleAlertIcon;

    @FindBy(xpath = "//*[contains(text(),'Prescription Details')]")
    private WebElement prescriptionDetailsText;

    @FindBy(xpath = "//*[contains(@class,'p-6 pt-2')]//*[contains(text(),'date')]")
    private WebElement prescriptionDetailsDateText;

    @FindBy(xpath = "//*[contains(text(),'valid till')]")
    private WebElement prescriptionDetailsValidTillText;

    @FindBy(xpath = "//*[contains(text(),'chief complaints')]")
    private WebElement prescriptionDetailsChiefComplaintsText;

    @FindBy(xpath = "//*[contains(text(),'clinical features')]")
    private WebElement prescriptionDetailsClinicalFeaturesText;

    @FindBy(xpath = "//*[contains(text(),'examination')]")
    private WebElement prescriptionDetailsExaminationText;

    @FindBy(xpath = "//*[contains(text(),'diagnosis')]")
    private WebElement prescriptionDetailsDiagnosisText;

    @FindBy(xpath = "//*[contains(@class,'pill')]")
    private WebElement supplementPrescriptionPillIcon;

    @FindBy(xpath = "//h3[contains(normalize-space(.),'No supplement prescriptions found')]")
    private WebElement supplementPrescriptionNoSupplementFoundText;

    @FindBy(xpath = "//span[contains(normalize-space(.),'Add supplement prescription')]")
    private WebElement supplementPrescriptionAddSupplementPrescriptionButton;

    @FindBy(xpath = "//*[contains(@class,'p-6 pt-2')]//*[contains(@class,'plus')]")
    private WebElement supplementPrescriptionPlusIconInAddSupplement;

    @FindBy(xpath = "//span[contains(normalize-space(.),'(⌥+Shift)')]")
    private WebElement supplementPrescriptionAddSupplementPrescriptionInfo;

    @FindBy(xpath = "//*[contains(text(),'Drug Prescriptions')]/following-sibling::*//*[contains(@class,'chevron')]")
    private WebElement drugPrescriptionChevronIcon;

    @FindBy(xpath = "//*[contains(@class,'tablets')]")
    private WebElement drugPrescriptionTabletIcon;

    @FindBy(xpath = "//h3[contains(normalize-space(.),'No drug prescriptions found')]")
    private WebElement drugPrescriptionNoDrugFoundText;

    @FindBy(xpath = "//button[.//span[contains(normalize-space(.),'Add drug prescription')]]//*[local-name()='svg']")
    private WebElement drugPrescriptionPlusIconInAddDrug;

    @FindBy(xpath = "//span[contains(normalize-space(.),'Add drug prescription')]")
    private WebElement drugPrescriptionAddDrugPrescriptionButton;

    @FindBy(xpath = "//button[.//span[contains(.,'Add drug prescription')]]//span[contains(.,'(⌥+Shift)')]")
    private WebElement drugPrescriptionAddDrugPrescriptionInfo;

    @FindBy(xpath = "//*[contains(text(),'Additional Information')]")
    private WebElement additionalInformationText;

    @FindBy(xpath = "//*[contains(text(),'investigations')]")
    private WebElement additionalInformationInvestigationText;

    @FindBy(xpath = "//*[contains(text(),'advice referrals')]")
    private WebElement additionalInformationAdviceReferralsText;

    @FindBy(xpath = "//*[contains(text(),'notes')]")
    private WebElement additionalInformationNotesText;

    @FindBy(xpath = "//*[contains(text(),'No data present')]")
    private WebElement noDataPresentText;


    public void clickOnCreatePrescription() {
        createPrescription.click();
    }

    public boolean getProfileAvatar() {
        WebElement profileAvatar = driver.findElement(By.xpath("//*[contains(@class,'p-6 pt-2')]//*[@title='" + AppConstants.getMemberName() + "']"));
        return profileAvatar.isDisplayed();
    }

    public boolean getPrescriptionDetailsHeaderText() {
        return prescriptionDetailsHeaderText.isDisplayed();
    }

    public boolean getDraftText() {
        return draftText.isDisplayed();
    }

    public boolean getDraftCircleAlertIcon() {
        return draftCircleAlertIcon.isDisplayed();
    }

    public void getPrescriptionCreatedSuccessMessage() {
        try {
            Assert.assertTrue(successMessage.isDisplayed(), "Success message is not displayed");
            Assert.assertTrue(createdSuccessMessage.isDisplayed(), "schedule created message is not displayed");
        } catch (NoSuchElementException e) {
            Assert.assertTrue(successMessage.isDisplayed(), "Success message is not displayed");
            Assert.assertTrue(createdSuccessMessage.isDisplayed(), "schedule created message is not displayed");
        }
    }

    public boolean getCurrentDayDate() {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        String date = dateTimeFormatter.format(localDate);

        WebElement currentDay = driver.findElement(By.xpath("//*[contains(text(),'" + date + "')]"));
        return currentDay.isDisplayed();
    }

    public boolean getCurrentDay() {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = dateTimeFormatter.format(localDate);

        WebElement currentDay = driver.findElement(By.xpath("//*[contains(@class,'p-6 pt-2')]//*[contains(text(),'" + date + "')]"));
        return currentDay.isDisplayed();
    }

    public boolean getPrescriptionDetailsText() {
        return prescriptionDetailsText.isDisplayed();
    }

    public boolean getPrescriptionDetailsDateText() {
        return prescriptionDetailsDateText.isDisplayed();
    }

    public boolean getPrescriptionDetailsValidTillText() {
        return prescriptionDetailsValidTillText.isDisplayed();
    }

    public boolean getPrescriptionDetailsChiefComplaintsText() {
        return prescriptionDetailsChiefComplaintsText.isDisplayed();
    }

    public boolean getPrescriptionDetailsClinicalFeaturesText() {
        return prescriptionDetailsClinicalFeaturesText.isDisplayed();
    }

    public boolean getPrescriptionDetailsExaminationText() {
        return prescriptionDetailsExaminationText.isDisplayed();
    }

    public boolean getPrescriptionDetailsDiagnosisText() {
        return prescriptionDetailsDiagnosisText.isDisplayed();
    }

    public boolean getSupplementPrescriptionPillIcon() {
        return supplementPrescriptionPillIcon.isDisplayed();
    }

    public boolean getSupplementPrescriptionNoSupplementFoundText() {
        return supplementPrescriptionNoSupplementFoundText.isDisplayed();
    }

    public boolean getSupplementPrescriptionAddSupplementPrescriptionButton() {
        return supplementPrescriptionAddSupplementPrescriptionButton.isDisplayed();
    }

    public boolean getSupplementPrescriptionPlusIconInAddSupplement() {
        return supplementPrescriptionPlusIconInAddSupplement.isDisplayed();
    }

    public boolean getSupplementPrescriptionAddSupplementPrescriptionInfo() {
        return supplementPrescriptionAddSupplementPrescriptionInfo.isDisplayed();
    }

    public void clickOnDrugPrescriptionChevronIcon() {
        Actions actions = new Actions(driver);
        actions.moveToElement(drugPrescriptionChevronIcon).build().perform();
        drugPrescriptionChevronIcon.click();
    }

    public boolean getDrugPrescriptionTabletIcon() {
        return drugPrescriptionTabletIcon.isDisplayed();
    }

    public boolean getDrugPrescriptionNoDrugFoundText() {
        return drugPrescriptionNoDrugFoundText.isDisplayed();
    }

    public boolean getDrugPrescriptionPlusIconInAddDrug() {
        return drugPrescriptionPlusIconInAddDrug.isDisplayed();
    }

    public boolean getDrugPrescriptionAddDrugPrescriptionButton() {
        return drugPrescriptionAddDrugPrescriptionButton.isDisplayed();
    }

    public boolean getDrugPrescriptionAddDrugPrescriptionInfo() {
        return drugPrescriptionAddDrugPrescriptionInfo.isDisplayed();
    }

    public boolean getAdditionalInformationText() {
        return additionalInformationText.isDisplayed();
    }

    public boolean getAdditionalInformationInvestigationText() {
        return additionalInformationInvestigationText.isDisplayed();
    }

    public boolean getAdditionalInformationAdviceReferralsText() {
        return additionalInformationAdviceReferralsText.isDisplayed();
    }

    public boolean getAdditionalInformationNotesText() {
        Actions actions = new Actions(driver);
        actions.moveToElement(additionalInformationNotesText).build().perform();
        return additionalInformationNotesText.isDisplayed();
    }

    public boolean getNoDataPresentText() {
        return noDataPresentText.isDisplayed();
    }

    public boolean getCurrentDate(){
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = dateTimeFormatter.format(localDate);

        WebElement currentDay = driver.findElement(By.xpath("//*[contains(@class,'divide-y')]//*[contains(text(),'" + date + "')]"));
        return currentDay.isDisplayed();
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000);");
    }

}
