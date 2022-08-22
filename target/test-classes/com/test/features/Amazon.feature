Feature: Amazon Feature

@brokenLinks
  Scenario: Validate Broken Links in a WebPage
  Given I navigate to Amazon Home Page
  Then  I perform Health Check on the All the links in a Web Page

  @dragAndDrop
    Scenario: Perform Drag and Drop
    Given I navigate to Jquery Home Page
    Then  I perform Drag and Drop of element

  @toolTips
     Scenario: I validate Tool Tips
     Given I navigate ToolsQA WebPage
     Then  I validate the ToolTip is Displayed on a webElement

  @scrollUpAndDown
    Scenario: Perform Scroll Up and Down
    Given I navigate to Amazon Home Page
    Then  I perform Scroll Up and Down action

  @screenShot
    Scenario: Perform Scroll Up and Down
    Given I navigate to Amazon Home Page
    Then I Take the Screenshot of the Amazon Page