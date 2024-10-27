Feature: Purchase a product

  Background:
    Given the homepage is opened
    And the user is logged in with email "krdntcodtfotemamgh@hthlm.com" and password "password123"
  @done
  Scenario: User purchases a Hummingbird Printed Sweater
    Given the homepage is opened
    When the user selects the "Hummingbird Printed Sweater" for purchase
    And the discount is checked to be 20 percent
    And the user selects size "M"
    And the user sets the quantity to "5"
    And the user adds the product to the cart
    And the user proceeds to checkout
    And the user confirms the address
    And the user chooses the "pick up in store" delivery method
    And the user selects the "Pay by Check" payment option
    And the user places the order with an obligation to pay
    Then the user takes a screenshot of the confirmation
    And the user verifies the order status in the history as "Awaiting check payment"