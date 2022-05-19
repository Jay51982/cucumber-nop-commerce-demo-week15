Feature: Register
@smoke,@sanity
  Scenario: User should create account successfully
    Given I am on homepage
    When I click on register link
    And I see the Register Text

@sanity,@regression
  Scenario: User should verify That FirstName LastName Email Password And Confirm Password Fields Are Mandatory
    Given I am on homepage
    When I click on register link
    And I can click register Button
    Then I should verify the error message for mandatory field

@regression
  Scenario:  verify That User Should Create Account Successfully
    Given I am on homepage
    When I click on register link
    And I can fill mandetory field "Male","Dhirubhai","Ambani","12","January","1970","Jay","shayona123","shayona123"
    And I can click register Button
    Then I can Verify message Your registration completed
