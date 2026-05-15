package org.FOMIX.API.StepDefinition;

import io.cucumber.java.en.*;
import org.FOMIX.API.Services.PrescriptionService;
import org.FOMIX.API.Utils.AppConstants;

public class PrescriptionStepDefinition {
    @Given("Delete all existing prescription for the member")
    public void deleteAllExistingPrescriptionForTheMember() {
        PrescriptionService prescriptionService = new PrescriptionService(AppConstants.getAccessToken());
        prescriptionService.deleteAllPrescription(AppConstants.getMemberId());
    }
}
