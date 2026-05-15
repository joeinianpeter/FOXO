Feature: Login functionality

  Background:
    Given Verify the mobile app is launched
@mobile @dev
  Scenario: Verify user is able to login with valid phone number and OTP
    Given Login to the mobile app with mobile number and OTP
    And Logout from the app

  Scenario: Verify user should not be able to login with In-valid phone number
    Given User enter a phone number of a member who is not registered under foxo
    Then User should be displayed with proper user information message

  Scenario: Verify user should not be able to login when user enter In-valid OTP
    Given When user enter Valid phone number and In-valid OTP
    Then Verify user should be displayed with error message

  Scenario: Verify the sign-in button should be disabled before the phone number is entered
    Given Verify whether the Sign In button is enabled before the phone number is entered

  Scenario: Verify the sign-in button should be disabled when the user enter phone number less than 10 digits
    Given Verify whether the Sign In button is enabled when user enter phone number less than ten digits

#  Scenario: Verify the sign-in button should be disabled when the user enter phone number more than 10 digits
#    Given Verify whether the Sign In button is enabled when user enter phone number more than ten digits

  Scenario: Verify the sign in button should not be enabled when user enter the alphabets, special characters into the phone number field
    Given Verify whether the Sign In button is enabled when user type alphabets, special characters in the phone number field

  Scenario: Verify when user try to change the phone number from OTP section
    Given User enter the phone number and click on the sign in button
    When User should be displayed with OTP screen
    Then When user clicks on the "Change" text button, user should be back to the user login section
    And Clear the phone number field

  Scenario: Verify when user fails to enter the OTP within the specified the time interval
    Given User enter the phone number and click on the sign in button
    Then Verify the timer text should be displayed
    And Verify the text displayed after 120 seconds

  Scenario: Verify the verify button before entering the OTP
    Given User enter the phone number and click on the sign in button
    Then Verify the "Verify" button should be disabled, before the OTP is entered

  Scenario: Verify the login screen
    Given Verify all the text displayed in the login screen
    When User enter the phone number and click on the sign in button
    Then Verify all the text displayed in the OTP screen







