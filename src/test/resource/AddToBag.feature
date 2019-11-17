@~ignore
Feature: Add item To Bag test

  Scenario: T o test that user can add item to the cart
    Given I am logged in
    When I add an item to the cart
    And I click on the cart
    Then I should see the itemn I added
