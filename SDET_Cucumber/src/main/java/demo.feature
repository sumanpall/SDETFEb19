Feature: Refund of an item

  Scenario: Jeff is returned the faulty microwave
    
    Given Jeff has brought a microwave for 100
    And he has receipt
    When Jeff returned the faulty microwave  
    Then Jeff should get refund of 100
