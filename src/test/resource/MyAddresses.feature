@RegressionTest @EndToEndTest
Feature: My Address test

  Scenario Outline: To test a user is able to complete  a transaction
    Given I am  on the Home Page
    And I log into search page by entering desired "<clothing>"
    Then I chooses an item displaying image and title and price
    Then I logs into page showing product boldly displayed
    Then I log into product page showing product I intend to purchase
    Then I confirm details of product to be purchased
    And I click on Add To Cart button
    Then I confirm seeing a message saying product is successfully added to cart
    Then I log into shopping cart summary page
    And I log in into sign in page
    And I login in with correct "<emailAddress>" and "<passsword>"
    And I confirm seeing correct address details

    Examples: 
      | clothing | emailAddress           | passsword |
      | women    | davin.riches@gmail.com | Today01   |
      | dresses  | escosolo7@gmail.com    | Ikeama78  |
      | T-Shirt  | switch146@gmail.com    | Escosolo7 |

  Scenario Outline: To test that a user is able to add  a new Address
    Given I am  on the Home Page
    And I log into search page by entering desired "<clothing>"
    Then I chooses an item displaying image and title and price
    Then I logs into page showing product boldly displayed
    And I click on Add To Cart button
    Then I confirm seeing a message saying product is successfully added to cart
    Then I log into shopping cart summary page
    And I log in into sign in page
    And I login in with correct "<emailAddress>" and "<passsword>"
    Then I choose use the delivery address as my billing address
    Then I attempt to add a new address
    And I fills in new address by filling "<Company>" and "<AddressLine1>" and "<AddressLine2>" and "<City>" and "<Zipcode>" along with state and country
    And I also chooses state and country
    Then I types additional information by entering "<Messages>" and "<HomePhone>" email and "<Mobilephone>" and "<AssignedAddress>"
    Then I log into billing page showing my new address

    Examples: 
      | clothing | emailAddress           | passsword | Company  | AddressLine1 | AddressLine2 | City  | Zipcode | Messages  | HomePhone    | Mobilephone | AssignedAddress  |
      | women    | davin.riches@gmail.com | Today01   | ASCA Ltd | 5c           | Greek Avenue | bronx |   24378 | not ready | 076543212343 | 07654323445 | 5c  Greek Avenue |
