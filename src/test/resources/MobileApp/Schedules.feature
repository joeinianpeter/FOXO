
Feature: Schedule functionality

  Background:
    Given Add the Login payload
    When User calls "LoginAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the Login response
    And Add the member list payload
    When User calls "MemberListAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the member list response
    Then Select member "Joe Inian Peter"

#  NOTE:This step is used to delete all the to do tasks
#  Scenario: Verify user is able to create a new schedule
#    Given Delete all existing schedules for the member

  Scenario: Verify the detailed display of the schedule "Behaviour coach appointment" in the app
    Given Delete all existing schedules for the member
    Given Add the schedule payload with event name "Behaviour coach appointment" location "Sanmaya Home", start date "Today", start time "6:15 PM", end date "Today", end time "6:18 PM"
    When User calls "ScheduleAPI" with "post" http request
    Then Extract the schedule response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the created schedule should be displayed in the app
    And Click on the schedule
    Then Verify the detailed display of the schedule with "Set Reminder" and "Reschedule" options for behaviour coach appointment
    And Logout from the app

  Scenario: Verify the detailed display of the schedule "Internal Squad Call" in the app
    Given Delete all existing schedules for the member
    Given Add the schedule payload with event name "Internal Squad Call" location "Akash Home", start date "Today", start time "6:15 PM", end date "Today", end time "6:18 PM"
    When User calls "ScheduleAPI" with "post" http request
    Then Extract the schedule response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the created schedule should be displayed in the app
    And Click on the schedule
    Then Verify the detailed display of the schedule with "Set Reminder", "Reschedule" and "Navigate" options for internal squad call
    And Logout from the app

  Scenario: Verify the detailed display of the schedule "Radiology Test" in the app
    Given Delete all existing schedules for the member
    Given Add the schedule payload with event name "Radiology Test" location "Celara - Bangalore", start date "Today", start time "6:15 PM", end date "Today", end time "6:18 PM"
    When User calls "ScheduleAPI" with "post" http request
    Then Extract the schedule response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the created schedule should be displayed in the app
    And Click on the schedule
    Then Verify the detailed display of the schedule with "Set Reminder", "Reschedule" and "Navigate" options for radiology test
    And Logout from the app

  Scenario: Verify the detailed display of the schedule "Doctor Bi-Weekly Catchup" in the app
    Given Delete all existing schedules for the member
    Given Add the schedule payload with event name "Doctor Bi-Weekly Catchup" location "Charu's Home", start date "Today", start time "6:15 PM", end date "Today", end time "6:18 PM"
    When User calls "ScheduleAPI" with "post" http request
    Then Extract the schedule response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the created schedule should be displayed in the app
    And Click on the schedule
    Then Verify the detailed display of the schedule with "Set Reminder" and "Reschedule" options for Doctor bi-weekly catchup
    And Logout from the app

  Scenario: Verify the detailed display of the schedule "FOXO Kit & Concierge Introduction" in the app
    Given Delete all existing schedules for the member
    Given Add the schedule payload with event name "FOXO Kit & Concierge Introduction" location "Devanshu' Home", start date "Today", start time "6:15 PM", end date "Today", end time "6:18 PM"
    When User calls "ScheduleAPI" with "post" http request
    Then Extract the schedule response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the created schedule should be displayed in the app
    And Click on the schedule
    Then Verify the detailed display of the schedule with "Set Reminder" and "Reschedule" options for FOXO kit & concierge introduction
    And Logout from the app

  Scenario: Verify the detailed display of the schedule "Blood, Urine, Stool sample collection" in the app
    Given Delete all existing schedules for the member
    Given Add the schedule payload with event name "Blood, Urine, Stool sample collection" location "FOXO", start date "Today", start time "6:15 PM", end date "Today", end time "6:18 PM"
    When User calls "ScheduleAPI" with "post" http request
    Then Extract the schedule response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the created schedule should be displayed in the app
    And Click on the schedule
    Then Verify the detailed display of the schedule with "Set Reminder" and "Reschedule" options for blood, urine, stool sample collection
    And Logout from the app

  Scenario: Verify the detailed display of the schedule "Health Coaching" in the app
    Given Delete all existing schedules for the member
    Given Add the schedule payload with event name "Health Coaching" location "Gireesh's Home", start date "Today", start time "6:15 PM", end date "Today", end time "6:18 PM"
    When User calls "ScheduleAPI" with "post" http request
    Then Extract the schedule response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the created schedule should be displayed in the app
    And Click on the schedule
    Then Verify the detailed display of the schedule with "Set Reminder" and "Reschedule" options for health coaching
    And Logout from the app

  Scenario: Verify the detailed display of the schedule "FOXO Nutritionist Consultation" in the app
    Given Delete all existing schedules for the member
    Given Add the schedule payload with event name "FOXO Nutritionist Consultation" location "Inzen Noida", start date "Today", start time "6:15 PM", end date "Today", end time "6:18 PM"
    When User calls "ScheduleAPI" with "post" http request
    Then Extract the schedule response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the created schedule should be displayed in the app
    And Click on the schedule
    Then Verify the detailed display of the schedule with "Set Reminder" and "Reschedule" options for FOXO Nutritionist consultation
    And Logout from the app

#  Scenario: Verify the detailed display of the schedule "Nutritionist Followup" in the app
#    Given Delete all existing schedules for the member
#    Given Add the schedule payload with event name "Nutritionist Followup" location "Izen lab", start date "Today", start time "5:15 PM", end date "Today", end time "5:18 PM"
#    When User calls "ScheduleAPI" with "post" http request
#    Then Extract the schedule response
#    Then Verify the status code as 200
#    And Verify the mobile app is launched
#    And Login to the mobile app
#    Then Verify the created schedule should be displayed in the app
#    And Click on the schedule
#    Then Verify the detailed display of the schedule with "Set Reminder" and "Reschedule" options for Nutritionist Followup
#    And Logout from the app

  Scenario: Verify the detailed display of the schedule "Doctor Consultation" in the app
    Given Delete all existing schedules for the member
    Given Add the schedule payload with event name "Doctor Consultation" location "Kanva Diagnostic Services Pvt Ltd", start date "Today", start time "6:15 PM", end date "Today", end time "6:18 PM"
    When User calls "ScheduleAPI" with "post" http request
    Then Extract the schedule response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the created schedule should be displayed in the app
    And Click on the schedule
    Then Verify the detailed display of the schedule with "Set Reminder" and "Reschedule" options for Doctor Consultation
    And Logout from the app

  Scenario: Verify the detailed display of the schedule "test collection" in the app
    Given Delete all existing schedules for the member
    Given Add the schedule payload with event name "test collection" location "Lalith's Home", start date "Today", start time "6:15 PM", end date "Today", end time "6:18 PM"
    When User calls "ScheduleAPI" with "post" http request
    Then Extract the schedule response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the created schedule should be displayed in the app
    And Click on the schedule
    Then Verify the detailed display of the schedule with "Set Reminder" and "Reschedule" options for test collection
    And Logout from the app

  Scenario: Verify the detailed display of the schedule "Hormonal Health Consultation – Testosterone Panel" in the app
    Given Delete all existing schedules for the member
    Given Add the schedule payload with event name "Hormonal Health Consultation – Testosterone Panel" location "Location With Lab has lat long", start date "Today", start time "6:15 PM", end date "Today", end time "6:18 PM"
    When User calls "ScheduleAPI" with "post" http request
    Then Extract the schedule response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the created schedule should be displayed in the app
    And Click on the schedule
    Then Verify the detailed display of the schedule with "Set Reminder" and "Reschedule" options for Hormonal Health Consultation – Testosterone Panel
    And Logout from the app

#  Scenario: Verify the detailed display of the schedule "test" in the app
#    Given Delete all existing schedules for the member
#    Given Add the schedule payload with event name "test" location "Member's Home", start date "Today", start time "6:15 PM", end date "Today", end time "6:18 PM"
#    When User calls "ScheduleAPI" with "post" http request
#    Then Extract the schedule response
#    Then Verify the status code as 200
#    And Verify the mobile app is launched
#    And Login to the mobile app
#    Then Verify the created schedule should be displayed in the app
#    And Click on the schedule
#    Then Verify the detailed display of the schedule with "Set Reminder" and "Reschedule" options for test
#    And Logout from the app

  Scenario: Verify the detailed display of the schedule "Cardiac and Imaging Test" in the app
    Given Delete all existing schedules for the member
    Given Add the schedule payload with event name "Cardiac and Imaging Test" location "Online", start date "Today", start time "6:15 PM", end date "Today", end time "6:18 PM"
    When User calls "ScheduleAPI" with "post" http request
    Then Extract the schedule response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the created schedule should be displayed in the app
    And Click on the schedule
    Then Verify the detailed display of the schedule with "Set Reminder" and "Reschedule" options for Cardiac and Imaging Test
    And Logout from the app

  Scenario: Verify the detailed display of the schedule "Kitchen Audit" in the app
    Given Delete all existing schedules for the member
    Given Add the schedule payload with event name "Kitchen Audit" location "Rajat's Home", start date "Today", start time "6:15 PM", end date "Today", end time "6:18 PM"
    When User calls "ScheduleAPI" with "post" http request
    Then Extract the schedule response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the created schedule should be displayed in the app
    And Click on the schedule
    Then Verify the detailed display of the schedule with "Set Reminder" and "Reschedule" options for Kitchen Audit
    And Logout from the app

  Scenario: Verify the detailed display of the schedule "Physio Assessment" in the app
    Given Delete all existing schedules for the member
    Given Add the schedule payload with event name "Physio Assessment" location "Rapid Sport Fitness & Physiotherapy - RSF", start date "Today", start time "6:15 PM", end date "Today", end time "6:18 PM"
    When User calls "ScheduleAPI" with "post" http request
    Then Extract the schedule response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the created schedule should be displayed in the app
    And Click on the schedule
    Then Verify the detailed display of the schedule with "Set Reminder" and "Reschedule" options for Physio Assessment
    And Logout from the app

  Scenario: Verify the detailed display of the schedule "Doctor Appointment" in the app
    Given Delete all existing schedules for the member
    Given Add the schedule payload with event name "Doctor Appointment" location "Sajith's Home", start date "Today", start time "6:15 PM", end date "Today", end time "6:18 PM"
    When User calls "ScheduleAPI" with "post" http request
    Then Extract the schedule response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the created schedule should be displayed in the app
    And Click on the schedule
    Then Verify the detailed display of the schedule with "Set Reminder" and "Reschedule" options for Doctor Appointment
    And Logout from the app

  Scenario: Verify the detailed display of the schedule "CGM Patch Application" in the app
    Given Delete all existing schedules for the member
    Given Add the schedule payload with event name "CGM Patch Application" location "Smriti Singh", start date "Today", start time "6:15 PM", end date "Today", end time "6:18 PM"
    When User calls "ScheduleAPI" with "post" http request
    Then Extract the schedule response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the created schedule should be displayed in the app
    And Click on the schedule
    Then Verify the detailed display of the schedule with "Set Reminder" and "Reschedule" options for CGM Patch Application
    And Logout from the app

  Scenario: Verify the detailed display of the schedule "CGM Patch Application" in the app
    Given Delete all existing schedules for the member
    Given Add the schedule payload with event name "Nutritionist Appointment" location "Sneh' Home", start date "Today", start time "6:15 PM", end date "Today", end time "6:18 PM"
    When User calls "ScheduleAPI" with "post" http request
    Then Extract the schedule response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the created schedule should be displayed in the app
    And Click on the schedule
    Then Verify the detailed display of the schedule with "Set Reminder" and "Reschedule" options for Nutritionist Appointment
    And Logout from the app

  Scenario: Verify the detailed display of the schedule "Consent for genetic and gut tests, and MSQ" in the app
    Given Delete all existing schedules for the member
    Given Add the schedule payload with event name "Consent for genetic and gut tests, and MSQ" location "Sushmita's Home", start date "Today", start time "6:15 PM", end date "Today", end time "6:18 PM"
    When User calls "ScheduleAPI" with "post" http request
    Then Extract the schedule response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the created schedule should be displayed in the app
    And Click on the schedule
    Then Verify the detailed display of the schedule with "Set Reminder" and "Reschedule" options for Consent for genetic and gut tests, and MSQ
    And Logout from the app

  Scenario: Verify the detailed display of the schedule "Doctor Onboarding Call" in the app
    Given Delete all existing schedules for the member
    Given Add the schedule payload with event name "Doctor Onboarding Call" location "Online", start date "Today", start time "6:15 PM", end date "Today", end time "6:18 PM"
    When User calls "ScheduleAPI" with "post" http request
    Then Extract the schedule response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the created schedule should be displayed in the app
    And Click on the schedule
    Then Verify the detailed display of the schedule with "Set Reminder", "Reschedule" and "Navigate" options for Doctor Onboarding Call
    And Logout from the app

  Scenario: Verify the detailed display of the schedule "Doctor Consultation - Cardiovascular Risk Review" in the app
    Given Delete all existing schedules for the member
    Given Add the schedule payload with event name "Doctor Consultation - Cardiovascular Risk Review" location "Online", start date "Today", start time "6:15 PM", end date "Today", end time "6:18 PM"
    When User calls "ScheduleAPI" with "post" http request
    Then Extract the schedule response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the created schedule should be displayed in the app
    And Click on the schedule
    Then Verify the detailed display of the schedule with "Set Reminder", "Reschedule" and "Navigate" options for Doctor Consultation - Cardiovascular Risk Review
    And Logout from the app

#    update the schedule
#
#    add the care-specialist & doctor
#
#    add meeting link
#
#    verify the calendar icon details screen

  Scenario: Verify the schedule created is displayed under the calendar icon
    Given Delete all existing schedules for the member
    Given Add the schedule payload with event name "Doctor Consultation - Cardiovascular Risk Review" location "Online", start date "Today", start time "6:15 PM", end date "Today", end time "6:18 PM"
    When User calls "ScheduleAPI" with "post" http request
    Then Extract the schedule response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the created schedule should be displayed in the app
    And Click on the calendar icon
    Then Verify the schedules displayed under "Upcoming" section







