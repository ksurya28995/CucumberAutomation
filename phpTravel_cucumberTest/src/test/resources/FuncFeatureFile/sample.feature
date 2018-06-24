Feature: This is a sample feature file
@start
Scenario: This is a scenario for Adding two number.
        Given Two number as 2 and 6
        When We add this two given number
        Then Result should be 8

@smokeTest
@start
Scenario Outline: This is a scenario for Subtracting two number.
        Given Two number as <num1> and <num2>
        When We add this two given number
        Then Result should be <num3>
        
       
        Examples:
        |num3|num2|num1|
        |5|3|2|
        |5|2|3|
        |5|1|4|
        |5|0|5|