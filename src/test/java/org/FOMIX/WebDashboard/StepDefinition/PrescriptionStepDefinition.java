package org.FOMIX.WebDashboard.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.FOMIX.WebDashboard.POM.PrescriptionPage;
import org.FOMIX.WebDashboard.Utils.TextContextSetup;
import org.testng.Assert;

public class PrescriptionStepDefinition {
    public TextContextSetup textContextSetup;

    public PrescriptionStepDefinition(TextContextSetup textContextSetup) {
        this.textContextSetup = textContextSetup;
    }
    @Then("Click on Create Prescription")
    public void clickOnCreatePrescription() {
        PrescriptionPage prescriptionPage = textContextSetup.pageObjectManager.prescriptionPage();
        prescriptionPage.clickOnCreatePrescription();

    }

    @Then("Verify the create prescription success message")
    public void verifyTheCreatePrescriptionSuccessMessage() {
        PrescriptionPage prescriptionPage = textContextSetup.pageObjectManager.prescriptionPage();
        prescriptionPage.getPrescriptionCreatedSuccessMessage();
    }

    @And("Verify the created prescription should be in draft state")
    public void verifyTheCreatedPrescriptionShouldBeInDraftState() {
        PrescriptionPage prescriptionPage = textContextSetup.pageObjectManager.prescriptionPage();
        Assert.assertTrue(prescriptionPage.getDraftText(), "The draft text is not displayed");
        Assert.assertTrue(prescriptionPage.getDraftCircleAlertIcon(), "The circle alert icon near to draft text is not displayed");
    }

    @Then("Verify the prescription details, supplement prescription, drug prescription and additional information")
    public void verifyThePrescriptionDetailsSupplementPrescriptionDrugPrescriptionAndAdditionalInformation() {
        PrescriptionPage prescriptionPage = textContextSetup.pageObjectManager.prescriptionPage();
        Assert.assertTrue(prescriptionPage.getPrescriptionDetailsHeaderText(), "The PRESCRIPTION DETAILS text is not displayed");
        Assert.assertTrue(prescriptionPage.getProfileAvatar(), "The profile avatar of the member is not displayed");
        Assert.assertTrue(prescriptionPage.getCurrentDayDate(), "The prescription details creation date is not displayed");
        //prescription details
        Assert.assertTrue(prescriptionPage.getPrescriptionDetailsText(), "The prescription details text is not displayed");
        Assert.assertTrue(prescriptionPage.getPrescriptionDetailsDateText(), "The prescription details date text is not displayed");
        Assert.assertTrue(prescriptionPage.getPrescriptionDetailsValidTillText(), "The prescription details VALID TILL text is not displayed");
        Assert.assertTrue(prescriptionPage.getPrescriptionDetailsChiefComplaintsText(), "The prescription details CHIEF COMPLAINTS text is not displayed");
        Assert.assertTrue(prescriptionPage.getPrescriptionDetailsClinicalFeaturesText(), "The prescription details CLINICAL FEATURES text is not displayed");
        Assert.assertTrue(prescriptionPage.getPrescriptionDetailsExaminationText(), "The prescription details EXAMINATION text is not displayed");
        Assert.assertTrue(prescriptionPage.getPrescriptionDetailsDiagnosisText(), "The prescription details DIAGNOSIS text is not displayed");
        //supplement details
        Assert.assertTrue(prescriptionPage.getSupplementPrescriptionPillIcon(), "The supplement prescription PILL icon is not displayed");
        Assert.assertTrue(prescriptionPage.getSupplementPrescriptionNoSupplementFoundText(), "The supplement prescription NO SUPPLEMENT FOUND text is not displayed");
        Assert.assertTrue(prescriptionPage.getSupplementPrescriptionPlusIconInAddSupplement(), "The supplement prescription PLUS icon is not displayed");
        Assert.assertTrue(prescriptionPage.getSupplementPrescriptionAddSupplementPrescriptionButton(), "The supplement prescription ADD SUPPLEMENT PRESCRIPTION text is not displayed");
        Assert.assertTrue(prescriptionPage.getSupplementPrescriptionAddSupplementPrescriptionInfo(), "The supplement prescription INFO text is not displayed");
        //drug prescription
        prescriptionPage.clickOnDrugPrescriptionChevronIcon();
        Assert.assertTrue(prescriptionPage.getDrugPrescriptionTabletIcon(), "The drug prescription TABLET icon is not displayed");
        Assert.assertTrue(prescriptionPage.getDrugPrescriptionNoDrugFoundText(), "The drug prescription NO DRUG PRESCRIPTION FOUND text is not displayed");
        Assert.assertTrue(prescriptionPage.getDrugPrescriptionPlusIconInAddDrug(), "The drug prescription PLUS icon is not displayed");
        Assert.assertTrue(prescriptionPage.getDrugPrescriptionAddDrugPrescriptionButton(), "The drug prescription ADD DRUG PRESCRIPTION text is not displayed");
        Assert.assertTrue(prescriptionPage.getDrugPrescriptionAddDrugPrescriptionInfo(), "The drug prescription INFO text is not displayed");
        //additional Info
        Assert.assertTrue(prescriptionPage.getAdditionalInformationText(), "The additional information text is not displayed");
        Assert.assertTrue(prescriptionPage.getAdditionalInformationInvestigationText(), "The additional information INVESTIGATION text is not displayed");
        Assert.assertTrue(prescriptionPage.getAdditionalInformationAdviceReferralsText(), "The additional information ADVICE REFERRALS text is not displayed");
        Assert.assertTrue(prescriptionPage.getAdditionalInformationNotesText(), "The additional information NOTES text is not displayed");

    }

    @Then("Verify the info message when user has no prescription")
    public void verifyTheInfoMessageWhenUserHasNoPrescription() {
        PrescriptionPage prescriptionPage = textContextSetup.pageObjectManager.prescriptionPage();
        Assert.assertTrue(prescriptionPage.getNoDataPresentText(),"The NO DATA PRESENT text is not displayed");
    }

    @Then("Verify the created prescription should always be the current date")
    public void verifyTheCreatedPrescriptionShouldAlwaysBeTheCurrentDate() {
        PrescriptionPage prescriptionPage = textContextSetup.pageObjectManager.prescriptionPage();
        Assert.assertTrue(prescriptionPage.getCurrentDayDate(),"The NO DATA PRESENT text is not displayed");
        Assert.assertTrue(prescriptionPage.getCurrentDay(),"The NO DATA PRESENT text is not displayed");
        Assert.assertTrue(prescriptionPage.getCurrentDate(),"The NO DATA PRESENT text is not displayed");
    }
}
