Feature: As a user I should be able to fill the details so that I can see the comment at last

  Scenario: I should able to pass my comment successfully with valid details

    Given I am on nopCommerce new release page
    When I enter title and comment
    And press 'New Comment' button
    Then I should be able to see the entered comment at last