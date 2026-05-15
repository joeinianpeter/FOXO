@web
Feature: Prescription functionality in web dashboard

  Background:
    Given Launch the browser
    When User enter the valid username and password
    Then User should be displayed with the Welcome screen
    And Select the member "Joe Inian Peter"
  @dev
  Scenario: Verify user should be displayed with User Info text when no prescription are present for the member
    Given Add the Login payload
    When User calls "LoginAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the Login response
    And Add the member list payload
    When User calls "MemberListAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the member list response
    Then Select member "Joe Inian Peter"
    Given Delete all existing prescription for the member
    And Click on "Member Preview"
    And Select "Prescriptions"
    Then Verify the info message when user has no prescription

  Scenario: Verify when user create a prescription, it should always be in draft state
    Given Add the Login payload
    When User calls "LoginAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the Login response
    And Add the member list payload
    When User calls "MemberListAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the member list response
    Then Select member "Joe Inian Peter"
    Given Delete all existing prescription for the member
    And Click on "Member Preview"
    And Select "Prescriptions"
    Then Click on Create Prescription
    Then Verify the create prescription success message
    And Verify the created prescription should be in draft state

  Scenario: Verify user is able to create a prescription for a member
    Given Add the Login payload
    When User calls "LoginAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the Login response
    And Add the member list payload
    When User calls "MemberListAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the member list response
    Then Select member "Joe Inian Peter"
    Given Delete all existing prescription for the member
    And Click on "Member Preview"
    And Select "Prescriptions"
    Then Click on Create Prescription
    Then Verify the create prescription success message
    And Verify the created prescription should be in draft state
    Then Verify the prescription details, supplement prescription, drug prescription and additional information

  Scenario: Verify when user create a prescription, it should always be the current date
    Given Add the Login payload
    When User calls "LoginAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the Login response
    And Add the member list payload
    When User calls "MemberListAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the member list response
    Then Select member "Joe Inian Peter"
    Given Delete all existing prescription for the member
    And Click on "Member Preview"
    And Select "Prescriptions"
    Then Click on Create Prescription
    Then Verify the create prescription success message
    And Verify the created prescription should be in draft state
    Then Verify the created prescription should always be the current date