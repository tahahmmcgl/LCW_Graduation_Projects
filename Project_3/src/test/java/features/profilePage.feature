@ProfilePage @All
Feature: Profile Page


@FalseMail
  Scenario: False E-Mail Scenario
    Given User is Profile Page
    When Check "Profil" Page
    When click "E-Posta" check box
    When write "Taha_Hamamcıoğlu" in "E-Posta Adresiniz" textbox
    When write "123456789" in password textbox
    When click login button
    Then you should see "Lütfen geçerli bir e-posta adresi giriniz." message
@TrueMail
  Scenario: True E-Mail Scenario
    Given User is Profile Page
    When Check "Profil" Page
    When click "E-Posta" check box
    When write "tahahamamcioglu@hotmail.com" in "E-Posta Adresiniz" textbox
    When write "123456789" in password textbox
    When click login button
    Then you should see "Lütfen E-Posta Adresinizi ya da Şifrenizi Kontrol Ediniz" slide down text

@EmptyPassword
  Scenario: Empty password Scenario
    Given User is Profile Page
    When Check "Profil" Page
    When click "E-Posta" check box
    When write "tahahamamcioglu@hotmail.com" in "E-Posta Adresiniz" textbox
    When write "" in password textbox
    When click password box
    When click login button
    Then you should see "Lütfen şifre giriniz." password error message
    Then you should see "E-posta adresinizi ya da şifrenizi kontrol ediniz." slide down text

@EmptyMail
  Scenario: Empty password Scenario
    Given User is Profile Page
    When Check "Profil" Page
    When click "E-Posta" check box
    When write "" in "E-Posta Adresiniz" textbox
    When write "123456789" in password textbox
    When click login button
    Then you should see "E-posta adresinizi ya da şifrenizi kontrol ediniz." slide down text

  @UserLogin
  Scenario: True E-Mail Scenario
    Given User is Profile Page
    When Check "Profil" Page
    When click "E-Posta" check box
    When write "trakmaklak1234@gmail.com" in "E-Posta Adresiniz" textbox
    When write "19981998aA." in password textbox
    When click login button
