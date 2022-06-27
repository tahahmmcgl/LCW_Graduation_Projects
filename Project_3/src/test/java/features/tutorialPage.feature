@TutorialPage @All
Feature: Tutorial Page

  @Check @Components
  Scenario Outline: Check Tutorial Page Components
    Given User is opened LcWaikiki App
    When should see TvTutorial
    When should see "<text>" text
    When should see "<title>" title
    When should see "<desc>" title description
    When click "<button>" footer button
    Examples:
      | text            | title           | desc                                | button |
      | Yeniliği Keşfet | PRATİK ALT MENÜ | Yenilenen alt menü ile kategorilere | Atla   |

