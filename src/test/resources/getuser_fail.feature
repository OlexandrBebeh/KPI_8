Feature: Find user by name
  If you want to find user but you have only name

  Scenario: Find user by name
    Given Username "sadt3cyawWh54h"
    When I want to find user
    Then I should get user page