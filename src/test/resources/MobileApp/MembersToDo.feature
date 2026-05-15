Feature: Members To Do feature

  Background:
    Given Add the Login payload
    When User calls "LoginAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the Login response

#  NOTE:This step is used to delete all the to do tasks
#  Scenario: Delete all the member to do task
#    Given Delete all existing To-Do tasks for the member

#  First 16 scenarios are for creating the member to do task and check in the app whether getting displayed
  Scenario: Verify user is able to create a To-Do task
    Given Delete all existing To-Do tasks for the member
    Given Add the members to-do task payload with category "liquid-supplement", status "active", occurrence "only-once", start date "Today", and time "10 AM", end date "Today", and time "10:35 AM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the To-Do task should be displayed in the app
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Delete all existing To-Do tasks for the member
    Given Add the members to-do task payload with category "tablet-medicine", status "active", occurrence "only-once", start date "Today", and time "5 PM", end date "Today", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the To-Do task should be displayed in the app
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Add the members to-do task payload with category "powder-medicine", status "active", occurrence "only-once", start date "2025-11-29", and time "5 PM", end date "2025-11-29", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the To-Do task should be displayed in the app
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Add the members to-do task payload with category "liquid-supplement", status "active", occurrence "only-once", start date "2025-11-29", and time "5 PM", end date "2025-11-29", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the To-Do task should be displayed in the app
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Add the members to-do task payload with category "capsule-supplement", status "active", occurrence "only-once", start date "2025-11-29", and time "5 PM", end date "2025-11-29", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the To-Do task should be displayed in the app
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Add the members to-do task payload with category "powder-supplement", status "active", occurrence "only-once", start date "2025-11-29", and time "5 PM", end date "2025-11-29", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the To-Do task should be displayed in the app
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Add the members to-do task payload with category "activities", status "active", occurrence "only-once", start date "2025-11-29", and time "5 PM", end date "2025-11-29", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the To-Do task should be displayed in the app
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Add the members to-do task payload with category "Movement-exercise", status "active", occurrence "only-once", start date "2025-11-29", and time "5 PM", end date "2025-11-29", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the To-Do task should be displayed in the app
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Add the members to-do task payload with category "Nutrition-fruit", status "active", occurrence "only-once", start date "2025-11-29", and time "5 PM", end date "2025-11-29", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the To-Do task should be displayed in the app
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Add the members to-do task payload with category "Nutrition-liquid", status "active", occurrence "only-once", start date "2025-11-29", and time "5 PM", end date "2025-11-29", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the To-Do task should be displayed in the app
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Add the members to-do task payload with category "Nutrition-solid-food", status "active", occurrence "only-once", start date "2025-11-29", and time "5 PM", end date "2025-11-29", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the To-Do task should be displayed in the app
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Add the members to-do task payload with category "Nutrition-nuts", status "active", occurrence "only-once", start date "2025-11-29", and time "5 PM", end date "2025-11-29", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the To-Do task should be displayed in the app
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Add the members to-do task payload with category "sleep", status "active", occurrence "only-once", start date "2025-11-29", and time "5 PM", end date "2025-11-29", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the To-Do task should be displayed in the app
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Add the members to-do task payload with category "Therapy", status "active", occurrence "only-once", start date "2025-11-29", and time "5 PM", end date "2025-11-29", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the To-Do task should be displayed in the app
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Add the members to-do task payload with category "Stress", status "active", occurrence "only-once", start date "2025-11-29", and time "5 PM", end date "2025-11-29", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the To-Do task should be displayed in the app
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Add the members to-do task payload with category "Sun-bath", status "active", occurrence "only-once", start date "2025-11-29", and time "5 PM", end date "2025-11-29", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Verify the To-Do task should be displayed in the app
    And Logout from the app


#    The next 16 scenarios are for completing the task today

  Scenario: Verify user is able to create a To-Do task
    Given Delete all existing To-Do tasks for the member
    Given Add the members to-do task payload with category "liquid-supplement", status "active", occurrence "only-once", start date "Today", and time "10 AM", end date "Today", and time "10:35 AM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Complete the task and verify the toast message
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Delete all existing To-Do tasks for the member
    Given Add the members to-do task payload with category "tablet-medicine", status "active", occurrence "only-once", start date "Today", and time "5 PM", end date "Today", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Complete the task and verify the toast message
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Delete all existing To-Do tasks for the member
    Given Add the members to-do task payload with category "powder-medicine", status "active", occurrence "only-once", start date "Today", and time "5 PM", end date "Today", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Complete the task and verify the toast message
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Delete all existing To-Do tasks for the member
    Given Add the members to-do task payload with category "liquid-supplement", status "active", occurrence "only-once", start date "Today", and time "5 PM", end date "Today", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Complete the task and verify the toast message
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Delete all existing To-Do tasks for the member
    Given Add the members to-do task payload with category "capsule-supplement", status "active", occurrence "only-once", start date "Today", and time "5 PM", end date "Today", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Complete the task and verify the toast message
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Delete all existing To-Do tasks for the member
    Given Add the members to-do task payload with category "powder-supplement", status "active", occurrence "only-once", start date "Today", and time "5 PM", end date "Today", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Complete the task and verify the toast message
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Delete all existing To-Do tasks for the member
    Given Add the members to-do task payload with category "activities", status "active", occurrence "only-once", start date "Today", and time "5 PM", end date "Today", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Complete the task and verify the toast message
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Delete all existing To-Do tasks for the member
    Given Add the members to-do task payload with category "Movement-exercise", status "active", occurrence "only-once", start date "Today", and time "5 PM", end date "Today", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Complete the task and verify the toast message
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Delete all existing To-Do tasks for the member
    Given Add the members to-do task payload with category "Nutrition-fruit", status "active", occurrence "only-once", start date "Today", and time "5 PM", end date "Today", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Complete the task and verify the toast message
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Delete all existing To-Do tasks for the member
    Given Add the members to-do task payload with category "Nutrition-liquid", status "active", occurrence "only-once", start date "Today", and time "5 PM", end date "Today", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Complete the task and verify the toast message
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Delete all existing To-Do tasks for the member
    Given Add the members to-do task payload with category "Nutrition-solid-food", status "active", occurrence "only-once", start date "Today", and time "5 PM", end date "Today", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Complete the task and verify the toast message
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Delete all existing To-Do tasks for the member
    Given Add the members to-do task payload with category "Nutrition-nuts", status "active", occurrence "only-once", start date "Today", and time "5 PM", end date "Today", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Complete the task and verify the toast message
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Delete all existing To-Do tasks for the member
    Given Add the members to-do task payload with category "sleep", status "active", occurrence "only-once", start date "Today", and time "5 PM", end date "Today", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Complete the task and verify the toast message
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Delete all existing To-Do tasks for the member
    Given Add the members to-do task payload with category "Therapy", status "active", occurrence "only-once", start date "Today", and time "5 PM", end date "Today", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Complete the task and verify the toast message
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Delete all existing To-Do tasks for the member
    Given Add the members to-do task payload with category "Stress", status "active", occurrence "only-once", start date "Today9", and time "5 PM", end date "Today", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Complete the task and verify the toast message
    And Logout from the app

  Scenario: Verify user is able to create a To-Do task
    Given Delete all existing To-Do tasks for the member
    Given Add the members to-do task payload with category "Sun-bath", status "active", occurrence "only-once", start date "Today", and time "5 PM", end date "Today", and time "6:35 PM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    Then Complete the task and verify the toast message
    And Logout from the app

#  The next 16 scenarios are for completing the task for yesterday
  Scenario: Verify user is able to complete a task for the last day
    Given Delete all existing To-Do tasks for the member
    Given Add the members to-do task payload with category "liquid-supplement", status "active", occurrence "only-once", start date "Yesterday", and time "10 AM", end date "Yesterday", and time "10:35 AM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    When User clicks on "Yesterday"
    Then Complete the task and verify the toast message
    And Logout from the app

#  The next 16 scenarios are trying to complete the future day
  Scenario: Verify whether the user is able to complete a future task
    Given Delete all existing To-Do tasks for the member
    Given Add the members to-do task payload with category "liquid-supplement", status "active", occurrence "only-once", start date "Tomorrow", and time "10 AM", end date "Tomorrow", and time "10:35 AM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    When User clicks on "Tomorrow"
    Then Verify user should not be allowed to complete a future task or task which are created seven days before
    And Logout from the app

#  The next 16 scenarios are trying to complete task 6 days before
  Scenario: Verify user should be able to complete a task 6 days before
    Given Delete all existing To-Do tasks for the member
    Given Add the members to-do task payload with category "liquid-supplement", status "active", occurrence "only-once", start date "Six days before", and time "10 AM", end date "Six days before", and time "10:35 AM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    When User clicks on "Six days before"
    Then Complete the task and verify the toast message
    And Logout from the app

#  The next 16 scenarios are trying to complete the task 7 days before
  Scenario: Verify user should not be able to complete a task 7 days before
    Given Delete all existing To-Do tasks for the member
    Given Add the members to-do task payload with category "liquid-supplement", status "active", occurrence "only-once", start date "Seven days before", and time "10 AM", end date "Seven days before", and time "10:35 AM"
    When User calls "MemberToDoAPI" with "post" http request
    And Extract the response
    Then Verify the status code as 200
    And Verify the mobile app is launched
    And Login to the mobile app
    When User clicks on "Seven days before"
    Then Verify user should not be allowed to complete a future task or task which are created seven days before
    And Logout from the app
