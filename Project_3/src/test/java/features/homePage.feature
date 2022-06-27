@HomePage @All
Feature: Home Page


@CheckHomePage
Scenario: Home page Check
  Given User is HomePage
  When Check HomePage "Hoş geldin" title
  When click "Profil" navigation button
  When Check "Profil" Page
