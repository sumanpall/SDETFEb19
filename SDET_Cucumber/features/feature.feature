Feature: Refund of an item

  @FunTest
  Scenario: Jeff is returned the faulty microwave
    Given Jeff has brought a microwave for 100
    And he has no receipt
    When Jeff returned the faulty microwave
    Then Jeff should not get refund of 100

  @RegressionTest
  Scenario Outline: Sales assistant login
    Given Jane open the application
    And application is opened
    When Jane provides "<user>" and "<pass>" as credentials
    Then Jane is logged into the system

    Examples: 
      | user  | pass   |
      | mary  | jane   |
      | peter | parker |

  @FunTest
  Scenario: Customer Signup
    Given Jane open the application
    When the jane provides the credentials
      | john | piper |
    Then sinup is successful
