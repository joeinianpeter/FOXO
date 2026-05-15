@web
Feature: Schedule functionality in web dashboard

  Background:
    Given Launch the browser
    When User enter the valid username and password
    Then User should be displayed with the Welcome screen
    And Select the member "Joe Inian Peter"

  Scenario: Verify user is able to create a schedule for a member
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
    And Add the start time "04" "00" "PM" and date "Today"
    And Add the end time "05" "00" "PM" and date "Today"
    And Select the Squad Member "Joe Inian Peter"
    And Select the care specialist "ankit test care"
    And Click on Create Schedule
    Then Verify the success message
    And Check the created schedule details

  Scenario: Verify user is able edit the created schedule and update it
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
    And Add the start time "04" "00" "PM" and date "Today"
    And Add the end time "05" "00" "PM" and date "Today"
    And Select the Squad Member "Joe Inian Peter"
    And Select the care specialist "ankit test care"
    And Click on Create Schedule
    Then Verify the success message
    And Check the created schedule details
    And Click on the edit icon
    And Click on the event name and update it with "Doctor Bi-Weekly Catchup"
    And Add the start time "07" "00" "PM" and date "Today"
    And Add end time "08" "00" "PM" and date "Today"
    And Click on Update Schedule
    Then Verify schedule updated success message
    And Check the updated schedule details