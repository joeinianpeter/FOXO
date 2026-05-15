package org.FOMIX.WebDashboard.POM;

import org.FOMIX.API.Utils.AppConstants;
import org.FOMIX.API.Utils.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class MeetingNotesPage {
    public WebDriver driver;

    public MeetingNotesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[contains(text(),'Saved successfully')]")
    private WebElement meetingNotesSaved;

    @FindBy(xpath = "//*[contains(@class,'relative py-2')]")
    private WebElement memberNameNotes;

    @FindBy(xpath = "//*[@aria-label='editable markdown']")
    private WebElement inputDashboardNotes;

    @FindBy(xpath = "//button[span[normalize-space()='Save']]")
    private WebElement saveButton;

    @FindBy(xpath = "//*[contains(text(),'Success')]")
    private WebElement successMessage;

    @FindBy(xpath = "//*[contains(text(),'Meeting note saved')]")
    private WebElement noteSavedSuccessMessage;

    @FindBy(xpath = "//*[contains(text(),'Unsaved Changes')]")
    private WebElement unsavedChanges;

    @FindBy(xpath = "//*[contains(text(),'You have unsaved meeting notes. If you leave now, your changes will be lost.')]")
    private WebElement unsavedChangesInfo;

    @FindBy(xpath = "//*[contains(text(),'Stay & Save')]")
    private WebElement staySave;

    @FindBy(xpath = "//*[contains(text(),'Discard & Leave')]")
    private WebElement discardAndLeave;

    @FindBy(xpath = "//button[contains(normalize-space(),'Add meeting note')]")
    private WebElement addMeetingNotesButton;

    @FindBy(xpath = "//*[contains(text(),'Enter Notes')]")
    private WebElement enterNotesPlaceHolder;

    public Boolean getMeetingNotes(String notes) {
        try {
            WebElement dashboardNotes = driver.findElement(By.xpath("//*[contains(normalize-space(),'" + notes + "')]"));
            return dashboardNotes.isDisplayed();
        } catch (Exception e) {
            WebElement dashboardNotes = driver.findElement(By.xpath("//*[contains(normalize-space(),'" + notes + "')]"));
            return dashboardNotes.isDisplayed();
        }

    }

    public void clickOnOptions(String options) {
        try {
            WebElement option = driver.findElement(By.xpath("//button[contains(normalize-space(),'" + options + "')]"));
            option.click();
        } catch (Exception e) {
            driver.navigate().refresh();
            WebElement option = driver.findElement(By.xpath("//button[contains(normalize-space(),'" + options + "')]"));
            option.click();
        }
    }

    public String enterMeetingNotes() {
        List<WebElement> notes = driver.findElements(By.xpath("//*[@class='w-full']//tbody//td//*[@aria-label='editable markdown']"));
        String meetingNotes = Faker.generateMeetingNotes();
        notes.get(0).sendKeys(meetingNotes);
        try {
            meetingNotesSaved.isDisplayed();
        } catch (NoSuchElementException e) {
            meetingNotesSaved.isDisplayed();
        }

        return meetingNotes;
    }

    public MeetingNotesPage clickOnMemberNameNotes() {
        try {
            driver.navigate().refresh();
            memberNameNotes.click();
        } catch (Exception e) {
            memberNameNotes.click();
        }
        return this;
    }

    public void enterDataIntoDashboardNotes() throws InterruptedException {
        String meetingNotes = Faker.generateMeetingNotes();
        inputDashboardNotes.sendKeys(meetingNotes);
        AppConstants.setMeetingNotes(meetingNotes);
        Thread.sleep(1000);
    }

    public void clickOnSaveButton() throws InterruptedException {
        Thread.sleep(1000);
        saveButton.click();
    }

    public void getNotesSuccessMessage() {
        Assert.assertTrue(successMessage.isDisplayed(), "Success message is not displayed");
        Assert.assertTrue(noteSavedSuccessMessage.isDisplayed(), "schedule created message is not displayed");
    }

    public void checkTheCursorPositionInMeetingNotesSection() {
        List<WebElement> notes = driver.findElements(By.xpath("//*[@class='w-full']//tbody//td//*[@aria-label='editable markdown']"));
        notes.get(0).click();

        // Clear everything
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.COMMAND) // or CONTROL for Windows
                .sendKeys("a")
                .keyUp(Keys.COMMAND)
                .sendKeys(Keys.DELETE)
                .perform();

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

        List<Long> cursorPositions = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            actions.sendKeys(" FOXO FOXO ").perform();

            Long cursorPos = (Long) javascriptExecutor.executeScript(
                    "var sel = window.getSelection();" +
                            "if (sel.rangeCount === 0) return -1;" +
                            "var range = sel.getRangeAt(0);" +
                            "return range.startOffset;"
            );
            System.out.println("Cursor position: " + cursorPos);
            cursorPositions.add(cursorPos);
        }

        // Verify cursor never moves backward
        boolean cursorMovedBackward = false;
        for (int i = 1; i < cursorPositions.size(); i++) {

            if (cursorPositions.get(i) < cursorPositions.get(i - 1)) {
                cursorMovedBackward = true;
                System.out.println("Cursor moved backward from " +
                        cursorPositions.get(i - 1) + " to " + cursorPositions.get(i));
            }
        }

        if (cursorMovedBackward) {
            throw new AssertionError("Cursor moved backward!");
        } else {
            System.out.println("Cursor moved forward correctly throughout.");
        }
    }

    public void checkTheCursorPositionInDashboardSection() {

        Actions actions = new Actions(driver);
        actions.moveToElement(inputDashboardNotes).perform();

        inputDashboardNotes.click();

        // Clear everything
        actions.keyDown(Keys.COMMAND) // or CONTROL for Windows
                .sendKeys("a")
                .keyUp(Keys.COMMAND)
                .sendKeys(Keys.DELETE)
                .perform();

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

        List<Long> cursorPositions = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            actions.sendKeys(" FOXO FOXO ").perform();

            Long cursorPos = (Long) javascriptExecutor.executeScript(
                    "var sel = window.getSelection();" +
                            "if (sel.rangeCount === 0) return -1;" +
                            "var range = sel.getRangeAt(0);" +
                            "return range.startOffset;"
            );
            System.out.println("Cursor position: " + cursorPos);
            cursorPositions.add(cursorPos);
        }

        // Verify cursor never moves backward
        boolean cursorMovedBackward = false;
        for (int i = 1; i < cursorPositions.size(); i++) {

            if (cursorPositions.get(i) < cursorPositions.get(i - 1)) {
                cursorMovedBackward = true;
                System.out.println("Cursor moved backward from " +
                        cursorPositions.get(i - 1) + " to " + cursorPositions.get(i));
            }
        }

        if (cursorMovedBackward) {
            throw new AssertionError("Cursor moved backward!");
        } else {
            System.out.println("Cursor moved forward correctly throughout.");
        }

    }

    public void checkDataDeletion() {
        List<WebElement> notes = driver.findElements(By.xpath("//*[@class='w-full']//tbody//td//*[@aria-label='editable markdown']"));

        WebElement notesBox = notes.get(0);

        String meetingNotes = Faker.generateMeetingNotes().replace(".", "");
        String[] words = meetingNotes.split(" ");

        notesBox.sendKeys(words[0]);

        //auto-save
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Saving')]")));

        for (int i = 1; i < words.length; i++) {
            notesBox.sendKeys(" " + words[i]);
        }

        // wait until save completes
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[contains(text(),'Saved successfully')]")));

        Assert.assertTrue(driver.findElement(By.xpath("//*[@aria-label='editable markdown']//*[contains(text(),'" + meetingNotes + "')]")).isDisplayed());

    }

    public boolean getUnsavedChangesText() {
        return unsavedChanges.isDisplayed();
    }

    public boolean getUnsavedChangesInfoText() {
        return unsavedChangesInfo.isDisplayed();
    }

    public boolean getStaySaveText() {
        return staySave.isDisplayed();
    }

    public boolean getDiscardAndLeaveText() {
        return discardAndLeave.isDisplayed();
    }

    public void clickOnDiscardAndLeave() {
        discardAndLeave.click();
    }

    public Boolean addMeetingNoteDisplayed() {
        return addMeetingNotesButton.isDisplayed();
    }

    public Boolean enterNotesPlaceHolderDashboard() throws InterruptedException {
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(enterNotesPlaceHolder)
                .build()
                .perform();
        return enterNotesPlaceHolder.isDisplayed();
    }

    public void verticalScrollDown(WebElement element) {
        Actions actions = new Actions(driver);

        actions.moveToElement(element)
                .clickAndHold()
                .moveByOffset(0, 400)   // positive → scroll down
                .release()
                .perform();
    }

    public void verticalScrollUp(WebElement element) {
        Actions actions = new Actions(driver);

        actions.moveToElement(element)
                .clickAndHold()
                .moveByOffset(0, -400)   // positive → scroll down
                .release()
                .perform();
    }

    public void jsClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }
}
