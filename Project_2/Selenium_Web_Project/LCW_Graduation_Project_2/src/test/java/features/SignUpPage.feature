@SignUpPage @All
  Feature: Sign Up Page


    @SuccesfulSignUp
    Scenario: Succesful Sign Up
      Given User is Sign Up Page
      When User write "tahataha@gmail.com" to "E-Posta Adresiniz" box
      When User write "123456789aA." to "Şifreniz" box
      When User write "123456798" to "0 (5__) ___ __ __" box
      When mark Terms and Conditions check box
      When User click sign up page "ÜYE OL" button
      Then User should see "TELEFON DOĞRULAMA KODU" text


    @SuccesfulSignUpWithEmailNotification
    Scenario: Succesful Sign Up With marked E-mail check box
      Given User is Sign Up Page
      When User write "tahataha@gmail.com" to "E-Posta Adresiniz" box
      When User write "123456789aA." to "Şifreniz" box
      When User write "123456798" to "0 (5__) ___ __ __" box
      When mark Terms and Conditions check box
      When User click "E-Posta" check box
      When User click sign up page "ÜYE OL" button
      Then User should see "TELEFON DOĞRULAMA KODU" text


    @FailedSignUPWithUnvalidMail
    Scenario:Failed Sign Up With Wrong Email
      Given User is Sign Up Page
      When User write "tahataha" to "E-Posta Adresiniz" box
      When User write "123456789aA." to "Şifreniz" box
      When User write "123456798" to "0 (5__) ___ __ __" box
      When mark Terms and Conditions check box
      When User click sign up page "ÜYE OL" button
      Then User should see "Lütfen geçerli bir e-posta adresi giriniz." sign up error message


    @FailedSignUPWithUnvalidPassword
    Scenario:Failed Sign Up With Wrong Password
      Given User is Sign Up Page
      When User write "tahataha@gmail.com" to "E-Posta Adresiniz" box
      When User write "123456789" to "Şifreniz" box
      When User write "123456798" to "0 (5__) ___ __ __" box
      When mark Terms and Conditions check box
      When User click sign up page "ÜYE OL" button
      Then User should see "Şifreniz harf ile rakam içermeli ve en az altı karakter olmalıdır." sign up error message


    @FailedSignUPWithNotMarkedTermsAndConditions
    Scenario:Failed Sign Up With not marked terms and conditions
      Given User is Sign Up Page
      When User write "tahataha@gmail.com" to "E-Posta Adresiniz" box
      When User write "123456789aA." to "Şifreniz" box
      When User write "123456789" to "0 (5__) ___ __ __" box
      When User click sign up page "ÜYE OL" button
      Then User should see "Kullanım Sözleşmesini onaylamalısınız." sign up error message








