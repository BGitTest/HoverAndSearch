Feature: As a user, I should able to register to buy the products

  Scenario: I should able to register successfully with valid credentials

    Given I am on register page
    When I enter valid details
    And press register
    Then I should be registered successfully
