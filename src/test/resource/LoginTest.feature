@SmokeTest
Feature: Login Feature Test

  Scenario Outline: To test that user can login successfully if valid credentials are entered
    Given I am  on the Home Page
    And I see a logo banner
    When I click sign in
    And I login in with correct "<emailAddress>" and "<passsword>"
    Then I should see "<myName>" on the dashboard that I logged in successfully

    Examples: 
      | emailAddress           | passsword | myName        |
      | davin.riches@gmail.com | Today01   | davin riches  |
      | escosolo7@gmail.com    | Ikeama78  | Emeka Onourha |

  Scenario Outline: To test that user is unable to login if invalid credentials are entered
    Given I am  on the Home Page
    And I see a logo banner
    When I click sign in
    When I try to log in with incorrect  "<email>" or incorrect "<passswd>"
    Then I should see error "<message>"

    Examples: 
      | email                  | passswd  | message                |
      | davin.riches@gmail.com | Today2   | Authentication failed. |
      | esco@yahmail.com       | Ikeama78 | Authentication failed. |
      | christodibo@yaho       | To7@     | Invalid password.      |

  Scenario Outline: To test that user is unable to login when the one or both field is blank
    Given I am  on the Home Page
    And I see a logo banner
    When I click sign in
    When I try to log in with blank  "<MyemailAddress>" or "<Mypasssword>"
    Then I validate  "<errorMesssage>"

    Examples: 
      | MyemailAddress         | Mypasssword | errorMesssage              |
      | davin.riches@gmail.com |             | Password is required.      |
      |                        | Today01     | An email address required. |
      |                        |             | An email address required. |
