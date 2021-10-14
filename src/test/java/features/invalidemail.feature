Feature: Login Feature Test

  Scenario: Login with invalid email and password
    Given I am at TalentTEK Homepage
    And I enter a invalid email address
    And I enter a valid password
    When I click on Login Button
    Then I should not be able to successfully log in

  #hasanyc2@gmail.com/Test$1234