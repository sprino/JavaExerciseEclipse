#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@SDET
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Form page load
    Given the form is loaded
    When  The user focuses the page
    Then  The system shows input field setted to '1'
		And   The num2 input field setted to '2'
		And   The sum '3'
		And   A clear button

      
      