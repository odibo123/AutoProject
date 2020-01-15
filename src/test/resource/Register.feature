@SmokeTest @EndToEndTest
Feature: Create Account Test

  Background:
  Given I am  on the Home Page
  And I see a logo banner
  When I click sign in
 
  Scenario Outline: As a visitor I want to create an account
    
    And I log into create  account page using email that is not in use
    And I fills in personal information by choosing title and  entering "<firstname>" and "<lastname>" email and "<myPassword>" and date of birth
    And I fills in address section by filling "<company>" and "<addressLine1>" and "<addressLine2>" and "<city>" and "<zipcode>"
    And I also chooses state and country
    Then I types additional information by entering "<Messages>" and "<HomePhone>" email and "<Mobilephone>" and "<AssignedAddress>"
    Then I log into personal account Page
    Then I confirms account was registered successfully

    Examples: 
      | firstname | lastname | myPassword | company | addressLine1 | addressLine2 | city     | zipcode | Messages                | HomePhone    | Mobilephone  | AssignedAddress |
      | john      | riches   | Today05    | XYZ LTD |            3 | Wesley Road  | bronx    |   10004 | none                    | 076543216765 | 076543216765 | 3  Wesley Road  |
      | Emeka     | john     | Ikeama7    | ABY LTD |           67 | St James St  | new york |   10003 | pleases confirm details | 087657656768 | 087657656768 | 67 St James St  |

  Scenario Outline: As a registered user when I try to create an account with email already registered error message should be displayed
  
    When I attempt to create  a personal  account by entering  "<emailid>" that is already in use
    Then error message should be displayed

    Examples: 
      | emailid                |
      | davin.riches@gmail.com |
      | escosolo7@gmail.com    |
