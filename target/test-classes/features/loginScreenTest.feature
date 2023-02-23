Feature: Login screen tests

  @Smoke
  Scenario: Login With valid credentials
    Given Open METCAL Runtime and entel valid login and password
    Then Click on the LogIn button
