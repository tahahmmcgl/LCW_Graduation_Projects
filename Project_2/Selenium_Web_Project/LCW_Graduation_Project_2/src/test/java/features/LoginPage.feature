@LoginPage @All
  Feature: Login Page

      @LoginPageToSignUpPage
      Scenario: User in Login Page to Sign Up Page
        Given User is Login Page
        When User click login page "ÜYE OL" button
        Then Check Sign Up Page

      @SuccesfulLogin
      Scenario: User Login Succesfuly
        Given User is Login Page
        When User click "E-Posta" radio button
        When User write "TrueMAİL@gmail.com" to "E-Posta Adresiniz" login text box
        When User write "TruePassword" to "Şifreniz" login text box
        When User click login page Giriş Yap login button
        Then User should see "Hesabım" header button in logined HomePage



