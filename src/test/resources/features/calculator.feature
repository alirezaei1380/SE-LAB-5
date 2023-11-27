@tag
Feature: Calculator

  Scenario: add two numbers
    Given Two input values, 1 and 2
    When I add the two values
    Then I expect the result 3

  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result>

    Examples:
      | first | second | result |
      | 1     | 12     | 13     |
      | -1    | 6      | 5  	|
      | 2     | 2      | 4	    |

  Scenario: find root of division on two numbers with function f
    Given Two input values, 16 and 4
    When I f the two values
    Then I expect the result 2

  Scenario Outline: add two numbers
    Given Two input values, <a> and <b>
    When I f the two values
    Then I expect the result <result>

    Examples:
      | a | b | result |
      | 4     | 1     | 2     |
      | 36    | 4      | 3  	|
