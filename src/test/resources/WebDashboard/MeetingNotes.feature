@web
Feature: Meeting Notes Functionality in Web Dashboard

  Background:
    Given Launch the browser
    When User enter the valid username and password
    Then User should be displayed with the Welcome screen
    And Select the member "Joe Inian Peter"

  Scenario: Verify entering data into meeting notes and the same should be displayed in the Dashboard notes
    Given Add the Login payload
    When User calls "LoginAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the Login response
    And Add the member list payload
    When User calls "MemberListAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the member list response
    Then Select member "Joe Inian Peter"
    Given Delete all existing schedules for the member
    And Select the "Today's Schedules" or "schedules" or "schedule List Test"
    Then Click on "plus" icon
    And search for "Schedules"
    Then Click on "Doctor Bi-Weekly Catchup" and select a event "Progress coach call"
    And Add the start time "04" "00" "PM" and date "30"
    And Add the end time "05" "00" "PM" and date "30"
    And Select the Squad Member "Joe Inian Peter"
    And Select the care specialist "ankit test care"
    And Click on Create Schedule
    Then Verify the success message
    And Check the created schedule details
    And Select the "Member Logs" or "meeting notes"
    Then Enter data under notes in the meeting notes section
    And Click on "Dashboard"
    Then Verify the meeting notes

  Scenario: Verify entering data into Dashboard notes gets reflected in the meeting notes section
    Given Add the Login payload
    When User calls "LoginAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the Login response
    And Add the member list payload
    When User calls "MemberListAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the member list response
    Then Select member "Joe Inian Peter"
    Given Delete all existing schedules for the member
    And Select the "schedule List Test" or "schedules" or "Today's Schedules"
    Then Click on "plus" icon
    And search for "Schedules"
    Then Click on "Doctor Bi-Weekly Catchup" and select a event "Progress coach call"
    And Add the start time "04" "00" "PM" and date "30"
    And Add the end time "05" "00" "PM" and date "30"
    And Select the Squad Member "Joe Inian Peter"
    And Select the care specialist "ankit test care"
    And Click on Create Schedule
    Then Verify the success message
    And Check the created schedule details
    And Click on "Dashboard"
    And Click on the name and enter the data under the notes sections
    Then Save the notes in the dashboard section
    And Select the "Member Logs" or "meeting notes"
    Then Verify the meeting notes

  Scenario: Verify the cursor moves only in forward direction while data is entered in meeting notes in Member Logs section
    Given Add the Login payload
    When User calls "LoginAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the Login response
    And Add the member list payload
    When User calls "MemberListAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the member list response
    Then Select member "Joe Inian Peter"
    Given Delete all existing schedules for the member
    And Select the "Today's Schedules" or "schedules" or "schedule List Test"
    Then Click on "plus" icon
    And search for "Schedules"
    Then Click on "Doctor Bi-Weekly Catchup" and select a event "Progress coach call"
    And Add the start time "04" "00" "PM" and date "30"
    And Add the end time "05" "00" "PM" and date "30"
    And Select the Squad Member "Joe Inian Peter"
    And Select the care specialist "ankit test care"
    And Click on Create Schedule
    Then Verify the success message
    And Check the created schedule details
    And Select the "Member Logs" or "meeting notes"
    Then Enter the data and verify the cursor moves only in forward direction under meeting notes section

  Scenario: Verify the cursor moves only in forward direction while data is entered in meeting notes in Dashboard section
    Given Add the Login payload
    When User calls "LoginAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the Login response
    And Add the member list payload
    When User calls "MemberListAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the member list response
    Then Select member "Joe Inian Peter"
    Given Delete all existing schedules for the member
    And Select the "schedule List Test" or "schedules" or "Today's Schedules"
    Then Click on "plus" icon
    And search for "Schedules"
    Then Click on "Doctor Bi-Weekly Catchup" and select a event "Progress coach call"
    And Add the start time "04" "00" "PM" and date "30"
    And Add the end time "05" "00" "PM" and date "30"
    And Select the Squad Member "Joe Inian Peter"
    And Select the care specialist "ankit test care"
    And Click on Create Schedule
    Then Verify the success message
    And Check the created schedule details
    And Click on "Dashboard"
    Then Enter the data and verify the cursor moves only in forward direction under dashboard section

  Scenario: Verify the data in the meeting notes is not deleted during the auto-saving functionality
    Given Add the Login payload
    When User calls "LoginAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the Login response
    And Add the member list payload
    When User calls "MemberListAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the member list response
    Then Select member "Joe Inian Peter"
    Given Delete all existing schedules for the member
    And Select the "Today's Schedules" or "schedules" or "schedule List Test"
    Then Click on "plus" icon
    And search for "Schedules"
    Then Click on "Doctor Bi-Weekly Catchup" and select a event "Progress coach call"
    And Add the start time "04" "00" "PM" and date "30"
    And Add the end time "05" "00" "PM" and date "30"
    And Select the Squad Member "Joe Inian Peter"
    And Select the care specialist "ankit test care"
    And Click on Create Schedule
    Then Verify the success message
    And Check the created schedule details
    And Select the "Member Logs" or "meeting notes"
    Then Verify meeting notes retain all text when user types while autosave is in progress

  Scenario: Verify user should be displayed with save pop-up before navigating to the other section
    Given Add the Login payload
    When User calls "LoginAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the Login response
    And Add the member list payload
    When User calls "MemberListAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the member list response
    Then Select member "Joe Inian Peter"
    Given Delete all existing schedules for the member
    And Select the "Today's Schedules" or "schedules" or "schedule List Test"
    Then Click on "plus" icon
    And search for "Schedules"
    Then Click on "Doctor Bi-Weekly Catchup" and select a event "Progress coach call"
    And Add the start time "04" "00" "PM" and date "30"
    And Add the end time "05" "00" "PM" and date "30"
    And Select the Squad Member "Joe Inian Peter"
    And Select the care specialist "ankit test care"
    And Click on Create Schedule
    Then Verify the success message
    And Check the created schedule details
    And Click on "Dashboard"
    And Click on the name and enter the data under the notes sections
    And Select the "Member Logs" or "meeting notes"
    Then Verify user should be displayed with save and discard pop-up

  Scenario: Verify the data should not be visible when user discard the un-saved changes pop-up
    Given Add the Login payload
    When User calls "LoginAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the Login response
    And Add the member list payload
    When User calls "MemberListAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the member list response
    Then Select member "Joe Inian Peter"
    Given Delete all existing schedules for the member
    And Select the "Today's Schedules" or "schedules" or "schedule List Test"
    Then Click on "plus" icon
    And search for "Schedules"
    Then Click on "Doctor Bi-Weekly Catchup" and select a event "Progress coach call"
    And Add the start time "04" "00" "PM" and date "30"
    And Add the end time "05" "00" "PM" and date "30"
    And Select the Squad Member "Joe Inian Peter"
    And Select the care specialist "ankit test care"
    And Click on Create Schedule
    Then Verify the success message
    And Check the created schedule details
    And Click on "Dashboard"
    And Click on the name and enter the data under the notes sections
    And Select the "Member Logs" or "meeting notes"
    Then Verify user should be displayed with save and discard pop-up
    And Verify add meeting notes section should be displayed
    And Click on "Dashboard"
    Then Verify the meeting notes data should not be visible since user didn't save the content