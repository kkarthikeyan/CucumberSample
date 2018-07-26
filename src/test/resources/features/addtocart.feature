Feature: Add an item to the cart

  Scenario: cart item count should not be displayed when cart is empty
    When user launches the application
    Then cart item count should not be displayed

  Scenario: cart item count should be displayed when item is added to card
    When user launches the application
    And searches for "sun screen"
    And adds a product to the card
    Then cart item count should be displayed
#@pending
#Scenario: cart item count should be displayed when an item is added to the cart
#
#@pendig
#Scenario: user should be able to add an item to the cart
