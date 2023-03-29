Feature: facebook login functionality

  Scenario: validate valid user login
  
    Given I am the user of facebook application
     When I enter valid userName
      And I enter valid Password
      And I click on login
     Then I should be able to login successfully
