package org.FOMIX.Mobile.POM;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.mk_latn.No;
import org.FOMIX.API.Utils.AppConstants;
import org.FOMIX.API.Utils.DateUtils;
import org.FOMIX.API.Utils.XPathUtils;
import org.FOMIX.Mobile.Utils.BaseUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;

public class SchedulesPage {

    public AndroidDriver driver;
    private final BaseUtils baseUtils;

    public SchedulesPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.baseUtils = new BaseUtils(driver);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Your Squad Member']")
    private WebElement squadMemberTitle;

    @FindBy(xpath = "//android.widget.TextView[@text='A Squad Member will be assigned soon.']")
    private WebElement squadMemberAssignedText;

    @FindBy(xpath = "//android.widget.TextView[@text='What to Expect']")
    private WebElement squadDetailsOne;

    @FindBy(xpath = "//android.widget.TextView[@text='A safe, non-judgmental space to talk about behaviours, habits, or struggles.']")
    private WebElement squadDetailsTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Guidance and tools to handle stress, anxiety, low motivation, or unhealthy habits.']")
    private WebElement squadDetailsThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Personalised action plan rather than generic advice.']")
    private WebElement squadDetailsFour;

    @FindBy(xpath = "//android.widget.TextView[@text='Encouragement, accountability, and follow-up in future sessions.']")
    private WebElement squadDetailsFive;

    @FindBy(xpath = "//android.widget.TextView[@text='Agenda']")
    private WebElement agendaText;

    @FindBy(xpath = "//android.widget.TextView[@text='Scheduled test']")
    private WebElement scheduleTestText;

    @FindBy(xpath = "//android.widget.TextView[@text='What to Expect']")
    private WebElement whatToExpectText;

    @FindBy(xpath = "//android.widget.TextView[@text='Here’s how to prepare for your test']")
    private WebElement prepareTestText;

    @FindBy(xpath = "//android.widget.TextView[@text='Why we are taking these test together?']")
    private WebElement whyTakingTestText;

    @FindBy(xpath = "//android.widget.TextView[@text='Post Sample collection']")
    private WebElement sampleCollectionText;

    @FindBy(xpath = "//android.widget.TextView[@text='1.']")
    private WebElement indexOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Scan Preparation – Instructions and setup by the technician.']")
    private WebElement agendaOne;

    @FindBy(xpath = "//android.widget.TextView[@text='2.']")
    private WebElement indexTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Radiology Test Execution – Imaging procedure (duration may vary by test).']")
    private WebElement agendaTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='3.']")
    private WebElement indexThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Data Transfer to FOXO Team – Secure upload of scan results.']")
    private WebElement agendaThree;

    @FindBy(xpath = "//android.widget.TextView[@text='4.']")
    private WebElement indexFour;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Your Radiology Test is designed to help us visualize and understand your internal health more precisely including organs, bones, and tissues, so that your care plan can be highly personalized.')]")
    private WebElement whatToExpectInfoPartOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Fasting (if advised): Usually 3-4 hours of empty stomach. Follow any fasting instructions shared by your FOXO health coach or lab representative.']")
    private WebElement prepareTestOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Hydration: No Caffeine.']")
    private WebElement prepareTestTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Clothing: Wear comfortable, loose-fitting clothes without metal zippers or jewelry.']")
    private WebElement prepareTestThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Arrive Early: Reach 15–20 minutes before your scheduled slot to ensure smooth onboarding.']")
    private WebElement prepareTestFour;

    @FindBy(xpath = "//android.widget.TextView[@text='Why we are taking these test together?']")
    private WebElement testTogether;

    @FindBy(xpath = "//android.widget.TextView[@text='It helps us:']")
    private WebElement helpsUs;

    @FindBy(xpath = "//android.widget.TextView[@text='Validate the quality of imaging and data.']")
    private WebElement testTogetherInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Integrate radiology findings with your genetic, gut, and lifestyle insights.']")
    private WebElement testTogetherInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Identify deeper correlations for more accurate interventions and recommendations.']")
    private WebElement testTogetherInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='This step is essential for completing your 360° health profile before your personalized longevity plan is crafted.']")
    private WebElement testTogetherInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='A follow-up with doctor to understand any concern with your health in past 15 days. You can also discuss any issues or symptoms you have faced during that period.']")
    private WebElement whatToExpectBiWeeklyText;

    @FindBy(xpath = "//android.widget.TextView[@text='Here’s how to prepare for your appointment']")
    private WebElement prepareForYourAppointment;

    @FindBy(xpath = "//android.widget.TextView[@text='Keep list of all the challeges you have faced or difficulty in completing any goals assigned to you.']")
    private WebElement appointmentInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='Why we are taking these appointment together?']")
    private WebElement appointmentTogether;

    @FindBy(xpath = "//android.widget.TextView[@text='To understand your health concerns over the past 15 days, track the challenges you’ve faced, and identify how FOXO can help you overcome them.']")
    private WebElement appointmentTogetherInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='A welcome box with the test kits, and a surprise.']")
    private WebElement whatToExpectFoxoIntro;

    @FindBy(xpath = "//android.widget.TextView[@text='Sit in a silent environment and wait for the call from our concierge. ']")
    private WebElement prepareYourTestInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Prepare a list of question to ask him about FOXO, and how we can contribute in your journey to longevity. ']")
    private WebElement prepareYourTestInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='This is a crucial step as knowing your concierge will help you in reaching out to him anytime and ask for support. ']")
    private WebElement testTogetherOne;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'And the test kits will be used for sample collection process.')]")
    private WebElement testTogetherTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Nothing to be done now. The urine and stool kits need to be used for sample collection a few days later. These will be collected by the phlebotomist.']")
    private WebElement postSampleCollectionInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='Phlebotomist will draw a blood sample. They will also collect the urine and stool sample, which have already been delivered to you.']")
    private WebElement bloodUrineStoolAgendaInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='Comprehensive blood panel, Metabolomics, Genetic, and Gut tests.']")
    private WebElement bloodUrineStoolScheduleTestInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='Our Care Specialist will visit to collect your core biological samples - blood, urine, and stool.']")
    private WebElement bloodUrineStoolExpectInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='In this visit, some anthropomorphic measurements will also be taken, for example, waist and hip circumference.']")
    private WebElement bloodUrineStoolExpectInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Exact protocols will be shared 48 hours before this event']")
    private WebElement bloodUrineStoolPrepareTestInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='These set of tests together provide most of the biomarker data needed for a thorough profile.']")
    private WebElement bloodUrineStoolTestTogetherInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='Results of the different tests will be available at following times. The reports will be available for download in the app.']")
    private WebElement bloodUrineStoolSampleCollectionInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='Comprehensive blood test - 2-3 days']")
    private WebElement bloodUrineStoolSampleCollectionInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Metabolomics test - 7-14 days']")
    private WebElement bloodUrineStoolSampleCollectionInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Gut test - 2-3 weeks']")
    private WebElement bloodUrineStoolSampleCollectionInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Genetic test - about 4 weeks']")
    private WebElement bloodUrineStoolSampleCollectionInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='A one-on-one conversation with your FOXO Health Coach']")
    private WebElement healthCoachingExpectInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Guidance on your lifestyle, nutrition, activity, and overall wellbeing']")
    private WebElement healthCoachingExpectInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Support in setting achievable health goals']")
    private WebElement healthCoachingExpectInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Regular check-ins to track your progress']")
    private WebElement healthCoachingExpectInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='Note down any questions or concerns you’d like to discuss']")
    private WebElement healthCoachingPrepareForYourAppointmentInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Be ready to share your daily routine, challenges, and progress']")
    private WebElement healthCoachingPrepareForYourAppointmentInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Join the call in a quiet place for a better conversation']")
    private WebElement healthCoachingPrepareForYourAppointmentInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Helps you understand your health better and make informed choices']")
    private WebElement healthCoachingAppointmentTogetherInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Keeps you accountable and motivated on your wellness journey']")
    private WebElement healthCoachingAppointmentTogetherInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Provides personalized guidance instead of generic advice']")
    private WebElement healthCoachingAppointmentTogetherInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Bridges the gap between your current lifestyle and long-term health goals']")
    private WebElement healthCoachingAppointmentTogetherInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='A friendly one-on-one conversation with our certified nutritionist']")
    private WebElement NutritionistConsultationWhatToExpectInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Discussion around your eating habits, lifestyle, and health goals']")
    private WebElement NutritionistConsultationWhatToExpectInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Personalized suggestions on diet and nutrition that fit your routine']")
    private WebElement NutritionistConsultationWhatToExpectInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Keep a rough idea of your daily meals and snacks from the last few days']")
    private WebElement nutritionistConsultationPrepareForYourAppointmentInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Note down any issues you face (e.g., bloating, fatigue, cravings)']")
    private WebElement nutritionistConsultationPrepareForYourAppointmentInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Have recent health reports (if any) handy']")
    private WebElement nutritionistConsultationPrepareForYourAppointmentInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Be open about your food preferences and challenges']")
    private WebElement nutritionistConsultationPrepareForYourAppointmentInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='Nutrition plays a key role in your long-term health and well-being']")
    private WebElement nutritionistConsultationAppointmentTogetherInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Helps you understand the connection between food and your symptoms/progress']")
    private WebElement nutritionistConsultationAppointmentTogetherInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='You’ll get practical, customized advice to make small, sustainable changes']")
    private WebElement nutritionistConsultationAppointmentTogetherInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Builds the foundation for a healthier lifestyle with FOXO’s guidance']")
    private WebElement nutritionistConsultationAppointmentTogetherInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='A quick check-in on your overall progress and energy levels']")
    private WebElement nutritionFollowupWhatToExpectInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Review of your eating habits over the past week']")
    private WebElement nutritionFollowupWhatToExpectInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Discussion of any challenges (cravings, meal timings, travel, stress eating, etc.)']")
    private WebElement nutritionFollowupWhatToExpectInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Personalised tips or small adjustments to improve your diet']")
    private WebElement nutritionFollowupWhatToExpectInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='Guidance on next week’s nutrition goals']")
    private WebElement nutritionFollowupWhatToExpectInfoFive;

    @FindBy(xpath = "//android.widget.TextView[@text='Log your meals timely in mobile app ']")
    private WebElement nutritionFollowupPrepareForYourAppointmentInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Be ready to share any difficulties you faced in following the plan']")
    private WebElement nutritionFollowupPrepareForYourAppointmentInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Track and mention changes you noticed (weight, digestion, energy, sleep)']")
    private WebElement nutritionFollowupPrepareForYourAppointmentInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='List any questions or concerns you’d like to ask']")
    private WebElement nutritionFollowupPrepareForYourAppointmentInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='Keep a water/meal routine record if possible (helps the nutritionist spot patterns)']")
    private WebElement nutritionFollowupPrepareForYourAppointmentInfoFive;

    @FindBy(xpath = "//android.widget.TextView[@text=' It will help you stay consistent and accountable and ensures your diet is aligned with your health goals.']")
    private WebElement nutritionFollowupAppointmentTogetherInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='Introduction – Quick greeting and purpose of the call']")
    private WebElement doctorConsultationAgendaInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Your Progress – Doctor asks about how you’ve been feeling since last time']")
    private WebElement doctorConsultationAgendaInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Symptoms – Share any current issues or new symptoms']")
    private WebElement doctorConsultationAgendaInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Follow-up Questions – Doctor may ask about lifestyle, habits, or concerns']")
    private WebElement doctorConsultationAgendaInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='Next Steps – Recommendations, adjustments, or tests if needed']")
    private WebElement doctorConsultationAgendaInfoFive;

    @FindBy(xpath = "//android.widget.TextView[@text='Q&A – Your chance to ask questions and clarify doubts']")
    private WebElement doctorConsultationAgendaInfoSix;

    @FindBy(xpath = "//android.widget.TextView[@text='Scheduled appointment']")
    private WebElement scheduledAppointmentText;

    @FindBy(xpath = "//android.widget.TextView[@text='Doctor will ask few basic questions to understand your progress and symptoms which you are facing.']")
    private WebElement doctorConsultationWhatToExpectInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='To understand the issues of your health']")
    private WebElement doctorConsultationAppointmentTogetherInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='Discussion of symptoms and medical history.']")
    private WebElement hormonalHealthConsultationAgendaInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Explanation of testosterone’s role in health.']")
    private WebElement hormonalHealthConsultationAgendaInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Blood test procedure and sample collection.']")
    private WebElement hormonalHealthConsultationAgendaInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Q&A with doctor on expectations and outcomes.']")
    private WebElement hormonalHealthConsultationAgendaInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='Plan for follow-up based on test results.']")
    private WebElement hormonalHealthConsultationAgendaInfoFive;

    @FindBy(xpath = "//android.widget.TextView[@text='5.']")
    private WebElement indexFive;

    @FindBy(xpath = "//android.widget.TextView[@text='Blood test to measure total testosterone']")
    private WebElement hormonalHealthConsultationScheduleAppointmentInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Possible additional markers: free testosterone, SHBG (Sex Hormone-Binding Globulin), LH, FSH, estradiol, prolactin (depending on doctor’s discretion)']")
    private WebElement hormonalHealthConsultationScheduleAppointmentInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='A short consultation with the doctor to discuss symptoms and health concerns (e.g., energy levels, mood, muscle mass, libido, sleep, weight changes).']")
    private WebElement hormonalHealthConsultationWhatToExpectInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Blood sample collection (usually in the morning, when testosterone levels peak).']")
    private WebElement hormonalHealthConsultationWhatToExpectInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Review of results with a focus on overall hormonal balance, not just testosterone.']")
    private WebElement hormonalHealthConsultationWhatToExpectInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Fasting: Some clinics recommend fasting (8–10 hours) before the test, especially if combined with other metabolic panels.']")
    private WebElement hormonalHealthConsultationPrepareForYourAppointmentInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Timing: Schedule the blood draw in the morning (7–10 AM) for most accurate results.']")
    private WebElement hormonalHealthConsultationPrepareForYourAppointmentInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Medication disclosure: Inform your doctor about any supplements, steroids, or hormone therapies you are taking.']")
    private WebElement hormonalHealthConsultationPrepareForYourAppointmentInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Lifestyle: Avoid heavy exercise, alcohol, and stress the day before, as these can temporarily affect hormone levels.']")
    private WebElement hormonalHealthConsultationPrepareForYourAppointmentInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='To check for low or high testosterone levels, which may cause fatigue, mood swings, reduced muscle strength, weight gain, or sexual health issues.']")
    private WebElement hormonalHealthConsultationAppointmentTogetherInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='To evaluate fertility, bone health, and cardiovascular risk factors.']")
    private WebElement hormonalHealthConsultationAppointmentTogetherInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='To guide treatment plans, including lifestyle changes, supplements, or hormone therapy if required.']")
    private WebElement hormonalHealthConsultationAppointmentTogetherInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Receive a personalized report with testosterone and related hormone values.']")
    private WebElement hormonalHealthConsultationSampleCollectionInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Doctor’s interpretation of results in the context of symptoms and lifestyle.']")
    private WebElement hormonalHealthConsultationSampleCollectionInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Clear next steps: dietary guidance, exercise plans, supplements, or further medical evaluation if necessary.']")
    private WebElement hormonalHealthConsultationSampleCollectionInfoThree;

    @FindBy(xpath = "//com.horcrux.svg.CircleView")
    private WebElement hormonalHealthConsultationCautionSymbol;

    @FindBy(xpath = "//android.widget.TextView[@text='Testosterone levels naturally decline with age, but lifestyle, sleep, and stress also play a huge role.']")
    private WebElement hormonalHealthConsultationCautionInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Imbalances may not always need medication—often nutrition, exercise, and stress management can improve levels.']")
    private WebElement hormonalHealthConsultationCautionInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='For accurate tracking, repeat testing may be suggested after 3–6 months.']")
    private WebElement hormonalHealthConsultationCautionInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Assessments to be done :']")
    private WebElement cardiacAndImagingTestAgendaInfoTitle;

    @FindBy(xpath = "//android.widget.TextView[@text='Calcium Score from CT scan']")
    private WebElement cardiacAndImagingTestAgendaInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='DEXA scan for BMD and body composition']")
    private WebElement cardiacAndImagingTestAgendaInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Abdomen Ultrasound']")
    private WebElement cardiacAndImagingTestAgendaInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='2D Echo']")
    private WebElement cardiacAndImagingTestAgendaInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='TMT']")
    private WebElement cardiacAndImagingTestAgendaInfoFive;

    @FindBy(xpath = "//android.widget.TextView[@text='Echocardiogram (ECHO)']")
    private WebElement cardiacAndImagingTestScheduleTestInfoTitleOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Visualizes your heart’s chambers, valves, and pumping function']")
    private WebElement cardiacAndImagingTestScheduleTestInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Electrocardiogram (ECG)']")
    private WebElement cardiacAndImagingTestScheduleTestInfoTitleTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Detects arrhythmias, electrical patterns, or heart strain']")
    private WebElement cardiacAndImagingTestScheduleTestInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Coronary Artery Calcium (CAC) Score']")
    private WebElement cardiacAndImagingTestScheduleTestInfoTitleThree;

    @FindBy(xpath = "//android.widget.TextView[@text='CT-based scan for arterial plaque and heart disease risk']")
    private WebElement cardiacAndImagingTestScheduleTestInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Abdominal Ultrasound']")
    private WebElement cardiacAndImagingTestScheduleTestInfoTitleFour;

    @FindBy(xpath = "//android.widget.TextView[@text='Looks at liver, kidneys, and other organs for structural health.']")
    private WebElement cardiacAndImagingTestScheduleTestInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='DEXA Scan']")
    private WebElement cardiacAndImagingTestScheduleTestInfoTitleFive;

    @FindBy(xpath = "//android.widget.TextView[@text='Evaluates bone density and body composition (fat, muscle, visceral adiposity)']")
    private WebElement cardiacAndImagingTestScheduleTestInfoFive;

    @FindBy(xpath = "//android.widget.TextView[@text='Cardiac and Imaging tests to ascertain risks and body composition.']")
    private WebElement cardiacAndImagingTestWhatToExpectInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='Fast 10 hours beforehand (water’s fine).']")
    private WebElement cardiacAndImagingTestPrepareForYourTestInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Skip alcohol the day before.']")
    private WebElement cardiacAndImagingTestPrepareForYourTestInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Avoid caffeine in the morning.']")
    private WebElement cardiacAndImagingTestPrepareForYourTestInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Wear comfortable clothing. Avoid wearing metal or jewellery.']")
    private WebElement cardiacAndImagingTestPrepareForYourTestInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='Stay hydrated.']")
    private WebElement cardiacAndImagingTestPrepareForYourTestInfoFive;

    @FindBy(xpath = "//android.widget.TextView[@text='These tests provide a structural and functional snapshot of your internal systems — especially your heart, blood vessels, and key organs.']")
    private WebElement cardiacAndImagingTestTogetherInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='This is about early detection, risk stratification, and prevention.']")
    private WebElement cardiacAndImagingTestTogetherInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='You can take home the physical copies of the reports post the tests. Digital versions will be uploaded on FOXO mobile app later in the day.']")
    private WebElement cardiacAndImagingTestPostSampleCollectionInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='Your concierge will be ready and waiting for you on-site.']")
    private WebElement cardiacAndImagingTestCautionInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='A review and understanding for best practices in the kitchen with respect to hygiene, storage, and organisation.']")
    private WebElement kitchenAuditWhatToExpectInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='Keep your kitchen clean and provide all the information to our Nutritionist. ']")
    private WebElement kitchenAuditPrepareForYourTestInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='A conducive kitchen environment is the foundation for fun, wholesome, and nutritious meals.']")
    private WebElement kitchenAuditTestTogetherInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='Protocol and changes needed in your kitchen supplies or practices for healthier living.']")
    private WebElement kitchenAuditPostSampleCollectionInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='Light exercises and discussions with Physio and Coach.']")
    private WebElement physioAssessmentWhatToExpectInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='Points to note']")
    private WebElement physioAssessmentPrepareFourYourTestTitle;

    @FindBy(xpath = "//android.widget.TextView[@text='Dress in athletic wear.']")
    private WebElement physioAssessmentPrepareFourYourTestInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='You can do the exercises barefoot, or in trainers. Carry a pair if you need.']")
    private WebElement physioAssessmentPrepareFourYourTestInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Carry a napkin for sweat.']")
    private WebElement physioAssessmentPrepareFourYourTestInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='A shower facility is available if you need.']")
    private WebElement physioAssessmentPrepareFourYourTestInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='You can consume a light snack prior, based on your general routine.']")
    private WebElement physioAssessmentPrepareFourYourTestInfoFive;

    @FindBy(xpath = "//android.widget.TextView[@text='Understanding of your endurance, strength, balance, flexibility, mobility.']")
    private WebElement physioAssessmentTestTogetherInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='A focused conversation about your health concerns, symptoms, and medical history.']")
    private WebElement doctorAppointmentWhatToExpectInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Doctor will connect the dots between lifestyle, test results, and current condition.']")
    private WebElement doctorAppointmentWhatToExpectInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Opportunity to ask questions and clarify doubts about treatments, risks, and preventive steps.']")
    private WebElement doctorAppointmentWhatToExpectInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Development of a personalized health plan (may include medication, therapy, or lifestyle recommendations).']")
    private WebElement doctorAppointmentWhatToExpectInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='Carry your latest test reports, prescriptions, and medical records.']")
    private WebElement doctorAppointmentPrepareForYourAppointmentInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Prepare a list of symptoms, concerns, or questions you’d like to discuss.']")
    private WebElement doctorAppointmentPrepareForYourAppointmentInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Note down any ongoing medications or supplements (including dosage).']")
    private WebElement doctorAppointmentPrepareForYourAppointmentInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Bring previous specialist consultation notes if applicable.']")
    private WebElement doctorAppointmentPrepareForYourAppointmentInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='Be ready to share details about diet, sleep, stress, and exercise for a holistic assessment.']")
    private WebElement doctorAppointmentPrepareForYourAppointmentInfoFive;

    @FindBy(xpath = "//android.widget.TextView[@text='A doctor’s summary note with key observations and next steps.']")
    private WebElement doctorAppointmentPostSampleCollectionInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Updated prescriptions (if medication or supplements are required).']")
    private WebElement doctorAppointmentPostSampleCollectionInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Referrals for specialist visits, further tests, or imaging if needed.']")
    private WebElement doctorAppointmentPostSampleCollectionInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Preventive recommendations for diet, exercise, and lifestyle.']")
    private WebElement doctorAppointmentPostSampleCollectionInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='Being transparent about habits, stress, or irregularities helps the doctor guide you better.']")
    private WebElement doctorAppointmentCautionInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Regular follow-ups help track progress and adjust plans as needed.']")
    private WebElement doctorAppointmentCautionInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Doctors often work in sync with nutritionists, trainers, and specialists for holistic care.']")
    private WebElement doctorAppointmentCautionInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Continuous Glucose Monitor (CGM) is a small, wearable patch that tracks your blood glucose 24/7 for a period of 14 days.']")
    private WebElement CGMPatchApplicationTestTogetherInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='The goal isn’t just to catch sugar spikes. It’s to understand how your body responds to food, stress, sleep, and movement.']")
    private WebElement CGMPatchApplicationTestTogetherInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Glucose is a proxy for resilience.']")
    private WebElement CGMPatchApplicationTestTogetherInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='During the period when CGM patch is applied (and more if recommended by your squad), you need to log in all your meals on this app.']")
    private WebElement CGMPatchApplicationPostSampleCollectionInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='CGM data alone may not always offer dramatic insights right away. Its real value lies in tracking how your metabolic responses evolve over time, especially after interventions.']")
    private WebElement CGMPatchApplicationCautionInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='This session is about understanding how you eat, live, and fuel your body.']")
    private WebElement nutritionistAppointmentAgendaInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='We’ll discuss']")
    private WebElement nutritionistAppointmentAgendaTitleOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Your Eating Patterns']")
    private WebElement nutritionistAppointmentAgendaInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Food Relationships']")
    private WebElement nutritionistAppointmentAgendaInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Supplement & Hydration Habits']")
    private WebElement nutritionistAppointmentAgendaInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='Lifestyle Drivers']")
    private WebElement nutritionistAppointmentAgendaInfoFive;

    @FindBy(xpath = "//android.widget.TextView[@text='Symptoms & Body Feedback']")
    private WebElement nutritionistAppointmentAgendaInfoSix;

    @FindBy(xpath = "//android.widget.TextView[@text='No recommendations, this is just about understanding you.']")
    private WebElement nutritionistAppointmentAgendaTitleTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Review of previous lab results (blood sugar, lipid profile, vitamin levels, hormonal markers, etc.).']")
    private WebElement nutritionistAppointmentScheduledAppointmentInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Dietary recall & lifestyle assessment (current food habits, exercise, sleep, stress).']")
    private WebElement nutritionistAppointmentScheduledAppointmentInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Body composition review (weight, BMI, body fat %, muscle mass if available from scans or devices).']")
    private WebElement nutritionistAppointmentScheduledAppointmentInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='May recommend additional tests (e.g., vitamin D, iron, thyroid, gut health) if gaps are identified.']")
    private WebElement nutritionistAppointmentScheduledAppointmentInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='A one-on-one discussion focused on your eating patterns, daily routines, and personal health goals.']")
    private WebElement nutritionistAppointmentWhatToExpectInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Nutritionist will ask about food preferences, allergies, intolerances, and any medical history.']")
    private WebElement nutritionistAppointmentWhatToExpectInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Personalized guidance instead of generic advice—meal structuring, portion sizes, supplements if required.']")
    private WebElement nutritionistAppointmentWhatToExpectInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Collaborative approach: plan is designed around your lifestyle, culture, and food choices.']")
    private WebElement nutritionistAppointmentWhatToExpectInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='Carry or recall a 3–5 day food log (including snacks and beverages) for accuracy.']")
    private WebElement nutritionistAppointmentPrepareForYourAppointmentInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Bring along your latest test reports or prescriptions.']")
    private WebElement nutritionistAppointmentPrepareForYourAppointmentInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Be open about challenges (e.g., cravings, eating out, irregular schedules).']")
    private WebElement nutritionistAppointmentPrepareForYourAppointmentInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Wear comfortable clothing if body composition analysis is part of the session.']")
    private WebElement nutritionistAppointmentPrepareForYourAppointmentInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='To align your nutrition with your health goals—whether it’s weight management, metabolic health, hormonal balance, or improved energy.']")
    private WebElement nutritionistAppointmentAppointmentTogetherInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Identify nutrient deficiencies or imbalances that may impact sleep, mood, or immunity.']")
    private WebElement nutritionistAppointmentAppointmentTogetherInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Create a sustainable plan that prevents lifestyle diseases (diabetes, heart disease, obesity, etc.).']")
    private WebElement nutritionistAppointmentAppointmentTogetherInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Translate lab results into practical food choices for long-term health.']")
    private WebElement nutritionistAppointmentAppointmentTogetherInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='A personalized nutrition plan tailored to your test results, lifestyle, and goals.']")
    private WebElement nutritionistAppointmentPostSampleCollectionInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Supplement guidance (if required) with proper dosage and timing.']")
    private WebElement nutritionistAppointmentPostSampleCollectionInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Practical tools: meal timing, portion guidance, healthy swaps, snack options.']")
    private WebElement nutritionistAppointmentPostSampleCollectionInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Clear follow-up steps: progress review timeline (usually 4–6 weeks).']")
    private WebElement nutritionistAppointmentPostSampleCollectionInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='An extensive list of questions regarding your medical history, any symptoms or issues faced.']")
    private WebElement consentForGeneticAndGutTestsAndMSQWhatToExpectInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='Sit in a silent room and be ready to discuss your past history. ']")
    private WebElement consentForGeneticAndGutTestsAndMSQPrepareForYourAppointmentInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='Some tests like the genetic and gut ones need signed consent. The responses are important for creating a complete profile, and serve as a base for this journey.']")
    private WebElement consentForGeneticAndGutTestsAndMSQAppointmentTogetherInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='Post the call, you will receive the consent forms digitally for your signature.']")
    private WebElement consentForGeneticAndGutTestsAndMSQPostSampleCollectionInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='Close']")
    private WebElement closeClickableText;

    @FindBy(xpath = "//android.widget.TextView[@text='Onboarding call for']")
    private WebElement doctorOnboardingCallWhatToExpectTitle;

    @FindBy(xpath = "//android.widget.TextView[@text='Introductions']")
    private WebElement doctorOnboardingCallWhatToExpectInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Understanding of member goals and motivations']")
    private WebElement doctorOnboardingCallWhatToExpectInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Detailed medical history']")
    private WebElement doctorOnboardingCallWhatToExpectInfoThree;

    @FindBy(xpath = "//android.widget.TextView[@text='Path ahead']")
    private WebElement doctorOnboardingCallWhatToExpectInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='Any other relevant topics of discussion']")
    private WebElement doctorOnboardingCallWhatToExpectInfoFive;

    @FindBy(xpath = "//android.widget.TextView[@text='Prep is optional, but helpful. You can reflect on the below.']")
    private WebElement doctorOnboardingCallPrepareForYourAppointmentTitle;

    @FindBy(xpath = "//android.widget.TextView[@text='Few things you want to change about your health or lifestyle.']")
    private WebElement doctorOnboardingCallPrepareForYourAppointmentInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='Key events or patterns in your health history.']")
    private WebElement doctorOnboardingCallPrepareForYourAppointmentInfoTwo;

    @FindBy(xpath = "//android.widget.TextView[@text='Your goals, from yourself and FOXO.']")
    private WebElement doctorOnboardingCallPrepareForYourAppointmentInfoThree;

    @FindBy(xpath = "(//android.widget.TextView[@text='Make sure you’re in a quiet space for the video call.'])[1]")
    private WebElement doctorOnboardingCallPrepareForYourAppointmentInfoFour;

    @FindBy(xpath = "//android.widget.TextView[@text='This is a foundational step in your FOXO journey. You’ll have a 90-minute one-on-one session with your Longevity doctor to explore your personal health history, lifestyle, and goals. This is not about tests or diagnostics, intentionally. It’s about listening, understanding, and laying the groundwork for everything that follows.']")
    private WebElement doctorOnboardingCallAppointmentTogetherInfo;

    @FindBy(xpath = "(//android.widget.TextView[@text='Make sure you’re in a quiet space for the video call.'])[2]")
    private WebElement doctorOnboardingCallCautionInfoOne;

    @FindBy(xpath = "//android.widget.TextView[@text='You’ll receive a Google Meet link at least 24 hours in advance.']")
    private WebElement doctorOnboardingCallCautionInfoTwo;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
    private WebElement calendarIcon;

    @FindBy(xpath = "//android.widget.TextView[@text='Schedules']")
    private WebElement scheduleText;

    public boolean isTitleDisplayed() {
        String escapedTitle = XPathUtils.escapeForXpath(AppConstants.getTitle());

        try {
            String xpath = "//android.widget.TextView[@text=" + escapedTitle + "]";
            WebElement title = driver.findElement(By.xpath(xpath));
            return title.isDisplayed();
        } catch (NoSuchElementException e) {
            String xpath = "//android.widget.TextView[@text=" + escapedTitle + "]";
            WebElement title = driver.findElement(By.xpath(xpath));
            return title.isDisplayed();
        }
    }

    public boolean isStartEndTimeDisplayed() {
        String expected = DateUtils.formatRange(AppConstants.getStartTime(), AppConstants.getEndTime());

        String expectedHyphen = expected.replace("–", "-");

        String xpath =
                "//android.widget.TextView[@text='" + expected + "']" +
                        " | //android.widget.TextView[@text='" + expectedHyphen + "']";

        WebElement startEndTime = driver.findElement(By.xpath(xpath));

        return startEndTime.isDisplayed();
    }

    public void clickOnSchedule() {
        String time = DateUtils.formatRange(AppConstants.getStartTime(), AppConstants.getEndTime());

        WebElement schedule = driver.findElement(AppiumBy.accessibilityId(AppConstants.getTitle() + ", " + time));
        schedule.click();
    }

    public void tapAt(int x, int y) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);

        tap.addAction(finger.createPointerMove(Duration.ZERO,
                PointerInput.Origin.viewport(),
                x,
                y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Arrays.asList(tap));
    }

    public void clickOnBack() {
        try {
            closeClickableText.click();
        } catch (Exception e) {
            closeClickableText.click();
        }
    }

    public boolean isDateDayMonthDisplayed() {
        String expectedDate = DateUtils.getFormattedDate(AppConstants.getDay());
        try {
            WebElement day = driver.findElement(By.xpath("//android.widget.TextView[@text='" + expectedDate + "']"));
            return day.isDisplayed();
        } catch (Exception e) {
            try {
                WebElement day = driver.findElement(By.xpath("//android.widget.TextView[@text='" + expectedDate + "']"));
                return day.isDisplayed();
            } catch (NoSuchElementException E) {
                WebElement day = driver.findElement(By.xpath("//android.widget.TextView[@text='" + expectedDate + "']"));

                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
                wait.until(ExpectedConditions.visibilityOf(day));

                return day.isDisplayed();
            }
        }
    }

    public boolean isStartTimeDurationDisplayed() {
        String uiText = DateUtils.buildUiTimeText(AppConstants.getStartTime(), AppConstants.getEndTime());

        WebElement startTimeDuration = driver.findElement(By.xpath("//android.widget.TextView[@text='" + uiText + "']"));
        return startTimeDuration.isDisplayed();
    }

    public void clickOnStartTimeDuration() {
        String uiText = DateUtils.buildUiTimeText(AppConstants.getStartTime(), AppConstants.getEndTime());

        WebElement startTimeDuration = driver.findElement(By.xpath("//android.widget.TextView[@text='" + uiText + "']"));
        startTimeDuration.click();
    }

    public boolean isLocationNameDisplayed() {
        try {
            WebElement location = driver.findElement(By.xpath("//android.widget.TextView[@text=" + XPathUtils.escapeForXpath(AppConstants.getLocation()) + "]"));
            return location.isDisplayed();
        } catch (NoSuchElementException e) {
            WebElement location = driver.findElement(By.xpath("//android.widget.TextView[@text=" + XPathUtils.escapeForXpath(AppConstants.getLocation()) + "]"));
            return location.isDisplayed();
        }
    }

    public boolean isReminderIconDisplayed(String option) {
        WebElement bellIcon = driver.findElement(By.xpath("//*[@content-desc='" + option + "']/com.horcrux.svg.SvgView"));
        return bellIcon.isDisplayed();
    }

    public boolean isReminderOptionDisplayed(String option) {
        WebElement reminderOption = driver.findElement(By.xpath("//android.widget.TextView[@text='" + option + "']"));
        return reminderOption.isDisplayed();
    }

    public boolean isRescheduleIconDisplayedOne(String option) {
        WebElement rescheduleIcon1 = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='" + option + "']/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[1]"));
        return rescheduleIcon1.isDisplayed();
    }

    public boolean isRescheduleIconDisplayedTwo(String option) {
        WebElement rescheduleIcon2 = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='" + option + "']/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[2]"));
        return rescheduleIcon2.isDisplayed();
    }

    public boolean isRescheduleOptionDisplayed(String option) {
        WebElement rescheduleOption = driver.findElement(By.xpath("//android.widget.TextView[@text='" + option + "']"));
        return rescheduleOption.isDisplayed();
    }

    public boolean isSquadMemberTitleDisplayed() {
        return squadMemberTitle.isDisplayed();
    }

    public boolean isSquadMemberAssignedTextDisplayed() {
        return squadMemberAssignedText.isDisplayed();
    }

    public boolean isSquadDetailsInfoTextDisplayed() {
        String text = "You'll see the name and contact details 12 hours prior to your consultation.";
        WebElement squadDetailsInfoText = driver.findElement(By.xpath("//android.widget.TextView[@text=" + XPathUtils.escapeForXpath(text) + "]"));
        return squadDetailsInfoText.isDisplayed();
    }

    public boolean isSquadDetailsOneDisplayed() {
        return squadDetailsOne.isDisplayed();
    }

    public boolean isSquadDetailsTwoDisplayed() {
        return squadDetailsTwo.isDisplayed();
    }

    public boolean isSquadDetailsThreeDisplayed() {
        return squadDetailsThree.isDisplayed();
    }

    public boolean isSquadDetailsFourDisplayed() {
        return squadDetailsFour.isDisplayed();
    }

    public boolean isSquadDetailsFiveDisplayed() {
        return squadDetailsFive.isDisplayed();
    }

    public boolean isAgendaTextDisplayed() {
        return agendaText.isDisplayed();
    }

    public boolean isScheduleTestText() {
        try {
            return scheduleTestText.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Scheduled test");
            return scheduleTestText.isDisplayed();
        }
    }

    public boolean isWhatToExpectText() {
        try {
            return whatToExpectText.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("What to Expect");
            return whatToExpectText.isDisplayed();
        }
    }

    public boolean isPrepareTestText() {
        try {
            return prepareTestText.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("prepare for your test");
            return prepareTestText.isDisplayed();
        }
    }

    public boolean isWhyTakingTestText() {
        try {
            return whyTakingTestText.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Why we are taking");
            return whyTakingTestText.isDisplayed();
        }
    }

    public boolean isSampleCollectionText() {
        try {
            return sampleCollectionText.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Post Sample");
            return sampleCollectionText.isDisplayed();
        }
    }

    public boolean isIndexOneDisplayed() {
        return indexOne.isDisplayed();
    }

    public boolean isIndexTwoDisplayed() {
        return indexTwo.isDisplayed();
    }

    public boolean isIndexThreeDisplayed() {
        return indexThree.isDisplayed();
    }

    public boolean isIndexFourDisplayed() {
        return indexFour.isDisplayed();
    }

    public boolean isAgendaOneDisplayed() {
        return agendaOne.isDisplayed();
    }

    public boolean isAgendaTwoDisplayed() {
        return agendaTwo.isDisplayed();
    }

    public boolean isAgendaThreeDisplayed() {
        return agendaThree.isDisplayed();
    }

    public boolean isAgendaFourDisplayed() {
        String text = "Next Steps – You’ll be notified once your results are integrated into your FOXO Health Dashboard.";
        WebElement agendaFourText = driver.findElement(By.xpath("//android.widget.TextView[@text=" + XPathUtils.escapeForXpath(text) + "]"));
        return agendaFourText.isDisplayed();
    }

    public boolean isEventNameDisplayed() {
        try {
            WebElement eventName = driver.findElement(By.xpath("//android.widget.TextView[@text='" + AppConstants.getEventName() + "']"));
            return eventName.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText(AppConstants.getEventName());
            WebElement eventName = driver.findElement(By.xpath("//android.widget.TextView[@text='" + AppConstants.getEventName() + "']"));
            return eventName.isDisplayed();
        }
    }

    public boolean isWhatToExpectInfoPartOneDisplayed() {

        try {
            return whatToExpectInfoPartOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Your Radiology Test is designed");
            return whatToExpectInfoPartOne.isDisplayed();
        }
    }

    public boolean isWhatToExpectInfoPartTwoDisplayed() {
        String text = "You’ll be guided by our medical partner lab team throughout the process. The scans are quick, painless, and performed using advanced diagnostic equipment to ensure accuracy and comfort.";
        WebElement whatToExpectInfo = driver.findElement(By.xpath("//android.widget.TextView[contains(@text," + XPathUtils.escapeForXpath(text) + ")]"));
        try {
            return whatToExpectInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("medical partner lab team throughout the process");
            return whatToExpectInfo.isDisplayed();
        }
    }

    public boolean isPrepareTestOneDisplayed() {
        try {
            return prepareTestOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Fasting (if advised): Usually 3-4 hours of empty stomach");
            return prepareTestOne.isDisplayed();
        }
    }

    public boolean isPrepareTestTwoDisplayed() {
        try {
            return prepareTestTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Hydration");
            return prepareTestTwo.isDisplayed();
        }
    }

    public boolean isPrepareTestThreeDisplayed() {
        try {
            return prepareTestThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Clothing: Wear comfortable,");
            return prepareTestThree.isDisplayed();
        }
    }

    public boolean isPrepareTestFourDisplayed() {
        try {
            return prepareTestFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Arrive Early: Reach 15–20 minutes before");
            return prepareTestFour.isDisplayed();
        }
    }

    public boolean isTestTogetherTextDisplayed() {
        try {
            return testTogether.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Why we are taking these");
            return testTogether.isDisplayed();
        }
    }

    public boolean isHelpsUsTextDisplayed() {
        try {
            return helpsUs.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("helps us:");
            return helpsUs.isDisplayed();
        }
    }

    public boolean isTestTogetherInfoOne() {
        try {
            return testTogetherInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Validate the quality");
            return testTogetherInfoOne.isDisplayed();
        }
    }

    public boolean isTestTogetherInfoTwo() {
        try {
            return testTogetherInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Integrate radiology findings with your genetic,");
            return testTogetherInfoTwo.isDisplayed();
        }
    }

    public boolean isTestTogetherInfoThree() {
        try {
            return testTogetherInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Identify deeper correlations for more accurate");
            return testTogetherInfoThree.isDisplayed();
        }
    }

    public boolean isTestTogetherInfoFour() {
        try {
            return testTogetherInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("This step is essential for completing your");
            return testTogetherInfoFour.isDisplayed();
        }
    }

    public boolean isWhatToExpectBiWeeklyTextDisplayed() {
        return whatToExpectBiWeeklyText.isDisplayed();
    }

    public boolean isPrepareForYourAppointmentDisplayed() {
        try {
            return prepareForYourAppointment.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Here’s how to prepare");
            return prepareForYourAppointment.isDisplayed();
        }
    }

    public boolean isAppointmentInfoDisplayed() {
        try {
            return appointmentInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Keep list of all the challeges you have faced or difficulty");
            return appointmentInfo.isDisplayed();
        }
    }

    public boolean isAppointmentTogetherDisplayed() {
        try {
            return appointmentTogether.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Why we are takin");
            return appointmentTogether.isDisplayed();
        }
    }

    public boolean isAppointmentTogetherInfoDisplayed() {
        try {
            return appointmentTogetherInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("To understand your health concerns over the past");
            return appointmentTogetherInfo.isDisplayed();
        }
    }

    public boolean isWhatToExpectFoxoIntroDisplayed() {
        try {
            return whatToExpectFoxoIntro.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("A welcome box with");
            return whatToExpectFoxoIntro.isDisplayed();
        }
    }

    public boolean isPrepareYourTestInfoOneDisplayed() {
        try {
            return prepareYourTestInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Sit in a silent environment");
            return prepareYourTestInfoOne.isDisplayed();
        }
    }

    public boolean isPrepareYourTestInfoTwoDisplayed() {
        try {
            return prepareYourTestInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Prepare a list of question to ask him about FOXO");
            return prepareYourTestInfoTwo.isDisplayed();
        }
    }

    public boolean isTestTogetherOneDisplayed() {
        try {
            return testTogetherOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("This is a crucial step as knowing your concierge");
            return testTogetherOne.isDisplayed();
        }
    }

    public boolean isTestTogetherTwoDisplayed() {
        try {
            return testTogetherTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("And the test kits will be used for sample");
            return testTogetherTwo.isDisplayed();
        }
    }

    public boolean isPostSampleCollectionInfoDisplayed() {
        try {
            return postSampleCollectionInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Nothing to be done now. The urine and stool kits need to be used for sample collection");
            return postSampleCollectionInfo.isDisplayed();
        }
    }

    public boolean isBloodUrineStoolAgendaInfoDisplayed() {
        try {
            return bloodUrineStoolAgendaInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Phlebotomist will draw a blood sample.");
            return bloodUrineStoolAgendaInfo.isDisplayed();
        }
    }

    public boolean isBloodUrineStoolScheduleTestInfoDisplayed() {
        try {
            return bloodUrineStoolScheduleTestInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Comprehensive blood panel");
            return bloodUrineStoolScheduleTestInfo.isDisplayed();
        }
    }

    public boolean isBloodUrineStoolExpectInfoOneDisplayed() {
        try {
            return bloodUrineStoolExpectInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Our Care Specialist will visit to collect");
            return bloodUrineStoolExpectInfoOne.isDisplayed();
        }
    }

    public boolean isBloodUrineStoolExpectInfoTwoDisplayed() {
        try {
            return bloodUrineStoolExpectInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("In this visit, some anthropomorphic measurements");
            return bloodUrineStoolExpectInfoTwo.isDisplayed();
        }
    }

    public boolean isBloodUrineStoolPrepareTestInfoDisplayed() {
        try {
            return bloodUrineStoolPrepareTestInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Exact protocols will be shared");
            return bloodUrineStoolPrepareTestInfo.isDisplayed();
        }
    }

    public boolean isBloodUrineStoolTestTogetherInfoDisplayed() {
        try {
            return bloodUrineStoolTestTogetherInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("These set of tests together provide most of the biomarker");
            return bloodUrineStoolTestTogetherInfo.isDisplayed();
        }
    }

    public boolean isBloodUrineStoolSampleCollectionInfoDisplayed() {
        try {
            return bloodUrineStoolSampleCollectionInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Results of the different tests will be available");
            return bloodUrineStoolSampleCollectionInfo.isDisplayed();
        }
    }

    public boolean isBloodUrineStoolSampleCollectionInfoOne() {
        try {
            return bloodUrineStoolSampleCollectionInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Comprehensive blood test");
            return bloodUrineStoolSampleCollectionInfoOne.isDisplayed();
        }
    }

    public boolean isBloodUrineStoolSampleCollectionInfoTwo() {
        try {
            return bloodUrineStoolSampleCollectionInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Metabolomics test");
            return bloodUrineStoolSampleCollectionInfoTwo.isDisplayed();
        }
    }

    public boolean isBloodUrineStoolSampleCollectionInfoThree() {
        try {
            return bloodUrineStoolSampleCollectionInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Gut test");
            return bloodUrineStoolSampleCollectionInfoThree.isDisplayed();
        }
    }

    public boolean isBloodUrineStoolSampleCollectionInfoFour() {
        try {
            return bloodUrineStoolSampleCollectionInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Genetic test");
            return bloodUrineStoolSampleCollectionInfoFour.isDisplayed();
        }
    }

    public boolean isHealthCoachingExpectInfoOne() {
        try {
            return healthCoachingExpectInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("A one-on-one conversation");
            return healthCoachingExpectInfoOne.isDisplayed();
        }
    }

    public boolean isHealthCoachingExpectInfoTwo() {
        try {
            return healthCoachingExpectInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Guidance on your lifestyle");
            return healthCoachingExpectInfoTwo.isDisplayed();
        }
    }

    public boolean isHealthCoachingExpectInfoThree() {
        try {
            return healthCoachingExpectInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Support in setting achievable");
            return healthCoachingExpectInfoThree.isDisplayed();
        }
    }

    public boolean isHealthCoachingExpectInfoFour() {
        try {
            return healthCoachingExpectInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Regular check-ins");
            return healthCoachingExpectInfoFour.isDisplayed();
        }
    }

    public boolean isHealthCoachingPrepareForYourAppointmentInfoOne() {
        try {
            return healthCoachingPrepareForYourAppointmentInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Note down any questions");
            return healthCoachingPrepareForYourAppointmentInfoOne.isDisplayed();
        }
    }

    public boolean isHealthCoachingPrepareForYourAppointmentInfoTwo() {
        try {
            return healthCoachingPrepareForYourAppointmentInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Note down any questions");
            return healthCoachingPrepareForYourAppointmentInfoTwo.isDisplayed();
        }
    }

    public boolean isHealthCoachingPrepareForYourAppointmentInfoThree() {
        try {
            return healthCoachingPrepareForYourAppointmentInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Note down any questions");
            return healthCoachingPrepareForYourAppointmentInfoThree.isDisplayed();
        }
    }

    public boolean isHealthCoachingAppointmentTogetherInfoOne() {
        try {
            return healthCoachingAppointmentTogetherInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Helps you understand your health better");
            return healthCoachingAppointmentTogetherInfoOne.isDisplayed();
        }
    }

    public boolean isHealthCoachingAppointmentTogetherInfoTwo() {
        try {
            return healthCoachingAppointmentTogetherInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Keeps you accountable");
            return healthCoachingAppointmentTogetherInfoTwo.isDisplayed();
        }
    }

    public boolean isHealthCoachingAppointmentTogetherInfoThree() {
        try {
            return healthCoachingAppointmentTogetherInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Provides personalized guidance");
            return healthCoachingAppointmentTogetherInfoThree.isDisplayed();
        }
    }

    public boolean isHealthCoachingAppointmentTogetherInfoFour() {
        try {
            return healthCoachingAppointmentTogetherInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Bridges the gap between your current lifestyle");
            return healthCoachingAppointmentTogetherInfoFour.isDisplayed();
        }
    }

    public boolean isNutritionistConsultationWhatToExpectInfoOneDisplayed() {
        try {
            return NutritionistConsultationWhatToExpectInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("A friendly one-on-one conversation");
            return NutritionistConsultationWhatToExpectInfoOne.isDisplayed();
        }
    }

    public boolean isNutritionistConsultationWhatToExpectInfoTwoDisplayed() {
        try {
            return NutritionistConsultationWhatToExpectInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Discussion around your eating habits");
            return NutritionistConsultationWhatToExpectInfoTwo.isDisplayed();
        }
    }

    public boolean isNutritionistConsultationWhatToExpectInfoThreeDisplayed() {
        try {
            return NutritionistConsultationWhatToExpectInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Personalized suggestions on diet");
            return NutritionistConsultationWhatToExpectInfoThree.isDisplayed();
        }
    }

    public boolean isNutritionistConsultationPrepareForYourAppointmentInfoOneDisplayed() {
        try {
            return nutritionistConsultationPrepareForYourAppointmentInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Keep a rough idea of your daily meals");
            return nutritionistConsultationPrepareForYourAppointmentInfoOne.isDisplayed();
        }
    }

    public boolean isNutritionistConsultationPrepareForYourAppointmentInfoTwoDisplayed() {
        try {
            return nutritionistConsultationPrepareForYourAppointmentInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Note down any issues you face");
            return nutritionistConsultationPrepareForYourAppointmentInfoTwo.isDisplayed();
        }
    }

    public boolean isNutritionistConsultationPrepareForYourAppointmentInfoThreeDisplayed() {
        try {
            return nutritionistConsultationPrepareForYourAppointmentInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Have recent health reports");
            return nutritionistConsultationPrepareForYourAppointmentInfoThree.isDisplayed();
        }
    }

    public boolean isNutritionistConsultationPrepareForYourAppointmentInfoFourDisplayed() {
        try {
            return nutritionistConsultationPrepareForYourAppointmentInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Be open about your food preferences");
            return nutritionistConsultationPrepareForYourAppointmentInfoFour.isDisplayed();
        }
    }

    public boolean isNutritionistConsultationAppointmentTogetherInfoOneDisplayed() {
        try {
            return nutritionistConsultationAppointmentTogetherInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Nutrition plays a key role");
            return nutritionistConsultationAppointmentTogetherInfoOne.isDisplayed();
        }
    }

    public boolean isNutritionistConsultationAppointmentTogetherInfoTwoDisplayed() {
        try {
            return nutritionistConsultationAppointmentTogetherInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Helps you understand the connection");
            return nutritionistConsultationAppointmentTogetherInfoTwo.isDisplayed();
        }
    }

    public boolean isNutritionistConsultationAppointmentTogetherInfoThreeDisplayed() {
        try {
            return nutritionistConsultationAppointmentTogetherInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("customized advice to make small");
            return nutritionistConsultationAppointmentTogetherInfoThree.isDisplayed();
        }
    }

    public boolean isNutritionistConsultationAppointmentTogetherInfoFourDisplayed() {
        try {
            return nutritionistConsultationAppointmentTogetherInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Builds the foundation for a healthier");
            return nutritionistConsultationAppointmentTogetherInfoFour.isDisplayed();
        }
    }

    public boolean isNutritionFollowupWhatToExpectInfoOneDisplayed() {
        try {
            return nutritionFollowupWhatToExpectInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("A quick check-in");
            return nutritionFollowupWhatToExpectInfoOne.isDisplayed();
        }
    }

    public boolean isNutritionFollowupWhatToExpectInfoTwoDisplayed() {
        try {
            return nutritionFollowupWhatToExpectInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Review of your eating habits");
            return nutritionFollowupWhatToExpectInfoTwo.isDisplayed();
        }
    }

    public boolean isNutritionFollowupWhatToExpectInfoThreeDisplayed() {
        try {
            return nutritionFollowupWhatToExpectInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Discussion of any challenges");
            return nutritionFollowupWhatToExpectInfoThree.isDisplayed();
        }
    }

    public boolean isNutritionFollowupWhatToExpectInfoFourDisplayed() {
        try {
            return nutritionFollowupWhatToExpectInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Personalised tips");
            return nutritionFollowupWhatToExpectInfoFour.isDisplayed();
        }
    }

    public boolean isNutritionFollowupWhatToExpectInfoFiveDisplayed() {
        try {
            return nutritionFollowupWhatToExpectInfoFive.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Guidance on next");
            return nutritionFollowupWhatToExpectInfoFive.isDisplayed();
        }
    }

    public boolean isNutritionFollowupPrepareForYourAppointmentInfoOneDisplayed() {
        try {
            return nutritionFollowupPrepareForYourAppointmentInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Log your meals");
            return nutritionFollowupPrepareForYourAppointmentInfoOne.isDisplayed();
        }
    }

    public boolean isNutritionFollowupPrepareForYourAppointmentInfoTwoDisplayed() {
        try {
            return nutritionFollowupPrepareForYourAppointmentInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Be ready to share any difficulties");
            return nutritionFollowupPrepareForYourAppointmentInfoTwo.isDisplayed();
        }
    }

    public boolean isNutritionFollowupPrepareForYourAppointmentInfoThreeDisplayed() {
        try {
            return nutritionFollowupPrepareForYourAppointmentInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Track and mention changes");
            return nutritionFollowupPrepareForYourAppointmentInfoThree.isDisplayed();
        }
    }

    public boolean isNutritionFollowupPrepareForYourAppointmentInfoFourDisplayed() {
        try {
            return nutritionFollowupPrepareForYourAppointmentInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("List any questions");
            return nutritionFollowupPrepareForYourAppointmentInfoFour.isDisplayed();
        }
    }

    public boolean isNutritionFollowupPrepareForYourAppointmentInfoFiveDisplayed() {
        try {
            return nutritionFollowupPrepareForYourAppointmentInfoFive.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Keep a water/meal routine");
            return nutritionFollowupPrepareForYourAppointmentInfoFive.isDisplayed();
        }
    }

    public boolean isNutritionFollowupAppointmentTogetherInfo() {
        try {
            return nutritionFollowupAppointmentTogetherInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("stay consistent and accountable");
            return nutritionFollowupAppointmentTogetherInfo.isDisplayed();
        }
    }

    public boolean isDoctorConsultationAgendaInfoOneDisplayed() {
        try {
            return doctorConsultationAgendaInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Introduction – Quick greeting");
            return doctorConsultationAgendaInfoOne.isDisplayed();
        }
    }

    public boolean isDoctorConsultationAgendaInfoTwoDisplayed() {
        try {
            return doctorConsultationAgendaInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Your Progress – Doctor");
            return doctorConsultationAgendaInfoTwo.isDisplayed();
        }
    }

    public boolean isDoctorConsultationAgendaInfoThreeDisplayed() {
        try {
            return doctorConsultationAgendaInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Symptoms – Share");
            return doctorConsultationAgendaInfoThree.isDisplayed();
        }
    }

    public boolean isDoctorConsultationAgendaInfoFourDisplayed() {
        try {
            return doctorConsultationAgendaInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Follow-up Questions");
            return doctorConsultationAgendaInfoFour.isDisplayed();
        }
    }

    public boolean isDoctorConsultationAgendaInfoFiveDisplayed() {
        try {
            return doctorConsultationAgendaInfoFive.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Next Steps – Recommendations");
            return doctorConsultationAgendaInfoFive.isDisplayed();
        }
    }

    public boolean isDoctorConsultationAgendaInfoSixDisplayed() {
        try {
            return doctorConsultationAgendaInfoSix.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Q&A – Your chance");
            return doctorConsultationAgendaInfoSix.isDisplayed();
        }
    }

    public boolean isScheduledAppointmentTextDisplayed() {
        try {
            return scheduledAppointmentText.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Scheduled appointment");
            return scheduledAppointmentText.isDisplayed();
        }
    }

    public boolean isDoctorConsultationWhatToExpectInfoDisplayed() {
        try {
            return doctorConsultationWhatToExpectInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Doctor will ask few basic questions");
            return doctorConsultationWhatToExpectInfo.isDisplayed();
        }
    }

    public boolean isDoctorConsultationAppointmentTogetherInfo() {
        try {
            return doctorConsultationAppointmentTogetherInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("To understand");
            return doctorConsultationAppointmentTogetherInfo.isDisplayed();
        }
    }

    public boolean isHormonalHealthConsultationAgendaInfoOneDisplayed() {
        try {
            return hormonalHealthConsultationAgendaInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Discussion of symptoms");
            return hormonalHealthConsultationAgendaInfoOne.isDisplayed();
        }
    }

    public boolean isHormonalHealthConsultationAgendaInfoTwoDisplayed() {
        try {
            return hormonalHealthConsultationAgendaInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Explanation of testosterone’s role");
            return hormonalHealthConsultationAgendaInfoTwo.isDisplayed();
        }
    }

    public boolean isHormonalHealthConsultationAgendaInfoThreeDisplayed() {
        try {
            return hormonalHealthConsultationAgendaInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Blood test procedure");
            return hormonalHealthConsultationAgendaInfoThree.isDisplayed();
        }
    }

    public boolean isHormonalHealthConsultationAgendaInfoFourDisplayed() {
        try {
            return hormonalHealthConsultationAgendaInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Q&A with doctor");
            return hormonalHealthConsultationAgendaInfoFour.isDisplayed();
        }
    }

    public boolean isHormonalHealthConsultationAgendaInfoFiveDisplayed() {
        try {
            return hormonalHealthConsultationAgendaInfoFive.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Plan for follow-up");
            return hormonalHealthConsultationAgendaInfoFive.isDisplayed();
        }
    }

    public boolean isIndexFiveDisplayed() {
        try {
            return indexFive.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("5.");
            return indexFive.isDisplayed();
        }
    }

    public boolean isHormonalHealthConsultationScheduleAppointmentInfoOneDisplayed() {
        try {
            return hormonalHealthConsultationScheduleAppointmentInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Blood test to measure");
            return hormonalHealthConsultationScheduleAppointmentInfoOne.isDisplayed();
        }
    }

    public boolean isHormonalHealthConsultationScheduleAppointmentInfoOTwoDisplayed() {
        try {
            return hormonalHealthConsultationScheduleAppointmentInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Possible additional markers:");
            return hormonalHealthConsultationScheduleAppointmentInfoTwo.isDisplayed();
        }
    }

    public boolean isHormonalHealthConsultationWhatToExpectInfoOneDisplayed() {
        try {
            return hormonalHealthConsultationWhatToExpectInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("A short consultation with the doctor");
            return hormonalHealthConsultationWhatToExpectInfoOne.isDisplayed();
        }
    }

    public boolean isHormonalHealthConsultationWhatToExpectInfoTwoDisplayed() {
        try {
            return hormonalHealthConsultationWhatToExpectInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Blood sample collection");
            return hormonalHealthConsultationWhatToExpectInfoTwo.isDisplayed();
        }
    }

    public boolean isHormonalHealthConsultationWhatToExpectInfoThreeDisplayed() {
        try {
            return hormonalHealthConsultationWhatToExpectInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Review of results with a focus");
            return hormonalHealthConsultationWhatToExpectInfoThree.isDisplayed();
        }
    }

    public boolean isHormonalHealthConsultationPrepareForYourAppointmentInfoOneDisplayed() {
        try {
            return hormonalHealthConsultationPrepareForYourAppointmentInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Fasting: Some clinics recommend fasting");
            return hormonalHealthConsultationPrepareForYourAppointmentInfoOne.isDisplayed();
        }
    }

    public boolean isHormonalHealthConsultationPrepareForYourAppointmentInfoTwoDisplayed() {
        try {
            return hormonalHealthConsultationPrepareForYourAppointmentInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Timing: Schedule the blood draw");
            return hormonalHealthConsultationPrepareForYourAppointmentInfoTwo.isDisplayed();
        }
    }

    public boolean isHormonalHealthConsultationPrepareForYourAppointmentInfoThreeDisplayed() {
        try {
            return hormonalHealthConsultationPrepareForYourAppointmentInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Medication disclosure:");
            return hormonalHealthConsultationPrepareForYourAppointmentInfoThree.isDisplayed();
        }
    }

    public boolean isHormonalHealthConsultationPrepareForYourAppointmentInfoFourDisplayed() {
        try {
            return hormonalHealthConsultationPrepareForYourAppointmentInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Lifestyle: Avoid heavy exercise");
            return hormonalHealthConsultationPrepareForYourAppointmentInfoFour.isDisplayed();
        }
    }

    public boolean isHormonalHealthConsultationAppointmentTogetherInfoOneDisplayed() {
        try {
            return hormonalHealthConsultationAppointmentTogetherInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("To check for low or high testosterone levels");
            return hormonalHealthConsultationAppointmentTogetherInfoOne.isDisplayed();
        }
    }

    public boolean isHormonalHealthConsultationAppointmentTogetherInfoTwoDisplayed() {
        try {
            return hormonalHealthConsultationAppointmentTogetherInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("To evaluate fertility");
            return hormonalHealthConsultationAppointmentTogetherInfoTwo.isDisplayed();
        }
    }

    public boolean isHormonalHealthConsultationAppointmentTogetherInfoThreeDisplayed() {
        try {
            return hormonalHealthConsultationAppointmentTogetherInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("To guide treatment plans");
            return hormonalHealthConsultationAppointmentTogetherInfoThree.isDisplayed();
        }
    }

    public boolean isHormonalHealthConsultationSampleCollectionInfoOneDisplayed() {
        try {
            return hormonalHealthConsultationSampleCollectionInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Receive a personalized report ");
            return hormonalHealthConsultationSampleCollectionInfoOne.isDisplayed();
        }
    }

    public boolean isHormonalHealthConsultationSampleCollectionInfoTwoDisplayed() {
        try {
            return hormonalHealthConsultationSampleCollectionInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("interpretation of results");
            return hormonalHealthConsultationSampleCollectionInfoTwo.isDisplayed();
        }
    }

    public boolean isHormonalHealthConsultationSampleCollectionInfoThreeDisplayed() {
        try {
            return hormonalHealthConsultationSampleCollectionInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Clear next steps:");
            return hormonalHealthConsultationSampleCollectionInfoThree.isDisplayed();
        }
    }

    public boolean isHormonalHealthConsultationCautionSymbolDisplayed() {
        return hormonalHealthConsultationCautionSymbol.isDisplayed();
    }

    public boolean isHormonalHealthConsultationCautionInfoOneDisplayed() {
        try {
            return hormonalHealthConsultationCautionInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Testosterone levels naturally decline with age");
            return hormonalHealthConsultationCautionInfoOne.isDisplayed();
        }
    }

    public boolean isHormonalHealthConsultationCautionInfoTwoDisplayed() {
        try {
            return hormonalHealthConsultationCautionInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Imbalances may not always need medication");
            return hormonalHealthConsultationCautionInfoTwo.isDisplayed();
        }
    }

    public boolean isHormonalHealthConsultationCautionInfoThreeDisplayed() {
        try {
            return hormonalHealthConsultationCautionInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("For accurate tracking");
            return hormonalHealthConsultationCautionInfoThree.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestAgendaInfoTitleDisplayed() {
        try {
            return cardiacAndImagingTestAgendaInfoTitle.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Assessments");
            return cardiacAndImagingTestAgendaInfoTitle.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestAgendaInfoOneDisplayed() {
        try {
            return cardiacAndImagingTestAgendaInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Calcium Score");
            return cardiacAndImagingTestAgendaInfoOne.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestAgendaInfoTwoDisplayed() {
        try {
            return cardiacAndImagingTestAgendaInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("DEXA scan");
            return cardiacAndImagingTestAgendaInfoTwo.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestAgendaInfoThreeDisplayed() {
        try {
            return cardiacAndImagingTestAgendaInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Abdomen Ultrasound");
            return cardiacAndImagingTestAgendaInfoThree.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestAgendaInfoFourDisplayed() {
        try {
            return cardiacAndImagingTestAgendaInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("2D Echo");
            return cardiacAndImagingTestAgendaInfoFour.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestAgendaInfoFiveDisplayed() {
        try {
            return cardiacAndImagingTestAgendaInfoFive.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("TMT");
            return cardiacAndImagingTestAgendaInfoFive.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestScheduleTestInfoTitleOneDisplayed() {
        try {
            return cardiacAndImagingTestScheduleTestInfoTitleOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Echocardiogram");
            return cardiacAndImagingTestScheduleTestInfoTitleOne.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestScheduleTestInfoTitleTwoDisplayed() {
        try {
            return cardiacAndImagingTestScheduleTestInfoTitleTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Electrocardiogram");
            return cardiacAndImagingTestScheduleTestInfoTitleTwo.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestScheduleTestInfoTitleThreeDisplayed() {
        try {
            return cardiacAndImagingTestScheduleTestInfoTitleThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Coronary Artery");
            return cardiacAndImagingTestScheduleTestInfoTitleThree.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestScheduleTestInfoTitleFourDisplayed() {
        try {
            return cardiacAndImagingTestScheduleTestInfoTitleFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Abdominal Ultrasound");
            return cardiacAndImagingTestScheduleTestInfoTitleFour.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestScheduleTestInfoTitleFiveDisplayed() {
        try {
            return cardiacAndImagingTestScheduleTestInfoTitleFive.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("DEXA Scan");
            return cardiacAndImagingTestScheduleTestInfoTitleFive.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestScheduleTestInfoOneDisplayed() {
        try {
            return cardiacAndImagingTestScheduleTestInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Visualizes your heart");
            return cardiacAndImagingTestScheduleTestInfoOne.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestScheduleTestInfoTwoDisplayed() {
        try {
            return cardiacAndImagingTestScheduleTestInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Detects arrhythmias");
            return cardiacAndImagingTestScheduleTestInfoTwo.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestScheduleTestInfoThreeDisplayed() {
        try {
            return cardiacAndImagingTestScheduleTestInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("CT-based scan for arterial plaque");
            return cardiacAndImagingTestScheduleTestInfoThree.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestScheduleTestInfoFourDisplayed() {
        try {
            return cardiacAndImagingTestScheduleTestInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Looks at liver");
            return cardiacAndImagingTestScheduleTestInfoFour.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestScheduleTestInfoFiveDisplayed() {
        try {
            return cardiacAndImagingTestScheduleTestInfoFive.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Evaluates bone density");
            return cardiacAndImagingTestScheduleTestInfoFive.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestWhatToExpectInfoDisplayed() {
        try {
            return cardiacAndImagingTestWhatToExpectInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Cardiac and Imaging tests");
            return cardiacAndImagingTestWhatToExpectInfo.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestPrepareForYourTestInfoOneDisplayed() {
        try {
            return cardiacAndImagingTestPrepareForYourTestInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Fast 10 hours");
            return cardiacAndImagingTestPrepareForYourTestInfoOne.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestPrepareForYourTestInfoTwoDisplayed() {
        try {
            return cardiacAndImagingTestPrepareForYourTestInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Skip alcohol");
            return cardiacAndImagingTestPrepareForYourTestInfoTwo.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestPrepareForYourTestInfoThreeDisplayed() {
        try {
            return cardiacAndImagingTestPrepareForYourTestInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Avoid caffeine");
            return cardiacAndImagingTestPrepareForYourTestInfoThree.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestPrepareForYourTestInfoFourDisplayed() {
        try {
            return cardiacAndImagingTestPrepareForYourTestInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Wear comfortable clothing");
            return cardiacAndImagingTestPrepareForYourTestInfoFour.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestPrepareForYourTestInfoFiveDisplayed() {
        try {
            return cardiacAndImagingTestPrepareForYourTestInfoFive.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Stay hydrated");
            return cardiacAndImagingTestPrepareForYourTestInfoFive.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestTogetherInfoOneDisplayed() {
        try {
            return cardiacAndImagingTestTogetherInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("These tests provide a structural");
            return cardiacAndImagingTestTogetherInfoOne.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestTogetherInfoTwoDisplayed() {
        try {
            return cardiacAndImagingTestTogetherInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("This is about early detection");
            return cardiacAndImagingTestTogetherInfoTwo.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestPostSampleCollectionInfoDisplayed() {
        try {
            return cardiacAndImagingTestPostSampleCollectionInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("You can take home the physical copies");
            return cardiacAndImagingTestPostSampleCollectionInfo.isDisplayed();
        }
    }

    public boolean isCardiacAndImagingTestCautionInfoDisplayed() {
        try {
            return cardiacAndImagingTestCautionInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Your concierge will be ready");
            return cardiacAndImagingTestCautionInfo.isDisplayed();
        }
    }

    public boolean isKitchenAuditWhatToExpectInfoDisplayed() {
        try {
            return kitchenAuditWhatToExpectInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("A review and understanding for best practices");
            return kitchenAuditWhatToExpectInfo.isDisplayed();
        }
    }

    public boolean isKitchenAuditPrepareForYourTestInfoDisplayed() {
        try {
            return kitchenAuditPrepareForYourTestInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Keep your kitchen clean");
            return kitchenAuditPrepareForYourTestInfo.isDisplayed();
        }
    }

    public boolean isKitchenAuditTestTogetherInfoDisplayed() {
        try {
            return kitchenAuditTestTogetherInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("A conducive kitchen environment");
            return kitchenAuditTestTogetherInfo.isDisplayed();
        }
    }

    public boolean isKitchenAuditPostSampleCollectionInfoDisplayed() {
        try {
            return kitchenAuditPostSampleCollectionInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Protocol and changes");
            return kitchenAuditPostSampleCollectionInfo.isDisplayed();
        }
    }

    public boolean isPhysioAssessmentWhatToExpectInfoDisplayed() {
        try {
            return physioAssessmentWhatToExpectInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Light exercises");
            return physioAssessmentWhatToExpectInfo.isDisplayed();
        }
    }

    public boolean isPhysioAssessmentPrepareFourYourTestTitleDisplayed() {
        try {
            return physioAssessmentPrepareFourYourTestTitle.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Points to note");
            return physioAssessmentPrepareFourYourTestTitle.isDisplayed();
        }
    }

    public boolean isPhysioAssessmentPrepareFourYourTestInfoOneDisplayed() {
        try {
            return physioAssessmentPrepareFourYourTestInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Dress in");
            return physioAssessmentPrepareFourYourTestInfoOne.isDisplayed();
        }
    }

    public boolean isPhysioAssessmentPrepareFourYourTestInfoTwoDisplayed() {
        try {
            return physioAssessmentPrepareFourYourTestInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("You can do the exercises barefoot");
            return physioAssessmentPrepareFourYourTestInfoTwo.isDisplayed();
        }
    }

    public boolean isPhysioAssessmentPrepareFourYourTestInfoThreeDisplayed() {
        try {
            return physioAssessmentPrepareFourYourTestInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Carry a napkin");
            return physioAssessmentPrepareFourYourTestInfoThree.isDisplayed();
        }
    }

    public boolean isPhysioAssessmentPrepareFourYourTestInfoFourDisplayed() {
        try {
            return physioAssessmentPrepareFourYourTestInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("A shower facility");
            return physioAssessmentPrepareFourYourTestInfoFour.isDisplayed();
        }
    }

    public boolean isPhysioAssessmentPrepareFourYourTestInfoFiveDisplayed() {
        try {
            return physioAssessmentPrepareFourYourTestInfoFive.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("You can consume a light snack prior");
            return physioAssessmentPrepareFourYourTestInfoFive.isDisplayed();
        }
    }

    public boolean isPhysioAssessmentTestTogetherInfo() {
        try {
            return physioAssessmentTestTogetherInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Understanding of your endurance");
            return physioAssessmentTestTogetherInfo.isDisplayed();
        }
    }

    public boolean isDoctorAppointmentWhatToExpectInfoOneDisplayed() {
        try {
            return doctorAppointmentWhatToExpectInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("A focused conversation about your health concerns");
            return doctorAppointmentWhatToExpectInfoOne.isDisplayed();
        }
    }

    public boolean isDoctorAppointmentWhatToExpectInfoTwoDisplayed() {
        try {
            return doctorAppointmentWhatToExpectInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Doctor will connect the dots between lifestyle");
            return doctorAppointmentWhatToExpectInfoTwo.isDisplayed();
        }
    }

    public boolean isDoctorAppointmentWhatToExpectInfoThreeDisplayed() {
        try {
            return doctorAppointmentWhatToExpectInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Opportunity to ask questions and clarify doubts about treatments");
            return doctorAppointmentWhatToExpectInfoThree.isDisplayed();
        }
    }

    public boolean isDoctorAppointmentWhatToExpectInfoFourDisplayed() {
        try {
            return doctorAppointmentWhatToExpectInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Development of a personalized health plan");
            return doctorAppointmentWhatToExpectInfoFour.isDisplayed();
        }
    }

    public boolean isDoctorAppointmentPrepareForYourAppointmentInfoOneDisplayed() {
        try {
            return doctorAppointmentPrepareForYourAppointmentInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Carry your latest test reports");
            return doctorAppointmentPrepareForYourAppointmentInfoOne.isDisplayed();
        }
    }

    public boolean isDoctorAppointmentPrepareForYourAppointmentInfoTwoDisplayed() {
        try {
            return doctorAppointmentPrepareForYourAppointmentInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Prepare a list of symptoms");
            return doctorAppointmentPrepareForYourAppointmentInfoTwo.isDisplayed();
        }
    }

    public boolean isDoctorAppointmentPrepareForYourAppointmentInfoThreeDisplayed() {
        try {
            return doctorAppointmentPrepareForYourAppointmentInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Note down any ongoing medications");
            return doctorAppointmentPrepareForYourAppointmentInfoThree.isDisplayed();
        }
    }

    public boolean isDoctorAppointmentPrepareForYourAppointmentInfoFourDisplayed() {
        try {
            return doctorAppointmentPrepareForYourAppointmentInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Bring previous specialist");
            return doctorAppointmentPrepareForYourAppointmentInfoFour.isDisplayed();
        }
    }

    public boolean isDoctorAppointmentPrepareForYourAppointmentInfoFiveDisplayed() {
        try {
            return doctorAppointmentPrepareForYourAppointmentInfoFive.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Be ready to share details about diet");
            return doctorAppointmentPrepareForYourAppointmentInfoFive.isDisplayed();
        }
    }

    public boolean isDoctorAppointmentPostSampleCollectionInfoOneDisplayed() {
        try {
            return doctorAppointmentPostSampleCollectionInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("summary note with key observations");
            return doctorAppointmentPostSampleCollectionInfoOne.isDisplayed();
        }
    }

    public boolean isDoctorAppointmentPostSampleCollectionInfoTwoDisplayed() {
        try {
            return doctorAppointmentPostSampleCollectionInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Updated prescriptions");
            return doctorAppointmentPostSampleCollectionInfoTwo.isDisplayed();
        }
    }

    public boolean isDoctorAppointmentPostSampleCollectionInfoThreeDisplayed() {
        try {
            return doctorAppointmentPostSampleCollectionInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Referrals for specialist visits");
            return doctorAppointmentPostSampleCollectionInfoThree.isDisplayed();
        }
    }

    public boolean isDoctorAppointmentPostSampleCollectionInfoFourDisplayed() {
        try {
            return doctorAppointmentPostSampleCollectionInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Preventive recommendations");
            return doctorAppointmentPostSampleCollectionInfoFour.isDisplayed();
        }
    }

    public boolean isDoctorAppointmentCautionInfoOneDisplayed() {
        try {
            return doctorAppointmentCautionInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Being transparent about habits");
            return doctorAppointmentCautionInfoOne.isDisplayed();
        }
    }

    public boolean isDoctorAppointmentCautionInfoTwoDisplayed() {
        try {
            return doctorAppointmentCautionInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Regular follow-ups help track progress");
            return doctorAppointmentCautionInfoTwo.isDisplayed();
        }
    }

    public boolean isDoctorAppointmentCautionInfoThreeDisplayed() {
        try {
            return doctorAppointmentCautionInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Doctors often work in sync with nutritionists");
            return doctorAppointmentCautionInfoThree.isDisplayed();
        }
    }

    public boolean isCGMPatchApplicationTestTogetherInfoOneDisplayed() {
        try {
            return CGMPatchApplicationTestTogetherInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Continuous Glucose Monitor (CGM) is a small");
            return CGMPatchApplicationTestTogetherInfoOne.isDisplayed();
        }
    }

    public boolean isCGMPatchApplicationTestTogetherInfoTwoDisplayed() {
        try {
            return CGMPatchApplicationTestTogetherInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("The goal isn’t just to catch sugar spikes");
            return CGMPatchApplicationTestTogetherInfoTwo.isDisplayed();
        }
    }

    public boolean isCGMPatchApplicationTestTogetherInfoThreeDisplayed() {
        try {
            return CGMPatchApplicationTestTogetherInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Glucose is a proxy");
            return CGMPatchApplicationTestTogetherInfoThree.isDisplayed();
        }
    }

    public boolean isCGMPatchApplicationPostSampleCollectionInfoDisplayed() {
        try {
            return CGMPatchApplicationPostSampleCollectionInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("During the period when CGM patch is applied");
            return CGMPatchApplicationPostSampleCollectionInfo.isDisplayed();
        }
    }

    public boolean isCGMPatchApplicationCautionInfoDisplayed() {
        try {
            return CGMPatchApplicationCautionInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("CGM data alone may not always offer dramatic insights right away");
            return CGMPatchApplicationCautionInfo.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentAgendaInfoOneDisplayed() {
        try {
            return nutritionistAppointmentAgendaInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("This session is about understanding how you ea");
            return nutritionistAppointmentAgendaInfoOne.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentAgendaInfoTwoDisplayed() {
        try {
            return nutritionistAppointmentAgendaInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Your Eating Patterns");
            return nutritionistAppointmentAgendaInfoTwo.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentAgendaInfoThreeDisplayed() {
        try {
            return nutritionistAppointmentAgendaInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Food Relationships");
            return nutritionistAppointmentAgendaInfoThree.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentAgendaInfoFourDisplayed() {
        try {
            return nutritionistAppointmentAgendaInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Supplement & Hydration");
            return nutritionistAppointmentAgendaInfoFour.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentAgendaInfoFiveDisplayed() {
        try {
            return nutritionistAppointmentAgendaInfoFive.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Lifestyle Drivers");
            return nutritionistAppointmentAgendaInfoFive.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentAgendaInfoSixDisplayed() {
        try {
            return nutritionistAppointmentAgendaInfoSix.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Symptoms & Body Feedback");
            return nutritionistAppointmentAgendaInfoSix.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentAgendaTitleOneDisplayed() {
        try {
            return nutritionistAppointmentAgendaTitleOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("We’ll discuss");
            return nutritionistAppointmentAgendaTitleOne.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentAgendaTitleTwoDisplayed() {
        try {
            return nutritionistAppointmentAgendaTitleTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("No recommendations");
            return nutritionistAppointmentAgendaTitleTwo.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentScheduledAppointmentInfoOneDisplayed() {
        try {
            return nutritionistAppointmentScheduledAppointmentInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Review of previous lab results");
            return nutritionistAppointmentScheduledAppointmentInfoOne.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentScheduledAppointmentInfoTwoDisplayed() {
        try {
            return nutritionistAppointmentScheduledAppointmentInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Dietary recall & lifestyle assessment");
            return nutritionistAppointmentScheduledAppointmentInfoTwo.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentScheduledAppointmentInfoThreeDisplayed() {
        try {
            return nutritionistAppointmentScheduledAppointmentInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Body composition review");
            return nutritionistAppointmentScheduledAppointmentInfoThree.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentScheduledAppointmentInfoFourDisplayed() {
        try {
            return nutritionistAppointmentScheduledAppointmentInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("May recommend additional tests");
            return nutritionistAppointmentScheduledAppointmentInfoFour.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentWhatToExpectInfoOneDisplayed() {
        try {
            return nutritionistAppointmentWhatToExpectInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("A one-on-one discussion focused on your eating patterns");
            return nutritionistAppointmentWhatToExpectInfoOne.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentWhatToExpectInfoTwoDisplayed() {
        try {
            return nutritionistAppointmentWhatToExpectInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Nutritionist will ask about food preferences");
            return nutritionistAppointmentWhatToExpectInfoTwo.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentWhatToExpectInfoThreeDisplayed() {
        try {
            return nutritionistAppointmentWhatToExpectInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Personalized guidance instead of generic advice");
            return nutritionistAppointmentWhatToExpectInfoThree.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentWhatToExpectInfoFourDisplayed() {
        try {
            return nutritionistAppointmentWhatToExpectInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Collaborative approach:");
            return nutritionistAppointmentWhatToExpectInfoFour.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentPrepareForYourAppointmentInfoOneDisplayed() {
        try {
            return nutritionistAppointmentPrepareForYourAppointmentInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Carry or recall a 3–5 day food log");
            return nutritionistAppointmentPrepareForYourAppointmentInfoOne.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentPrepareForYourAppointmentInfoTwoDisplayed() {
        try {
            return nutritionistAppointmentPrepareForYourAppointmentInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Bring along your latest test ");
            return nutritionistAppointmentPrepareForYourAppointmentInfoTwo.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentPrepareForYourAppointmentInfoThreeDisplayed() {
        try {
            return nutritionistAppointmentPrepareForYourAppointmentInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Be open about challenges");
            return nutritionistAppointmentPrepareForYourAppointmentInfoThree.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentPrepareForYourAppointmentInfoFourDisplayed() {
        try {
            return nutritionistAppointmentPrepareForYourAppointmentInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Wear comfortable clothing");
            return nutritionistAppointmentPrepareForYourAppointmentInfoFour.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentAppointmentTogetherInfoOneDisplayed() {
        try {
            return nutritionistAppointmentAppointmentTogetherInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("To align your nutrition with your health goals");
            return nutritionistAppointmentAppointmentTogetherInfoOne.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentAppointmentTogetherInfoTwoDisplayed() {
        try {
            return nutritionistAppointmentAppointmentTogetherInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Identify nutrient deficiencies");
            return nutritionistAppointmentAppointmentTogetherInfoTwo.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentAppointmentTogetherInfoThreeDisplayed() {
        try {
            return nutritionistAppointmentAppointmentTogetherInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Create a sustainable plan that prevents lifestyle diseases");
            return nutritionistAppointmentAppointmentTogetherInfoThree.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentAppointmentTogetherInfoFourDisplayed() {
        try {
            return nutritionistAppointmentAppointmentTogetherInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Translate lab results into practical food ");
            return nutritionistAppointmentAppointmentTogetherInfoFour.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentPostSampleCollectionInfoOneDisplayed() {
        try {
            return nutritionistAppointmentPostSampleCollectionInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("A personalized nutrition plan tailored to your test results");
            return nutritionistAppointmentPostSampleCollectionInfoOne.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentPostSampleCollectionInfoTwoDisplayed() {
        try {
            return nutritionistAppointmentPostSampleCollectionInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Supplement guidance");
            return nutritionistAppointmentPostSampleCollectionInfoTwo.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentPostSampleCollectionInfoThreeDisplayed() {
        try {
            return nutritionistAppointmentPostSampleCollectionInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Practical tools: meal timing");
            return nutritionistAppointmentPostSampleCollectionInfoThree.isDisplayed();
        }
    }

    public boolean isNutritionistAppointmentPostSampleCollectionInfoFourDisplayed() {
        try {
            return nutritionistAppointmentPostSampleCollectionInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Clear follow-up steps:");
            return nutritionistAppointmentPostSampleCollectionInfoFour.isDisplayed();
        }
    }

    public boolean isConsentForGeneticAndGutTestsAndMSQWhatToExpectInfoDisplayed() {
        try {
            return consentForGeneticAndGutTestsAndMSQWhatToExpectInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("An extensive list of questions regarding");
            return consentForGeneticAndGutTestsAndMSQWhatToExpectInfo.isDisplayed();
        }
    }

    public boolean isConsentForGeneticAndGutTestsAndMSQPrepareForYourAppointmentInfoDisplayed() {
        try {
            return consentForGeneticAndGutTestsAndMSQPrepareForYourAppointmentInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Sit in a silent room and be ready");
            return consentForGeneticAndGutTestsAndMSQPrepareForYourAppointmentInfo.isDisplayed();
        }
    }

    public boolean isConsentForGeneticAndGutTestsAndMSQAppointmentTogetherInfoDisplayed() {
        try {
            return consentForGeneticAndGutTestsAndMSQAppointmentTogetherInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Some tests like the genetic and gut ones need signed consent");
            return consentForGeneticAndGutTestsAndMSQAppointmentTogetherInfo.isDisplayed();
        }
    }

    public boolean isConsentForGeneticAndGutTestsAndMSQPostSampleCollectionInfoDisplayed() {
        try {
            return consentForGeneticAndGutTestsAndMSQPostSampleCollectionInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Post the call, you will receive the consent forms digitally");
            return consentForGeneticAndGutTestsAndMSQPostSampleCollectionInfo.isDisplayed();
        }
    }

    public boolean isDoctorOnboardingCallWhatToExpectTitleDisplayed() {
        try {
            return doctorOnboardingCallWhatToExpectTitle.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Onboarding call for");
            return doctorOnboardingCallWhatToExpectTitle.isDisplayed();
        }
    }

    public boolean isDoctorOnboardingCallWhatToExpectInfoOneDisplayed() {
        try {
            return doctorOnboardingCallWhatToExpectInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Introductions");
            return doctorOnboardingCallWhatToExpectInfoOne.isDisplayed();
        }
    }

    public boolean isDoctorOnboardingCallWhatToExpectInfoTwoDisplayed() {
        try {
            return doctorOnboardingCallWhatToExpectInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Understanding of member goals");
            return doctorOnboardingCallWhatToExpectInfoTwo.isDisplayed();
        }
    }

    public boolean isDoctorOnboardingCallWhatToExpectInfoThreeDisplayed() {
        try {
            return doctorOnboardingCallWhatToExpectInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Detailed medical history");
            return doctorOnboardingCallWhatToExpectInfoThree.isDisplayed();
        }
    }

    public boolean isDoctorOnboardingCallWhatToExpectInfoFourDisplayed() {
        try {
            return doctorOnboardingCallWhatToExpectInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Path ahead");
            return doctorOnboardingCallWhatToExpectInfoFour.isDisplayed();
        }
    }

    public boolean isDoctorOnboardingCallWhatToExpectInfoFiveDisplayed() {
        try {
            return doctorOnboardingCallWhatToExpectInfoFive.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Any other relevant topics");
            return doctorOnboardingCallWhatToExpectInfoFive.isDisplayed();
        }
    }

    public boolean isDoctorOnboardingCallPrepareForYourAppointmentTitleDisplayed() {
        try {
            return doctorOnboardingCallPrepareForYourAppointmentTitle.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Prep is optional");
            return doctorOnboardingCallPrepareForYourAppointmentTitle.isDisplayed();
        }
    }

    public boolean isDoctorOnboardingCallPrepareForYourAppointmentInfoOneDisplayed() {
        try {
            return doctorOnboardingCallPrepareForYourAppointmentInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Few things you want to change");
            return doctorOnboardingCallPrepareForYourAppointmentInfoOne.isDisplayed();
        }
    }

    public boolean isDoctorOnboardingCallPrepareForYourAppointmentInfoTwoDisplayed() {
        try {
            return doctorOnboardingCallPrepareForYourAppointmentInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Key events or patterns");
            return doctorOnboardingCallPrepareForYourAppointmentInfoTwo.isDisplayed();
        }
    }

    public boolean isDoctorOnboardingCallPrepareForYourAppointmentInfoThreeDisplayed() {
        try {
            return doctorOnboardingCallPrepareForYourAppointmentInfoThree.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Your goals");
            return doctorOnboardingCallPrepareForYourAppointmentInfoThree.isDisplayed();
        }
    }

    public boolean isDoctorOnboardingCallPrepareForYourAppointmentInfoFourDisplayed() {
        try {
            return doctorOnboardingCallPrepareForYourAppointmentInfoFour.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Make sure");
            return doctorOnboardingCallPrepareForYourAppointmentInfoFour.isDisplayed();
        }
    }

    public boolean isDoctorOnboardingCallAppointmentTogetherInfoDisplayed() {
        try {
            return doctorOnboardingCallAppointmentTogetherInfo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("This is a foundational step in your FOXO journey");
            return doctorOnboardingCallAppointmentTogetherInfo.isDisplayed();
        }
    }

    public boolean isDoctorOnboardingCallCautionInfoOneDisplayed() {
        try {
            return doctorOnboardingCallCautionInfoOne.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("Make sure you’re in a quiet");
            return doctorOnboardingCallCautionInfoOne.isDisplayed();
        }
    }

    public boolean isDoctorOnboardingCallCautionInfoTwoDisplayed() {
        try {
            return doctorOnboardingCallCautionInfoTwo.isDisplayed();
        } catch (NoSuchElementException e) {
            baseUtils.scrollToText("receive a Google Meet link");
            return doctorOnboardingCallCautionInfoTwo.isDisplayed();
        }
    }

    public boolean isNavigateIconDisplayed(String option) {
        WebElement navigateIcon = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='" + option + "']/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView"));
        return navigateIcon.isDisplayed();
    }

    public boolean isNavigateOptionDisplayed(String option) {
        WebElement navigateOption = driver.findElement(By.xpath("//android.widget.TextView[@text='" + option + "']"));
        return navigateOption.isDisplayed();
    }

    public void clickOnCalendarIcon() {
        calendarIcon.click();
    }

    public boolean isScheduleTextDisplayed() {
        return scheduleText.isDisplayed();
    }

    public void clickOnOptions(String option) {
        WebElement options = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='" + option + "']"));
        System.out.println(options.isSelected());
//        options.click();
    }

}
