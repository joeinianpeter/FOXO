package org.FOMIX.WebDashboard.POM;

import org.FOMIX.API.Utils.AppConstants;
import org.FOMIX.API.Utils.XPathUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class SchedulePage {

    public WebDriver driver;

    public SchedulePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@placeholder='Search events...']")
    private WebElement searchEventTextBox;

    @FindBy(xpath = "//button[normalize-space(.)='Create schedule']")
    private WebElement createSchedule;

    @FindBy(xpath = "//*[contains(text(),'Success')]")
    private WebElement successText;

    @FindBy(xpath = "//*[contains(text(),'schedule created successfully')]")
    private WebElement scheduleCreatedMessage;

    @FindBy(xpath = "//*[contains(text(),'Squad responsible for the event')]/following::*//*[contains(@class,'chevron-down')]")
    private WebElement squadOption;

    @FindBy(xpath = "//*[@placeholder='Search squads...']")
    private WebElement searchSquadTextBox;

    @FindBy(xpath = "//button[contains(.,'Add Care Specialist')]")
    private WebElement addCareSpecialistButton;

    @FindBy(xpath = "//*[contains(text(),'Select...')]")
    private WebElement selectCareSpecialistTextBox;

    @FindBy(xpath = "//*[@placeholder='Search care_specialists...']")
    private WebElement searchCareSpecialistTextBox;

    @FindBy(xpath = "//*[@placeholder='Search tables...']")
    private WebElement searchTableTextBox;

    @FindBy(xpath = "//*[contains(text(),'Start time of the scheduled event')]/following-sibling::*//*[contains(@class,'-x')]")
    private WebElement startTimeCloseIcon;

    @FindBy(xpath = "//*[contains(text(),'End time of the scheduled event')]/following-sibling::*//*[contains(@class,'-x')]")
    private WebElement endTimeCloseIcon;

    @FindBy(xpath = "//*[contains(text(),'Start time of the scheduled event')]/following-sibling::*//*[contains(@class,'lucide-calendar')]")
    private WebElement startTimeCalendarIcon;

    @FindBy(xpath = "//*[contains(text(),'End time of the scheduled event')]/following-sibling::*//*[contains(@class,'lucide-calendar')]")
    private WebElement endTimeCalendarIcon;

    @FindBy(xpath = "//*[contains(text(),'Select time')]")
    private WebElement arrowIcon;

    @FindBy(xpath = "//*[contains(text(),'Cancel')]")
    private WebElement cancelButton;

    @FindBy(xpath = "//*[contains(text(),'Done')]")
    private WebElement doneButton;

    @FindBy(xpath = "//*[contains(text(),'Optional Fields')]")
    private WebElement optionalField;

    @FindBy(xpath = "//*[contains(@class,'square-pen')]")
    private WebElement editIconSchedule;

    @FindBy(xpath = "//button[normalize-space(.)='Update schedule']")
    private WebElement updateSchedule;

    @FindBy(xpath = "//*[contains(text(),'schedule updated successfully')]")
    private WebElement scheduleUpdatedMessage;

    public void clickOnScheduleOptions(String... options) {
        for (String option : options) {
            String scheduleOption = XPathUtils.escapeForXpath(option);
            List<WebElement> elements = driver.findElements(By.xpath("//*[contains(text()," + scheduleOption + ")]"));

            if (!elements.isEmpty()) {
                try {
                    WebElement element = elements.get(0);
                    element.click();
                    return;
                } catch (NoSuchElementException e) {
                    WebElement element = elements.get(0);
                    verticalScroll(element);
                    element.click();
                    return;
                }
            }
        }

        throw new RuntimeException("Schedule option NOT FOUND");
    }

    public void verticalScroll(WebElement element) {
        Actions actions = new Actions(driver);

        actions.moveToElement(element)
                .clickAndHold()
                .moveByOffset(0, 10)   // positive → scroll down
                .release()
                .perform();
    }

    public void clickOnScheduleList(String optionOne, String optionTwo) {
        try {
            WebElement scheduleOption = driver.findElement(By.xpath("//*[contains(text(),'" + optionOne + "')]"));
            scheduleOption.click();
        } catch (NoSuchElementException e) {
            WebElement scheduleOption = driver.findElement(By.xpath("//*[contains(text(),'" + optionTwo + "')]"));
            scheduleOption.click();
        }
    }

    public void clickOnOptions(String option) {
        WebElement options = driver.findElement(By.xpath("//button[not(contains(@class,'hidden')) and .//*[contains(@class,'" + option + "')]]"));
        options.click();
    }

    public void clickOnSearchTable(String option) {
        searchTableTextBox.sendKeys(option);
        WebElement options = driver.findElement(By.xpath("//*[contains(@class,'py-1 overflow')]//*[contains(text(),'" + option + "')]"));
        options.click();
    }

    public void clickOnEventName(String eventName, String event) {
        try {
            WebElement eventNameTextBox = driver.findElement(By.xpath("//*[@class='flex-1 p-6']//*[contains(text(),'" + eventName + "')]"));
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOf(eventNameTextBox));
            eventNameTextBox.click();
        } catch (NoSuchElementException e) {
            String eventTitle = toTitleCase(eventName);
            WebElement eventNameTextBox = driver.findElement(By.xpath("//*[@class='flex-1 p-6']//*[contains(text(),'" + eventTitle + "')]"));
            eventNameTextBox.click();
        }
        searchEventTextBox.sendKeys(event);
        try {
            WebElement selectAEventName = driver.findElement(By.xpath("//*[contains(text(),'" + event + "')]"));
            selectAEventName.click();
        } catch (NoSuchElementException e) {
            String eventTitle = toLowerCase(event);
            WebElement selectAEventName = driver.findElement(By.xpath("//*[contains(text(),'" + eventTitle + "')]"));
            selectAEventName.click();
        }
    }

    public void clickOnCreateSchedule() {
        createSchedule.click();
    }

    public void getScheduleCreatedSuccessMessage() {
        try {
            Assert.assertTrue(successText.isDisplayed(), "Success message is not displayed");
            Assert.assertTrue(scheduleCreatedMessage.isDisplayed(), "schedule created message is not displayed");
        } catch (NoSuchElementException e) {
            Assert.assertTrue(successText.isDisplayed(), "Success message is not displayed");
            Assert.assertTrue(scheduleCreatedMessage.isDisplayed(), "schedule created message is not displayed");
        }
    }

    public void getCreatedScheduleDetails(String memberName, String eventName, String startDay, String endDay) {
        try {
            WebElement memberNameText = driver.findElement(By.xpath("//*[@class='w-full']//tbody//tr//*[@attr='member_id']//*[contains(text(),'" + memberName + "')]"));
            Assert.assertTrue(memberNameText.isDisplayed(), "The Member Name displayed is not Matching....");
        } catch (NoSuchElementException e) {
            driver.navigate().refresh();
            WebElement memberNameText = driver.findElement(By.xpath("//*[@class='w-full']//tbody//tr//*[@attr='member_id']//*[contains(text(),'" + memberName + "')]"));
            Assert.assertTrue(memberNameText.isDisplayed(), "The Member Name displayed is not Matching....");
        }

        String eventTitle = toTitleCase(eventName);

        try {
            WebElement eventNameText = driver.findElement(By.xpath("//*[@class='w-full']//tbody//tr//*[@attr='event_id']//*[contains(text(),'" + eventTitle + "')]"));
            Assert.assertTrue(eventNameText.isDisplayed(), "The Event Name displayed is not Matching....");
        } catch (NoSuchElementException e) {
            WebElement eventNameText = driver.findElement(By.xpath("//*[@class='w-full']//tbody//tr//*[@attr='event_id']//*[contains(text(),'" + eventTitle + "')]"));
            Assert.assertTrue(eventNameText.isDisplayed(), "The Event Name displayed is not Matching....");
        }

        String startTimeAndDate = getDate(startDay) + ", " + getFormattedTime(AppConstants.getStartTime());
        String endTimeAndDate = getDate(endDay) + ", " + getFormattedTime(AppConstants.getEndTime());

        System.out.println("Start time:" + startTimeAndDate);
        System.out.println("End time:" + endTimeAndDate);

        WebElement startDateTimeText = driver.findElement(By.xpath("//*[@class='w-full']//tbody//tr//*[@attr='start_time']//*[contains(text(),'" + startTimeAndDate + "')]"));
        Assert.assertTrue(startDateTimeText.isDisplayed(), "The Start Time displayed is not Matching....");

        WebElement endDateTimeText = driver.findElement(By.xpath("//*[@class='w-full']//tbody//tr//*[@attr='end_time']//*[contains(text(),'" + endTimeAndDate + "')]"));
        horizontalScroll(endDateTimeText, -500);
        Assert.assertTrue(endDateTimeText.isDisplayed(), "The End Time displayed is not Matching....");
    }

    public static String getDate(String day) {
        day = day.trim().toLowerCase();
        LocalDate localDate = LocalDate.now();

        switch (day) {
            case "yesterday":
                localDate = LocalDate.now().minusDays(1);
                break;

            case "tomorrow":
                localDate = LocalDate.now().plusDays(1);
                break;

            default:
                //today
                break;

        }

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        return localDate.format(dateTimeFormatter);
    }

    public String getFormattedTime(String inputTime) {
        String time = inputTime;

        time = time.replaceFirst("^0", "");
        time = time.toLowerCase();

        return time;
    }

    public String toTitleCase(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder result = new StringBuilder();
        boolean newWord = true;

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            // Space OR Hyphen = next character should be capital
            if (ch == ' ' || ch == '-') {
                result.append(ch);
                newWord = true;
            } else {

                if (newWord) {
                    // convert first letter to CAPITAL manually
                    if (ch >= 'a' && ch <= 'z') {
                        ch = (char) (ch - 32);
                    }

                    result.append(ch);
                    newWord = false;

                } else {
                    // convert remaining letters to small manually
                    if (ch >= 'A' && ch <= 'Z') {
                        ch = (char) (ch + 32);
                    }

                    result.append(ch);
                }
            }
        }

        return result.toString();
    }

    public String toLowerCase(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder result = new StringBuilder();

        boolean firstLetter = true;   // first character of full sentence
        boolean afterHyphen = false;  // becomes true only if '-' exists

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            // keep spaces
            if (ch == ' ') {
                result.append(ch);
                continue;
            }

            // detect hyphen
            if (ch == '-') {
                result.append(ch);
                afterHyphen = true;
                continue;
            }

            if (firstLetter) {
                // first letter should be CAPITAL
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char) (ch - 32);
                }
                firstLetter = false;

            } else {
                // all remaining letters should be small
                if (ch >= 'A' && ch <= 'Z') {
                    ch = (char) (ch + 32);
                }
            }

            result.append(ch);
        }
        return result.toString();
    }

    public void horizontalScroll(WebElement element, int xOffset) {
        Actions actions = new Actions(driver);

        actions.clickAndHold(element)
                .moveByOffset(xOffset, 0)
                .release()
                .perform();
    }

    public SchedulePage clickOnSquadSelectionTextBox() {
        squadOption.click();
        return this;
    }

    public SchedulePage clickOnSearchSquadTextBox(String squadMember) {
        searchSquadTextBox.sendKeys(squadMember);
        return this;
    }

    public void clickOnSelectSquadMember() {
        WebElement clickOnSquadMember = driver.findElement(By.xpath("//*[contains(text(),'" + AppConstants.getSquadMember() + "')]"));
        clickOnSquadMember.click();
    }

    public SchedulePage clickOnAddCareSpecialistButton() {
        addCareSpecialistButton.click();
        return this;
    }

    public SchedulePage clickOnSelectCareSpecialistTextBox() {
        selectCareSpecialistTextBox.click();
        return this;
    }

    public SchedulePage clickOnSearchCareSpecialistTextBox(String careSpecialistName) {
        searchCareSpecialistTextBox.sendKeys(careSpecialistName);
        return this;
    }

    public void clickOnCareSpecialistName() {
        WebElement clickOnCareSpecialistName = driver.findElement(By.xpath("//*[contains(text(),'" + AppConstants.getCareSpecialistName() + "')]"));
        clickOnCareSpecialistName.click();
    }

    public void selectStartEndTime(String hour, String minute, String timePeriod) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        try {
            WebElement hours = driver.findElement(By.xpath("//*[text()='Hour']/following-sibling::*[contains(text(),'" + hour + "')]"));
            hours.click();
        } catch (ElementNotInteractableException e) {
            scrollToCancel();
            Thread.sleep(500);
            WebElement hours = driver.findElement(By.xpath("//*[text()='Hour']/following-sibling::*[contains(text(),'" + hour + "')]"));
            safeClick(hours);
        }

        WebElement minutes = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[text()='Min']/following-sibling::*[contains(text(),'" + minute + "')]")));

        safeClick(minutes);

        WebElement time = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[text()='AM/PM']/following-sibling::*[contains(text(),'" + timePeriod + "')]")));

        safeClick(time);

        try {
            doneButton.click();
        } catch (Exception e) {
            doneButton.click();
        }

    }

    public SchedulePage clickOnStartTimeCloseIcon() {
        try {
            startTimeCloseIcon.click();
        } catch (Exception e) {
            startTimeCloseIcon.click();
        }
        return this;
    }

    public SchedulePage clickOnEndTimeCloseIcon() {
        try {
            endTimeCloseIcon.click();
        } catch (Exception e) {
            endTimeCloseIcon.click();
        }
        return this;
    }

    public SchedulePage clickOnStartTimeCalendarIcon() {
        try {
            startTimeCalendarIcon.click();
        } catch (Exception e) {
            startTimeCalendarIcon.click();
        }
        return this;
    }

    public SchedulePage clickOnEndTimeCalendarIcon() {
        try {
            endTimeCalendarIcon.click();
        } catch (Exception e) {
            endTimeCalendarIcon.click();
        }
        return this;
    }

    public SchedulePage clickOnArrowIcon() {
        try {
            arrowIcon.click();
        } catch (ElementClickInterceptedException e) {
            arrowIcon.click();
        }
        return this;
    }

    public SchedulePage selectADay(String day) {
        String date = selectDay(day);
        WebElement dateElement = driver.findElement(By.xpath("//button[text()='" + date + "']"));
        dateElement.click();
        return this;
    }

    public void scrollToCancel() {
        _moveToElement(cancelButton);
    }

    public void _moveToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public void safeClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            js.executeScript(
                    "arguments[0].scrollIntoView({block: 'center'});",
                    element
            );

            Thread.sleep(200); // small stabilization

            element.click();

        } catch (Exception e) {
            js.executeScript("arguments[0].click();", element);
        }
    }

    public SchedulePage clickOnOptionalField() {
        optionalField.click();
        return this;
    }

    public static String selectDay(String day) {
        day = day.trim().toLowerCase();
        LocalDate localDate = LocalDate.now();

        switch (day) {
            case "yesterday":
                localDate = LocalDate.now().minusDays(1);
                break;

            case "tomorrow":
                localDate = LocalDate.now().plusDays(1);
                break;

            default:
                // today
                break;
        }

        // Format date (change pattern if needed)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
        return localDate.format(formatter);
    }

    public void editIconOnSchedule(){
        horizontalScroll(editIconSchedule, -600);
        editIconSchedule.click();
    }

    public void clickOnUpdateSchedule(){
        updateSchedule.click();
    }

    public void getScheduleUpdatedSuccessMessage() {
        try {
            Assert.assertTrue(successText.isDisplayed(), "Success message is not displayed");
            Assert.assertTrue(scheduleUpdatedMessage.isDisplayed(), "schedule updated message is not displayed");
        } catch (NoSuchElementException e) {
            Assert.assertTrue(successText.isDisplayed(), "Success message is not displayed");
            Assert.assertTrue(scheduleUpdatedMessage.isDisplayed(), "schedule updated message is not displayed");
        }
    }


    public void getUpdatedScheduleDetails(String memberName, String eventName, String startDay, String endDay){
        try {
            driver.navigate().refresh();
            WebElement memberNameText = driver.findElement(By.xpath("//*[@class='w-full']//tbody//tr//*[@attr='member_id']//*[contains(text(),'" + memberName + "')]"));
            Assert.assertTrue(memberNameText.isDisplayed(), "The Member Name displayed is not Matching....");
        } catch (NoSuchElementException e) {
            WebElement memberNameText = driver.findElement(By.xpath("//*[@class='w-full']//tbody//tr//*[@attr='member_id']//*[contains(text(),'" + memberName + "')]"));
            Assert.assertTrue(memberNameText.isDisplayed(), "The Member Name displayed is not Matching....");
        }

        String eventTitle = toTitleCase(eventName);

        try {
            WebElement eventNameText = driver.findElement(By.xpath("//*[@class='w-full']//tbody//tr//*[@attr='event_id']//*[contains(text(),'" + eventTitle + "')]"));
            Assert.assertTrue(eventNameText.isDisplayed(), "The Event Name displayed is not Matching....");
        } catch (NoSuchElementException e) {
            WebElement eventNameText = driver.findElement(By.xpath("//*[@class='w-full']//tbody//tr//*[@attr='event_id']//*[contains(text(),'" + eventTitle + "')]"));
            Assert.assertTrue(eventNameText.isDisplayed(), "The Event Name displayed is not Matching....");
        }

        String startTimeAndDate = getDate(startDay) + ", " + getFormattedTime(AppConstants.getStartTime());
        String endTimeAndDate = getDate(endDay) + ", " + getFormattedTime(AppConstants.getEndTime());

        System.out.println("Start time:" + startTimeAndDate);
        System.out.println("End time:" + endTimeAndDate);

        WebElement startDateTimeText = driver.findElement(By.xpath("//*[@class='w-full']//tbody//tr//*[@attr='start_time']//*[contains(text(),'" + startTimeAndDate + "')]"));
        Assert.assertTrue(startDateTimeText.isDisplayed(), "The Start Time displayed is not Matching....");

        WebElement endDateTimeText = driver.findElement(By.xpath("//*[@class='w-full']//tbody//tr//*[@attr='end_time']//*[contains(text(),'" + endTimeAndDate + "')]"));
        horizontalScroll(endDateTimeText, -500);
        Assert.assertTrue(endDateTimeText.isDisplayed(), "The End Time displayed is not Matching....");
    }
}
