@api
Feature: Login and Logout functionality

  @SkipAutoLogout
  Scenario: Verify user is able to login and logout successfully
    Given Add the Login payload
    When User calls "LoginAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the Login response
    And Add the member list payload
    When User calls "MemberListAPI" with "post" http request
    Then Verify the status code as 200
    And Extract the member list response
    Then Select member "Joe Inian Peter"
    And Add the logout payload
    When User calls "LogoutAPI" with "post" http request
    Then Verify the status code as 204