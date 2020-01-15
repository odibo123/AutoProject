@RegresssionTest
Feature: Wishlist Test

  Scenario Outline: To test a user sees different items on wishlist page
    Given I am  on the Home Page
    And I see a logo banner
    And I log into search page by entering desired "<clothing>"
    Then I chooses an item displaying image and title and price
    Then I logs into page showing product boldly displayed
    Then I confirm details of product to be purchased
    And I log  into sign in page
    And I login in with correct "<emailAddress>" and "<passsword>"
    When I click on My wishlist
    Then I should see my wishlist

    Examples: 
      | clothing | emailAddress           | passsword |
      | women    | davin.riches@gmail.com | Today01   |

  Scenario Outline: To test that a user is able to save an item after making a new wishlist
    Given I am  on the Home Page
    And I see a logo banner
    And I log into search page by entering desired "<clothing>"
    Then I chooses an item displaying image and title and price
    Then I logs into page showing product boldly displayed
    Then I confirm details of product to be purchased
    And I log  into sign in page
    And I login in with correct "<emailAddress>" and "<passsword>"
    When I click on My wishlist
    Then I should see my wishlist
    When I type my desired Clothing on "<newWishlist>" message box
    And l click on save button
    Then I should confirm that the desired item was saved

    Examples: 
      | clothing | emailAddress        | passsword | newWishlist |
      | women    | escosolo7@gmail.com | Ikeama78  | blouse      |

  Scenario Outline: To test that a user is able to add an item to a  wishlist
    Given I am  on the Home Page
    And I see a logo banner
    And I log into search page by entering desired "<clothing>"
    Then I chooses an item displaying image and title and price
    Then I logs into page showing product boldly displayed
    Then I confirm details of product to be purchased
    And I log  into sign in page
    And I login in with correct "<emailAddress>" and "<passsword>"
    When I click on My wishlist
    Then I should see my wishlist
    When I type my desired Clothing on "<newWishlist>" message box
    And l click on save button
    Then I should confirm that the desired item was saved
    And I click on my wishlist image saved item
    When I add it to my wishlist
    Then I should see a confirmation message saying it is added to my wishlist

    Examples: 
      | clothing | emailAddress        | passsword | newWishlist |
      | women    | escosolo7@gmail.com | Ikeama78  | blouse      |

  Scenario Outline: To test that a user is able to delete a wishlist
    Given I am  on the Home Page
    And I see a logo banner
    And I log into search page by entering desired "<clothing>"
    Then I chooses an item displaying image and title and price
    Then I logs into page showing product boldly displayed
    Then I confirm details of product to be purchased
    And I log  into sign in page
    And I login in with correct "<emailAddress>" and "<passsword>"
    When I click on My wishlist
    Then I should see my wishlist
    When I type my desired Clothing on "<newWishlist>" message box
    And l click on save button
    When I click on delete button
    Then I should be able to delete my wishList item

    Examples: 
      | clothing | emailAddress        | passsword | newWishlist |
      | women    | escosolo7@gmail.com | Ikeama78  | blouse      |
