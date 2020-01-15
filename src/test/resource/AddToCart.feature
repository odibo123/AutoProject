@AddToCart
Feature: Add To Cart Test

  Scenario Outline: To test that user delete an item  successfully after attempting purchase
    Given I am  on the Home Page
    And I see a logo banner
    And I log into search page by entering desired "<clothing>"
    Then I chooses an item displaying image and title and price
    Then I logs into page showing product boldly displayed
    Then I confirm details of product to be purchased
    And I click on Add To Cart button
    Then I confirm seeing a message saying product is successfully added to cart
    Then I log into shopping cart summary page
    And I clicks on the negative button under the quantity section
    Then I  validate the message shopping cart is empty

    Examples: 
      | clothing |
      | women    |
      | dresses  |
      | T-Shirt  |

  Scenario: To check that a user should see a message displaying shopping cart is empty when he does not choose an item
    Given I am  on the Home Page
    And I see a logo banner
    When I click on Cart
    Then I should see a message saying shopping cart is empty

  Scenario Outline: To check that a user sees the exact quantity of product on the shopping cart before making purchase
    
    Given I am  on the Home Page
    And I log into search page by entering desired "<clothing>"
    Then I chooses one item displaying image and title and price
    Then I logs into page showing product boldly displayed
    And I click on Add To Cart button
    Then I confirm seeing exact quantity added to cart

    Examples: 
      | clothing |
      | women    |

  Scenario Outline: To test a user can add item to the cart
    Given I am  on the Home Page
    And I log into search page by entering desired "<clothing>"
    Then I chooses an item displaying image and title and price
    Then I logs into page showing product boldly displayed
    And I click on Add To Cart button
    Then I confirm seeing a message saying product is successfully added to cart

    Examples: 
      | clothing |
      | women    |
