@SmokeTest
Feature: Sign Out Feature Test

  Scenario Outline: To test that user can login successfully if valid credentials are entered
    Given I am  on the Home Page
    And I see a logo banner
    When I click sign in
    And I login in with correct "<emailAddress>" and "<passsword>"
    Then I should see "<myName>" on the dashboard that I logged in successfully
    And I log out

    Examples: 
      | emailAddress           | passsword | myName        |
      | davin.riches@gmail.com | Today01   | davin riches  |
      | escosolo7@gmail.com    | Ikeama78  | Emeka Onourha |
