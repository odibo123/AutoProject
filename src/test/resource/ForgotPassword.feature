@Smoke @EndToEndTest
Feature:Forgot Password Test

  Scenario Outline: To test that user can login successfully if valid credentials are entered
    Given I am  on the Home Page
    And I see a logo banner
    When I click sign in
    And I click forgot password link
    Then I should see a message requesting I enter email I registered with
    And I enter correct  "<emailAddress>"
    When I attempt to retrieve my password
    Then I should see a confirmation message sent  to my address

    Examples: 
      | emailAddress           |
      | davin.riches@gmail.com |
      | escosolo7@gmail.com    |
