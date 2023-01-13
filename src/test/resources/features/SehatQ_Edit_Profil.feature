@SehatQ
@SehatQ_Edit_Profil
Feature: SehatQ - Edit Profil

  @Scenario0015
  Scenario: Verify user successfuly login using registered account
    Given User open url "sehatq.com"
    And user already login on sehatQ website
    And user go to profil page
    When user click Edit profile button
    And user input tanggal lahir "14-April-2000" on edit profil page
    And user input jenis kelamin perempuan on edit profil page
    And user input tinggi badan "160" on edit profil page
    And user input berat badan "50" on edit profil page
    And user input no telepon "081256262662" on edit profil page
    And user input alamat "Jakarta" on edit profil page
    And user click Simpan button on edit profil page
    Then user verify Profil successfully updated


  @Scenario0018
  Scenario:  Verify user Failed to Edit Profil when Tinggi Badan is not filled in
    Given User open url "sehatq.com"
    And user already login on sehatQ website
    And user go to profil page
    When user click Edit profile button
    And user remove value from tinggi badan field
    And user click Simpan button on edit profil page
    Then user verify show error message "Tinggi Badan wajib diisi" on edit profil page

  @Scenario0019
  Scenario:  Verify user Failed to Edit Profil when filling in incorrect format of Tinggi Badan
    Given User open url "sehatq.com"
    And user already login on sehatQ website
    And user go to profil page
    When user click Edit profile button
    And user input tinggi badan "1@c12" on edit profil page
    And user click Simpan button on edit profil page
    Then user verify show error message "Tinggi Badan harus diisi dengan benar" on edit profil page

  @Scenario0020
  Scenario:  Verify user Failed to Edit Profil when Berat Badan is not filled in
    Given User open url "sehatq.com"
    And user already login on sehatQ website
    And user go to profil page
    When user click Edit profile button
    And user remove value from berat badan field
    And user click Simpan button on edit profil page
    Then user verify show error message "Berat Badan wajib diisi" on edit profil page

  @Scenario0021
  Scenario:  Verify user Failed to Edit Profil when filling in incorrect format of Berat Badan
    Given User open url "sehatq.com"
    And user already login on sehatQ website
    And user go to profil page
    When user click Edit profile button
    And user input berat badan "@rt^" on edit profil page
    And user click Simpan button on edit profil page
    Then user verify show error message "Berat Badan harus diisi dengan benar" on edit profil page

  @Scenario0021
  Scenario:  Verify user Failed to Edit Profil when No Telepon is not filled in
    Given User open url "sehatq.com"
    And user already login on sehatQ website with email "septiamelia49@gmail.com"
    And user go to profil page
    When user click Edit profile button
    And user remove value from no telpon field
    And user click Simpan button on edit profil page
    Then user verify show error message "Phone wajib diisi" on edit profil page

  @Scenario0021
  Scenario:  Verify user Failed to Edit Profil when filling in incorrect format of No Telepon
    Given User open url "sehatq.com"
    And user already login on sehatQ website
    And user go to profil page
    When user click Edit profile button
    And user input no telepon "a@3ooouei" on edit profil page
    And user click Simpan button on edit profil page
    Then user verify show error message "No. Telp harus diisi dengan benar" on edit profil page

  @Scenario0022
  Scenario:  Verify user Failed to Edit Profil when filling in No Telepon less than 9 digits
    Given User open url "sehatq.com"
    And user already login on sehatQ website
    And user go to profil page
    When user click Edit profile button
    And user input no telepon "08123456" on edit profil page
    And user click Simpan button on edit profil page
    Then user verify show error message "Kolom No. Telp minimal 9" on edit profil page

  @Scenario0023
  Scenario:  Verify user Failed to Edit Profil when Alamat is not filled in
    Given User open url "sehatq.com"
    And user already login on sehatQ website
    And user go to profil page
    When user click Edit profile button
    And user remove value from alamat field
    And user click Simpan button on edit profil page
    Then user verify show error message "Alamat wajib diisi" on edit profil page











