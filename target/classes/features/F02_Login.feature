@smoke


Feature: F02_Login | user could login and assert on the transaction type of the withdraw

  Scenario: F02_Login | user could login and assert on the transaction type of the withdraw

  When Click Customer login
  And Select name Albus Dumbledore
    And Login
    And Make a deposit “1000”
    And Withdraw “400”
    Then Assert on Balance = “600”
    When Click on Transaction
  Then Assert on the transaction type of the withdraw