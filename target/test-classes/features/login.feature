Feature: Login functionality

  Scenario: Successful login
    Given user is on login page
    When user enters "<username>" and "<password>"
    Then user is redirected to the homepage
    
Examples:
| username | password |
  | Ajith    | 81315    |
  | standard_user    | secret_sauce    |
