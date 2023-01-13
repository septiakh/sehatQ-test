@SehatQ
@SehatQ_Login
Feature: SehatQ - Login

  @Scenario001
  Scenario: Verify user successfuly login using registered account
    Given User open url "sehatq.com"
    And user click icon profile
    When user input email "test1@mailinator.com" on login page
    And user input password "Password1" on login page
    And user click Login button
    Then user verify already login

  @Scenario002
  Scenario: Verify user failed to login when using unregistered email
    Given User open url "sehatq.com"
    And user click icon profile
    When user input email "te@mailinator.com" on login page
    And user input password "Password1" on login page
    And user click Login button
    Then user verify show a toast "Email harus diisi dengan benar"

  @Scenario003
  Scenario: Verify user failed to login when using invalid  email format
    Given User open url "sehatq.com"
    And user click icon profile
    When user input email "te@mailinator" on login page
    And user input password "Password1" on login page
    And user click Login button
    Then user verify show message "Email harus diisi dengan benar"

  @Scenario004
  Scenario: Verify user failed to login when using incorrect password
    Given User open url "sehatq.com"
    And user click icon profile
    When user input email "test1@mailinator.com" on login page
    And user input password "Password3" on login page
    And user click Login button
    Then user verify show a toast "Email atau Password yang Anda masukkan salah"

  @Scenario005
  Scenario: Verify user failed to login when using password less than 6 characters
    Given User open url "sehatq.com"
    And user click icon profile
    When user input email "test1@mailinator.com" on login page
    And user input password "Passw" on login page
    And user click Login button
    Then user verify show message "Kolom Password minimal 6"
