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