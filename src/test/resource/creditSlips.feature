@Regression @EndToEndTest
Feature: credit slips  Test

  Scenario Outline: To test a user sees different items on wishlist page
    Given I am  on the Home Page
    And I see a logo banner
    And I log  into sign in page
    And I login in with correct "<emailAddress>" and "<passsword>"
    When I click on My credit slips
    Then I should see my credit slips

    Examples: 
      | clothing | emailAddress           | passsword |
      | women    | davin.riches@gmail.com | Today01   |
