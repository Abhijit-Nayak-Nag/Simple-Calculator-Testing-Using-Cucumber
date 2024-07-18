Feature: Calculator
  Scenario: Addition of two numbers
    Given I have a calculator
    When I add 5 and 3
#    Then the result of 5 and 3 should be 8
    Then the result should be 8


#  Step 1: Enhanced Feature File with Scenario Outlines, Data Tables, and Tags
#  Create a directory structure src/test/resources/features and inside it, update calculator.feature

#  @Calculator
#  Feature: Calculator
#
#  @Addition
#  Scenario Outline: Addition of two numbers
#    Given I have a calculator
#    When I add <num1> and <num2>
#    Then the result should be <result>
#
#    Examples:
#      | num1 | num2 | result |
#      | 5    | 3    | 8      |
#      | 10   | 20   | 30     |
#      | -1   | 1    | 0      |
#
#  @Multiplication
#  Scenario: Multiplication of two numbers
#    Given I have a calculator
#    When I multiply the following numbers
#      | num1 | num2 |
#      | 2    | 3    |
#      | 4    | 5    |
#    Then the result should be 120



