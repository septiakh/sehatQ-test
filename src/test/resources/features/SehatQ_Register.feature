@SehatQ
@SehatQ_Register
Feature: SehatQ - Register

  @Scenario007
  Scenario: Verify user successfully register using valid data
    Given User open url "sehatq.com"
    And user click icon profile
    And user click Daftar link
    When user input nama lengkap "Adelia Nur" on daftar page
    And user input email "test5@mailinator.com" on daftar page
    And user input password "Password1" on daftar page
    And user check T and C on daftar page
    And user click Daftar button
    Then user input will redirect to OTP page
# This step can't complete because doesn't have an access to Database to access OTP number
#    And user input the OTP number
#    And user verify successfully registered

  @Scenario008
  Scenario: Verify user failed to register when Nama Lengkap filed doesn't filled in
    Given User open url "sehatq.com"
    And user click icon profile
    And user click Daftar link
    When user input email "test5@mailinator.com" on daftar page
    And user input password "Password1" on daftar page
    And user check T and C on daftar page
    And user click Daftar button
    Then user verify show error message "Nama Lengkap wajib diisi"

  @Scenario009
  Scenario: Verify user failed to register when Email filed doesn't filled in
    Given User open url "sehatq.com"
    And user click icon profile
    And user click Daftar link
    When user input nama lengkap "Adelia Nur" on daftar page
    And user input password "Password1" on daftar page
    And user check T and C on daftar page
    And user click Daftar button
    Then user verify show error message "Email wajib diisi"

  @Scenario010
  Scenario: Verify user failed to register when Email filed doesn't filled in
    Given User open url "sehatq.com"
    And user click icon profile
    And user click Daftar link
    When user input nama lengkap "Adelia Nur" on daftar page
    And user input password "Password1" on daftar page
    And user check T and C on daftar page
    And user click Daftar button
    Then user verify show error message "Email wajib diisi"

  @Scenario011
  Scenario: Verify user failed to register when Password filed doesn't filled in
    Given User open url "sehatq.com"
    And user click icon profile
    And user click Daftar link
    When user input nama lengkap "Adelia Nur" on daftar page
    And user input email "test10@mailinator.com" on daftar page
    And user check T and C on daftar page
    And user click Daftar button
    Then user verify show error message "Password wajib diisi"

  @Scenario012
  Scenario: Verify user failed to register when Ketentuan dan Kebijakan Privacy has not been checked
    Given User open url "sehatq.com"
    And user click icon profile
    And user click Daftar link
    When user input nama lengkap "Adelia Nur" on daftar page
    And user input email "test10@mailinator.com" on daftar page
    And user input password "Password1" on daftar page
    Then user verify Daftar button is disabled

  @Scenario013
  Scenario: Verify user failed to register when using registered Email
    Given User open url "sehatq.com"
    And user click icon profile
    And user click Daftar link
    When user input nama lengkap "Adelia Nur" on daftar page
    And user input email "test1@mailinator.com" on daftar page
    And user input password "Password1" on daftar page
    And user check T and C on daftar page
    And user click Daftar button
    Then user verify show error message "email sudah terverifikasi & telah dimiliki user"

  @Scenario013
  Scenario: Verify user failed to register when using incorrect email format
    Given User open url "sehatq.com"
    And user click icon profile
    And user click Daftar link
    When user input nama lengkap "Adelia Nur" on daftar page
    And user input email "test1@mailinator" on daftar page
    And user input password "Password1" on daftar page
    And user check T and C on daftar page
    And user click Daftar button
    Then user verify show error message "Email harus diisi dengan benar."

  @Scenario014
  Scenario: Verify user failed to register when input Password less than 6 caracters
    Given User open url "sehatq.com"
    And user click icon profile
    And user click Daftar link
    When user input nama lengkap "Adelia Nur" on daftar page
    And user input email "test1@mailinator.com" on daftar page
    And user input password "Passw" on daftar page
    And user check T and C on daftar page
    And user click Daftar button
    Then user verify show error message "Password harus diisi minimal 6"



