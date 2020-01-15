@RegressionTest  @EndToEndTest
Feature: Order History And Details Test

  Scenario Outline: To test a user sees different items on wishlist page
    Given I am  on the Home Page
    And I see a logo banner
    And I log  into sign in page
    And I login in with correct "<emailAddress>" and "<passsword>"
    When I click on Order History And Details text field
    Then I should see details of my order history

    Examples: 
      | clothing | emailAddress           | passsword |
      | women    | davin.riches@gmail.com | Today01   |
      | dresses  | escosolo7@gmail.com    | Ikeama78  |
      | T-Shirt  | switch146@gmail.com    | Escosolo7 |
