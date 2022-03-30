Feature: Login
  As user
  I want to see home page
  So that I can see my collections books

  Scenario: As user, I have be able to success login
    Given I am on the login page
    When I input valid username
    And I input valid password
    And I click login button
    Then I am on the home page

  Scenario: As user, I have be unable login
    Given I am on the login page
    When I input invalid username
    And I input valid password
    And I click login button
    Then Show error message "Invalid username or password!"

  Scenario: As user, I have be unable login
    Given I am on the login page
    When I input valid username
    And I input invalid password
    And I click login button
    Then Show error message "Invalid username or password!"

  Scenario: As user, I have be unable login
    Given I am on the login page
    When I input invalid username
    And I input invalid password
    And I click login button
    Then Show error message "Invalid username or password!"