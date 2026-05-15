@api @dev
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
#    Given Delete all existing schedules for the member
    Given Add the schedule payload with event name "Internal Squad Call" location "Sanmaya Home", start date "Tomorrow", start time "1:35 PM", end date "Tomorrow", end time "1:55 PM", squad "Joe", care specialist "ankit test care"
    When User calls "ScheduleAPI" with "post" http request
    Then Extract the schedule response
    Then Verify the status code as 200