Feature: Work with My Store - Final Exercise Part 2

  Scenario: Successful log in an account and setting up addresses
    Given Page 'https://mystore-testlab.coderslab.pl/' opened in the browser
    When Logged in
    When Click logo
    When Choose Sweater
    When check Discount
    When Choose Sweater M
    When Choose Sweater Quantity
    When Click add to cart
    When Click checkout
    When Proceed to checkout
    When Check address
    When Buy process address continue
    When Shipping method click
    When Shipping click continue
    When Payment choose
    When Terms and conditions click
    When Place order click
    When Save screenshot hummingbird sweater
    When Close my browser