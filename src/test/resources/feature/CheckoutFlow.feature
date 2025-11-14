Feature: SauceDemo Checkout Flow
  Validate that a user can log in, add items to cart, and complete checkout.

  Scenario: Complete an end-to-end checkout
    Given the user launches the SauceDemo application
    When the user logs in with valid credentials
    And the user adds two products to the cart
    And the user proceeds to checkout
    And the user enters checkout details
    Then the user should see the order confirmation message
