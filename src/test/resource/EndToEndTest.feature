@EndToEndTest
Feature: End To End Test

  Scenario Outline: To test a user is able to complete  an undetailed transaction
    Given I am  on the Home Page
    And I log into search page by entering desired "<clothing>"
    Then I chooses an item displaying image and title and price
    Then I logs into page showing product boldly displayed
    And I click on Add To Cart button
    Then I confirm seeing a message saying product is successfully added to cart
    Then I log into shopping cart summary page
    And I log in into sign in page
    And I login in with correct "<emailAddress>" and "<passsword>"
    And I confirm seeing correct address details
    Then I log into shipping page
    Then I log into payment Page after agreeing on terms of service
    Then i chooose my payment method
    When i confirm my order
    Then I should see a message coinfirming the order placed

    Examples: 
      | clothing | emailAddress           | passsword |
      | women    | davin.riches@gmail.com | Today01   |
      | dresses  | escosolo7@gmail.com    | Ikeama78  |
      | T-Shirt  | switch146@gmail.com    | Escosolo7 |

  #Scenario: To test a user is able to complete  a detailed transaction
  #Given I am  on the Home Page
  #And user mouses hover women  and clicks on summer dress
  #When user chooses specific size,colour,styles,composition properties,availability manufacture, condition and price range
  #Then user logs into a page showing chosen item boldly displayed
  #
  #
  # And I click on Add To Cart button
  #And user click on Add To Cart button
  #And user logs in and sees product successfully added to shopping cart
  Scenario: As a user I want to change the price of summer dress to $16 - $20
    Given I am  on the Home Page
    And user mouses hover women  and clicks on summer dress
    And user changes the price range from $16 to $20
