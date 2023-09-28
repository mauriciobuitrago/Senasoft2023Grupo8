Feature: Login successful

  Scenario: Login
    Given he user enters the website
    When he user enters the credentials
    |email|password|
    |carlosprogramador8@gmail.com|Programador8|
     Then  he user is logged in

    Scenario: Login Error
      Given he user enters the website
      When he user enters the email wrong
        |emailError|
        |carlosprogor8@gmail.com|
      Then  user not logged in

      Scenario: Login error Gmail
        Given he user enters the website
        When he user enters the wrong email structure
          |gmailIncompleto|
          |carlosprogor|
        Then he user cannot log in

