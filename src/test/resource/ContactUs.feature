@SmokeTest
Feature: Contact us Test App

  Scenario: To test User is able to get to Contact us Page
    Given I am  on the Home Page
    And log into contact us page
    Then I should verify title of contact us page

  Scenario Outline: To test user  receives a confirmation message when user makes a request
    Given I am  on the Home Page
    And log into contact us page
    Then I fill in contact Us details by choosing  subject heading and entering email and "<orderReference>" and chooses a file
    Then logs in after  typing  a "<message>" of enquiry
    And I should see  the  "message" Your message has been successfully sent to our team."

    Examples: 
      | orderReference | message                         |
      |            123 | I want to see my order          |
      |            456 | How soon can I cancel my order? |

  Scenario Outline: To test that  user sees an error message when user do not enter any message
    Given I am  on the Home Page
    And log into contact us page
    Then I fill in contact Us details by choosing  subject heading and entering email and "<orderReference>" and chooses a file
    When I attempt to log in without typing on the "<emptyMessage>" box
    Then I should see an error message

    Examples: 
      | orderReference | emptyMessage |
      |           8123 |              |
      |           4569 |              |
