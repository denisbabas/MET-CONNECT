Feature: Login screen tests

  @Smoke
  Scenario: Login With valid credentials(MC)
    Given Open METCAL Runtime and enter valid login and password for MC user
    Then Click on the LogIn button
    And verify that for MC user "RUN" and "CONFIGURE" tabs is enabled

  @Smoke
  Scenario: Login With valid credentials(Admin)
    Given Open METCAL Runtime and enter valid login and password for Admin user
    Then Click on the LogIn button
    And verify that for MC user RUN and CONFIGURE tabs is disabled

  @Smoke
  Scenario Outline: Login with invalid Login
    Given Open METCAL Runtime and enter invalid "<Login>"
    When Enter valid password
    Then Click on the LogIn button
    Then Verify Invalid setting "<Error>" message is displayed

    Examples: 
      | Login  | Error                                                 |
      | mc!    | E278:  User name is not valid: Database login failed. |
      | !mc    | E278:  User name is not valid: Database login failed. |
      | admin! | E278:  User name is not valid: Database login failed. |
      | .admin | E278:  User name is not valid: Database login failed. |

  @Smoke
  Scenario Outline: Login with invalid password
    Given Open METCAL Runtime and enter valid login
    When Enter invalid "<Password>"
    Then Click on the LogIn button
    Then Verify Invalid setting "<Error>" message is displayed

    Examples: 
      | Password | Error                                                |
      | mc!      | E278:  Password is incorrect: Database login failed. |
      | !mc      | E278:  Password is incorrect: Database login failed. |
      | admin    | E278:  Password is incorrect: Database login failed. |
      | .admin   | E278:  Password is incorrect: Database login failed. |

  @Smoke
  Scenario Outline: Login with invalid login and password
    Given Open METCAL Runtime and enter invalid "<Login>"
    When Enter invalid "<Password>"
    Then Verify Invalid setting "<Error>" message is displayed
      | Login | Password | Error                                          |
      | mc!   | mc!      | User name is not valid: Database login failed. |

  @Smoke
  Scenario: Verify help button on login page work properly and shows proper topic
    Given Open METCAL Runtime and click Help button
    Then Verify header "MET/CONNECT Overview" on help page is shows for the user

 