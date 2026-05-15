@api
Feature: Members To Do feature

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
#  Scenario: Delete all the member to do task
#    Given Delete all existing To-Do tasks for the member

  Scenario: Verify user is able to create a To-Do task
    And Add the members to-do task payload with category "Powder Supplement", status "active", occurrence "daily", start date "2026-03-31", and time "11 AM", end date "2026-04-30", and time "11:35 AM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200

  Scenario: Verify user is able to create a To-Do task
    And Add the members to-do task payload with category "Tablet Supplement", status "active", occurrence "daily", start date "2026-03-31", and time "5 PM", end date "2026-04-30", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200

  Scenario: Verify user is able to create a To-Do task
    And Add the members to-do task payload with category "Liquid Supplement", status "active", occurrence "daily", start date "2026-03-31", and time "5 PM", end date "2026-04-30", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200

  Scenario: Verify user is able to create a To-Do task
    And Add the members to-do task payload with category "Capsule Supplement", status "active", occurrence "daily", start date "2026-03-31", and time "5 PM", end date "2026-04-30", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200

  Scenario: Verify user is able to create a To-Do task
    And Add the members to-do task payload with category "Millet", status "active", occurrence "daily", start date "2026-03-31", and time "5 PM", end date "2026-04-30", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200

  Scenario: Verify user is able to create a To-Do task
    And Add the members to-do task payload with category "Vegetable", status "active", occurrence "daily", start date "2026-03-31", and time "5 PM", end date "2026-04-30", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200

  Scenario: Verify user is able to create a To-Do task
    And Add the members to-do task payload with category "Generic", status "active", occurrence "daily", start date "2026-03-31", and time "5 PM", end date "2026-04-30", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200

  Scenario: Verify user is able to create a To-Do task
    And Add the members to-do task payload with category "Stool", status "active", occurrence "daily", start date "2026-03-31", and time "5 PM", end date "2026-04-30", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200

  Scenario: Verify user is able to create a To-Do task
    And Add the members to-do task payload with category "Stool Consistency", status "active", occurrence "daily", start date "2026-03-31", and time "5 PM", end date "2026-04-30", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200

  Scenario: Verify user is able to create a To-Do task
    And Add the members to-do task payload with category "Weight", status "active", occurrence "daily", start date "2026-03-31", and time "5 PM", end date "2026-04-30", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200

  Scenario: Verify user is able to create a To-Do task
    And Add the members to-do task payload with category "Hydration", status "active", occurrence "daily", start date "2026-03-31", and time "5 PM", end date "2026-04-30", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200

  Scenario: Verify user should be able to complete a task 6 days before
    Given Add the members to-do task payload with category "Tablet Supplement", status "active", occurrence "only-once", start date "Six days before", and time "10 AM", end date "Six days before", and time "10:35 AM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200

  Scenario: Verify user should not be able to complete a task 7 days before
    Given Add the members to-do task payload with category "Tablet Supplement", status "active", occurrence "only-once", start date "Seven days before", and time "10 AM", end date "Seven days before", and time "10:35 AM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200