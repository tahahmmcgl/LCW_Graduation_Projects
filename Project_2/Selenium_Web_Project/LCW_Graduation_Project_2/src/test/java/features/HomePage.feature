@HomePage @All
  Feature: Home Page

    @UserInLoginPage
    Scenario Outline: User in LoginPage
      Given User is HomePage
      When User click <headerButton> Header Button
      Then Check Login Page
      Examples:
        | headerButton |
        | "Giriş Yap"  |


